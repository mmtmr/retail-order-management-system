package retailordermanagementsystem;

import java.util.ArrayList;
import java.time.LocalDateTime;

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

    public Account(String AccID, String AccName, String AccPassword, LocalDateTime AccRegisterDT, LocalDateTime AccLastLoginDT) {
        this.AccID = AccID;
        this.AccName = AccName;
        this.AccPassword = AccPassword;
        this.AccRegisterDT = AccRegisterDT;
        this.AccLastLoginDT = AccLastLoginDT;
    }

    public String getAccID() {
        return AccID;
    }

    public void setAccID(String AccID) {
        this.AccID = AccID;
    }

    public void generateAccID() {

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

}

class AdminAcc extends Account {

    private static int AANum; //TODO: READ FROM TXT FILE

    public AdminAcc(String AccID, String AccName, String AccPassword, LocalDateTime AccRegisterDT, LocalDateTime AccLastLoginDT) {
        super(AccID, AccName, AccPassword, AccRegisterDT, AccLastLoginDT);
    }

    @Override
    public void generateAccID() { //TODO: 
        String AANumFormatted = String.format("%06d", AANum);
        setAccID("AC" + AANumFormatted); //AC000001
        AANum += 1;
    }

    //TODO CHECK DUPKEY
}

class CusAcc extends Account {

    private static int CANum; //TODO: READ FROM TXT FILE

    public CusAcc(String AccID, String AccName, String AccPassword, LocalDateTime AccRegisterDT, LocalDateTime AccLastLoginDT) {
        super(AccID, AccName, AccPassword, AccRegisterDT, AccLastLoginDT);
    }

    @Override
    public void generateAccID() {
        String CANumFormatted = String.format("%06d", CANum);
        super.setAccID("CA" + CANumFormatted); //CC000001
        CANum += 1;
    }

    //TODO CHECK DUPKEY
}

class Address {

    private String AddStreet;
    private String AddCity;
    private String AddState;
    private String AddPostcode;

    public Address(String AddStreet, String AddCity, String AddState, String AddPostcode) {
        this.AddStreet = AddStreet;
        this.AddCity = AddCity;
        this.AddState = AddState;
        this.AddPostcode = AddPostcode;
    }

    public String getAddStreet() {
        return AddStreet;
    }

    public void setAddStreet(String AddStreet) {
        this.AddStreet = AddStreet;
    }

    public String getAddCity() {
        return AddCity;
    }

    public void setAddCity(String AddCity) {
        this.AddCity = AddCity;
    }

    public String getAddState() {
        return AddState;
    }

    public void setAddState(String AddState) {
        this.AddState = AddState;
    }

    public String getAddPostcode() {
        return AddPostcode;
    }

    public void setAddPostcode(String AddPostcode) {
        this.AddPostcode = AddPostcode;
    }

    public static boolean validateStreet(String AddStreet) {
        return AddStreet.matches("\\w+(\\s\\w+){2,}");
    }

    public static boolean validateCity(String AddCity) {
        return AddCity.matches("([a-zA-Z]+|[a-zA-Z]+\\\\s[a-zA-Z]+)");
    }

    public static boolean validateState(String AddState) {
        return AddState.matches("Kuala Lumpur|Putrajaya|Labuan|Perlis|Kedah|Terengganu|Pahang|Perak|Kelantan|Penang|Selangor|Negeri Sembilan|Johor|Malacca|Sabah|Sarawak");
    }

    public static boolean validatePostcode(String AddPostcode) {
        return AddPostcode.matches("\\d{5}");
    }

    public static boolean validateAddress(String AddStreet, String AddCity, String AddState, String AddPostcode) {
        return validateStreet(AddStreet) && validateCity(AddCity) && validateState(AddState) && validatePostcode(AddPostcode);
    }
}

//TODO CLASS Person INHERITANCE OR CONTACT DETAILS COMPOSITION
class Customer {

    private String CusFName;
    private String CusLName;
    private String CusPhone;
    private String CusEmail;
    private Address CusAddress;
    private CusAcc CusAccount; //UniqueID is here
    private ArrayList<Order> CusOrders = new ArrayList<Order>();
    //TODO PAYMENT CREDIT CARD PAYMENT, OPTIONAL CUSTOMER BALANCE

    public Customer(String CusFName, String CusLName, String CusPhone, String CusEmail, Address CusAddress, CusAcc CusAccount) {
        this.CusFName = CusFName;
        this.CusLName = CusLName;
        this.CusPhone = CusPhone;
        this.CusEmail = CusEmail;
        this.CusAddress = CusAddress;
        this.CusAccount = CusAccount;
    }

    public String getCusFName() {
        return CusFName;
    }

    public void setCusFName(String CusFName) {
        this.CusFName = CusFName;
    }

    public String getCusLName() {
        return CusLName;
    }

    public void setCusLName(String CusLName) {
        this.CusLName = CusLName;
    }

    public String getCusPhone() {
        return CusPhone;
    }

    public void setCusPhone(String CusPhone) {
        this.CusPhone = CusPhone;
    }

    public String getCusEmail() {
        return CusEmail;
    }

