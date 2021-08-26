package retailordermanagementsystem;

import java.util.*;
import java.time.*;

/**
 *
 * @author Lai Mei Sim, Koh Ya Wen
 */
class Account {

    private String AccID;
    private String AccName;
    private String AccPassword;
    private LocalDateTime AccRegisterDT;
    private LocalDateTime AccLastLoginDT;

    public Account() {
    }

    public Account(String AccID, String AccName, String AccPassword, LocalDateTime AccRegisterDT, LocalDateTime AccLastLoginDT) {
        this.AccID = AccID;
        this.AccName = AccName;
        this.AccPassword = AccPassword;
        this.AccRegisterDT = AccRegisterDT;
        this.AccLastLoginDT = AccLastLoginDT;
    }

    public Account(String AccName, String AccPassword) {
        this.AccName = AccName;
        this.AccPassword = AccPassword;
        this.AccRegisterDT=LocalDateTime.now();
        this.AccLastLoginDT=LocalDateTime.now();
    }
    

    public String getAccID() {
        return AccID;
    }

    public void setAccID(String AccID) {
        this.AccID = AccID;
    }

    public String generateAccID() {
        return "";
    }

    public String getAccName() {
        return AccName;
    }

    public void setAccName(String AccName) {
        this.AccName = AccName;
    }

    public String getAccPassword() {
        return AccPassword;
    }

    public void setAccPassword(String AccPassword) {
        this.AccPassword = AccPassword;
    }

    public LocalDateTime getAccRegisterDT() {
        return AccRegisterDT;
    }

    public void setAccRegisterDT(LocalDateTime AccRegisterDT) {
        this.AccRegisterDT = AccRegisterDT;
    }

    public LocalDateTime getAccLastLoginDT() {
        return AccLastLoginDT;
    }

    public void setAccLastLoginDT(LocalDateTime AccLastLoginDT) {
        this.AccLastLoginDT = AccLastLoginDT;
    }

    public void registerAcc(String AccName, String AccPassword, LocalDateTime AccRegisterDT){
        generateAccID();
        setAccName(AccName);
        setAccPassword(AccPassword);
        setAccRegisterDT(AccRegisterDT);
    }
    
    public boolean verifyLogin(String LoginName, String LoginPassword){
        return LoginName.equals(getAccName())&&LoginPassword.equals(getAccPassword());
    }
    
    @Override
    public String toString() {
        return "Account{" + "AccID=" + AccID + ", AccName=" + AccName + ", AccPassword=" + AccPassword + ", AccRegisterDT=" + AccRegisterDT + ", AccLastLoginDT=" + AccLastLoginDT + '}';
    }
    
}

class AdminAcc extends Account {

    private static int AACounter=0; //TODO: READ FROM TXT FILE

    public AdminAcc() {
    }

    public AdminAcc(String AccName, String AccPassword) {
        super(AccName, AccPassword);
        setAccID(generateAccID());
    }

    
    public AdminAcc(String AccID, String AccName, String AccPassword, LocalDateTime AccRegisterDT, LocalDateTime AccLastLoginDT) {
        super(AccID, AccName, AccPassword, AccRegisterDT, AccLastLoginDT);
    }

    @Override
    public String generateAccID() { //TODO: 
        String AANumFormatted = String.format("%06d", AACounter);
        AACounter += 1;
        return ("AA" + AANumFormatted); //AC000001
    }

    //TODO CHECK DUPKEY
}

class CusAcc extends Account {

    private static int CACounter=0; //TODO: READ FROM TXT FILE

    public CusAcc() {
    }

    public CusAcc(String AccName, String AccPassword) {
        super(AccName, AccPassword);
        setAccID(generateAccID());
    }

    public CusAcc(String AccID, String AccName, String AccPassword, LocalDateTime AccRegisterDT, LocalDateTime AccLastLoginDT) {
        super(AccID, AccName, AccPassword, AccRegisterDT, AccLastLoginDT);
    }

    @Override
    public String generateAccID() {
        String CANumFormatted = String.format("%05d", CACounter);
        CACounter += 1;
        return ("CA" + CANumFormatted);//CA00001
    }

