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
public class Product {

    //https://stackoverflow.com/a/8353371
    protected String ProID; //Metadata Idea: P0010001001
    private String ProName;
    private double ProPrice;
    protected double ProPackingCharge;
    private double ProWeight;
    private ArrayList<ProModel> ProModels;
    private ProductType ProCategory;
    private static int ProStationeryCounter, ProFoodCounter, ProFashionCounter, ProOtherCounter;

    public Product() {

    }

    //https://www.geeksforgeeks.org/passing-and-returning-objects-in-java/
//    public Product(Product Pro) {
//        this.ProID = Pro.ProID;
//        this.ProName = Pro.ProName;
//        this.ProStock = Pro.ProStock;
//        this.ProPrice = Pro.ProPrice;
//        this.ProPackingCharge = Pro.ProPackingCharge;
//        this.ProWeight = Pro.ProWeight;
//        this.ProModels = Pro.ProModels;
//        this.ProCategory = Pro.ProCategory;
//        //addProCategoryCounter(this.ProCategory);
//    }
    public Product(String ProName, double ProPrice, double ProWeight, String ProModelsNames, String ProModelsStocks, ProductType ProCategory) {
        this.ProName = ProName;
        this.ProPrice = ProPrice;
        this.ProWeight = ProWeight;
        String[] PMNames = ProModelsNames.split(",");
        String[] PMStocks = ProModelsStocks.split(",");
        for (int i = 0; i < PMNames.length; i++) {
            this.ProModels.add(new ProModel(PMNames[i], Integer.parseInt(PMStocks[i])));
        }
        this.ProCategory = ProCategory;
        addProCategoryCounter(this.ProCategory);
        switch (this.ProCategory) {
            case Stationery:
                this.ProID = "P0" + String.format("%02d", this.ProCategory.ordinal() + 1) + String.format("%04d", ProStationeryCounter + 1);
                //ProStationeryCounter+=1;
                break;
            case Food:
                this.ProID = "P0" + String.format("%02d", this.ProCategory.ordinal() + 1) + String.format("%04d", ProFoodCounter + 1);
                //ProFoodCounter+=1;
                break;
            case Fashion:
                this.ProID = "P0" + String.format("%02d", this.ProCategory.ordinal() + 1) + String.format("%04d", ProFashionCounter + 1);
                //ProFashionCounter+=1;
                break;
            case Other:
                this.ProID = "P0" + String.format("%02d", this.ProCategory.ordinal() + 1) + String.format("%04d", ProOtherCounter + 1);
                //ProOtherCounter+=1;
                break;

        }
//        this.ProPackingCharge = this.ProWeight/0.50*6.00 - ((this.ProWeight/0.50*6.00) % 6.00) + 6.00;
        if ((this.ProWeight / 0.50 * 6.00) % 6.00 != 0) {
            this.ProPackingCharge = this.ProWeight / 0.50 * 6.00 - ((this.ProWeight / 0.50 * 6.00) % 6.00) + 6.00;//6 Ringgit per 0.5kg
        } else {
            this.ProPackingCharge = this.ProWeight / 0.50 * 6.00;
        }
    }

    public Product(String ProID, String ProName, double ProPrice, double ProPackingCharge, double ProWeight, String ProModelsNames, String ProModelsStocks, ProductType ProCategory) {
        this.ProID = ProID;
        this.ProName = ProName;
        this.ProPrice = ProPrice;
        this.ProPackingCharge = ProPackingCharge;
        this.ProWeight = ProWeight;
        String[] PMNames = ProModelsNames.split(",");
        String[] PMStocks = ProModelsStocks.split(",");
        for (int i = 0; i < PMNames.length; i++) {
            this.ProModels.add(new ProModel(PMNames[i], Integer.parseInt(PMStocks[i])));
        }
        this.ProCategory = ProCategory;
        addProCategoryCounter(this.ProCategory);
    }

    public String getProID() {
        return ProID;
    }

    public void setProID(String ProID) {
        this.ProID = ProID;
    }

    public String getProName() {
        return ProName;
    }

    public void setProName(String ProName) {
        this.ProName = ProName;
    }

    public double getProPrice() {
        return ProPrice;
    }

    public void setProPrice(double ProPrice) {
        this.ProPrice = ProPrice;
    }

