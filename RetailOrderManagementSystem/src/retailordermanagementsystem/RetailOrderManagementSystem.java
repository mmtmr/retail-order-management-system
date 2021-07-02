
package retailordermanagementsystem;

/**
 *
 * @author Lai Mei Sim, Koh Ya Wen
 */
enum AccountType {Admin,Customer};
class Account {
    private String AccName;
    private String AccPassword;
    private AccountType AccType;
    public void successMessage(String name){
        System.out.println("Login success! Welcome back, "+name+".");
    } //TODO How to fetch name?
    public void failureMessage(){
        System.out.println("Username or password is wrong.\nPlease contact the admin or system administrator to reset.");
        //TODO hyperlink for admin
        //TODO Send e-mail to administrator on fail login attempt
    }
}

class Address {
    private String AddStreet;
    private String AddCity;
    private String AddState; //TODO: might need an enum here
    private int AddPostcode; //TODO check how the number of digits
}

class PhoneNumber {
    private String PNPrefix; //TODO: might need an enum here
    private String PNNumber;
}
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

class Product {
    private String ProID;
    private String ProName;
    private int ProStock;//Item Remaining
    private double ProPrice;
    private String ProCategory;
    private boolean ProFragile;
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
