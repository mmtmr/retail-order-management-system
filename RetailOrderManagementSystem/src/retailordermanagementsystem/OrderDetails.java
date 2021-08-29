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

    protected String OrdID; //ORD000001
    protected LocalDateTime OrdModifyDT;
    protected ArrayList<OrderItem> OrdItems;

    public OrderDetails() {
        this.OrdModifyDT = LocalDateTime.now();
        this.OrdItems = new ArrayList<>();
    }

    public OrderDetails(String OrdID, LocalDateTime OrdModifyDT) {
        this.OrdID = OrdID;
        this.OrdModifyDT = OrdModifyDT;
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
    
    //Create
    public void setOrdItems(Order OIOrd, Product OIPro, int OIQuantity, String OIModel) {
        OrdItems.add(new OrderItem(OIPro, OIID, OIQuantity, OIModel, OIPrice, OIPackingCharge));
    }
    
    //Load
    public void setOrdItems(Product OIPro, String OIID, int OIQuantity, String OIModel, double OIPrice, double OIPackingCharge) {
        OrdItems.add(new OrderItem(OIPro, OIID, OIQuantity, OIModel, OIPrice, OIPackingCharge));
    }
    
    public String getOrdItemsIDs() {
        //String OrdItemsIDs = "[";
        String OrdItemsIDs = "";
        if (!OrdItems.isEmpty()) {
            for (OrderItem item : OrdItems) {
                OrdItemsIDs = OrdItemsIDs + item.getOIID() + ',';
            }

            if (OrdItemsIDs.charAt(OrdItemsIDs.length() - 1) == ',') {
                OrdItemsIDs = OrdItemsIDs.substring(0, OrdItemsIDs.length() - 2);
            }
        } else {
            OrdItemsIDs="null";
        }
        //OrdItemsIDs = OrdItemsIDs + ']';
        return OrdItemsIDs;
    }

    @Override
    public abstract String toString();

}
