/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

/**
 *
 * @author Maxine
 */
public class Payment {
    private String PName;
    private String  PCardNumber;
    private String  PBank;

    public Payment() {
    }

    public Payment(String PName, String PCardNumber, String PBank) {
        this.PName = PName;
        this.PCardNumber = PCardNumber;
        this.PBank = PBank;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public String getPCardNumber() {
        return PCardNumber;
    }

    public void setPCardNumber(String PCardNumber) {
        this.PCardNumber = PCardNumber;
    }

    public String getPBank() {
        return PBank;
    }

    public void setPBank(String PBank) {
        this.PBank = PBank;
    }

    @Override
    public String toString() {
        return PName + "|" + PCardNumber + "|" + PBank;
    }
    
    public static String[] parsePayFromString(String payLine) throws Exception {
        String[] payData = payLine.split("\\|");
        if (payData.length != 3) {
            throw (new Exception("Payment is incomplete!" + payLine));
        } else {
            return payData;
        }
    }
}
