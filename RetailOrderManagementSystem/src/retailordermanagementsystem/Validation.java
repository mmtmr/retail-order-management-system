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
//To validate user input
public class Validation {

    public static boolean validateNoTabAndNoNull(String input) {
        return !input.contains("\t")&&!input.isEmpty();
    }
    
    public static boolean validateNotNull(String input) {
        return !input.isEmpty();
    }

    public static void validateCustomer(String fname, String lname, String phone, String email, String AddStreet, String AddCity, String AddState, String AddPostcode, String accname) throws Exception{
        if (validateNoTabAndNoNull(phone) && validateNoTabAndNoNull(email) && validateNoTabAndNoNull(AddStreet) && validateNoTabAndNoNull(AddCity) && validateNoTabAndNoNull(AddState) && validateNoTabAndNoNull(AddPostcode)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab inside input or NULL input.");    
        }
        if (validatePhone(phone) && validateEmail(email) && validateAddress(AddState, AddPostcode)) {
        } else {
            throw new Exception("Contact info format is incorrect");
        }
        if (validateNoTabAndNoNull(fname) && validateNoTabAndNoNull(lname)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab inside input or NULL input.");
        }
        if (validateName(fname) && validateName(lname)) {
        } else {
            throw new Exception("Personal info format is incorrect");
        }
        if (validateNoTabAndNoNull(accname)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab inside input or NULL input.");
        }
    }
    
    public static void validateCustomer(String fname, String lname, String phone, String email, String AddStreet, String AddCity, String AddState, String AddPostcode, String accname, String password) throws Exception{
        if (validateNoTabAndNoNull(phone) && validateNoTabAndNoNull(email) && validateNoTabAndNoNull(AddStreet) && validateNoTabAndNoNull(AddCity) && validateNoTabAndNoNull(AddState) && validateNoTabAndNoNull(AddPostcode)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab inside input or NULL input.");    
        }
        if (validatePhone(phone) && validateEmail(email) && validateAddress(AddState, AddPostcode)) {
        } else {
            throw new Exception("Contact info format is incorrect");
        }
        if (validateNoTabAndNoNull(fname) && validateNoTabAndNoNull(lname)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab inside input or NULL input.");
        }
        if (validateName(fname) && validateName(lname)) {
        } else {
            throw new Exception("Personal info format is incorrect");
        }
        if (validateNoTabAndNoNull(accname) && validateNoTabAndNoNull(password)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab inside input or NULL input.");
        }
    }

//    public static boolean validateContactInfo(String phone, String email, String AddStreet, String AddCity, String AddState, String AddPostcode) throws Exception {
//        if (validateNoTabAndNoNull(phone) && validateNoTabAndNoNull(email) && validateNoTabAndNoNull(AddStreet) && validateNoTabAndNoNull(AddCity) && validateNoTabAndNoNull(AddState) && validateNoTabAndNoNull(AddPostcode)) {
//        } else {
//            throw new Exception("Invalid Input: Remove the tab inside input.");
//        }
//        if (validatePhone(phone) && validateEmail(email) && validateAddress(AddState, AddPostcode)) {
//        } else {
//            throw new Exception("Contact info format is incorrect");
//        }
//        return validatePhone(phone) && validateEmail(email) && validateAddress(AddState, AddPostcode) && validateNoTabAndNoNull(phone) && validateNoTabAndNoNull(email) && validateNoTabAndNoNull(AddStreet) && validateNoTabAndNoNull(AddCity) && validateNoTabAndNoNull(AddState) && validateNoTabAndNoNull(AddPostcode);
//    }
//
//    public static boolean validatePersonalInfo(String fname, String lname) throws Exception {
//        if (validateNoTabAndNoNull(fname) && validateNoTabAndNoNull(lname)) {
//        } else {
//            throw new Exception("Invalid Input: Remove the tab inside input.");
//        }
//        if (validateName(fname) && validateName(lname)) {
//        } else {
//            throw new Exception("Personal info format is incorrect");
//        }
//        return validateNoTabAndNoNull(fname) && validateNoTabAndNoNull(lname) && validateName(fname) && validateName(lname);
//    }
//
    public static void validateAccount(String accname, String password) throws Exception {
        if (validateNoTabAndNoNull(accname) && validateNoTabAndNoNull(password)) {
        } else {
            throw new Exception("Invalid Input: Remove the tab inside input.");
        }
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
