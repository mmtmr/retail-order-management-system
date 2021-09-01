/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.util.ArrayList;
import static retailordermanagementsystem.Operation.ProList;

/**
 *
 * @author Maxine
 */
public class Product {
    //https://stackoverflow.com/a/8353371

    protected String ProID; //Metadata Idea: P0010001001
    private String ProName;
    private double ProPrice;
    private double ProWeight;
    private ProductType ProCategory;
    protected double ProPackingCharge;
    private static int ProStationeryCounter, ProFoodCounter, ProFashionCounter, ProOtherCounter;
    private boolean ProFragile;
    protected ArrayList<ProModel> ProModels;

    public Product() {

    }

    public Product(Product Pro) {
        this.ProID = Pro.ProID;
        this.ProName = Pro.ProName;
        this.ProPrice = Pro.ProPrice;
        this.ProWeight = Pro.ProWeight;
        this.ProCategory = Pro.ProCategory;
        this.ProPackingCharge = Pro.ProPackingCharge;
        this.ProFragile = Pro.ProFragile;
        this.ProModels = Pro.ProModels;
    }

    //Load
    public Product(String ProID, String ProName, double ProPrice, double ProWeight, double ProPackingCharge, ProductType ProCategory, String[][] ProModelsLine) {
        this.ProID = ProID;
        this.ProName = ProName;
        this.ProPrice = ProPrice;
        this.ProWeight = ProWeight;
        this.ProPackingCharge = ProPackingCharge;
        this.ProCategory = ProCategory;
        if ("1".equals(this.ProID.substring(1, 2))) {
            this.ProFragile = true;
        } else if ("0".equals(this.ProID.substring(1, 2))) {
            this.ProFragile = false;
        }
        this.ProModels = new ArrayList();
        this.addProModelsList(ProModelsLine);
    }

    //Load
    public Product(String ProID, String ProName, double ProPrice, double ProWeight, ProductType ProCategory, double ProPackingCharge, boolean ProFragile, String[][] ProModelsLine) {
        this.ProID = ProID;
        this.ProName = ProName;
        this.ProPrice = ProPrice;
        this.ProWeight = ProWeight;
        this.ProCategory = ProCategory;
        this.ProPackingCharge = ProPackingCharge;
        this.ProFragile = ProFragile;
        this.ProModels = new ArrayList();
        this.addProModelsList(ProModelsLine);
    }

    //Load from String Array
    public Product(String[] ProLine, String[][] ProModelsLine) {
        this.ProID = ProLine[0];
        this.ProName = ProLine[1];
        this.ProPrice = Double.parseDouble(ProLine[2]);
        this.ProWeight = Double.parseDouble(ProLine[3]);
        this.ProPackingCharge = Double.parseDouble(ProLine[4]);
        this.ProCategory = ProductType.valueOf(ProLine[5]);

        if ("1".equals(this.ProID.substring(1, 2))) {
            this.ProFragile = true;
        } else if ("0".equals(this.ProID.substring(1, 2))) {
            this.ProFragile = false;
        }
        this.ProModels = new ArrayList();
        this.addProModelsList(ProModelsLine);
    }

    //https://www.geeksforgeeks.org/passing-and-returning-objects-in-java/
    //Create
    public Product(String ProName, double ProPrice, double ProWeight, ProductType ProCategory, boolean ProFragile, String[][] ProModelsLine) {

        this.ProName = ProName;
        this.ProPrice = ProPrice;
        this.ProWeight = ProWeight;
        this.ProCategory = ProCategory;
        this.ProFragile = ProFragile;
        this.ProModels = new ArrayList();
        this.addProModelsList(ProModelsLine);
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

        if (!this.ProFragile) {
            this.ProID = "P0" + this.ProID;
            if ((this.ProWeight / 0.50 * 6.00) % 6.00 != 0) {
                this.ProPackingCharge = this.ProWeight / 0.50 * 6.00 - ((this.ProWeight / 0.50 * 6.00) % 6.00) + 6.00;//6 Ringgit per 0.5kg
            } else {
                this.ProPackingCharge = this.ProWeight / 0.50 * 6.00;
            }
        } else {
            this.ProID = "P1" + this.ProID;
            if ((this.ProWeight / 0.50 * 10.00) % 10.00 != 0) {
                this.ProPackingCharge = this.ProWeight / 0.50 * 10.00 - ((this.ProWeight / 0.50 * 10.00) % 10.00) + 10.00;//10 Ringgit per 0.5kg
            } else {
                this.ProPackingCharge = this.ProWeight / 0.50 * 10.00;
            }
        }

        addProCategoryCounter(this.ProCategory);

    }

