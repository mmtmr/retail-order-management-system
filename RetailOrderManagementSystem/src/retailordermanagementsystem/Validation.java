/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.util.regex.*;

/**
 *
 * @author Maxine
 */
//To validate user input
public class Validation {

    public static boolean validateNoDelimeterAndNoNull(String input) {
        return !input.contains("\t") &&!input.contains("\\|") && !input.isEmpty();
    }

    public static boolean validateNotNull(String input) {
        return !input.isEmpty();
    }

    public static void validateSupplierInput(String supname, String fname, String lname, String phone, String email, String AddStreet, String AddCity, String AddState, String AddPostcode) throws Exception {
        if (validateNoDelimeterAndNoNull(phone) && validateNoDelimeterAndNoNull(email) && validateNoDelimeterAndNoNull(AddStreet) && validateNoDelimeterAndNoNull(AddCity) && validateNoDelimeterAndNoNull(AddState) && validateNoDelimeterAndNoNull(AddPostcode)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab inside input or NULL input.");
        }
        if (validatePhone(phone) && validateEmail(email) && validateAddress(AddState, AddPostcode)) {
        } else {
            throw new Exception("Contact info format is incorrect");
        }
        if (validateNoDelimeterAndNoNull(supname) &&validateNoDelimeterAndNoNull(fname) && validateNoDelimeterAndNoNull(lname)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab or | inside input or NULL input.");
        }
        if (validateName(fname) && validateName(lname)) {
        } else {
            throw new Exception("Personal info format is incorrect");
        }
        
    }
    
    public static void validateCustomerInput(String fname, String lname, String phone, String email, String AddStreet, String AddCity, String AddState, String AddPostcode, String accname) throws Exception {
        if (validateNoDelimeterAndNoNull(phone) && validateNoDelimeterAndNoNull(email) && validateNoDelimeterAndNoNull(AddStreet) && validateNoDelimeterAndNoNull(AddCity) && validateNoDelimeterAndNoNull(AddState) && validateNoDelimeterAndNoNull(AddPostcode)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab inside input or NULL input.");
        }
        if (validatePhone(phone) && validateEmail(email) && validateAddress(AddState, AddPostcode)) {
        } else {
            throw new Exception("Contact info format is incorrect");
        }
        if (validateNoDelimeterAndNoNull(fname) && validateNoDelimeterAndNoNull(lname)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab or | inside input or NULL input.");
        }
        if (validateName(fname) && validateName(lname)) {
        } else {
            throw new Exception("Personal info format is incorrect");
        }
        if (validateNoDelimeterAndNoNull(accname)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab or | inside input or NULL input.");
        }
    }

