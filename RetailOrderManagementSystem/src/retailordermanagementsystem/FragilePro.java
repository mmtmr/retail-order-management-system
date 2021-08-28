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
public class FragilePro extends Product {

    public FragilePro() {
    }

    public FragilePro(String ProName, double ProPrice, double ProWeight, String ProModelsNames, String ProModelsStocks, ProductType ProCategory) {
        super(ProName, ProPrice, ProWeight, ProModelsNames, ProModelsStocks, ProCategory);
        switch (ProCategory) {
            case Stationery:
                this.ProID = "P1" + String.format("%02d", ProCategory.ordinal() + 1) + String.format("%04d", getProStationeryCounter() + 1);
                //setProStationeryCounter(getProStationeryCounter()+1);
                break;
            case Food:
                this.ProID = "P1" + String.format("%02d", ProCategory.ordinal() + 1) + String.format("%04d", getProFoodCounter() + 1);
                //setProFoodCounter(getProFoodCounter()+1);
                break;
            case Fashion:
                this.ProID = "P1" + String.format("%02d", ProCategory.ordinal() + 1) + String.format("%04d", getProFashionCounter() + 1);
                //setProFashionCounter(getProFashionCounter()+1);
                break;
            case Other:
                this.ProID = "P1" + String.format("%02d", ProCategory.ordinal() + 1) + String.format("%04d", getProFashionCounter() + 1);
                //setProOtherCounter(getProFashionCounter()+1);
                break;

        }
        if ((ProWeight / 0.50 * 10.00) % 10.00 != 0) {
            ProPackingCharge = ProWeight / 0.50 * 10.00 - ((ProWeight / 0.50 * 10.00) % 10.00) + 10.00;//10 Ringgit per 0.5kg
        } else {
            ProPackingCharge = ProWeight / 0.50 * 10.00;//10 Ringgit per 0.5kg
        }
    }

    public FragilePro(String ProID, String ProName, double ProPrice, double ProPackingCharge, double ProWeight, String ProModelsNames, String ProModelsStocks, ProductType ProCategory) {
        super(ProID, ProName, ProPrice, ProPackingCharge, ProWeight, ProModelsNames, ProModelsStocks, ProCategory);
    }

//    public void generateProPackingCharge() {
//
//        double baseCharge = 10.00;
//        double realCharge = 0.00;
//
//        realCharge = getProWeight() / 0.50 * baseCharge;//10 Ringgit per 0.5kg
//
//        if (realCharge % baseCharge != 0) {
//            realCharge = realCharge - (realCharge % baseCharge) + baseCharge;
//        }
//
//        setProPackingCharge(realCharge);
//    }
}
