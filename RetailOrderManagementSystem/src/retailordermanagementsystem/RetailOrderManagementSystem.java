package retailordermanagementsystem;

import java.util.*;
import java.time.*;
import static retailordermanagementsystem.Order.getOrdIDCounter;

/**
 *
 * @author Lai Mei Sim, Koh Ya Wen
 */
//https://stackoverflow.com/a/63564947
abstract class Account {

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
        this.AccRegisterDT = LocalDateTime.now();
        this.AccLastLoginDT = LocalDateTime.now();
    }

    public String getAccID() {
        return AccID;
    }

    public void setAccID(String AccID) {
        this.AccID = AccID;
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

    public boolean verifyLogin(String LoginName, String LoginPassword) {
        return LoginName.equals(getAccName()) && LoginPassword.equals(getAccPassword());
    }

    @Override
    public String toString() {
        return AccID + "\t" + AccName + "\t" + AccPassword + "\t" + AccRegisterDT + "\t" + AccLastLoginDT;
    }

    public abstract Account parseAccountFromString(String accLine);

}

class AdminAcc extends Account {

    private static int AACounter; //TODO: READ FROM TXT FILE

    public AdminAcc() {
    }

    public AdminAcc(String AccName, String AccPassword) {
        super(AccName, AccPassword);
        setAccID("AA" + String.format("%05d", AACounter));
        AACounter += 1;
    }

    public AdminAcc(String AccID, String AccName, String AccPassword, LocalDateTime AccRegisterDT, LocalDateTime AccLastLoginDT) {
        super(AccID, AccName, AccPassword, AccRegisterDT, AccLastLoginDT);
    }

    public static int getAACounter() {
        return AACounter;
    }

    public static void setAACounter(int AACounter) {
        AdminAcc.AACounter = AACounter;
    }

    @Override
    public Account parseAccountFromString(String accLine) {
        String[] accData = accLine.split("\t");
        System.out.println(Arrays.toString(accData));
        return new AdminAcc(accData[0], accData[1], accData[2], LocalDateTime.parse(accData[3]), LocalDateTime.parse(accData[4]));
    }

    //TODO CHECK DUPKEY
}

class CusAcc extends Account {

    private static int CACounter = 0; //TODO: READ FROM TXT FILE

    public CusAcc() {
    }

    public CusAcc(String AccName, String AccPassword) {
        super(AccName, AccPassword);
        setAccID("CA" + String.format("%05d", CACounter));
        CACounter += 1;
    }

    public CusAcc(String AccID, String AccName, String AccPassword, LocalDateTime AccRegisterDT, LocalDateTime AccLastLoginDT) {
        super(AccID, AccName, AccPassword, AccRegisterDT, AccLastLoginDT);
    }

    public static int getCACounter() {
        return CACounter;
    }

    public static void setCACounter(int CACounter) {
        CusAcc.CACounter = CACounter;
    }

    @Override
    public Account parseAccountFromString(String accLine) {
        String[] accData = accLine.split("\t");
        System.out.println(Arrays.toString(accData));
        return new CusAcc(accData[0], accData[1], accData[2], LocalDateTime.parse(accData[3]), LocalDateTime.parse(accData[4]));
    }

    //TODO CHECK DUPKEY
}

class PersonalInfo {

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
        return getPIFName().matches("[a-zA-Z]+([ '-][a-zA-Z]+)*");
    }

    public boolean validatePILName() {
        return getPILName().matches("[a-zA-Z]+([ '-][a-zA-Z]+)*");
    }

//    public boolean validatePIGender(){
//        return (getPIGender()=='F'||getPIGender()=='M');
//    }
    @Override
    public String toString() {
        return PIFName + "\t" + PILName + "\t" + PIGender;
    }

    public PersonalInfo parsePIFromString(String piLine) {
        String[] piData = piLine.split("\t");
        System.out.println(piData);
        return new PersonalInfo(piData[0], piData[1], piData[2].charAt(0));
    }
}

class CusInfo extends PersonalInfo {

    private int PIRewardPoint;
    private LocalDate PIDateOfBirth;

    //https://mkyong.com/java8/java-8-how-to-convert-string-to-localdate/
    public CusInfo() {
    }

    public CusInfo(String PIFName, String PILName, char PIGender) {
        super(PIFName, PILName, PIGender);
    }

    public CusInfo(int PIRewardPoint, LocalDate PIDateOfBirth) {
        this.PIRewardPoint = PIRewardPoint;
        this.PIDateOfBirth = PIDateOfBirth;
    }