    public void setCusEmail(String CusEmail) {
        this.CusEmail = CusEmail;
    }

    public Address getCusAddress() {
        return CusAddress;
    }

    public void setCusAddress(Address CusAddress) {
        this.CusAddress = CusAddress;
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

    public static boolean validateName(String name) {
        return name.matches("[[a-zA-Z]+([ '-][a-zA-Z]+)*");
    }

    public static boolean validatePhoneNo(String phoneNo) {
        return phoneNo.matches("^(\\+?6?01)[02-46-9]-*[0-9]{7}$|^(\\+?6?01)[1]-*[0-9]{8}$");//Format: +6012-34567890
    }

    public static boolean validateEmail(String email) {
        return email.matches("^(.+)@(.+)$");
    }

}

class Supplier {

    private String SupID;
    private String SupName;
    private String SupPersonInChargeFName;
    private String SupPersonInChargeLName;
    private String SupPhone;
    private String SupEmail;
    private String SupRemarks;
    private ArrayList<Product> SupProducts = new ArrayList<Product>();

    public Supplier(String SupID, String SupName, String SupPersonInChargeFName, String SupPersonInChargeLName, String SupPhone, String SupEmail, String SupRemarks) {
        this.SupID = SupID;
        this.SupName = SupName;
        this.SupPersonInChargeFName = SupPersonInChargeFName;
        this.SupPersonInChargeLName = SupPersonInChargeLName;
        this.SupPhone = SupPhone;
        this.SupEmail = SupEmail;
        this.SupRemarks = SupRemarks;
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

    public String getSupPersonInChargeFName() {
        return SupPersonInChargeFName;
    }

    public void setSupPersonInChargeFName(String SupPersonInChargeFName) {
        this.SupPersonInChargeFName = SupPersonInChargeFName;
    }

    public String getSupPersonInChargeLName() {
        return SupPersonInChargeLName;
    }

    public void setSupPersonInChargeLName(String SupPersonInChargeLName) {
        this.SupPersonInChargeLName = SupPersonInChargeLName;
    }

    public String getSupPhone() {
        return SupPhone;
    }

    public void setSupPhone(String SupPhone) {
        this.SupPhone = SupPhone;
    }

    public String getSupEmail() {
        return SupEmail;
    }

    public void setSupEmail(String SupEmail) {
        this.SupEmail = SupEmail;
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

    public static boolean validateName(String name) {
        return name.matches("[[a-zA-Z]+([ '-][a-zA-Z]+)*");
    }

    public static boolean validatePhoneNo(String phoneNo) {
        return phoneNo.matches("^(\\+?6?01)[02-46-9]-*[0-9]{7}$|^(\\+?6?01)[1]-*[0-9]{8}$");//TODO Validate House Phone
    }

    public static boolean validateEmail(String email) {
        return email.matches("^(.+)@(.+)$");
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
    private boolean ProFragile;// NO IFELSE

    public Product(String ProID, String ProName, int ProStock, double ProPrice, double ProPackingCharge, double ProWeight, String[] ProModel, ProductType ProCategory, boolean ProFragile) {
        this.ProID = ProID;
        this.ProName = ProName;
        this.ProStock = ProStock;
        this.ProPrice = ProPrice;
        this.ProPackingCharge = ProPackingCharge;
        this.ProWeight = ProWeight;
        this.ProModel = ProModel;
        this.ProCategory = ProCategory;
        this.ProFragile = ProFragile;
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

    public boolean isProFragile() {
        return ProFragile;
    }

    public void setProFragile(boolean ProFragile) {
        this.ProFragile = ProFragile;
    }

}

class OrderItem extends Product {

    private String OIID; //ORD001-P0010001001
    private int OIQuantity;
    private String OIModel;
    private double OIPrice;
    private double OIPackingCharge;

    public OrderItem(String OIID, int OIQuantity, String OIModel, String ProID, String ProName, int ProStock, double ProPrice, double ProPackingCharge, double ProWeight, String[] ProModel, ProductType ProCategory, boolean ProFragile) {
        super(ProID, ProName, ProStock, ProPrice, ProPackingCharge, ProWeight, ProModel, ProCategory, ProFragile);
        this.OIID = OIID;
        this.OIQuantity = OIQuantity;
        this.OIModel = OIModel;
        OIPrice = OIPrice * OIQuantity;
        OIPackingCharge = ProPackingCharge * OIQuantity;
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

}

class Order {

    private String OrdID; //ORD001
    private LocalDateTime OrdCreateDT;
    private LocalDateTime OrdModifyDT;
    private ArrayList<OrderItem> OrdItems = new ArrayList<OrderItem>();

    public Order(String OrdID, LocalDateTime OrdCreateDT, LocalDateTime OrdModifyDT) {
        this.OrdID = OrdID;
        this.OrdCreateDT = OrdCreateDT;
        this.OrdModifyDT = OrdModifyDT;
    }

    public String getOrdID() {
        return OrdID;
    }

    public void setOrdID(String OrdID) {
        this.OrdID = OrdID;
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

}

public class RetailOrderManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

}
