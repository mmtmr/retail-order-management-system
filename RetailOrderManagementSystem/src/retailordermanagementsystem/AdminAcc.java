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
public class AdminAcc extends Account {

    private static int AACounter; //TODO: READ FROM TXT FILE

    public AdminAcc() {
    }

    public AdminAcc(String AccName, String AccPassword) {
        super(AccName, AccPassword);
        this.AccID = "AA" + String.format("%05d", AACounter + 1);
        addAACounter();
    }

    public AdminAcc(String AccID, String AccName, String AccPassword, LocalDateTime AccRegisterDT, LocalDateTime AccLastLoginDT) {
        super(AccID, AccName, AccPassword, AccRegisterDT, AccLastLoginDT);
    }

    public static int getAACounter() {
        return AACounter;
    }

    public static void setAACounter(int AACounter) {
        AdminAcc.AACounter = AACounter;
    }

    public static void addAACounter() {
        AdminAcc.AACounter += 1;
    }

    public static void minusAACounter() {
        AdminAcc.AACounter -= 1;
    }

    public static AdminAcc parseAccountFromString(String accLine) {
        String[] aa = new String[5];
        try {
            System.out.println(accLine);
            String[] aaData = accLine.split("\t");
            if (aaData.length != 5) {
                throw (new Exception("Admin Account is incomplete!" + accLine));
            } else {
                aa = aaData.clone();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return new AdminAcc(aa[0], aa[1], aa[2], LocalDateTime.parse(aa[3]), LocalDateTime.parse(aa[4]));
    }

    //TODO CHECK DUPKEY
}