    public CusInfo(String PIFName, String PILName, char PIGender, LocalDate PIDateOfBirth) {
        super(PIFName, PILName, PIGender);
        this.PIDateOfBirth = PIDateOfBirth;
        this.PIRewardPoint = 0;
    }

    public CusInfo(String PIFName, String PILName, char PIGender, int CIRewardPoint, LocalDate CIDateOfBirth) {
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

    public LocalDate getPIDateOfBirth() {
        return PIDateOfBirth;
    }

    public void setPIDateOfBirth(LocalDate PIDateOfBirth) {
        this.PIDateOfBirth = PIDateOfBirth;
    }

    @Override
    public String toString() {
        return getPIFName() + "\t" + getPILName() + "\t" + getPIGender() + "\t" + PIRewardPoint + "\t" + PIDateOfBirth;
    }

    public CusInfo parsePIFromString(String piLine) {
        String[] piData = piLine.split("\t");
        System.out.println(piData);
        return new CusInfo(piData[0], piData[1], piData[2].charAt(0), Integer.parseInt(piData[3]), LocalDate.parse(piData[4]));
    }
}

class ContactInfo {

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
        return CIPhone.matches("(\\+?6?01)[0-46-9]-*[0-9]{7,8}");//Format: +6012-34567890
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

    @Override
    public String toString() {
        return CIPhone + "\t" + CIEmail + "\t" + CIAddStreet + "\t" + CIAddCity + "\t" + CIAddState + "\t" + CIAddPostcode;
    }

    public ContactInfo parseCIFromString(String ciLine) {
        String[] ciData = ciLine.split("\t");
        System.out.println(ciData);
        return new ContactInfo(ciData[0], ciData[1], ciData[2], ciData[3], ciData[4], ciData[5]);
    }

}
//TODO CLASS Person INHERITANCE OR CONTACT DETAILS COMPOSITION

class Customer {

    private CusInfo CusPI;
    private ContactInfo CusCI;
    private CusAcc CusAccount; //UniqueID is here
    private ArrayList<Order> CusOrders;
    private ShoppingCart CusSC;
    //TODO PAYMENT CREDIT CARD PAYMENT, OPTIONAL CUSTOMER BALANCE

    public Customer() {
        this.CusPI = new CusInfo();
        this.CusCI = new ContactInfo();
        this.CusAccount = new CusAcc();

        this.CusSC = new ShoppingCart();
        this.CusOrders = new ArrayList<Order>();
    }

    public Customer(CusAcc CusAccount, CusInfo CusPI, ContactInfo CusCI, ShoppingCart CusSC, ArrayList<Order> CusOrders) {
        this.CusAccount = CusAccount;
        this.CusPI = CusPI;
        this.CusCI = CusCI;
        this.CusSC = CusSC;
        this.CusOrders = CusOrders;
    }

    public Customer(CusAcc CusAccount, CusInfo CusPI, ContactInfo CusCI) {
        this.CusAccount = CusAccount;
        this.CusPI = CusPI;
        this.CusCI = CusCI;
        this.CusSC = new ShoppingCart();
        this.CusOrders = new ArrayList<Order>();
    }

    public CusInfo getCusPI() {
        return CusPI;
    }

    public void setCusPI(CusInfo CusPI) {
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

    public ShoppingCart getCusSC() {
        return CusSC;
    }

    public void setCusSC(ShoppingCart CusSC) {
        this.CusSC = CusSC;
    }

    public ArrayList<Order> getCusOrders() {
        return CusOrders;
    }

    public void setCusOrders(ArrayList<Order> CusOrders) {
        this.CusOrders = CusOrders;
    }

    public String getCusOrdersIDs() {
        String CusOrdersIDs = "[";

        for (Order ord : CusOrders) {
            CusOrdersIDs = CusOrdersIDs + ord.getOrdID() + ',';
        }

        if (CusOrdersIDs.charAt(CusOrdersIDs.length() - 1) == ',') {
            CusOrdersIDs = CusOrdersIDs.substring(0, CusOrdersIDs.length() - 2);
        }
        CusOrdersIDs = CusOrdersIDs + ']';
        return CusOrdersIDs;
    }

    @Override
    public String toString() {
        return CusAccount.getAccID() + ";" + CusCI + ";" + CusPI + ";" + CusSC.getOrdID() + ";" + getCusOrdersIDs();
    }

//    public Customer parseCustomerFromString(String cusLine) {
//        System.out.println(cusLine);
//        String[] cusData = cusLine.split(";");
//        System.out.println(ciData);
//        return new Customer(ciData[0], ciData[1], ciData[2], ciData[3], ciData[4], ciData[5]);
//
//        String AccID = data[0];
//        String AccName = data[1];
//        StrAccPassword = data[2];
//        AccRegisterDT = LocalDateTime.parse(data[3]);
//        AccLastLoginDT = LocalDateTime.parse(data[4]);
//        return ()
//                
//    }
}

class Supplier {

