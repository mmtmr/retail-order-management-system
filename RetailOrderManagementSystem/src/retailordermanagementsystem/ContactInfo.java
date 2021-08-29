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
    
    public ContactInfo(String[] CILine) {
        this.CIPhone = CILine[0];
        this.CIEmail = CILine[1];
        this.CIAddStreet = CILine[2];
        this.CIAddCity = CILine[3];
        this.CIAddState = CILine[4];
        this.CIAddPostcode = CILine[5];

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

////    public boolean validateCIPhone() {
////        return CIPhone.matches("(\\+?6?01)[0-46-9]-*[0-9]{7,8}");//Format: +6012-34567890
////    }
//    
//    public static boolean validateCIPhone(String CIPhone) {
//        return CIPhone.matches("(\\+?6?01)[0-46-9]-*[0-9]{7,8}");//Format: +6012-34567890
//    }
//    
////    public boolean validateCIEmail() {
////        return CIEmail.matches("^(.+)@(.+)$");
////    }
//    
//    public static boolean validateCIEmail(String CIEmail) {
//        return CIEmail.matches("^(.+)@(.+)$");
//    }
//
////    public boolean validateStreet() {
////        return getConAddStreet().matches("\\w+(\\s\\w+){2,}");
////    }
////
////    public boolean validateCity() {
////        return getConAddCity().matches("([a-zA-Z]+|[a-zA-Z]+\\\\s[a-zA-Z]+)");
////    }
////    public boolean validateCIAddState() {
////        return CIAddState.matches("Kuala Lumpur|Putrajaya|Labuan|Perlis|Kedah|Terengganu|Pahang|Perak|Kelantan|Penang|Selangor|Negeri Sembilan|Johor|Malacca|Sabah|Sarawak");
////    }
//
//    public static boolean validateCIAddState(String CIAddState) {
//        return CIAddState.matches("Kuala Lumpur|Putrajaya|Labuan|Perlis|Kedah|Terengganu|Pahang|Perak|Kelantan|Penang|Selangor|Negeri Sembilan|Johor|Malacca|Sabah|Sarawak");
//    }
//    
////    public boolean validateCIAddPostcode() {
////        return CIAddPostcode.matches("\\d{5}");
////    }
//    
//    public static boolean validateCIAddPostcode(String CIAddPostcode) {
//        return CIAddPostcode.matches("\\d{5}");
//    }
//
////    public boolean validateCIAddress() {
////        return validateCIAddState() && validateCIAddPostcode();
////    }
//    
//    public static boolean validateCIAddress(String CIAddState,String CIAddPostcode) {
//        return validateCIAddState(CIAddState) && validateCIAddPostcode(CIAddPostcode);
//    }
    @Override
    public String toString() {
        return CIPhone + "\t" + CIEmail + "\t" + CIAddStreet + "\t" + CIAddCity + "\t" + CIAddState + "\t" + CIAddPostcode;
    }

//    public static ContactInfo parseCIFromString(String ciLine) {
//        String[] ci = new String[6];
//        try {
//            System.out.println(ciLine);
//            String[] ciData = ciLine.split("\t");
//            if (ciData.length != 6) {
//                throw (new Exception("Contact Info is incomplete!" + ciLine));
//            } else {
//                ci = ciData.clone();
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        return new ContactInfo(ci[0], ci[1], ci[2], ci[3], ci[4], ci[5]);
//    }
     public static String[] parseContactInfoFromString(String ciLine) throws Exception {
        String[] ciData = ciLine.split("\t");
        if (ciData.length != 6) {
            throw (new Exception("Contact Info is incomplete!" + ciLine));
        } else {
            return ciData;
        }
    }
}