    //TODO CHECK DUPKEY
}

class PersonalInfo{
    private String PIFName;
    private String PILName;
    private char PIGender;

    public PersonalInfo() {
    }
    
    
    public PersonalInfo(String PIFName, String PILName, char PIGender) {
        this.PIFName = PIFName;
        this.PILName = PILName;
        this.PIGender = PIGender;
    }

    public String getPIFName() {
        return PIFName;
    }

    public void setPIFName(String PIFName) {
        this.PIFName = PIFName;
    }

    public String getPILName() {
        return PILName;
    }

    public void setPILName(String PILName) {
        this.PILName = PILName;
    }

    public char getPIGender() {
        return PIGender;
    }

    public void setPIGender(char PIGender) {
        this.PIGender = PIGender;
    }
    
    public boolean validatePIFName() {
        return getPIFName().matches("[[a-zA-Z]+([ '-][a-zA-Z]+)*");
    }
    
    public boolean validatePILName() {
        return getPILName().matches("[[a-zA-Z]+([ '-][a-zA-Z]+)*");
    }
}

class CustomerInfo extends PersonalInfo{
    private int PIRewardPoint;
    private LocalDateTime PIDateOfBirth;

    public CustomerInfo() {
    }

    public CustomerInfo(String PIFName, String PILName, char PIGender) {
        super(PIFName, PILName, PIGender);
    }

    public CustomerInfo(int PIRewardPoint, LocalDateTime PIDateOfBirth) {
        this.PIRewardPoint = PIRewardPoint;
        this.PIDateOfBirth = PIDateOfBirth;
    }
    
    public CustomerInfo(int CIRewardPoint, LocalDateTime CIDateOfBirth, String PIFName, String PILName, char PIGender) {
        super(PIFName, PILName, PIGender);
        this.PIRewardPoint = CIRewardPoint;
        this.PIDateOfBirth = CIDateOfBirth;
    }

    public int getPIRewardPoint() {
        return PIRewardPoint;
    }

    public void setPIRewardPoint(int PIRewardPoint) {
        this.PIRewardPoint = PIRewardPoint;
    }

    public LocalDateTime getPIDateOfBirth() {
        return PIDateOfBirth;
    }

    public void setPIDateOfBirth(LocalDateTime PIDateOfBirth) {
        this.PIDateOfBirth = PIDateOfBirth;
    }   
}


class ContactInfo{
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

    
    public boolean validateCIPhone() {
        return CIPhone.matches("^(\\+?6?01)[02-46-9]-*[0-9]{7}$|^(\\+?6?01)[1]-*[0-9]{8}$");//Format: +6012-34567890
    }

    public boolean validateCIEmail() {
        return CIEmail.matches("^(.+)@(.+)$");
    }
    
//    public boolean validateStreet() {
//        return getConAddStreet().matches("\\w+(\\s\\w+){2,}");
//    }
//
//    public boolean validateCity() {
//        return getConAddCity().matches("([a-zA-Z]+|[a-zA-Z]+\\\\s[a-zA-Z]+)");
//    }

    public boolean validateCIAddState() {
        return getCIAddState().matches("Kuala Lumpur|Putrajaya|Labuan|Perlis|Kedah|Terengganu|Pahang|Perak|Kelantan|Penang|Selangor|Negeri Sembilan|Johor|Malacca|Sabah|Sarawak");
    }

    public boolean validateCIAddPostcode() {
        return getCIAddPostcode().matches("\\d{5}");
    }

    public boolean validateCIAddress() {
        return validateCIAddState() && validateCIAddPostcode();
    }
}
//TODO CLASS Person INHERITANCE OR CONTACT DETAILS COMPOSITION
class Customer {

    private CustomerInfo CusPI;
    private ContactInfo CusCI;
    private CusAcc CusAccount; //UniqueID is here
    private ArrayList<Order> CusOrders;
    //TODO PAYMENT CREDIT CARD PAYMENT, OPTIONAL CUSTOMER BALANCE

    public Customer(){
        this.CusPI=new CustomerInfo();
        this.CusCI=new ContactInfo();
        this.CusAccount=new CusAcc();
        this.CusOrders=new ArrayList<Order>();
    }