    public Product(String ProName, double ProPrice, double ProWeight, ProductType ProCategory, boolean ProFragile, String PMName, int PMStock) {

        this.ProName = ProName;
        this.ProPrice = ProPrice;
        this.ProWeight = ProWeight;
        this.ProCategory = ProCategory;
        this.ProFragile = ProFragile;
        this.ProModels = new ArrayList();
        ProModels.add(new ProModel(PMName, PMStock));
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

        if (!this.ProFragile) {
            this.ProID = "P0" + this.ProID;
            if ((this.ProWeight / 0.50 * 6.00) % 6.00 != 0) {
                this.ProPackingCharge = this.ProWeight / 0.50 * 6.00 - ((this.ProWeight / 0.50 * 6.00) % 6.00) + 6.00;//6 Ringgit per 0.5kg
            } else {
                this.ProPackingCharge = this.ProWeight / 0.50 * 6.00;
            }
        } else {
            this.ProID = "P1" + this.ProID;
            if ((this.ProWeight / 0.50 * 10.00) % 10.00 != 0) {
                this.ProPackingCharge = this.ProWeight / 0.50 * 10.00 - ((this.ProWeight / 0.50 * 10.00) % 10.00) + 10.00;//10 Ringgit per 0.5kg
            } else {
                this.ProPackingCharge = this.ProWeight / 0.50 * 10.00;
            }
        }

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

    public ArrayList<ProModel> getProModels() {
        return ProModels;
    }

    public void setProModels(ArrayList<ProModel> ProModels) {
        this.ProModels = ProModels;
    }

    public void addProModel(ProModel ProModel) {
        ProModels.add(ProModel);
    }

    public void removeProModel(ProModel ProModel) {
        ProModels.remove(ProModel);
    }

    public boolean isProFragile() {
        return ProFragile;
    }

    public void setProFragile(boolean ProFragile) {
        this.ProFragile = ProFragile;
    }

    public String getProModelsNames() {
        String ProModelsNames;
        //https://stackoverflow.com/questions/599161/best-way-to-convert-an-arraylist-to-a-string
        StringBuilder ProModelsNamesBuilder = new StringBuilder();
        for (ProModel model : ProModels) {
            ProModelsNamesBuilder.append(",");
            ProModelsNamesBuilder.append(model.getPMName());
        }
        ProModelsNames = ProModelsNamesBuilder.toString();
        if (ProModelsNames.charAt(0) == ',') {
            ProModelsNames = ProModelsNames.substring(1, ProModelsNames.length());
        }

        if (ProModelsNames.charAt(ProModelsNames.length() - 1) == ',') {
            ProModelsNames = ProModelsNames.substring(0, ProModelsNames.length() - 1);
        }

        //SupProductsIDs = SupProductsIDs + ']';
        return ProModelsNames;
    }

    public String getProModelsStocks() {
        String ProModelsStocks;
        //https://stackoverflow.com/questions/599161/best-way-to-convert-an-arraylist-to-a-string
        StringBuilder ProModelsStocksBuilder = new StringBuilder();
        for (ProModel model : ProModels) {
            ProModelsStocksBuilder.append(",");
            ProModelsStocksBuilder.append(model.getPMStock());
        }
        ProModelsStocks = ProModelsStocksBuilder.toString();
        if (ProModelsStocks.charAt(0) == ',') {
            ProModelsStocks = ProModelsStocks.substring(1, ProModelsStocks.length());
        }

        if (ProModelsStocks.charAt(ProModelsStocks.length() - 1) == ',') {
            ProModelsStocks = ProModelsStocks.substring(0, ProModelsStocks.length() - 1);
        }

        //SupProductsIDs = SupProductsIDs + ']';
        return ProModelsStocks;
    }

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

    public final void addProModelsList(String[][] ProModelsLine) {
        int proStock;
        try {
            for (String[] proModel : ProModelsLine) {
                proStock = Integer.parseInt(proModel[1]);
                ProModels.add(new ProModel(proModel[0], proStock));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean validateStockFromModel(String OIModel, int OIQuantity) throws Exception {
        for (ProModel model : ProModels) {
            if (model.getPMName().equals(OIModel)) {
                if (model.getPMStock() < OIQuantity) {
                    throw new Exception("Sorry, the current stock left is " + model.getPMStock());
                }
                else{
                    return true;
                }
            }
        }
        throw new Exception("Model does not exist");
    }

//    public static ArrayList<Product> searchProsFromIDs(String[] ProIDs) {
//        ArrayList<Product> Products = new ArrayList<>();
//        if (ProIDs[0] != null) {
//            try {
//                for (String id : OrdersIDs) {
//                    for (Order ord : ProList) {
//                        if (ord.getOrdID().equals(id)) {
//                            Orders.add(ord);
//                        }
//                    }
//                }
//                if (Orders.isEmpty()) {
//                    throw (new Exception("Order not found!" + OrdersIDs));
//                } else {
//                    return Orders;
//                }
//
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//        return Orders;
//    }
    public static Product searchProFromID(String proID) {
        Product product = new Product();
        if (!proID.equals("-")) {
            try {
                for (Product pro : ProList) {
                    if (pro.getProID().equals(proID)) {
                        product = pro;
                        return product;
                    }
                }
                throw (new Exception("Product not found!" + proID));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return product;
    }

    @Override
    public String toString() {
        return ProID + "\t" + ProName + "\t" + ProPrice + "\t" + ProWeight + "\t" + ProPackingCharge + "\t" + ProCategory + "\t" + getProModelsList();
    }

    //    public Product(String ProID, String ProName, double ProWeight, double ProPackingCharge, ProductType ProCategory) {
    public static String[] parseProFromString(String proLine) throws Exception {
        String[] proData = proLine.split("\t");
        if (proData.length != 8) {
            throw (new Exception("Product is incomplete!" + proLine));
        } else {
            return proData;
        }
    }

    public static void buildProFromString(String proLine) {
        try {
            String[] ProLine = parseProFromString(proLine);
            String[][] ProModelsLine = ProModel.parsePMFromString(ProLine[6], ProLine[7]);
            Operation.ProList.add(new Product(ProLine, ProModelsLine));

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
