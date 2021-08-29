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
public abstract class ProductDetails {
    //https://stackoverflow.com/a/8353371

    protected String ProID; //Metadata Idea: P0010001001
    private String ProName;
    private double ProWeight;
    private ProductType ProCategory;
    protected double ProPackingCharge;
    private static int ProStationeryCounter, ProFoodCounter, ProFashionCounter, ProOtherCounter;
    protected ArrayList<ProModel> ProModels;

    public ProductDetails() {

    }

    //Load
    public ProductDetails(String ProID, String ProName, double ProWeight, double ProPackingCharge, ProductType ProCategory) {
        this.ProID = ProID;
        this.ProName = ProName;
        this.ProWeight = ProWeight;
        this.ProPackingCharge = ProPackingCharge;
        this.ProCategory = ProCategory;
        this.ProModels = new ArrayList();
        addProCategoryCounter(this.ProCategory);
    }

    public ProductDetails(String[] ProLine) {
        this.ProID = ProLine[0];
        this.ProName = ProLine[1];
        this.ProWeight = Double.parseDouble(ProLine[2]);
        this.ProPackingCharge = Double.parseDouble(ProLine[3]);
        this.ProCategory = ProductType.valueOf(ProLine[4]);
        this.ProModels = new ArrayList();
        addProModelsList(ProLine[5], ProLine[6]);
        addProCategoryCounter(this.ProCategory);

    }

    //https://www.geeksforgeeks.org/passing-and-returning-objects-in-java/
    //Create, should be inherited by ProModel
    public ProductDetails(String ProName, double ProWeight, ProductType ProCategory) {
        this.ProName = ProName;
        this.ProWeight = ProWeight;
        this.ProCategory = ProCategory;
        this.ProModels = new ArrayList();
        addProCategoryCounter(this.ProCategory);
        switch (this.ProCategory) {
            case Stationery:
                this.ProID = String.format("%02d", this.ProCategory.ordinal() + 1) + String.format("%04d", ProStationeryCounter + 1);
                break;
            case Food:
                this.ProID = String.format("%02d", this.ProCategory.ordinal() + 1) + String.format("%04d", ProFoodCounter + 1);
                break;
            case Fashion:
                this.ProID = String.format("%02d", this.ProCategory.ordinal() + 1) + String.format("%04d", ProFashionCounter + 1);
                break;
            case Other:
                this.ProID = String.format("%02d", this.ProCategory.ordinal() + 1) + String.format("%04d", ProOtherCounter + 1);
                break;
        }

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

//    public double getProPrice() {
//        return ProPrice;
//    }
//
//    public void setProPrice(double ProPrice) {
//        this.ProPrice = ProPrice;
//    }
//
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

    public static int getProStationeryCounter() {
        return ProStationeryCounter;
    }

    public static void setProStationeryCounter(int ProStationeryCounter) {
        ProductDetails.ProStationeryCounter = ProStationeryCounter;
    }

    public static int getProFoodCounter() {
        return ProFoodCounter;
    }

    public static void setProFoodCounter(int ProFoodCounter) {
        ProductDetails.ProFoodCounter = ProFoodCounter;
    }

    public static int getProFashionCounter() {
        return ProFashionCounter;
    }

    public static void setProFashionCounter(int ProFashionCounter) {
        ProductDetails.ProFashionCounter = ProFashionCounter;
    }

    public static int getProOtherCounter() {
        return ProOtherCounter;
    }

    public static void setProOtherCounter(int ProOtherCounter) {
        ProductDetails.ProOtherCounter = ProOtherCounter;
    }

    public ArrayList<ProModel> getProModels() {
        return ProModels;
    }

    public void setProModels(ArrayList<ProModel> ProModels) {
        this.ProModels = ProModels;
    }

//    public void addProModel(ProModel ProModel) {
//        ProModels.add(ProModel);
//    }
//
//    public void removeProModel(ProModel ProModel) {
//        ProModels.remove(ProModel);
//    }
    public String getProModelsList() {
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
            ProModelsList = ProModelsList.substring(1, ProModelsList.length());
        }

        if (ProModelsList.charAt(ProModelsList.length() - 1) == ',') {
            ProModelsList = ProModelsList.substring(0, ProModelsList.length() - 1);
        }

        //SupProductsIDs = SupProductsIDs + ']';
        return ProModelsList;
    }

    public final void addProModelsList(String ProModelsNames, String ProModelsStocks) {
        try {
            String[] proModelsNames = ProModelsNames.split(",");
            String[] proModelsStocks = ProModelsStocks.split(",");
            if (proModelsNames.length != proModelsStocks.length) {
                throw (new Exception("Product Model is incomplete!" + ProModelsNames));
            } else {
                for (int i = 0; i < proModelsNames.length; i++) {
                    ProModels.add(new ProModel(proModelsNames[i], Integer.parseInt(proModelsStocks[i])));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return ProID + "\t" + ProName + "\t" + ProWeight + "\t" + ProPackingCharge + "\t" + ProCategory + "\t" + getProModelsList();
    }

    //    public ProductDetails(String ProID, String ProName, double ProWeight, double ProPackingCharge, ProductType ProCategory) {
    public static String[] parseProFromString(String proLine) throws Exception {
        String[] proData = proLine.split("\t");
        if (proData.length != 7) {
            throw (new Exception("Product is incomplete!" + proLine));
        } else {
            return proData;
        }
    }

    public static void buildProFromString(String proLine) {
        try {
            String[] ProLine = parseProFromString(proLine);
            if (ProLine[0].contains("P0")) {
                Operation.ProList.add(new Product(ProLine));
            } else if (ProLine[0].contains("P1")) {
                Operation.ProList.add(new FragilePro(ProLine));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
