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
public class OrderItem extends Product {

    private Product OIPro;
    private String OIID; //ORD001-P001000101
    private int OIQuantity;
    private String OIModel;
    private double OIPrice;
    private double OIPackingCharge;

    public OrderItem() {
    }

    public OrderItem(Product OIPro, String OIID, int OIQuantity, String OIModel, double OIPrice, double OIPackingCharge) {
        this.OIPro = OIPro;
        this.OIID = OIID;
        this.OIQuantity = OIQuantity;
        this.OIModel = OIModel;
        this.OIPrice = OIPrice;
        this.OIPackingCharge = OIPackingCharge;
    }

//    public OrderItem(Product Pro, String OIID, int OIQuantity, String OIModel, double OIPrice, double OIPackingCharge) {
//        super(Pro);
//        this.OIID = OIID;
//        this.OIQuantity = OIQuantity;
//        this.OIModel = OIModel;
//        this.OIPrice = OIPrice;
//        this.OIPackingCharge = OIPackingCharge;
//    }
    public OrderItem(Order OIOrd, Product OIPro, int OIQuantity, String OIModel) {
        this.OIPro = OIPro;
        this.OIQuantity = OIQuantity;
        this.OIModel = OIModel;
        int index = 0;
        for (ProModel model : OIPro.getProModels()) {
            if (model.getPMName().equals(OIModel)) {
                model.minusPMStock(this.OIQuantity);
                this.OIID = OIOrd.getOrdID() + '-' + OIPro.getProID() + String.format("%02d", index + 1);
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

    @Override
    public String toString() {
        return OIID + "\t" + OIQuantity + "\t" + OIModel + "\t" + OIPrice + "\t" + OIPackingCharge;
    }

    public static OrderItem parseOIFromString(String oiLine, ArrayList<Product> ProList) {

        String[] oi = new String[5];
        Product oiPro = new Product();
        try {
            System.out.println(oiLine);
            String[] oiData = oiLine.split("\t");
            if (oiLine.length() != 5) {
                throw (new Exception("Order Item is incomplete!" + oiLine));
            } else {
                String[] oiIDData = oiData[0].split("-");
                if ("P0".equals(oiIDData[1].substring(0, 1))) {
                    for (Product pro : ProList) {
                        if (pro.getProID().equals(oiIDData[1].substring(0, 10))) {
                            oiPro=pro;
                        }
                    }
                }
                oi = oiData.clone();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        //Product OIPro, String OIID, int OIQuantity, String OIModel, double OIPrice, double OIPackingCharge
        return new OrderItem(oiPro, oi[0], Integer.parseInt(oi[1]), oi[2], Double.parseDouble(oi[3]), Double.parseDouble(oi[4]));
    }

}
