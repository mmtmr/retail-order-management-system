/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import static retailordermanagementsystem.Operation.CusList;

/**
 *
 * @author Maxine
 */
public class Customer {

    private static int CusCounter=0;
    private String CusID;//CUS000
    private CusInfo CusPI;//Composition
    private ContactInfo CusCI;//Composition
    private CusAcc CusAccount; //Aggregation
    private ArrayList<Order> CusOrders;//Aggregation
    //TODO PAYMENT CREDIT CARD PAYMENT, OPTIONAL CUSTOMER BALANCE

    public Customer() {
    }

    //Normal Load with All Info
    public Customer(String CusID, String PIFName, String PILName, Gender PIGender, LocalDate PIDateOfBirth, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode, CusAcc CusAccount, ArrayList<Order> CusOrders) {
        this.CusID = CusID;
        this.CusPI = new CusInfo(PIFName, PILName, PIGender, PIDateOfBirth);
        this.CusCI = new ContactInfo(CIPhone, CIEmail, CIAddStreet, CIAddCity, CIAddState, CIAddPostcode);
        this.CusAccount = CusAccount;
        this.CusOrders = CusOrders;
    }

//Following code is obtained from (rawr rang, 2014)
//Create New Customer
    public Customer(String PIFName, String PILName, Gender PIGender, LocalDate PIDateOfBirth, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode, CusAcc CusAccount) {
        this("CUS" + String.format("%05d", CusCounter + 1), PIFName, PILName, PIGender, PIDateOfBirth, CIPhone, CIEmail, CIAddStreet, CIAddCity, CIAddState, CIAddPostcode, CusAccount, new ArrayList<Order>());
        addCusCounter();
    }

    public String getCusID() {
        return CusID;
    }

    public static int getCusCounter() {
        return CusCounter;
    }

    public static void setCusCounter(int CusCounter) {
        Customer.CusCounter = CusCounter;
    }

    public static void addCusCounter() {
        CusCounter += 1;
    }

    public static void minusCusCounter() {
        CusCounter -= 1;
    }

    public void setCusID(String CusID) {
        this.CusID = CusID;
    }

    public CusInfo getCusPI() {
        return CusPI;
    }

    public void setCusPI(CusInfo CusPI) {
        this.CusPI = CusPI;
    }

    public ContactInfo getCusCI() {
        return CusCI;
    }

    public void setCusCI(ContactInfo CusCI) {
        this.CusCI = CusCI;
    }

    public CusAcc getCusAccount() {
        return CusAccount;
    }

    public void setCusAccount(CusAcc CusAccount) {
        this.CusAccount = CusAccount;
    }

    public ArrayList<Order> getCusOrders() {
        return CusOrders;
    }

    public void setCusOrders(ArrayList<Order> CusOrders) {
        this.CusOrders = CusOrders;
    }

    public String getCusOrdersIDs() {
        //String CusOrdersIDs = "[";
        String CusOrdersIDs = "";
        if (!CusOrders.isEmpty()) {
            for (Order ord : CusOrders) {
                CusOrdersIDs = CusOrdersIDs + ord.getOrdID() + '|';
            }

            if (CusOrdersIDs.charAt(CusOrdersIDs.length()-1) == '|') {
                CusOrdersIDs = CusOrdersIDs.substring(0, CusOrdersIDs.length() - 1);
            }
            //CusOrdersIDs = CusOrdersIDs + ']';
        } else {
            CusOrdersIDs = "-";
        }
        return CusOrdersIDs;
    }

    public void editCustomer(String PIFName, String PILName, Gender PIGender, LocalDate PIDateOfBirth, int PIRewardPoint, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode, String CAName) {
//        try{
//            validateCustomer(PIFName,PILName,CIPhone,CIEmail,CIAddStreet,CIAddCity,CIAddState,CIAddPostcode,CAName);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        CusPI.setPIFName(PIFName);
        CusPI.setPILName(PILName);
        CusPI.setPIGender(PIGender);
        CusPI.setPIDateOfBirth(PIDateOfBirth);
        CusPI.setPIRewardPoint(PIRewardPoint);
        CusCI.setCIPhone(CIPhone);
        CusCI.setCIEmail(CIEmail);
        CusCI.setCIAddStreet(CIAddStreet);
        CusCI.setCIAddCity(CIAddCity);
        CusCI.setCIAddState(CIAddState);
        CusCI.setCIAddPostcode(CIAddPostcode);
        CusAccount.setAccName(CAName);
    }
    
