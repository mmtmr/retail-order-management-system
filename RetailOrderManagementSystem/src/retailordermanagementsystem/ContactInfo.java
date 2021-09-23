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
public class ContactInfo {

    private String CIPhone;
    private String CIEmail;
    private String CIAddStreet;
    private String CIAddCity;
    private String CIAddState;
    private String CIAddPostcode;

    public ContactInfo() {
    }

    public ContactInfo(String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode) {
        this.CIPhone = CIPhone;
        this.CIEmail = CIEmail;
        this.CIAddStreet = CIAddStreet;
        this.CIAddCity = CIAddCity;
        this.CIAddState = CIAddState;
        this.CIAddPostcode = CIAddPostcode;

    }
    
    
    public String getCIPhone() {
        return CIPhone;
    }

    public void setCIPhone(String CIPhone) {
        this.CIPhone = CIPhone;
    }

    public String getCIEmail() {
        return CIEmail;
    }

    public void setCIEmail(String CIEmail) {
        this.CIEmail = CIEmail;
    }

    public String getCIAddStreet() {
        return CIAddStreet;
    }

    public void setCIAddStreet(String CIAddStreet) {
        this.CIAddStreet = CIAddStreet;
    }

    public String getCIAddCity() {
        return CIAddCity;
    }

    public void setCIAddCity(String CIAddCity) {
        this.CIAddCity = CIAddCity;
    }

    public String getCIAddState() {
        return CIAddState;
    }

    public void setCIAddState(String CIAddState) {
        this.CIAddState = CIAddState;
    }

    public String getCIAddPostcode() {
        return CIAddPostcode;
    }

    public void setCIAddPostcode(String CIAddPostcode) {
        this.CIAddPostcode = CIAddPostcode;
    }

    @Override
    public String toString() {
        return CIPhone + "|" + CIEmail + "|" + CIAddStreet + "|" + CIAddCity + "|" + CIAddState + "|" + CIAddPostcode;
    }


     public static String[] parseContactInfoFromString(String ciLine) throws Exception {
        String[] ciData = ciLine.split("\\|");
        if (ciData.length != 6) {
            throw (new Exception("Contact Info is incomplete!" + ciLine));
        } else {
            return ciData;
        }
    }
}
