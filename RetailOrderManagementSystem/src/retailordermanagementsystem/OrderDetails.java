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
        this.OrdItems = new ArrayList<>();
        this.OrdModifyDT = LocalDateTime.now();
    }

    public OrderDetails(String OrdID, LocalDateTime OrdModifyDT, ArrayList<OrderItem> OrdItems) {
        this.OrdID = OrdID;
        this.OrdModifyDT = OrdModifyDT;
        this.OrdItems = OrdItems;
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

    public String getOrdItemsIDs() {
        //String OrdItemsIDs = "[";
        String OrdItemsIDs = "";
        for (OrderItem item : OrdItems) {
            OrdItemsIDs = OrdItemsIDs + item.getOIID() + ',';
        }

        if (OrdItemsIDs.charAt(OrdItemsIDs.length() - 1) == ',') {
            OrdItemsIDs = OrdItemsIDs.substring(0, OrdItemsIDs.length() - 2);
        }
        //OrdItemsIDs = OrdItemsIDs + ']';
        return OrdItemsIDs;
    }

    @Override
    public abstract String toString();
    
}
