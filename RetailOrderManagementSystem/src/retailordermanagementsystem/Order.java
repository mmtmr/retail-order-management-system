/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import static retailordermanagementsystem.Operation.OrdList;

/**
 *
 * @author Maxine
 */
public class Order extends OrderDetails {

    private static int OrdCounter=0;//TODO Modify with Total ID
    private LocalDateTime OrdCreateDT;
    private OrderStatus OrdStatus;
    private String OrdShipment;
    private double OrdAmt;
    private Payment OrdPayment;

    public Order() {
    }

    //Create order
    public Order(ShoppingCart SC, double discount) {
        this.OrdID = "OR" + String.format("%06d", OrdCounter + 1);
        this.OrdCreateDT = LocalDateTime.now();
        this.OrdStatus = OrderStatus.Unpaid;
        this.OrdShipment="";
        this.OrdItems = new ArrayList<>(SC.getOrdItems());
        for (OrderItem oi : this.OrdItems) {
            String[] ids=oi.getOIID().split("-");
            oi.setOIID(this.OrdID+"-"+ids[1]);
            oi.setOIPrice(oi.getOIPrice() * (1 - discount));
            oi.setOIPackingCharge(oi.getOIPackingCharge() * (1 - discount));
            this.OrdAmt += oi.getOIPrice() + oi.getOIPackingCharge();
        }
        SC.setOrdItems(new ArrayList<>());
        SC.setOrdModifyDT(LocalDateTime.now());
        this.OrdPayment = new Payment();
        addOrdCounter();
    }

    //Load order
    public Order(LocalDateTime OrdCreateDT, OrderStatus OrdStatus, String OrdShipment, double OrdAmt, String PName, String PCardNumber, String PBank, String OrdID, LocalDateTime OrdModifyDT, ArrayList<Product> OIPros, String[] OIModels, int[] OIQuantities) {
        super(OrdID, OrdModifyDT, OIPros, OIModels, OIQuantities);
        this.OrdCreateDT = OrdCreateDT;
        this.OrdStatus = OrdStatus;
        this.OrdShipment = OrdShipment;
        this.OrdAmt = OrdAmt;
        this.OrdPayment = new Payment(PName, PCardNumber, PBank);
    }

    public Order(String OrdID, OrderStatus OrdStatus, LocalDateTime OrdCreateDT, LocalDateTime OrdModifyDT, String OrdShipment, double OrdAmt, String PName, String PCardNumber, String PBank) {
        super(OrdID, OrdModifyDT);
        this.OrdCreateDT = OrdCreateDT;
        this.OrdStatus = OrdStatus;
        this.OrdShipment = OrdShipment;
        this.OrdAmt = OrdAmt;
        this.OrdPayment = new Payment(PName, PCardNumber, PBank);
    }

    public Order(String OrdID, OrderStatus OrdStatus, LocalDateTime OrdCreateDT, LocalDateTime OrdModifyDT, String OrdShipment, double OrdAmt, String[] OrdPaymentLine) {
        super(OrdID, OrdModifyDT);
        this.OrdCreateDT = OrdCreateDT;
        this.OrdStatus = OrdStatus;
        this.OrdShipment = OrdShipment;
        this.OrdAmt = OrdAmt;
        this.OrdPayment = new Payment(OrdPaymentLine[0], OrdPaymentLine[1], OrdPaymentLine[2]);
    }

    public static int getOrdCounter() {
        return OrdCounter;
    }

    public static void setOrdCounter(int OrdCounter) {
        Order.OrdCounter = OrdCounter;
    }

    public String getOrdID() {
        return OrdID;
    }

    public void setOrdID(String OrdID) {
        this.OrdID = OrdID;
    }

    public LocalDateTime getOrdCreateDT() {
        return OrdCreateDT;
    }

    public void setOrdCreateDT(LocalDateTime OrdCreateDT) {
        this.OrdCreateDT = OrdCreateDT;
    }

