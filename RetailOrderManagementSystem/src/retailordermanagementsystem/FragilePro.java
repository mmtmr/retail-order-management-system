/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.util.ArrayList;


/**
 *
 * @author Maxine
 */
public class FragilePro extends ProductDetails {

   public FragilePro() {
    }

    public FragilePro(String ProID, String ProName, double ProPackingCharge, double ProWeight, ProductType ProCategory) {
        super(ProID, ProName, ProPackingCharge, ProWeight, ProCategory);
    }

    public FragilePro(String ProName, double ProWeight, ProductType ProCategory) {
        super(ProName, ProWeight, ProCategory);
        this.ProID = "P0" + this.ProID;
        if ((ProWeight / 0.50 * 6.00) % 6.00 != 0) {
            this.ProPackingCharge = ProWeight / 0.50 * 6.00 - ((ProWeight / 0.50 * 6.00) % 6.00) + 6.00;//6 Ringgit per 0.5kg
        } else {
            this.ProPackingCharge = ProWeight / 0.50 * 6.00;
        }
    }

    public FragilePro(String[] ProLine) {
        super(ProLine);
    }
}