    public Customer(CustomerInfo CusPI, ContactInfo CusCI, CusAcc CusAccount, ArrayList<Order> CusOrders) {
        this.CusPI = CusPI;
        this.CusCI = CusCI;
        this.CusAccount = CusAccount;
        this.CusOrders = CusOrders;
    }

    public CustomerInfo getCusPI() {
        return CusPI;
    }

    public void setCusPI(CustomerInfo CusPI) {
        this.CusPI = CusPI;
    }

    public ContactInfo getCusCI() {
        return CusCI;
    }

    public void setCusCI(ContactInfo CusCI) {
        this.CusCI = CusCI;
    }


    public CusAcc getCusAccount() {
        return CusAccount;
    }

    public void setCusAccount(CusAcc CusAccount) {
        this.CusAccount = CusAccount;
    }

    public ArrayList<Order> getCusOrders() {
        return CusOrders;
    }

    public void setCusOrders(ArrayList<Order> CusOrders) {
        this.CusOrders = CusOrders;
    }

}

class Supplier {
    private String SupID;
    private String SupName;
    private PersonalInfo SupPersonInCharge;
    private ContactInfo SupCI;
    private String SupRemarks;
    private ArrayList<Product> SupProducts;

    public Supplier() {
        this.SupPersonInCharge=new PersonalInfo();
        this.SupCI=new ContactInfo();
        this.SupProducts=new ArrayList<Product>();
    }

    public Supplier(String SupID, String SupName, PersonalInfo SupPersonInCharge, ContactInfo SupCI, String SupRemarks, ArrayList<Product> SupProducts) {
        this.SupID = SupID;
        this.SupName = SupName;
        this.SupPersonInCharge = SupPersonInCharge;
        this.SupCI = SupCI;
        this.SupRemarks = SupRemarks;
        this.SupProducts = SupProducts;
    }

    public String getSupID() {
        return SupID;
    }

    public void setSupID(String SupID) {
        this.SupID = SupID;
    }

    public String getSupName() {
        return SupName;
    }

    public void setSupName(String SupName) {
        this.SupName = SupName;
    }

    public PersonalInfo getSupPersonInCharge() {
        return SupPersonInCharge;
    }

    public void setSupPersonInCharge(PersonalInfo SupPersonInCharge) {
        this.SupPersonInCharge = SupPersonInCharge;
    }

    public ContactInfo getSupCI() {
        return SupCI;
    }

    public void setSupCI(ContactInfo SupCI) {
        this.SupCI = SupCI;
    }

    public String getSupRemarks() {
        return SupRemarks;
    }

    public void setSupRemarks(String SupRemarks) {
        this.SupRemarks = SupRemarks;
    }

    public ArrayList<Product> getSupProducts() {
        return SupProducts;
    }

    public void setSupProducts(ArrayList<Product> SupProducts) {
        this.SupProducts = SupProducts;
    }
    
}

enum ProductType {
    Stationary, Food,
}

class Product {

    private String ProID; //Metadata Idea: P0010001001
    private String ProName;
    private int ProStock;//Item Remaining
    private double ProPrice;
    private double ProPackingCharge;
    private double ProWeight;
    private String[] ProModel;
    private ProductType ProCategory;
    private Supplier ProSupplier;

    public Product() {
    }

    public Product(String ProID, String ProName, int ProStock, double ProPrice, double ProPackingCharge, double ProWeight, String[] ProModel, ProductType ProCategory, Supplier ProSupplier) {
        this.ProID = ProID;
        this.ProName = ProName;
        this.ProStock = ProStock;
        this.ProPrice = ProPrice;
        this.ProPackingCharge = ProPackingCharge;
        this.ProWeight = ProWeight;
        this.ProModel = ProModel;
        this.ProCategory = ProCategory;
        this.ProSupplier = ProSupplier;
    }

    

    public String getProID() {
        return ProID;
    }

    public void setProID(String ProID) {
        this.ProID = ProID;
    }

    public String getProName() {
        return ProName;
    }

    public void setProName(String ProName) {
        this.ProName = ProName;
    }

