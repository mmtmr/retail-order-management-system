/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Maxine
 */
public class Customer {

    private CusInfo CusPI;
    private ContactInfo CusCI;
    private CusAcc CusAccount; //UniqueID is here
    private ShoppingCart CusSC;
    private ArrayList<Order> CusOrders;
    //TODO PAYMENT CREDIT CARD PAYMENT, OPTIONAL CUSTOMER BALANCE

    public Customer() {
    }

    public Customer(String PIFName, String PILName, Gender PIGender, LocalDate PIDateOfBirth, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode, CusAcc CusAccount, ShoppingCart CusSC, ArrayList<Order> CusOrders) {
        this.CusPI = new CusInfo(PIFName, PILName, PIGender, PIDateOfBirth);
        this.CusCI = new ContactInfo(CIPhone, CIEmail, CIAddStreet, CIAddCity, CIAddState, CIAddPostcode);
        this.CusAccount = CusAccount;
        this.CusSC = CusSC;
        this.CusOrders = CusOrders;
    }

    public Customer(String PIFName, String PILName, Gender PIGender, LocalDate PIDateOfBirth, int PIRewardPoint, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode, CusAcc CusAccount) {
        this.CusPI = new CusInfo(PIFName, PILName, PIGender, PIDateOfBirth, PIRewardPoint);
        this.CusCI = new ContactInfo(CIPhone, CIEmail, CIAddStreet, CIAddCity, CIAddState, CIAddPostcode);
        this.CusAccount = CusAccount;
    }

    public Customer(String PIFName, String PILName, Gender PIGender, LocalDate PIDateOfBirth, int PIRewardPoint, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode, CusAcc CusAccount, ShoppingCart CusSC, ArrayList<Order> CusOrders) {
        this.CusPI = new CusInfo(PIFName, PILName, PIGender, PIDateOfBirth, PIRewardPoint);
        this.CusCI = new ContactInfo(CIPhone, CIEmail, CIAddStreet, CIAddCity, CIAddState, CIAddPostcode);
        this.CusAccount = CusAccount;
        this.CusSC = CusSC;
        this.CusOrders = CusOrders;
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

    public ShoppingCart getCusSC() {
        return CusSC;
    }

    public void setCusSC(ShoppingCart CusSC) {
        this.CusSC = CusSC;
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
                CusOrdersIDs = CusOrdersIDs + ord.getOrdID() + ',';
            }

            if (CusOrdersIDs.charAt(CusOrdersIDs.length() - 1) == ',') {
                CusOrdersIDs = CusOrdersIDs.substring(0, CusOrdersIDs.length() - 2);
            }
            //CusOrdersIDs = CusOrdersIDs + ']';
        }
        return CusOrdersIDs;
    }

    @Override
    public String toString() {
        return CusAccount.getAccID() + "\t" + CusPI + "\t" + CusCI + "\t" + CusSC.getOrdID() + "\t" + getCusOrdersIDs();
    }

    public static Customer parseCusFromString(String cusLine, ArrayList<CusAcc> CusAccList, ArrayList<Order> OrdList, ArrayList<ShoppingCart> SCList) {
        CusAcc cusAccount = new CusAcc();
        String[] cusPI = new String[5];
        String[] cusCI = new String[6];
        ShoppingCart cusSC = new ShoppingCart();
        ArrayList<Order> cusOrders = new ArrayList<>();
        try {
            System.out.println(cusLine);
            String[] cusData = cusLine.split("\t");
            if (cusData.length < 13) {
                throw (new Exception("Customer Info is incomplete!" + cusLine+cusData.length+cusData[cusData.length-1]));
            } else {
                for (CusAcc acc : CusAccList) {
                    if (acc.getAccID().equals(cusData[0])) {
                        cusAccount = acc;
                    } else {
                        throw (new Exception("Customer Account not found!" + cusLine));
                    }
                }
                cusPI = Arrays.copyOfRange(cusData, 1, 5);
                cusCI = Arrays.copyOfRange(cusData, 6, 11);
                for (ShoppingCart sc : SCList) {
                    if (sc.getOrdID().equals(cusData[12])) {
                        cusSC = sc;
                    }
                }
                String[] cusOrdersIDsData = cusData[13].split(",");
                for (String id : cusOrdersIDsData) {
                    for (Order ord : OrdList) {
                        if (ord.getOrdID().equals(id)) {
                            cusOrders.add(ord);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return new Customer(cusPI[0], cusPI[1], Gender.valueOf(cusPI[2]), LocalDate.parse(cusPI[3]), Integer.parseInt(cusPI[4]), cusCI[0], cusCI[1], cusCI[2], cusCI[3], cusCI[4], cusCI[5], cusAccount, cusSC, cusOrders);
    }
}
