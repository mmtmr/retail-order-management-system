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
public class ShoppingCart extends OrderDetails {

    public ShoppingCart() {
    }

    
    public ShoppingCart(String AccID) {
        this.OrdID = "SPC" + AccID.substring(2, AccID.length());
    }

    public ShoppingCart(String OrdID, LocalDateTime OrdModifyDT) {
        super(OrdID, OrdModifyDT);
    }

    
    @Override
    public String toString() {
        return OrdID + "\t" + OrdModifyDT + "\t" + getOrdItemsIDs();
    }

    public static ShoppingCart parseSCFromString(String scLine) {
        String[] sc = new String[2];
        //ArrayList<OrderItem> ordItems = new ArrayList();
        try {
            System.out.println(scLine);
            String[] scData = scLine.split("\t");
            if (scData.length != 3) {
                throw (new Exception("Shopping Cart is incomplete!" + scLine));
            } else {
                sc=scData.clone();
                sc[0] = scData[0];
                sc[1] = scData[1];
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
        return new ShoppingCart(sc[0], LocalDateTime.parse(sc[1]));
    }
    
}
