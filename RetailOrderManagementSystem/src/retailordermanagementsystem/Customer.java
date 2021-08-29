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

    private int CusCounter;
    private String CusID;
    private CusInfo CusPI;
    private ContactInfo CusCI;
    private CusAcc CusAccount; //UniqueID is here
    private ArrayList<Order> CusOrders;
    //TODO PAYMENT CREDIT CARD PAYMENT, OPTIONAL CUSTOMER BALANCE

    public Customer() {
    }

    public Customer(String CusID, String PIFName, String PILName, Gender PIGender, LocalDate PIDateOfBirth, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode, CusAcc CusAccount, ArrayList<OrderItem> OrdItems, ArrayList<Order> CusOrders) {
        this.CusID = CusID;
        this.CusPI = new CusInfo(PIFName, PILName, PIGender, PIDateOfBirth);
        this.CusCI = new ContactInfo(CIPhone, CIEmail, CIAddStreet, CIAddCity, CIAddState, CIAddPostcode);
        this.CusAccount = CusAccount;//Aggregation because i want to access it elsewhere
        this.CusOrders = CusOrders;//Aggregation because i want to keep the order it elsewhere
        
    }

    public Customer(String CusID, String[] PILine, String[] CILine, CusAcc CusAccount, ArrayList<Order> CusOrders) {
        this.CusID = CusID;
        this.CusPI = new CusInfo(PILine);
        this.CusCI = new ContactInfo(CILine);
        this.CusAccount = CusAccount;//Aggregation because i want to access it elsewhere
        this.CusOrders = CusOrders;//Aggregation because i want to keep the order it elsewhere
    }

    public String getCusID() {
        return CusID;
    }
    
    public int getCusCounter() {
        return CusCounter;
    }

//    public Customer(String PIFName, String PILName, Gender PIGender, LocalDate PIDateOfBirth, int PIRewardPoint, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode, CusAcc CusAccount) {
//        this.CusPI = new CusInfo(PIFName, PILName, PIGender, PIDateOfBirth, PIRewardPoint);
//        this.CusCI = new ContactInfo(CIPhone, CIEmail, CIAddStreet, CIAddCity, CIAddState, CIAddPostcode);
//        this.CusAccount = CusAccount;
//    }
//
//    public Customer(String PIFName, String PILName, Gender PIGender, LocalDate PIDateOfBirth, int PIRewardPoint, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode, CusAcc CusAccount, ShoppingCart CusSC, ArrayList<Order> CusOrders) {
//        this.CusPI = new CusInfo(PIFName, PILName, PIGender, PIDateOfBirth, PIRewardPoint);
//        this.CusCI = new ContactInfo(CIPhone, CIEmail, CIAddStreet, CIAddCity, CIAddState, CIAddPostcode);
//        this.CusAccount = CusAccount;
//        this.CusSC = CusSC;
//        this.CusOrders = CusOrders;
//    }
    public void setCusCounter(int CusCounter) {    
        this.CusCounter = CusCounter;
    }
    
    public void addCusCounter() {    
        this.CusCounter+=1;
    }
    
    public void minusCusCounter() {    
        this.CusCounter-=1;
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
            CusOrdersIDs = CusOrdersIDs + ',';
            for (Order ord : CusOrders) {
                CusOrdersIDs = CusOrdersIDs + ord.getOrdID() + ',';
            }

            if (CusOrdersIDs.charAt(CusOrdersIDs.length()) == ',') {
                CusOrdersIDs = CusOrdersIDs.substring(0, CusOrdersIDs.length() - 1);
            }
            //CusOrdersIDs = CusOrdersIDs + ']';
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

    @Override
    public String toString() {
        return CusID + "\t" + CusPI + "\t" + CusCI + "\t" + CusAccount.getAccID() + "\t" + getCusOrdersIDs();
    }

    public static Customer searchCusFromAccID(String cusAccID) {
        Customer customer = new Customer();
        try {
            for (Customer cus : CusList) {
                if (cus.getCusAccount().getAccID().equals(cusAccID)) {
                    customer = cus;
                    return customer;
                }
            }
            throw (new Exception("Customer not found!" + cusAccID));
        } catch (Exception e) {
            System.out.println(e);
        }
        return customer;
    }

//    public static Customer parseCusFromString(String cusLine, ArrayList<Account> AccList, ArrayList<OrderDetails> OrdList, ArrayList<ShoppingCart> SCList) {
//        CusAcc cusAccount = new CusAcc();
//        String[] cusPI = new String[5];
//        String[] cusCI = new String[6];
//        ShoppingCart cusSC = new ShoppingCart();
//        ArrayList<OrderItem> cusSCOIs = new ArrayList<>();
//        ArrayList<Order> cusOrders = new ArrayList<>();
//        try {
//            System.out.println(cusLine);
//            String[] cusData = cusLine.split("\t");
//            if (cusData.length < 13) {
//                throw (new Exception("Customer Info is incomplete!" + cusLine + cusData.length + cusData[cusData.length - 1]));
//            } else {
//                for (Account acc : AccList) {
//                    if (acc.getAccID().equals(cusData[0])) {
//                        cusAccount = (CusAcc) acc;
//                    } else {
//                        throw (new Exception("Customer Account not found!" + cusLine));
//                    }
//                }
//                cusPI = Arrays.copyOfRange(cusData, 1, 6);
//                cusCI = Arrays.copyOfRange(cusData, 6, 12);
//                String[] cusOrdersIDsData = cusData[12].split(",");
//                int index = 0;
//                for (String id : cusOrdersIDsData) {
//                    for (OrderDetails ord : OrdList) {
//                        if (ord.getOrdID().equals(id)) {
//                            if (index == 0) {
//                                cusSC = (ShoppingCart) ord;
//                            } else {
//                                cusOrders.add((Order) ord);
//                            }
//
//                        }
//                    }
//                    index += 1;
//                }
//                validateCustomer(cusPI[0], cusPI[1], cusCI[0], cusCI[1], cusCI[2], cusCI[3], cusCI[4], cusCI[5], cusAccount.getAccID(), cusAccount.getAccPassword());
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        //String PIFName, String PILName, Gender PIGender, LocalDate PIDateOfBirth, int PIRewardPoint, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode, CusAcc CusAccount, ShoppingCart CusSC, ArrayList<Order> CusOrders
//        return new Customer(cusPI[0], cusPI[1], Gender.valueOf(cusPI[2]), LocalDate.parse(cusPI[3]), Integer.parseInt(cusPI[4]), cusCI[0], cusCI[1], cusCI[2], cusCI[3], cusCI[4], cusCI[5], cusAccount, cusSC, cusOrders);
//    }56531
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
            String[] CusCILine = ContactInfo.parseContactInfoFromString(CusLine[2]);
            CusAcc CusAccount = CusAcc.searchCAFromID(CusLine[3]);
            ArrayList<Order> CusOrders = Order.searchOrdersFromIDs(CusLine[4].split(","));
            CusList.add(new Customer(CusLine[1], CusPILine, CusCILine, CusAccount, CusOrders));

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