    public int getProStock() {
        return ProStock;
    }

    public void setProStock(int ProStock) {
        this.ProStock = ProStock;
    }

    public double getProPrice() {
        return ProPrice;
    }

    public void setProPrice(double ProPrice) {
        this.ProPrice = ProPrice;
    }

    public double getProPackingCharge() {
        return ProPackingCharge;
    }

    public void setProPackingCharge(double ProPackingCharge) {
        this.ProPackingCharge = ProPackingCharge;
    }

    public double getProWeight() {
        return ProWeight;
    }

    public void setProWeight(double ProWeight) {
        this.ProWeight = ProWeight;
    }

    public String[] getProModel() {
        return ProModel;
    }

    public void setProModel(String[] ProModel) {
        this.ProModel = ProModel;
    }

    public ProductType getProCategory() {
        return ProCategory;
    }

    public void setProCategory(ProductType ProCategory) {
        this.ProCategory = ProCategory;
    }

    public Supplier getProSupplier() {
        return ProSupplier;
    }

    public void setProSupplier(Supplier ProSupplier) {
        this.ProSupplier = ProSupplier;
    }
    
    public void generateProPackingCharge(){
        double baseCharge=6.00;
        double realCharge=0.00;
        
        realCharge=getProWeight()/0.50*baseCharge;//6 Ringgit per 0.5kg
        
        if (realCharge%baseCharge!=0){
            realCharge=realCharge-(realCharge%baseCharge)+baseCharge;
        }     
        setProPackingCharge(realCharge);
    }
}

class FragilePro extends Product{

    public FragilePro() {
    }

    public FragilePro(String ProID, String ProName, int ProStock, double ProPrice, double ProPackingCharge, double ProWeight, String[] ProModel, ProductType ProCategory, Supplier ProSupplier) {
        super(ProID, ProName, ProStock, ProPrice, ProPackingCharge, ProWeight, ProModel, ProCategory, ProSupplier);
    }

    @Override
    public void generateProPackingCharge() {
        
        double baseCharge=10.00;
        double realCharge=0.00;

        realCharge=getProWeight()/0.50*baseCharge;//10 Ringgit per 0.5kg
        
        if (realCharge%baseCharge!=0){
            realCharge=realCharge-(realCharge%baseCharge)+baseCharge;
        }
        
        setProPackingCharge(realCharge);
    } 
}

class OrderItem extends Product {

    private String OIID; //ORD001-P0010001001
    private int OIQuantity;
    private String OIModel;
    private double OIPrice;
    private double OIPackingCharge;

    public OrderItem() {
    }

    public OrderItem(String OIID, int OIQuantity, String OIModel, String ProID, String ProName, int ProStock, double ProPrice, double ProPackingCharge, double ProWeight, String[] ProModel, ProductType ProCategory, Supplier ProSupplier) {
        super(ProID, ProName, ProStock, ProPrice, ProPackingCharge, ProWeight, ProModel, ProCategory, ProSupplier);
        this.OIID = OIID;
        this.OIQuantity = OIQuantity;
        this.OIModel = OIModel;
        this.OIPrice = ProPrice * OIQuantity;
        this.OIPackingCharge = ProPackingCharge * OIQuantity;
    }


    public String getOIID() {
        return OIID;
    }

    public void setOIID(String OIID) {
        this.OIID = OIID;
    }

    public int getOIQuantity() {
        return OIQuantity;
    }

    public void setOIQuantity(int OIQuantity) {
        this.OIQuantity = OIQuantity;
    }

    public String getOIModel() {
        return OIModel;
    }

    public void setOIModel(String OIModel) {
        this.OIModel = OIModel;
    }

    public double getOIPrice() {
        return OIPrice;
    }

    public void setOIPrice(double OIPrice) {
        this.OIPrice = OIPrice;
    }

    public double getOIPackingCharge() {
        return OIPackingCharge;
    }

    public void setOIPackingCharge(double OIPackingCharge) {
        this.OIPackingCharge = OIPackingCharge;
    }
    
    public void generateOIPrice(){
        OIPrice = getProPrice() * OIQuantity;
    }

