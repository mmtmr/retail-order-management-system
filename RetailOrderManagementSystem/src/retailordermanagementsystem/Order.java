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

    private static int OrdCounter;//TODO Modify with Total ID
    private LocalDateTime OrdCreateDT;
    private OrderStatus OrdStatus;
    private String OrdShipment;
    private String AccID;

    public Order() {
    }

    //Create order
    public Order(String AccID) {
        this.OrdID = "OR" + String.format("%06d", OrdCounter + 1);
        this.OrdCreateDT = LocalDateTime.now();
        this.OrdStatus = OrderStatus.Waiting;
        this.AccID = AccID;
        addOrdCounter();
    }

    //Load order
    public Order(String OrdID, OrderStatus OrdStatus, LocalDateTime OrdCreateDT, LocalDateTime OrdModifyDT, String OrdShipment, String AccID) {
        super(OrdID, OrdModifyDT);
        this.OrdCreateDT = OrdCreateDT;
        this.OrdStatus = OrdStatus;
        this.OrdShipment = OrdShipment;
        this.AccID = AccID;
        addOrdCounter();
    }

    public static int getOrdCounter() {
        return OrdCounter;
    }

    public static void setOrdCounter(int OrdCounter) {
        Order.OrdCounter = OrdCounter;
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

    public String getAccID() {
        return AccID;
    }

    public void setAccID(String AccID) {
        this.AccID = AccID;
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
        return OrdID + "\t" + OrdStatus + "\t" + OrdCreateDT + "\t" + OrdModifyDT + "\t" + OrdShipment + "\t" + AccID + "\t" + getOrdItemsIDs();
    }

    public static ArrayList<Order> searchOrdersFromIDs(String[] OrdersIDs) {
        ArrayList<Order> Orders = new ArrayList<>();
        if (OrdersIDs[0] != null) {
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

    public static Order parseOrdFromString(String ordLine) {
        String[] ord = new String[6];
//        ArrayList<OrderItem> ordItems = new ArrayList();
        try {
            System.out.println(ordLine);
            String[] ordData = ordLine.split("\t");
            if (ordData.length != 7) {
                throw (new Exception("Order is incomplete!" + ordLine));
            } else {
                ord[0] = ordData[0];
                ord[1] = ordData[1];
                ord[2] = ordData[2];
                ord[3] = ordData[3];
                ord[4] = ordData[4];
                ord[5] = ordData[5];
//                String[] ordOrdItemsIDsData = ordData[5].split(",");
//                for (String id : ordOrdItemsIDsData) {
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
        return new Order(ord[0], OrderStatus.valueOf(ord[1]), LocalDateTime.parse(ord[2]), LocalDateTime.parse(ord[3]), ord[4], ord[5]);
    }
}