    //For Customer
    public void editCustomer(String PIFName, String PILName, Gender PIGender, LocalDate PIDateOfBirth, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode) {
//        try{
//            validateCustomer(PIFName,PILName,CIPhone,CIEmail,CIAddStreet,CIAddCity,CIAddState,CIAddPostcode,CAName);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        CusPI.setPIFName(PIFName);
        CusPI.setPILName(PILName);
        CusPI.setPIGender(PIGender);
        CusPI.setPIDateOfBirth(PIDateOfBirth);
        CusCI.setCIPhone(CIPhone);
        CusCI.setCIEmail(CIEmail);
        CusCI.setCIAddStreet(CIAddStreet);
        CusCI.setCIAddCity(CIAddCity);
        CusCI.setCIAddState(CIAddState);
        CusCI.setCIAddPostcode(CIAddPostcode);
    }

    @Override
    public String toString() {
        if (CusAccount.getAccID() != null && !CusAccount.getAccID().isEmpty()) {
            return CusID + "\t" + CusPI + "\t" + CusCI + "\t" + CusAccount.getAccID() + "\t" + getCusOrdersIDs();
        } else {
            return CusID + "\t" + CusPI + "\t" + CusCI + "\t" + "-" + "\t" + getCusOrdersIDs();
        }
    }

    public static Customer searchCusFromAccID(String cusAccID) {
        Customer customer = new Customer();
        try {
            for (Customer cus : CusList) {
                if (cus.getCusAccount() != null) {
                    if (cus.getCusAccount().getAccID().equals(cusAccID)) {
                        customer = cus;
                        return cus;
                    }
                }
            }
            throw (new Exception("Customer not found!" + cusAccID));
        } catch (Exception e) {
            System.out.println(e);
        }
        return customer;
    }
    
    public static Customer searchCusFromOrdID(String ordID) {
        Customer customer = new Customer();
        try {
            for (Customer cus : CusList) {
                if (cus.getCusOrdersIDs() != null) {
                    if (cus.getCusOrdersIDs().contains(ordID)) {
                        customer = cus;
                        return cus;
                    }
                }
            }
            throw (new Exception("Customer not found!" + ordID));
        } catch (Exception e) {
            System.out.println(e);
        }
        return customer;
    }

    public static Customer searchCusFromID(String cusID) {
        Customer customer = new Customer();
        try {
            for (Customer cus : CusList) {
                if (cus != null && cus.getCusID().equals(cusID)) {
                    customer = cus;
                    return cus;
                }
            }
            throw (new Exception("Customer not found!" + cusID));
        } catch (Exception e) {
            System.out.println(e);
            
        }
        return customer;
    }   

    public static String[] parseCusFromString(String cusLine) throws Exception {
        String[] cusData = cusLine.split("\t");
        if (cusData.length != 5) {
            throw (new Exception("Customer is incomplete!" + cusLine));
        } else {
            return cusData;
        }
    }

    public static void buildCusFromString(String cusLine) {
        try {
            String[] CusLine = parseCusFromString(cusLine);

            String[] CusPILine = CusInfo.parseCusInfoFromString(CusLine[1]);
            String CusPIFName=CusPILine[0];
            String CusPILName=CusPILine[1];
            Gender CusPIGender=Gender.valueOf(CusPILine[2]);
            LocalDate CusPIDOB=LocalDate.parse(CusPILine[3]);
            String[] CusCILine = ContactInfo.parseContactInfoFromString(CusLine[2]);
            String CusCIPhone =CusCILine[0];
            String CusCIEmail =CusCILine[1];
            String CusCIAddStreet =CusCILine[2];
            String CusCIAddCity =CusCILine[3];
            String CusCIAddState =CusCILine[4];
            String CusCIAddPostcode =CusCILine[5];
            CusAcc CusAccount = CusAcc.searchCAFromID(CusLine[3]);
            ArrayList<Order> CusOrders = Order.searchOrdersFromIDs(CusLine[4].split("\\|"));

            CusList.add(new Customer(CusLine[0], CusPIFName, CusPILName, CusPIGender, CusPIDOB, CusCIPhone, CusCIEmail, CusCIAddStreet,CusCIAddCity,CusCIAddState, CusCIAddPostcode,CusAccount, CusOrders));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
