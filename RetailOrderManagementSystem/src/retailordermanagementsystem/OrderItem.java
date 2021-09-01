/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

/**
 *
 * @author Maxine
 */
public class OrderItem extends Product {

    //OrderItem can only have one model
    private String OIID; //ORD001-P0010001
    private int OIQuantity;
    private String OIModel;
    private double OIPrice;
    private double OIPackingCharge;

    public OrderItem() {
    }

    //Load
    public OrderItem(String OIID, int OIQuantity, String OIModel, double OIPrice, double OIPackingCharge, String ProID, String ProName, double ProPrice, double ProWeight, double ProPackingCharge, ProductType ProCategory, String[][] ProModelsLine) {
        super(ProID, ProName, ProPrice, ProWeight, ProPackingCharge, ProCategory, ProModelsLine);
        this.OIID = OIID;
        this.OIQuantity = OIQuantity;
        this.OIModel = OIModel;
        this.OIPrice = OIPrice;
        this.OIPackingCharge = OIPackingCharge;
    }

    //Load from ID (TXT)
    public OrderItem(Product OIPro, String OIID, int OIQuantity, String OIModel, double OIPrice, double OIPackingCharge) {
        super(OIPro);
        // super(searchProFromID(OIID.split("-")[1])); //Needs to valid
        this.OIID = OIID;
        this.OIQuantity = OIQuantity;
        this.OIModel = OIModel;
        this.OIPrice = OIPrice;
        this.OIPackingCharge = OIPackingCharge;
    }

    //Create
    public OrderItem(String OrdID, String OIModel, int OIQuantity, Product OIPro) {
        this.OIQuantity = OIQuantity;
        int index = 0;
        this.OIModel = OIModel;
        for (ProModel model : OIPro.getProModels()) {
            if (model.getPMName().equals(this.OIModel)) {
                model.minusPMStock(this.OIQuantity);
                this.OIID = OrdID + '-' + OIPro.getProID() + String.format("%02d", index + 1); //Add Model ID
                break;
            }
            index++;
        }
        this.OIPrice = OIPro.getProPrice() * OIQuantity;
        this.OIPackingCharge = OIPro.getProPackingCharge() * OIQuantity;
    }

//    public OrderItem(String ProID, String ProName, int ProStock, double ProPrice, double ProPackingCharge, double ProWeight, ArrayList<String> ProModels, ProductType ProCategory, Supplier ProSupplier, int OIQuantity, String OIModel) {
//        super(ProID, ProName, ProStock, ProPrice, ProPackingCharge, ProWeight, ProModels, ProCategory, ProSupplier);
//        this.OIQuantity = OIQuantity;
//        this.OIModel = OIModel;
//    }
//    public OrderItem( String ProID, String ProName, int ProStock, double ProPrice, double ProPackingCharge, double ProWeight, ArrayList<String> ProModels, ProductType ProCategory, String OIID, int OIQuantity, String OIModel) {
//        super(ProID, ProName, ProStock, ProPrice, ProPackingCharge, ProWeight, ProModels, ProCategory);
//        this.OIID = OIID;
//        this.OIQuantity = OIQuantity;
//        this.OIModel = OIModel;
//        this.OIPrice = ProPrice * OIQuantity;
//        this.OIPackingCharge = ProPackingCharge * OIQuantity;
//    }
//
    public String getOIID() {
        return OIID;
    }

    public void setOIID(String OIID) {
        this.OIID = OIID;
    }

    public int getOIQuantity() {
        return OIQuantity;
    }

    public void setOIQuantity(int OIQuantity) {
        this.OIQuantity = OIQuantity;
    }

    public String getOIModel() {
        return OIModel;
    }

    public void setOIModel(String OIModel) {
        this.OIModel = OIModel;
    }

    public double getOIPrice() {
        return OIPrice;
    }

    public void setOIPrice(double OIPrice) {
        this.OIPrice = OIPrice;
    }

    public double getOIPackingCharge() {
        return OIPackingCharge;
    }

    public void setOIPackingCharge(double OIPackingCharge) {
        this.OIPackingCharge = OIPackingCharge;
    }

    public void generateOIPrice() {
        OIPrice = getProPrice() * OIQuantity;
    }

    public void generateOIPackingCharge() {
        OIPackingCharge = getProPackingCharge() * OIQuantity;
    }

    //Search OI from Order
//    public OrderItem searchOIFromID(String oiID) {
//        OrderItem orderitem = new Product();
//        try {
//            for (OrderItem pro : OrdList) {
//                if (pro.getProID().equals(oiID)) {
//                    product = pro;
//                    return product;
//                } else {
//                    throw (new Exception("Order Item not found!" + oiID));
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return product;
//    }
    @Override
    public String toString() {
        return OIID + "\t" + OIQuantity + "\t" + OIModel + "\t" + OIPrice + "\t" + OIPackingCharge;
    }

    public static String[] parseOIFromString(String oiLine, String oiID) throws Exception {
        String[] oiData = oiLine.split("\t");
        if (oiData[0].equals(oiID)) {
            if (oiData.length != 5) {
                throw (new Exception("Order Item is incomplete!" + oiID));
            } else {
                return oiData;
            }
        } else {
            throw (new Exception("Order Item is not found! It may be not in correct order." + oiID));
        }
    }

    
    //Load from ID (TXT)
    //public OrderItem(Product OIPro, String OIID, int OIQuantity, String OIModel, double OIPrice, double OIPackingCharge) {
    public static void addOIFromString(String oiLine, String oiID) {
        try {
            String[] OILine = parseOIFromString(oiLine, oiID);
            if (OILine[0].equals(oiID)) {
                Product OIPro=Product.searchProFromID(oiID.split("-")[1].substring(0,oiID.split("-")[1].length()-2));
                int OIQuantiy=Integer.parseInt(OILine[1]);
                //Validate Model? todo?
                double OIPrice=Double.parseDouble(OILine[3]);
                double OIPackingCharge=Double.parseDouble(OILine[4]);
                if (oiID.contains("SP")) {
                    CusAcc.searchCAFromID("CA"+oiID.substring(3, oiID.split("-")[0].length())).getCusSC().getOrdItems().add(new OrderItem(OIPro,oiID,OIQuantiy,OILine[2],OIPrice,OIPackingCharge));
                } else if (oiID.contains("OR")) {
                    Order.searchOrderFromID(oiID.split("-")[1]).getOrdItems().add(new OrderItem(OIPro,oiID,OIQuantiy,OILine[2],OIPrice,OIPackingCharge));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
//    public static OrderItem parseOIFromString(String oiLine) {
//
//        String[] oi = new String[5];
//        Product oiPro = new Product();
//        try {
//            System.out.println(oiLine);
//            String[] oiData = oiLine.split("\t");
//            if (oiLine.length() != 5) {
//                throw (new Exception("Order Item is incomplete!" + oiLine));
//            } else {
//                String[] oiIDData = oiData[0].split("-");
//                if ("P0".equals(oiIDData[1].substring(0, 1))) {
//                    for (Product pro : ProList) {
//                        if (pro.getProID().equals(oiIDData[1].substring(0, 10))) {
//                            oiPro = pro;
//                        }
//                    }
//                }
//                oi = oiData.clone();
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        //Product OIPro, String OIID, int OIQuantity, String OIModel, double OIPrice, double OIPackingCharge
//        return new OrderItem(oiPro, oi[0], Integer.parseInt(oi[1]), oi[2], Double.parseDouble(oi[3]), Double.parseDouble(oi[4]));
//    }

}
