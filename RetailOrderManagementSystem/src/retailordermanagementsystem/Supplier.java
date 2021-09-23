/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.util.ArrayList;
import static retailordermanagementsystem.Operation.SupList;

/**
 *
 * @author Maxine
 */
public class Supplier {

    private String SupID;
    private String SupName;
    private PersonalInfo SupPersonInCharge;
    private ContactInfo SupCI;
    private ArrayList<Product> SupProducts;
    private static int SupCounter = 0;

    public Supplier() {
    }

    //Create
    public Supplier(String SupName, String PIFName, String PILName, Gender PIGender, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode) {
        this("S" + String.format("%04d", SupCounter + 1), SupName, PIFName, PILName, PIGender, CIPhone, CIEmail, CIAddStreet, CIAddCity, CIAddState, CIAddPostcode, new ArrayList<Product>());
        addSupCounter();
    }

    //Load
    public Supplier(String SupID, String SupName, String PIFName, String PILName, Gender PIGender, String CIPhone, String CIEmail, String CIAddStreet,String CIAddCity, String CIAddState, String CIAddPostcode, ArrayList<Product> SupProducts) {
        this.SupID = SupID;
        this.SupName = SupName;
        this.SupPersonInCharge = new PersonalInfo(PIFName, PILName, PIGender);
        this.SupCI = new ContactInfo(CIPhone, CIEmail, CIAddStreet, CIAddCity, CIAddState, CIAddPostcode);
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
        if (!SupProducts.isEmpty() && SupProducts.get(0) != null) {
            for (Product pro : SupProducts) {
                if (pro != null) {
                    SupProductsIDs = SupProductsIDs + pro.getProID() + '|';
                }
            }

            if (SupProductsIDs.charAt(SupProductsIDs.length() - 1) == '|') {
                SupProductsIDs = SupProductsIDs.substring(0, SupProductsIDs.length() - 1);
            }
        } else {
            SupProductsIDs = "-";
        }

        //SupProductsIDs = SupProductsIDs + ']';
        return SupProductsIDs;
    }

    @Override
    public String toString() {
        return SupID + "\t" + SupName + "\t" + SupPersonInCharge + "\t" + SupCI + "\t" + getSupProductsIDs();
    }

    public void editSupplier(String SupName, String PIFName, String PILName, Gender PIGender, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode) {
        setSupName(SupName);
        SupPersonInCharge.setPIFName(PIFName);
        SupPersonInCharge.setPILName(PILName);
        SupPersonInCharge.setPIGender(PIGender);
        SupCI.setCIPhone(CIPhone);
        SupCI.setCIEmail(CIEmail);
        SupCI.setCIAddStreet(CIAddStreet);
        SupCI.setCIAddCity(CIAddCity);
        SupCI.setCIAddState(CIAddState);
        SupCI.setCIAddPostcode(CIAddPostcode);
    }

    public static Supplier searchSupFromID(String supID) {
        Supplier supplier = new Supplier();
        try {
            for (Supplier sup : SupList) {
                if (sup.getSupID().equals(supID)) {
                    supplier = sup;
                    return supplier;
                }
            }
            throw (new Exception("Supplier not found!" + supID));
        } catch (Exception e) {
            System.out.println(e);
        }
        return supplier;
    }

    public static Supplier searchSupFromProID(String proID) {
        Supplier supplier = new Supplier();
        try {
            for (Supplier sup : SupList) {
                if (sup.getSupProductsIDs().contains(proID)) {
                    supplier = sup;
                    return supplier;
                }
            }
            throw (new Exception("Supplier not found!" + proID));
        } catch (Exception e) {
            System.out.println(e);
        }
        return supplier;
    }

    public static Supplier searchSupFromName(String supName) {
        Supplier supplier = new Supplier();
        try {
            for (Supplier sup : SupList) {
                if (sup.getSupName().equals(supName)) {
                    supplier = sup;
                    return supplier;
                }
            }
            throw (new Exception("Supplier not found!" + supName));
        } catch (Exception e) {
            System.out.println(e);
        }
        return supplier;
    }

    public static String[] parseSupFromString(String supLine) throws Exception {
        String[] supData = supLine.split("\t");
        if (supData.length != 5) {
            throw (new Exception("Supplier is incomplete!" + supLine));
        } else {
            return supData;
        }
    }

    public static void buildSupFromString(String supLine) {
        try {
            String[] SupLine = parseSupFromString(supLine);
            String[] SupPIData = PersonalInfo.parsePIFromString(SupLine[2]);
            String SupPIFName=SupPIData[0];
            String SupPILName=SupPIData[1];
            Gender SupPIGender=Gender.valueOf(SupPIData[2]);
            
            String[] SupCIData = ContactInfo.parseContactInfoFromString(SupLine[3]);
            String SupCIPhone =SupCIData[0];
            String SupCIEmail =SupCIData[1];
            String SupCIAddStreet =SupCIData[2];
            String SupCIAddCity =SupCIData[3];
            String SupCIAddState =SupCIData[4];
            String SupCIAddPostcode =SupCIData[5];          
            
            ArrayList<Product> SupProducts = new ArrayList<>();
            if ((SupLine[4].split("\\|"))[0] != null) {
                for (String id : SupLine[4].split("\\|")) {
                    SupProducts.add(Product.searchProFromID(id));
                }
            }

            SupList.add(new Supplier(SupLine[0], SupLine[1], SupPIFName, SupPILName, SupPIGender, SupCIPhone, SupCIEmail, SupCIAddStreet, SupCIAddCity, SupCIAddState, SupCIAddPostcode, SupProducts));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
