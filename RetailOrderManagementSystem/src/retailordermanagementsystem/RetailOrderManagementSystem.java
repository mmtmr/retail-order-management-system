
package retailordermanagementsystem;

/**
 *
 * @author Lai Mei Sim, Koh Ya Wen
 */
//enum AccountType {Admin,Customer};
class Account {
    private String AccName;
    private String AccPassword;
    private boolean AccAdmin;
    public void successMessage(String name){
        System.out.println("Login success! Welcome back, "+name+".");
    } //TODO How to fetch name?
    public void failureMessage(){
        System.out.println("Admin name or password is wrong.\nPlease contact the admin or system administrator to reset.");
        //TODO Send e-mail to administrator on fail login attempt
    }
}

class Address {
    private String AddStreet;
    private String AddCity;
    private String AddState; //TODO: might need an enum here
    private int AddPostcode;
}

class PhoneNumber {
    private String PNPrefix; //TODO: might need an enum here
    private String PNNumber; //TODO: detect is 10 digits or what
}

//class Email {
//    private String;
//    alaimeisim @ gmail.com
//    private String
//}
//TODO validate email
//enum PaymentMethod {Card,Transfer}
//class Payment {
//    private
//}
//TODO Payment

class Customer {
    private String CusID;
    private String CusFName;
    private String CusLName;
    private PhoneNumber CusPhone;
    private String CusEmail;
    private Address CusAddress;
    private Account CusAccount;
}

class Supplier {
    private String SupName;
    private PhoneNumber SupPhone;
    private String SupEmail;    
}

class Product { //SUBCLASS
    private String ProID;
    private String ProName;
    private int ProStock;//Item Remaining
    private double ProPrice;
    private double ProWeight;
    private String ProCategory;
    private boolean ProFragile;// NO IFELSE
}

class OrderItem {
    private Product OIProduct;
    private int OIQuantity;
}

class Order {
    private OrderItem[] OrdItems;
}
public class RetailOrderManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
