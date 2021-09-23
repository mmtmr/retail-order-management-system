/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import static retailordermanagementsystem.Operation.opCus;

/**
 *
 * @author Maxine
 */
public class ShoppingCart extends OrderDetails {

    public ShoppingCart() {
    }

    
    //Create
    public ShoppingCart(String AccID) {
        this.OrdID = "SP0" + AccID.substring(2, AccID.length());
    }

    //Load
    public ShoppingCart(String OrdID, LocalDateTime OrdModifyDT, ArrayList<Product> OIPros, String[] OIModels, int[] OIQuantities) {
        super(OrdID, OrdModifyDT, OIPros, OIModels, OIQuantities);
    }

    
    //Load from txt
    public ShoppingCart(String OrdID, LocalDateTime OrdModifyDT) {
        super(OrdID, OrdModifyDT);
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrdID);
        sb.append("\t").append(OrdModifyDT);
        sb.append("\t").append(getOrdItemsIDs());
        for (OrderItem oi : OrdItems){
            sb.append("\n").append(oi);
        }
        return sb.toString();
    }

    
}
