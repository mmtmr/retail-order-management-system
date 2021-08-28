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
public class Order extends OrderDetails {
    
    private static int OrdCounter;//TODO Modify with Total ID
    private LocalDateTime OrdCreateDT;
    private OrderStatus OrdStatus;
    private String OrdShipment;

    public Order() {
        this.OrdID = "OR" + String.format("%06d", OrdCounter + 1);
        this.OrdCreateDT = LocalDateTime.now();
        this.OrdStatus = OrderStatus.Waiting;
        addOrdCounter();
    }

    public Order(String OrdID, OrderStatus OrdStatus, LocalDateTime OrdCreateDT, LocalDateTime OrdModifyDT, String OrdShipment, ArrayList<OrderItem> OrdItems) {
        super(OrdID, OrdModifyDT, OrdItems);
        this.OrdStatus = OrdStatus;
        this.OrdShipment = OrdShipment;
        this.OrdCreateDT = OrdCreateDT;
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
        return OrdID + "\t" + OrdStatus + "\t" + OrdCreateDT + "\t" + OrdModifyDT + "\t" + OrdShipment + "\t" + getOrdItemsIDs();
    }
    
     public static Order parseOrdFromString(String ordLine, ArrayList<OrderItem> OIList){
        String[] ord = new String[5];
        ArrayList<OrderItem> ordItems=new ArrayList();
        try {
            System.out.println(ordLine);
            String[] ordData = ordLine.split("\t");
            if (ordData.length != 6) {
                throw (new Exception("Order is incomplete!" + ordLine));
            } else {
                ord[0]=ordData[0];
                ord[1]=ordData[1];
                ord[2]=ordData[2];
                ord[3]=ordData[3];
                ord[4]=ordData[4];
                String[] ordOrdItemsIDsData = ordData[5].split(",");
                for (String id : ordOrdItemsIDsData) {
                    for (OrderItem oi : OIList) {
                        if (oi.getOIID().equals(id)) {
                            ordItems.add(oi);
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return new Order(ord[0],OrderStatus.valueOf(ord[1]), LocalDateTime.parse(ord[2]), LocalDateTime.parse(ord[3]),ord[4],ordItems);
    }
}