    public OrderStatus getOrdStatus() {
        return OrdStatus;
    }

    public void setOrdStatus(OrderStatus OrdStatus) {
        this.OrdStatus = OrdStatus;
    }

    public String getOrdShipment() {
        return OrdShipment;
    }

    public void setOrdShipment(String OrdShipment) {
        this.OrdShipment = OrdShipment;
    }

    public double getOrdAmt() {
        return OrdAmt;
    }

    public void setOrdAmt(double OrdAmt) {
        this.OrdAmt = OrdAmt;
    }

    public Payment getOrdPayment() {
        return OrdPayment;
    }

    public void setOrdPayment(Payment OrdPayment) {
        this.OrdPayment = OrdPayment;
    }

//     public void generateOrdID() {
//        String numOrdID = String.format("%06d", getOrdIDCounter());
//        //https://www.mysamplecode.com/2012/03/java-add-leading-zeros-number.html
//        setOrdID("ORD" + String.format("%06d", getOrdIDCounter()));
//        setOrdIDCounter(getOrdIDCounter() + 1);
//    }
    public static void addOrdCounter() {
        Order.OrdCounter += 1;
    }

    public static void minusOrdCounter() {
        Order.OrdCounter -= 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrdID);
        sb.append("\t").append(OrdStatus);
        sb.append("\t").append(OrdCreateDT);
        sb.append("\t").append(OrdModifyDT);
        if(OrdShipment.isEmpty()){
            sb.append("\t").append("-");
        }
        else{
            sb.append("\t").append(OrdShipment);
        }
        sb.append("\t").append(OrdAmt);
        sb.append("\t").append(OrdPayment);
        sb.append("\t").append(getOrdItemsIDs());
        for (OrderItem oi : OrdItems) {
            sb.append("\n").append(oi);
        }
        return sb.toString();
    }

    public static Order searchOrderFromID(String ordID) {
        Order order = new Order();
        try {
            for (Order ord : OrdList) {
                if (ord.getOrdID().equals(ordID)) {
                    order = ord;
                    return order;
                }
            }
            throw (new Exception("Order not found!" + ordID));
        } catch (Exception e) {
            System.out.println(e);
        }
        return order;
    }

    public static ArrayList<Order> searchOrdersFromIDs(String[] OrdersIDs) {
        ArrayList<Order> Orders = new ArrayList<>();
        if (!OrdersIDs[0].equals("-")) {
            try {
                for (String id : OrdersIDs) {
                    for (Order ord : OrdList) {
                        if (ord.getOrdID().equals(id)) {
                            Orders.add(ord);
                        }
                    }
                }
                if (Orders.isEmpty()) {
                    throw (new Exception("Order not found!" + OrdersIDs));
                } else {
                    return Orders;
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return Orders;
    }

//    public static Order parseOrdFromString(String ordLine) {
//        String[] ord = new String[6];
////        ArrayList<OrderItem> ordItems = new ArrayList();
//        try {
//            System.out.println(ordLine);
//            String[] ordData = ordLine.split("\t");
//            if (ordData.length != 7) {
//                throw (new Exception("Order is incomplete!" + ordLine));
//            } else {
//                ord[0] = ordData[0];
//                ord[1] = ordData[1];
//                ord[2] = ordData[2];
//                ord[3] = ordData[3];
//                ord[4] = ordData[4];
//                ord[5] = ordData[5];
////                String[] ordOrdItemsIDsData = ordData[5].split(",");
////                for (String id : ordOrdItemsIDsData) {
////                    for (OrderItem oi : OIList) {
////                        if (oi.getOIID().equals(id)) {
////                            ordItems.add(oi);
////                        }
////                    }
////                }
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return new Order(ord[0], OrderStatus.valueOf(ord[1]), LocalDateTime.parse(ord[2]), LocalDateTime.parse(ord[3]), ord[4], ord[5]);
//    }
}
