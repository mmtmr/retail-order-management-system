/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.time.LocalDateTime;

/**
 *
 * @author Maxine
 */
public class CusAcc extends Account {

    private static int CACounter; //TODO: READ FROM TXT FILE

    public CusAcc() {
    }

    public CusAcc(String AccName, String AccPassword) {
        super(AccName, AccPassword);
        this.AccID = "CA" + String.format("%05d", CACounter + 1);
        addCACounter();
    }

    public CusAcc(String AccID, String AccName, String AccPassword, LocalDateTime AccRegisterDT, LocalDateTime AccLastLoginDT) {
        super(AccID, AccName, AccPassword, AccRegisterDT, AccLastLoginDT);
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

    public static CusAcc parseAccountFromString(String accLine) {
        String[] ca = new String[5];
        try {
            System.out.println(accLine);
            String[] caData = accLine.split("\t");
            if (caData.length != 5) {
                throw (new Exception("Customer Account is incomplete!" + accLine));
            } else {
                ca = caData.clone();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return new CusAcc(ca[0], ca[1], ca[2], LocalDateTime.parse(ca[3]), LocalDateTime.parse(ca[4]));
    }

    //TODO CHECK DUPKEY
}