/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Maxine
 */
public abstract class OrderDetails {

    protected String OrdID;
    protected LocalDateTime OrdModifyDT;
    protected ArrayList<OrderItem> OrdItems;

    //Load
    public OrderDetails(String OrdID, LocalDateTime OrdModifyDT, ArrayList<Product> OIPros, String[] OIModels, int[] OIQuantities) {
        this.OrdID = OrdID;
        this.OrdModifyDT = OrdModifyDT;
        this.OrdItems = new ArrayList<>();
        addOrdItemsList(OIPros, OIModels, OIQuantities);
    }

    //Load From txt and normal
    public OrderDetails(String OrdID, LocalDateTime OrdModifyDT) {
        this.OrdID = OrdID;
        this.OrdModifyDT = OrdModifyDT;
        this.OrdItems = new ArrayList<>();
    }

    //Create
    public OrderDetails() {
        this.OrdModifyDT = LocalDateTime.now();
        this.OrdItems = new ArrayList<>();
    }

    public String getOrdID() {
        return OrdID;
    }

    public void setOrdID(String OrdID) {
        this.OrdID = OrdID;
    }

    public LocalDateTime getOrdModifyDT() {
        return OrdModifyDT;
    }

    public void setOrdModifyDT(LocalDateTime OrdModifyDT) {
        this.OrdModifyDT = OrdModifyDT;
    }

    public ArrayList<OrderItem> getOrdItems() {
        return OrdItems;
    }

    public void setOrdItems(ArrayList<OrderItem> OrdItems) {
        this.OrdItems = OrdItems;
    }

//    //Load
//    public void addOrdItem(Product OIPro, String OIID, int OIQuantity, String OIModel, double OIPrice, double OIPackingCharge) {
//        OrdItems.add(new OrderItem(OIPro, OIID, OIQuantity, OIModel, OIPrice, OIPackingCharge));
//    }
//     
//    //Create
//    public void addOrdItem(Product OIPro, String OIModel, int OIQuantity) {
//        OrdItems.add(new OrderItem(OrdID, OIModel, OIQuantity, OIPro));
//    }
    public String getOrdItemsIDs() {
        //String OrdItemsIDs = "[";
        String OrdItemsIDs = "";
        if (!OrdItems.isEmpty()) {
            for (OrderItem item : OrdItems) {
                OrdItemsIDs = OrdItemsIDs + item.getOIID() + ',';
            }

            if (OrdItemsIDs.charAt(OrdItemsIDs.length()-1) == ',') {
                OrdItemsIDs = OrdItemsIDs.substring(0, OrdItemsIDs.length() - 1);
            }
        }
        else{
            OrdItemsIDs="-";
        }
        //OrdItemsIDs = OrdItemsIDs + ']';
        return OrdItemsIDs;
    }

    //Search OI from Order
    public OrderItem searchOIFromID(String oiID) {
        OrderItem orderitem = new OrderItem();
        try {
            for (OrderItem oi : OrdItems) {
                if (oi.getOIID().equals(oiID)) {
                    orderitem = oi;
                    return orderitem;
                }
            }
            throw (new Exception("Order Item not found!" + oiID));
        } catch (Exception e) {
            System.out.println(e);
        }
        return orderitem;
    }
    //OrderItem(String OrdID, String OIModel,  int OIQuantity, Product OIPro)

    public final void addOrdItemsList(ArrayList<Product> OIPros, String[] OIModels, int[] OIQuantities) {
        try {

            if (OIPros.size() != OIModels.length || OIModels.length != OIQuantities.length) {
                throw (new Exception("Order Item List is incomplete!"));
            } else {
                for (int i = 0; i < OIPros.size(); i++) {
                    OrdItems.add(new OrderItem(OrdID, OIModels[i], OIQuantities[i], OIPros.get(i)));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public abstract String toString();

    public static String[] parseSCFromString(String scLine) {
        String[] sc = new String[2];
        //ArrayList<OrderItem> ordItems = new ArrayList();
        try {
            System.out.println(scLine);
            String[] scData = scLine.split("\t");
            if (scData.length != 3) {
                throw (new Exception("Shopping Cart is incomplete!" + scLine));
            } else {
                return sc;
//                sc=scData.clone();
//                sc[0] = scData[0];
//                sc[1] = scData[1];
                //               String[] scOrdItemsIDsData = scData[2].split(",");
//                for (String id : scOrdItemsIDsData) {
//                    for (OrderItem oi : OIList) {
//                        if (oi.getOIID().equals(id)) {
//                            ordItems.add(oi);
//                        }
//                    }
//                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return sc;
    }

    public static String[] parseOrdFromString(String ordLine) throws Exception {
        String[] ordData = ordLine.split("\t");
        if (ordData[0].contains("SP") && !ordData[0].contains("-")) {
            if (ordData.length != 3) {
                throw (new Exception("Shopping Cart is incomplete!" + ordLine));
            } else {
                return ordData;
            }
        } else if (ordData[0].contains("OR") && !ordData[0].contains("-")) {
            if (ordData.length != 7) {
                throw (new Exception("Order is incomplete!" + ordLine));
            } else {
                return ordData;
            }
        } else {
            throw (new Exception("Cannot read Order or Shopping Cart data!" + ordLine));
        }
    }
    
    public static String[] buildOrdFromString(String ordLine) {
        String[] ordData = ordLine.split("\t");
        String[] oisIDs=ordData[ordData.length-1].split(",");
        try {
            String[] OrdLine = parseOrdFromString(ordLine);
            
            //String OrdID, LocalDateTime OrdModifyDT, ArrayList<Product> OIPros, String[] OIModels, int[] OIQuantities;
            //TODO valid ordid format
            //String OrdID, OrderStatus OrdStatus,LocalDateTime OrdCreateDT, LocalDateTime OrdModifyDT, String OrdShipment
            if (OrdLine[0].contains("SP") && !OrdLine[0].contains("-")) {
                LocalDateTime OrdModifyDT = LocalDateTime.parse(OrdLine[1]);
                CusAcc.searchCAFromID("CA"+OrdLine[0].substring(3, OrdLine[0].length())).setCusSC(new ShoppingCart(OrdLine[0], OrdModifyDT));
                return oisIDs;
            } else if (OrdLine[0].contains("OR") && !OrdLine[0].contains("-")) {

                OrderStatus OrdStatus = OrderStatus.valueOf(OrdLine[1]);
                LocalDateTime OrdCreateDT = LocalDateTime.parse(OrdLine[2]);
                LocalDateTime OrdModifyDT = LocalDateTime.parse(OrdLine[3]);
                String[] OrdPayment=Payment.parsePayFromString(OrdLine[5]);
                Operation.OrdList.add(new Order(OrdLine[0], OrdStatus, OrdCreateDT, OrdModifyDT, OrdLine[4], OrdPayment));
                return oisIDs;
            } else {
                oisIDs=null;
                throw (new Exception("Cannot find order!" + ordLine));
                
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return(oisIDs);
    }
    
}

