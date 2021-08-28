/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Maxine
 */
public class Supplier {

    private String SupID;
    private String SupName;
    private PersonalInfo SupPersonInCharge;
    private ContactInfo SupCI;
    private String SupRemarks;
    private ArrayList<Product> SupProducts;
    private static int SupCounter;

    public Supplier(String PIFName, String PILName, Gender PIGender, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode) {
        this.SupID = "S" + String.format("%04d", SupCounter + 1);
        this.SupPersonInCharge = new PersonalInfo(PIFName, PILName, PIGender);
        this.SupCI = new ContactInfo(CIPhone, CIEmail, CIAddStreet, CIAddCity, CIAddState, CIAddPostcode);
        addSupCounter();
    }

    public Supplier(String SupID, String SupName, String PIFName, String PILName, Gender PIGender, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode, String SupRemarks, ArrayList<Product> SupProducts) {
        this.SupID = SupID;
        this.SupName = SupName;
        this.SupPersonInCharge = new PersonalInfo(PIFName, PILName, PIGender);
        this.SupCI = new ContactInfo(CIPhone, CIEmail, CIAddStreet, CIAddCity, CIAddState, CIAddPostcode);
        this.SupRemarks = SupRemarks;
        this.SupProducts = SupProducts;
    }

    public String getSupID() {
        return SupID;
    }

    public void setSupID(String SupID) {
        this.SupID = SupID;
    }

    public String getSupName() {
        return SupName;
    }

    public void setSupName(String SupName) {
        this.SupName = SupName;
    }

    public PersonalInfo getSupPersonInCharge() {
        return SupPersonInCharge;
    }

    public void setSupPersonInCharge(PersonalInfo SupPersonInCharge) {
        this.SupPersonInCharge = SupPersonInCharge;
    }

    public ContactInfo getSupCI() {
        return SupCI;
    }

    public void setSupCI(ContactInfo SupCI) {
        this.SupCI = SupCI;
    }

    public String getSupRemarks() {
        return SupRemarks;
    }

    public void setSupRemarks(String SupRemarks) {
        this.SupRemarks = SupRemarks;
    }

    public ArrayList<Product> getSupProducts() {
        return SupProducts;
    }

    public void setSupProducts(ArrayList<Product> SupProducts) {
        this.SupProducts = SupProducts;
    }

    public static int getSupCounter() {
        return SupCounter;
    }

    public static void setSupCounter(int SupCounter) {
        Supplier.SupCounter = SupCounter;
    }

    public static void addSupCounter() {
        Supplier.SupCounter += 1;
    }

    public static void minusSupCounter() {
        Supplier.SupCounter -= 1;
    }

    public String getSupProductsIDs() {
        //String SupProductsIDs = "[";
        String SupProductsIDs = "";
        for (Product pro : SupProducts) {
            SupProductsIDs = SupProductsIDs + pro.getProID() + ',';
        }

        if (SupProductsIDs.charAt(SupProductsIDs.length() - 1) == ',') {
            SupProductsIDs = SupProductsIDs.substring(0, SupProductsIDs.length() - 2);
        }
        //SupProductsIDs = SupProductsIDs + ']';
        return SupProductsIDs;
    }

    @Override
    public String toString() {
        return SupID + "\t" + SupName + "\t" + SupPersonInCharge + "\t" + SupCI + "\t" + SupRemarks + "\t" + getSupProductsIDs();
    }

    public static Supplier parseSupFromString(String supLine, ArrayList<Product> ProList) {
        String[] sup = new String[3];
        String[] supPI = new String[3];
        String[] supCI = new String[6];
        ArrayList<Product> supProducts = new ArrayList<>();
        try {
            System.out.println(supLine);
            String[] supData = supLine.split("\t");
            if (supData.length != 13) {
                throw (new Exception("Supplier is incomplete!" + supLine));
            } else {

                sup[0] = supData[0];
                sup[1] = supData[1];
                supPI = Arrays.copyOfRange(supData, 2, 4);
                supCI = Arrays.copyOfRange(supData, 5, 10);
                sup[2] = supData[11];
                String[] supProductsIDsData = supData[12].split(",");
                for (String id : supProductsIDsData) {
                    for (Product pro : ProList) {
                        if (pro.getProID().equals(id)) {
                            supProducts.add(pro);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return new Supplier(sup[0], sup[1], supPI[0], supPI[1], Gender.valueOf(supPI[2]), supCI[0], supCI[1], supCI[2], supCI[3], supCI[4], supCI[5], sup[2], supProducts);
    }
}