    private String SupID;
    private String SupName;
    private PersonalInfo SupPersonInCharge;
    private ContactInfo SupCI;
    private String SupRemarks;
    private ArrayList<Product> SupProducts;

    public Supplier() {
        this.SupPersonInCharge = new PersonalInfo();
        this.SupCI = new ContactInfo();
        this.SupProducts = new ArrayList<Product>();
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
    Stationery, Food, Fashion, Other
    
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
    private static int ProStationeryCounter,ProFoodCounter,ProFashionCounter,ProOtherCounter;
    public Product() {
        
    }

    public Product(String ProName, int ProStock, double ProPrice, double ProPackingCharge, double ProWeight, String[] ProModel, ProductType ProCategory, Supplier ProSupplier) {
        this.ProName = ProName;
        this.ProStock = ProStock;
        this.ProPrice = ProPrice;
        this.ProPackingCharge = ProPackingCharge;
        this.ProWeight = ProWeight;
        this.ProModel = ProModel;
        this.ProCategory = ProCategory;
        this.ProSupplier = ProSupplier;
        switch(this.ProCategory){
            case Stationery:
                this.ProID='P'+String.format("%03d", this.ProCategory.ordinal()+1)+String.format("%04d", +1);
                break;
            case Food:
                
        }
//        this.ProPackingCharge = this.ProWeight/0.50*6.00 - ((this.ProWeight/0.50*6.00) % 6.00) + 6.00;
        if ((this.ProWeight/0.50*6.00) % 6.00 != 0) {
            this.ProPackingCharge = this.ProWeight/0.50*6.00 - ((this.ProWeight/0.50*6.00) % 6.00) + 6.00;//6 Ringgit per 0.5kg
        }
        else{
            this.ProPackingCharge=this.ProWeight/0.50*6.00;
        } 
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
    
//    public void generateProID(){
//        //https://stackoverflow.com/a/13792127
//        this.ProID='P'+String.format("%03d", getProCategory().ordinal()+1);
//    }
    
    
}

class FragilePro extends Product {

    public FragilePro() {
    }

    public FragilePro(String ProName, int ProStock, double ProPrice, double ProPackingCharge, double ProWeight, String[] ProModel, ProductType ProCategory, Supplier ProSupplier) {
        super(ProName, ProStock, ProPrice, ProPackingCharge, ProWeight, ProModel, ProCategory, ProSupplier);
        if ((getProWeight()/0.50*10.00) % 10.00 != 0) {
            setProPackingCharge(getProWeight()/0.50*10.00 - ((getProWeight()/0.50*10.00) % 10.00) + 10.00);//10 Ringgit per 0.5kg
        }
        else{
            setProPackingCharge(getProWeight()/0.50*10.00);//10 Ringgit per 0.5kg
        } 
        setProID("P1"+String.format("%02d", getProCategory().ordinal()+1));
    }

    
    public FragilePro(String ProID, String ProName, int ProStock, double ProPrice, double ProPackingCharge, double ProWeight, String[] ProModel, ProductType ProCategory, Supplier ProSupplier) {
        super(ProID, ProName, ProStock, ProPrice, ProPackingCharge, ProWeight, ProModel, ProCategory, ProSupplier);      
    }

//    public void generateProPackingCharge() {
//
//        double baseCharge = 10.00;
//        double realCharge = 0.00;
//
//        realCharge = getProWeight() / 0.50 * baseCharge;//10 Ringgit per 0.5kg
//
//        if (realCharge % baseCharge != 0) {
//            realCharge = realCharge - (realCharge % baseCharge) + baseCharge;
//        }
//
//        setProPackingCharge(realCharge);
//    }
}

class OrderItem extends Product {

    private String OIID; //ORD001-P0010001001
    private int OIQuantity;
    private String OIModel;
    private double OIPrice;
    private double OIPackingCharge;

    public OrderItem() {
    }

    public OrderItem(int OIQuantity, String OIModel, String OrdID) {
        this.OIQuantity = OIQuantity;
        this.OIModel = OIModel;
        this.OIID=OrdID+'-'+''+;
    }

    public OrderItem(int OIQuantity, String OIModel, String ProID, String ProName, int ProStock, double ProPrice, double ProPackingCharge, double ProWeight, String[] ProModel, ProductType ProCategory, Supplier ProSupplier) {
        super(ProID, ProName, ProStock, ProPrice, ProPackingCharge, ProWeight, ProModel, ProCategory, ProSupplier);
        this.OIQuantity = OIQuantity;
        this.OIModel = OIModel;
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

    public void generateOIPrice() {
        OIPrice = getProPrice() * OIQuantity;
    }

    public void generateOIPackingCharge() {
        OIPackingCharge = getProPackingCharge() * OIQuantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "OIID=" + OIID + ", OIQuantity=" + OIQuantity + ", OIModel=" + OIModel + ", OIPrice=" + OIPrice + ", OIPackingCharge=" + OIPackingCharge + '}';
    }

}

class Order {

    private String OrdID; //ORD000001
    private static int OrdIDCounter = 0;//TODO Modify with Total ID
    private LocalDateTime OrdCreateDT;
    private LocalDateTime OrdModifyDT;
    private ArrayList<OrderItem> OrdItems;

    public Order() {
        this.OrdItems = new ArrayList<OrderItem>();
    }

    public Order(LocalDateTime OrdCreateDT, LocalDateTime OrdModifyDT) {
        this.OrdID="ORD" + String.format("%06d", getOrdIDCounter());
        this.OrdCreateDT = OrdCreateDT;
        this.OrdModifyDT = OrdModifyDT;
        this.OrdItems = new ArrayList<OrderItem>();
        setOrdIDCounter(getOrdIDCounter() + 1);
    }

    public Order(String OrdID, LocalDateTime OrdCreateDT, LocalDateTime OrdModifyDT) {
        this.OrdID = OrdID;
        this.OrdCreateDT = OrdCreateDT;
        this.OrdModifyDT = OrdModifyDT;
        this.OrdItems = new ArrayList<OrderItem>();
    }

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

//     public void generateOrdID() {
//        String numOrdID = String.format("%06d", getOrdIDCounter());
//        //https://www.mysamplecode.com/2012/03/java-add-leading-zeros-number.html
//        setOrdID("ORD" + String.format("%06d", getOrdIDCounter()));
//        setOrdIDCounter(getOrdIDCounter() + 1);
//    }
     
    public String getOrdItemsIDs() {
        String OrdItemsIDs = "[";

        for (OrderItem item : OrdItems) {
            OrdItemsIDs = OrdItemsIDs + item.getOIID() + ',';
        }

        if (OrdItemsIDs.charAt(OrdItemsIDs.length() - 1) == ',') {
            OrdItemsIDs = OrdItemsIDs.substring(0, OrdItemsIDs.length() - 2);
        }
        OrdItemsIDs = OrdItemsIDs + ']';
        return OrdItemsIDs;
    }

   
}

class ShoppingCart extends Order {

    public ShoppingCart() {
    }

    public ShoppingCart(LocalDateTime OrdCreateDT, LocalDateTime OrdModifyDT) {
        super(OrdCreateDT, OrdModifyDT);
    }

    public ShoppingCart(String OrdID, LocalDateTime OrdCreateDT, LocalDateTime OrdModifyDT, ArrayList<OrderItem> OrdItems) {
        super(OrdID, OrdCreateDT, OrdModifyDT, OrdItems);
    }

    @Override
    public void generateOrdID() {
        String numSpcID = String.format("%06d", CusAcc.getCACounter());
        setOrdID("SPC" + numSpcID);
    }
}

public class RetailOrderManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test Login and Account Register
        ArrayList<CusAcc> CusAccounts = new ArrayList<CusAcc>();
        ArrayList<AdminAcc> AdminAccounts = new ArrayList<AdminAcc>();

        //Account Register
        CusAcc Cus1 = new CusAcc("MaxineYYDS", "Maxine123");
        AdminAcc Admin1 = new AdminAcc("MaxineWorking", "Maxine456");
        CusAcc Cus2 = new CusAcc("NewayYYDS", "Neway123");
        AdminAcc Admin2 = new AdminAcc("NewayYYDS", "Neway123");

        CusAccounts.add(Cus1);
        CusAccounts.add(Cus2);

        AdminAccounts.add(Admin1);
        AdminAccounts.add(Admin2);

        //Account Login
        for (CusAcc acc : CusAccounts) {
            if (acc.verifyLogin("NewayYYDS", "Neway123")) {
                System.out.println(acc);
            }
        }
        for (AdminAcc acc : AdminAccounts) {
            if (acc.verifyLogin("MaxineWorking", "Maxine456")) {
                System.out.println(acc);
            }
        }

    }

}