    public static void validateCustomerInput(String fname, String lname, String phone, String email, String AddStreet, String AddCity, String AddState, String AddPostcode, String accname, String password) throws Exception {
        if (validateNoDelimeterAndNoNull(phone) && validateNoDelimeterAndNoNull(email) && validateNoDelimeterAndNoNull(AddStreet) && validateNoDelimeterAndNoNull(AddCity) && validateNoDelimeterAndNoNull(AddState) && validateNoDelimeterAndNoNull(AddPostcode)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab inside input or NULL input.");
        }
        if (validatePhone(phone) && validateEmail(email) && validateAddress(AddState, AddPostcode)) {
        } else {
            throw new Exception("Contact info format is incorrect");
        }
        if (validateNoDelimeterAndNoNull(fname) && validateNoDelimeterAndNoNull(lname)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab or | inside input or NULL input.");
        }
        if (validateName(fname) && validateName(lname)) {
        } else {
            throw new Exception("Personal info format is incorrect");
        }
        if (validateNoDelimeterAndNoNull(accname) && validateNoDelimeterAndNoNull(password)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab or | inside input or NULL input.");
        }
    }

//    public static boolean validateContactInfo(String phone, String email, String AddStreet, String AddCity, String AddState, String AddPostcode) throws Exception {
//        if (validateNoDelimeterAndNoNull(phone) && validateNoDelimeterAndNoNull(email) && validateNoDelimeterAndNoNull(AddStreet) && validateNoDelimeterAndNoNull(AddCity) && validateNoDelimeterAndNoNull(AddState) && validateNoDelimeterAndNoNull(AddPostcode)) {
//        } else {
//            throw new Exception("Invalid Input: Remove the tab inside input.");
//        }
//        if (validatePhone(phone) && validateEmail(email) && validateAddress(AddState, AddPostcode)) {
//        } else {
//            throw new Exception("Contact info format is incorrect");
//        }
//        return validatePhone(phone) && validateEmail(email) && validateAddress(AddState, AddPostcode) && validateNoDelimeterAndNoNull(phone) && validateNoDelimeterAndNoNull(email) && validateNoDelimeterAndNoNull(AddStreet) && validateNoDelimeterAndNoNull(AddCity) && validateNoDelimeterAndNoNull(AddState) && validateNoDelimeterAndNoNull(AddPostcode);
//    }
//
//    public static boolean validatePersonalInfo(String fname, String lname) throws Exception {
//        if (validateNoDelimeterAndNoNull(fname) && validateNoDelimeterAndNoNull(lname)) {
//        } else {
//            throw new Exception("Invalid Input: Remove the tab inside input.");
//        }
//        if (validateName(fname) && validateName(lname)) {
//        } else {
//            throw new Exception("Personal info format is incorrect");
//        }
//        return validateNoDelimeterAndNoNull(fname) && validateNoDelimeterAndNoNull(lname) && validateName(fname) && validateName(lname);
//    }
//
    public static void validateAccountInput(String accname, String password) throws Exception {
        if (validateNoDelimeterAndNoNull(accname) && validateNoDelimeterAndNoNull(password)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab or | inside input.");
        }
    }

    //https://howtodoinjava.com/java/regex/java-regex-validate-credit-card-numbers/
    public static String validateCreditCard(String name, String cardnum, String cvv) throws Exception {
        
        if (validateNoDelimeterAndNoNull(cardnum) && validateNoDelimeterAndNoNull(cardnum) && validateNoDelimeterAndNoNull(cvv)) {            
        } else {
            throw new Exception("Invalid Input: Remove the tab or | inside input.");
        }
        if(validateCVV(cvv)){
        } else{
            throw new Exception("CVV format is incorrect.");
        }
        if(validateName(name)){
        } else{
            throw new Exception("Name format is incorrect.");
        }
        String creditcardregex = "^(?:(?<Visa>4[0-9]{12}(?:[0-9]{3})?)|" + "(?<Mastercard>5[1-5][0-9]{14})|";
        Pattern pattern = Pattern.compile(creditcardregex);
        cardnum = cardnum.replaceAll("-", "");
        Matcher matcher = pattern.matcher(cardnum);
        //MatchResult result= matcher.toMatchResult();
        //System.out.println("Current Matcher: "+ result);

        while (matcher.find()) {
            // Get the group matched using group() method
            return(matcher.group());
        }
        throw new Exception("Card format is incorrect or not accepted!");
    }

//TODO Validate Product Model names
    public static boolean validatePhone(String phone) {
        return phone.matches("(\\+?6?01)[0-46-9]-*[0-9]{7,8}");//Format: +6012-34567890
    }

    public static boolean validateEmail(String email) {
        return email.matches("^(.+)@(.+)$");
    }

    public static boolean validateAddState(String AddState) {
        return AddState.matches("Kuala Lumpur|Putrajaya|Labuan|Perlis|Kedah|Terengganu|Pahang|Perak|Kelantan|Penang|Selangor|Negeri Sembilan|Johor|Malacca|Sabah|Sarawak");
    }

    public static boolean validateCVV(String cvv) {
        return cvv.matches("\\d{3}");
    }
    public static boolean validateAddPostcode(String AddPostcode) {
        return AddPostcode.matches("\\d{5}");
    }

    public static boolean validateAddress(String AddState, String AddPostcode) {
        return validateAddState(AddState) && validateAddPostcode(AddPostcode);
    }

    public static boolean validateName(String name) {
        return name.matches("[a-zA-Z]+([ '-][a-zA-Z]+)*");
    }

}
