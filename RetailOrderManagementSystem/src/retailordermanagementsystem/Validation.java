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

    public static boolean validateNoTab(String input) {
        return !input.contains("\t");
    }

    public static boolean validateContactInfo(String phone, String email, String AddStreet, String AddCity, String AddState, String AddPostcode){
        try {
            if (validateNoTab(phone) && validateNoTab(email) && validateNoTab(AddStreet) && validateNoTab(AddCity) && validateNoTab(AddState) && validateNoTab(AddPostcode)) {
            } else {
                throw new Exception("Invalid Input: Remove the tab inside input.");
            }
            if (validatePhone(phone) && validateEmail(email) && validateAddress(AddState, AddPostcode)) {
            } else {
                throw new Exception("Contact info format is incorrect");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return validatePhone(phone) && validateEmail(email) && validateAddress(AddState, AddPostcode)&&validateNoTab(phone) && validateNoTab(email) && validateNoTab(AddStreet) && validateNoTab(AddCity) && validateNoTab(AddState) && validateNoTab(AddPostcode);
    }
    
    public static boolean validatePersonalInfo(String fname, String lname){
        try {
            if (validateNoTab(fname) && validateNoTab(lname)) {
            } else {
                throw new Exception("Invalid Input: Remove the tab inside input.");
            }
            if (validateName(fname) && validateName(lname)) {
            } else {
                throw new Exception("Personal info format is incorrect");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return validateNoTab(fname) && validateNoTab(lname) &&validateName(fname) && validateName(lname);
    }
    
    public static boolean validateAccount(String accname, String password){
        try {
            if (validateNoTab(accname) && validateNoTab(password)) {
            } else {
                throw new Exception("Invalid Input: Remove the tab inside input.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return validateNoTab(accname) && validateNoTab(password);
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