    public double getProPackingCharge() {
        return ProPackingCharge;
    }

    public void setProPackingCharge(double ProPackingCharge) {
        this.ProPackingCharge = ProPackingCharge;
    }

    public double getProWeight() {
        return ProWeight;
    }

    public void setProWeight(double ProWeight) {
        this.ProWeight = ProWeight;
    }

    public ArrayList<ProModel> getProModels() {
        return ProModels;
    }

    public void setProModels(ArrayList<ProModel> ProModels) {
        this.ProModels = ProModels;
    }

    public ProductType getProCategory() {
        return ProCategory;
    }

    public void setProCategory(ProductType ProCategory) {
        this.ProCategory = ProCategory;
    }

    public static void addProCategoryCounter(ProductType ProCategory) {
        switch (ProCategory) {
            case Stationery:
                ProStationeryCounter += 1;
                break;
            case Food:
                ProFoodCounter += 1;
                break;
            case Fashion:
                ProFashionCounter += 1;
                break;
            case Other:
                ProOtherCounter += 1;
                break;
        }
    }

    //Only Call when Cancel, Not Delete
    public static void minusProCategoryCounter(ProductType ProCategory) {
        switch (ProCategory) {
            case Stationery:
                ProStationeryCounter -= 1;
                break;
            case Food:
                ProFoodCounter -= 1;
                break;
            case Fashion:
                ProFashionCounter -= 1;
                break;
            case Other:
                ProOtherCounter -= 1;
                break;
        }
    }

//    public void generateProID(){
//        //https://stackoverflow.com/a/13792127
//        this.ProID='P'+String.format("%03d", getProCategory().ordinal()+1);
//    }
    public static int getProStationeryCounter() {
        return ProStationeryCounter;
    }

    public static void setProStationeryCounter(int ProStationeryCounter) {
        Product.ProStationeryCounter = ProStationeryCounter;
    }

    public static int getProFoodCounter() {
        return ProFoodCounter;
    }

    public static void setProFoodCounter(int ProFoodCounter) {
        Product.ProFoodCounter = ProFoodCounter;
    }

    public static int getProFashionCounter() {
        return ProFashionCounter;
    }

    public static void setProFashionCounter(int ProFashionCounter) {
        Product.ProFashionCounter = ProFashionCounter;
    }

    public static int getProOtherCounter() {
        return ProOtherCounter;
    }

    public static void setProOtherCounter(int ProOtherCounter) {
        Product.ProOtherCounter = ProOtherCounter;
    }

    public String getProModelsList() {
        //String ProModelsList = "[";
        String ProModelsList;
        //https://stackoverflow.com/questions/599161/best-way-to-convert-an-arraylist-to-a-string
        StringBuilder ProModelsListBuilder = new StringBuilder();
        for (ProModel model : ProModels) {
            ProModelsListBuilder.append(",");
            ProModelsListBuilder.append(model.getPMName());
        }

        ProModelsListBuilder.append("\t");
        for (ProModel model : ProModels) {
            ProModelsListBuilder.append(model.getPMStock());
            ProModelsListBuilder.append(",");
        }
        ProModelsList = ProModelsListBuilder.toString();

        if (ProModelsList.charAt(0) == ',') {
            ProModelsList = ProModelsList.substring(1, ProModelsList.length() - 1);
        }

        if (ProModelsList.charAt(ProModelsList.length() - 1) == ',') {
            ProModelsList = ProModelsList.substring(0, ProModelsList.length() - 2);
        }

        //SupProductsIDs = SupProductsIDs + ']';
        return ProModelsList;
    }

    

    @Override
    public String toString() {
        return ProID + "\t" + ProName + "\t" + ProPrice + "\t" + ProPackingCharge + "\t" + ProWeight + "\t" + getProModelsList() + "\t" + ProCategory;
    }

    public static Product parseProFromString(String proLine) {
        String[] pro = new String[8];
        try {
            System.out.println(proLine);
            String[] proData = proLine.split("\t");
            if (proData.length != 8) {
                throw (new Exception("Product is incomplete!" + proLine));
            } else {
                pro = proData.clone();

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return new Product(pro[0], pro[1], Double.parseDouble(pro[2]), Double.parseDouble(pro[3]), Double.parseDouble(pro[4]), pro[5], pro[6], ProductType.valueOf(pro[7]));
    }

}