    public void generateOIPackingCharge(){
        OIPackingCharge = getProPackingCharge() * OIQuantity;
    }
}

class Order {
    private String OrdID; //ORD000001
    private static int OrdIDCounter = 0;//TODO Modify with Total ID
    private LocalDateTime OrdCreateDT;
    private LocalDateTime OrdModifyDT;
    private ArrayList<OrderItem> OrdItems;

    public Order(String OrdID, LocalDateTime OrdCreateDT, LocalDateTime OrdModifyDT, ArrayList<OrderItem> OrdItems) {
        this.OrdID = OrdID;
        this.OrdCreateDT = OrdCreateDT;
        this.OrdModifyDT = OrdModifyDT;
        this.OrdItems = OrdItems;
    }

    public String getOrdID() {
        return OrdID;
    }

    public void setOrdID(String OrdID) {
        this.OrdID = OrdID;
    }

    public static int getOrdIDCounter() {
        return OrdIDCounter;
    }

    public static void setOrdIDCounter(int OrdIDCounter) {
        Order.OrdIDCounter = OrdIDCounter;
    }

    public LocalDateTime getOrdCreateDT() {
        return OrdCreateDT;
    }

    public void setOrdCreateDT(LocalDateTime OrdCreateDT) {
        this.OrdCreateDT = OrdCreateDT;
    }

    public LocalDateTime getOrdModifyDT() {
        return OrdModifyDT;
    }

    public void setOrdModifyDT(LocalDateTime OrdModifyDT) {
        this.OrdModifyDT = OrdModifyDT;
    }

    public ArrayList<OrderItem> getOrdItems() {
        return OrdItems;
    }

    public void setOrdItems(ArrayList<OrderItem> OrdItems) {
        this.OrdItems = OrdItems;
    }
    
    public void generateOrdID(){
        String numOrdID=String.format("%06d", getOrdIDCounter());
        //https://www.mysamplecode.com/2012/03/java-add-leading-zeros-number.html
        setOrdID("ORD"+numOrdID);
        setOrdIDCounter(getOrdIDCounter()+1);
    }
}

class ShoppingCart extends Order{
    private static int SpcIDCounter;

    public ShoppingCart(String OrdID, LocalDateTime OrdCreateDT, LocalDateTime OrdModifyDT, ArrayList<OrderItem> OrdItems) {
        super(OrdID, OrdCreateDT, OrdModifyDT, OrdItems);
    }

    
    public static int getSpcIDCounter() {
        return SpcIDCounter;
    }

    public static void setSpcIDCounter(int SpcIDCounter) {
        ShoppingCart.SpcIDCounter = SpcIDCounter;
    }

    @Override
    public void generateOrdID() {
         String numSpcID=String.format("%06d", getSpcIDCounter());
        setOrdID("SPC"+numSpcID);
        setSpcIDCounter(getSpcIDCounter()+1);
    }
}

public class RetailOrderManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        //Test Login and Account Register
//        ArrayList<CusAcc> CusAccounts=new ArrayList<CusAcc>();
//        ArrayList<AdminAcc> AdminAccounts=new ArrayList<AdminAcc>();
//        
//        //Account Register
//        CusAcc Cus1=new CusAcc("MaxineYYDS","Maxine123");
//        AdminAcc Admin1=new AdminAcc("MaxineWorking","Maxine456");
//        CusAcc Cus2=new CusAcc("NewayYYDS","Neway123"); 
//        AdminAcc Admin2=new AdminAcc("NewayYYDS","Neway123");
//        
//        CusAccounts.add(Cus1);
//        CusAccounts.add(Cus2);
//        
//        AdminAccounts.add(Admin1);
//        AdminAccounts.add(Admin2);
//        
//        //Account Login
//        for (CusAcc acc : CusAccounts) { 		      
//           if(acc.verifyLogin("NewayYYDS","Neway123")){
//               System.out.println(acc);
//           }	
//      }
//        for (AdminAcc acc : AdminAccounts) { 		      
//           if(acc.verifyLogin("MaxineWorking","Maxine456")){
//               System.out.println(acc);
//           }	
//      }


    }

}
