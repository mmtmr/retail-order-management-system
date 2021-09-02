/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.time.LocalDateTime;
import static retailordermanagementsystem.Operation.AccList;

/**
 *
 * @author Maxine
 */
public class CusAcc extends Account {

    private static int CACounter=0;
    private ShoppingCart CusSC;//Account gone shopping cart gone
    
    public CusAcc() {
        this.AccID = "";
    }

    //Create
    public CusAcc(String AccName, String AccPassword) {
        super(AccName, AccPassword);
        this.AccID = "CA" + String.format("%05d", CACounter + 1);
        this.CusSC = new ShoppingCart(AccID);
        addCACounter();
    }

    //Load
    public CusAcc(String AccID, String AccName, String AccPassword, LocalDateTime AccRegisterDT, LocalDateTime AccLastLoginDT) {
        super(AccID, AccName, AccPassword, AccRegisterDT, AccLastLoginDT);
        this.CusSC = new ShoppingCart();//Set it later
        //addCACounter();
    }

    //Load
    public CusAcc(String[] AccLine) {
        super(AccLine[0], AccLine[1], AccLine[2], LocalDateTime.parse(AccLine[3]), LocalDateTime.parse(AccLine[4]));
        this.CusSC = new ShoppingCart();//Set it later
        //addCACounter();
    }

    public static int getCACounter() {
        return CACounter;
    }

    public static void setCACounter(int CACounter) {
        CusAcc.CACounter = CACounter;
    }

    public static void addCACounter() {
        CusAcc.CACounter += 1;
    }

    public static void minusCACounter() {
        CusAcc.CACounter -= 1;
    }

    public ShoppingCart getCusSC() {
        return CusSC;
    }

    public void setCusSC(ShoppingCart CusSC) {
        this.CusSC = CusSC;
    }

    public void setCusSC(String OrdID, LocalDateTime OrdModifyDT) {
        this.CusSC = new ShoppingCart(OrdID, OrdModifyDT);
    }

//    @Override
//    public String toString() {
//        return getAccID() + "\t" + getAccName() + "\t" + getAccPassword() + "\t" + getAccRegisterDT() + "\t" + getAccLastLoginDT() +"\t"+CusSC.getOrdID();
//    }
    public static CusAcc searchCAFromID(String caID) {
        CusAcc account = new CusAcc();
        try {
            if(caID.isEmpty()||caID.equals("-")){
                return account;
            }
            for (Account acc : AccList) {
                if (acc.getAccID().equals(caID)) {
                    account = (CusAcc) acc;
                    return account;
                }
            }
            throw (new Exception("Account not found!" + caID));
        } catch (Exception e) {
            System.out.println(e);
        }
        return account;
    }

    //TODO CHECK DUPKEY
}
