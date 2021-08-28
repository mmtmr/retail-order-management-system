package retailordermanagementsystem;

import java.util.*;

/**
 *
 * @author Lai Mei Sim, Koh Ya Wen
 */
//https://stackoverflow.com/a/63564947
//abstract class Account {
//
//    protected String AccID;
//    private String AccName;
//    private String AccPassword;
//    private LocalDateTime AccRegisterDT;
//    private LocalDateTime AccLastLoginDT;
//
//    public Account() {
//    }
//
//    public Account(String AccID, String AccName, String AccPassword, LocalDateTime AccRegisterDT, LocalDateTime AccLastLoginDT) {
//        this.AccID = AccID;
//        this.AccName = AccName;
//        this.AccPassword = AccPassword;
//        this.AccRegisterDT = AccRegisterDT;
//        this.AccLastLoginDT = AccLastLoginDT;
//    }
//
//    public Account(String AccName, String AccPassword) {
//        this.AccName = AccName;
//        this.AccPassword = AccPassword;
//        this.AccRegisterDT = LocalDateTime.now();
//        this.AccLastLoginDT = LocalDateTime.now();
//    }
//
//    public String getAccID() {
//        return AccID;
//    }
//
//    public void setAccID(String AccID) {
//        this.AccID = AccID;
//    }
//
//    public String getAccName() {
//        return AccName;
//    }
//
//    public void setAccName(String AccName) {
//        this.AccName = AccName;
//    }
//
//    public String getAccPassword() {
//        return AccPassword;
//    }
//
//    public void setAccPassword(String AccPassword) {
//        this.AccPassword = AccPassword;
//    }
//
//    public LocalDateTime getAccRegisterDT() {
//        return AccRegisterDT;
//    }
//
//    public void setAccRegisterDT(LocalDateTime AccRegisterDT) {
//        this.AccRegisterDT = AccRegisterDT;
//    }
//
//    public LocalDateTime getAccLastLoginDT() {
//        return AccLastLoginDT;
//    }
//
//    public void setAccLastLoginDT(LocalDateTime AccLastLoginDT) {
//        this.AccLastLoginDT = AccLastLoginDT;
//    }
//
//    public boolean verifyLogin(String LoginName, String LoginPassword) {
//        return LoginName.equals(getAccName()) && LoginPassword.equals(getAccPassword());
//    }
//
//    @Override
//    public String toString() {
//        return AccID + "\t" + AccName + "\t" + AccPassword + "\t" + AccRegisterDT + "\t" + AccLastLoginDT;
//    }
//
//    //public static Account parseAccountFromString(String accLine);
//}
//class AdminAcc extends Account {
//
//    private static int AACounter; //TODO: READ FROM TXT FILE
//
//    public AdminAcc() {
//    }
//
//    public AdminAcc(String AccName, String AccPassword) {
//        super(AccName, AccPassword);
//        this.AccID = "AA" + String.format("%05d", AACounter + 1);
//        addAACounter();
//    }
//
//    public AdminAcc(String AccID, String AccName, String AccPassword, LocalDateTime AccRegisterDT, LocalDateTime AccLastLoginDT) {
//        super(AccID, AccName, AccPassword, AccRegisterDT, AccLastLoginDT);
//    }
//
//    public static int getAACounter() {
//        return AACounter;
//    }
//
//    public static void setAACounter(int AACounter) {
//        AdminAcc.AACounter = AACounter;
//    }
//
//    public static void addAACounter() {
//        AdminAcc.AACounter += 1;
//    }
//
//    public static void minusAACounter() {
//        AdminAcc.AACounter -= 1;
//    }
//
//    public static AdminAcc parseAccountFromString(String accLine) {
//        String[] aa = new String[5];
//        try {
//            System.out.println(accLine);
//            String[] aaData = accLine.split("\t");
//            if (aaData.length != 5) {
//                throw (new Exception("Admin Account is incomplete!" + accLine));
//            } else {
//                aa = aaData.clone();
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return new AdminAcc(aa[0], aa[1], aa[2], LocalDateTime.parse(aa[3]), LocalDateTime.parse(aa[4]));
//    }
//
//    //TODO CHECK DUPKEY
//}
//
//class CusAcc extends Account {
//
//    private static int CACounter; //TODO: READ FROM TXT FILE
//
//    public CusAcc() {
//    }
//
//    public CusAcc(String AccName, String AccPassword) {
//        super(AccName, AccPassword);
//        this.AccID = "CA" + String.format("%05d", CACounter + 1);
//        addCACounter();
//    }
//
//    public CusAcc(String AccID, String AccName, String AccPassword, LocalDateTime AccRegisterDT, LocalDateTime AccLastLoginDT) {
//        super(AccID, AccName, AccPassword, AccRegisterDT, AccLastLoginDT);
//    }
//
//    public static int getCACounter() {
//        return CACounter;
//    }
//
//    public static void setCACounter(int CACounter) {
//        CusAcc.CACounter = CACounter;
//    }
//
//    public static void addCACounter() {
//        CusAcc.CACounter += 1;
//    }
//
//    public static void minusCACounter() {
//        CusAcc.CACounter -= 1;
//    }
//
//    public static CusAcc parseAccountFromString(String accLine) {
//        String[] ca = new String[5];
//        try {
//            System.out.println(accLine);
//            String[] caData = accLine.split("\t");
//            if (caData.length != 5) {
//                throw (new Exception("Customer Account is incomplete!" + accLine));
//            } else {
//                ca = caData.clone();
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return new CusAcc(ca[0], ca[1], ca[2], LocalDateTime.parse(ca[3]), LocalDateTime.parse(ca[4]));
//    }
//
//    //TODO CHECK DUPKEY
//}
//class PersonalInfo {
//
//    private String PIFName;
//    private String PILName;
//    private char PIGender;
//
//    public PersonalInfo() {
//    }
//
//    public PersonalInfo(String PIFName, String PILName, char PIGender) {
//        this.PIFName = PIFName;
//        this.PILName = PILName;
//        this.PIGender = PIGender;
//    }
//
//    public String getPIFName() {
//        return PIFName;
//    }
//
//    public void setPIFName(String PIFName) {
//        this.PIFName = PIFName;
//    }
//
//    public String getPILName() {
//        return PILName;
//    }
//
//    public void setPILName(String PILName) {
//        this.PILName = PILName;
//    }
//
//    public char getPIGender() {
//        return PIGender;
//    }
//
//    public void setPIGender(char PIGender) {
//        this.PIGender = PIGender;
//    }
//
//    public boolean validatePIFName() {
//        return getPIFName().matches("[a-zA-Z]+([ '-][a-zA-Z]+)*");
//    }
//
//    public boolean validatePILName() {
//        return getPILName().matches("[a-zA-Z]+([ '-][a-zA-Z]+)*");
//    }
//
////    public boolean validatePIGender(){
////        return (getPIGender()=='F'||getPIGender()=='M');
////    }
//    @Override
//    public String toString() {
//        return PIFName + "\t" + PILName + "\t" + PIGender;
//    }
//
//    public static PersonalInfo parsePIFromString(String piLine) {
//        String[] pi = new String[3];
//        try {
//            System.out.println(piLine);
//            String[] piData = piLine.split("\t");
//            if (piData.length != 3) {
//                throw (new Exception("Personal Info is incomplete!" + piLine));
//            } else {
//                pi = piData.clone();
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return new PersonalInfo(pi[0], pi[1], pi[2].charAt(0));
//    }
//}
//
//class CusInfo extends PersonalInfo {
//
//    private int PIRewardPoint;
//    private LocalDate PIDateOfBirth;
//    private double PIWalletBalance;
//
//    //https://mkyong.com/java8/java-8-how-to-convert-string-to-localdate/
//    public CusInfo() {
//    }
//
////    public CusInfo(String PIFName, String PILName, char PIGender) {
////        super(PIFName, PILName, PIGender);
////    }
////    public CusInfo(int PIRewardPoint, LocalDate PIDateOfBirth) {
////        this.PIRewardPoint = PIRewardPoint;
////        this.PIDateOfBirth = PIDateOfBirth;
////    }
//    public CusInfo(String PIFName, String PILName, char PIGender, LocalDate PIDateOfBirth) {
//        super(PIFName, PILName, PIGender);
//        this.PIDateOfBirth = PIDateOfBirth;
//        this.PIRewardPoint = 0;
//        this.PIWalletBalance = 0.00;
//    }
//
//    public CusInfo(String PIFName, String PILName, char PIGender, int PIRewardPoint, LocalDate PIDateOfBirth, double PIWalletBalance) {
//        super(PIFName, PILName, PIGender);
//        this.PIRewardPoint = PIRewardPoint;
//        this.PIDateOfBirth = PIDateOfBirth;
//        this.PIWalletBalance = PIWalletBalance;
//    }
//
//    public int getPIRewardPoint() {
//        return PIRewardPoint;
//    }
//
//    public void setPIRewardPoint(int PIRewardPoint) {
//        this.PIRewardPoint = PIRewardPoint;
//    }
//
//    public LocalDate getPIDateOfBirth() {
//        return PIDateOfBirth;
//    }
//
//    public void setPIDateOfBirth(LocalDate PIDateOfBirth) {
//        this.PIDateOfBirth = PIDateOfBirth;
//    }
//
//    public double getPIWalletBalance() {
//        return PIWalletBalance;
//    }
//
//    public void setPIWalletBalance(double PIWalletBalance) {
//        this.PIWalletBalance = PIWalletBalance;
//    }
//
//    @Override
//    public String toString() {
//        return getPIFName() + "\t" + getPILName() + "\t" + getPIGender() + "\t" + PIRewardPoint + "\t" + PIDateOfBirth + "\t" + PIWalletBalance;
//    }
//
//    public static CusInfo parsePIFromString(String piLine) {
//        String[] pi = new String[6];
//        try {
//            System.out.println(piLine);
//            String[] piData = piLine.split("\t");
//            if (piData.length != 6) {
//                throw (new Exception("Personal Info is incomplete!" + piLine));
//            } else {
//                pi = piData.clone();
//            }
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return new CusInfo(pi[0], pi[1], pi[2].charAt(0), Integer.parseInt(pi[3]), LocalDate.parse(pi[4]), Double.parseDouble(pi[5]));
//    }
//}
//
//class ContactInfo {
//
//    private String CIPhone;
//    private String CIEmail;
//    private String CIAddStreet;
//    private String CIAddCity;
//    private String CIAddState;
//    private String CIAddPostcode;
//
//    public ContactInfo() {
//    }
//
//    public ContactInfo(String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode) {
//        this.CIPhone = CIPhone;
//        this.CIEmail = CIEmail;
//        this.CIAddStreet = CIAddStreet;
//        this.CIAddCity = CIAddCity;
//        this.CIAddState = CIAddState;
//        this.CIAddPostcode = CIAddPostcode;
//    }
//
//    public String getCIPhone() {
//        return CIPhone;
//    }
//
//    public void setCIPhone(String CIPhone) {
//        this.CIPhone = CIPhone;
//    }
//
//    public String getCIEmail() {
//        return CIEmail;
//    }
//
//    public void setCIEmail(String CIEmail) {
//        this.CIEmail = CIEmail;
//    }
//
//    public String getCIAddStreet() {
//        return CIAddStreet;
//    }
//
//    public void setCIAddStreet(String CIAddStreet) {
//        this.CIAddStreet = CIAddStreet;
//    }
//
//    public String getCIAddCity() {
//        return CIAddCity;
//    }
//
//    public void setCIAddCity(String CIAddCity) {
//        this.CIAddCity = CIAddCity;
//    }
//
//    public String getCIAddState() {
//        return CIAddState;
//    }
//
//    public void setCIAddState(String CIAddState) {
//        this.CIAddState = CIAddState;
//    }
//
//    public String getCIAddPostcode() {
//        return CIAddPostcode;
//    }
//
//    public void setCIAddPostcode(String CIAddPostcode) {
//        this.CIAddPostcode = CIAddPostcode;
//    }
//
//    public boolean validateCIPhone() {
//        return CIPhone.matches("(\\+?6?01)[0-46-9]-*[0-9]{7,8}");//Format: +6012-34567890
//    }
//
//    public boolean validateCIEmail() {
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
//    public boolean validateCIAddState() {
//        return getCIAddState().matches("Kuala Lumpur|Putrajaya|Labuan|Perlis|Kedah|Terengganu|Pahang|Perak|Kelantan|Penang|Selangor|Negeri Sembilan|Johor|Malacca|Sabah|Sarawak");
//    }
//
//    public boolean validateCIAddPostcode() {
//        return getCIAddPostcode().matches("\\d{5}");
//    }
//
//    public boolean validateCIAddress() {
//        return validateCIAddState() && validateCIAddPostcode();
//    }
//
//    @Override
//    public String toString() {
//        return CIPhone + "\t" + CIEmail + "\t" + CIAddStreet + "\t" + CIAddCity + "\t" + CIAddState + "\t" + CIAddPostcode;
//    }
//
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
//}
////TODO CLASS Person INHERITANCE OR CONTACT DETAILS COMPOSITION
//
//class Customer {
//
//    private CusInfo CusPI;
//    private ContactInfo CusCI;
//    private CusAcc CusAccount; //UniqueID is here
//    private ShoppingCart CusSC;
//    private ArrayList<Order> CusOrders;
//    //TODO PAYMENT CREDIT CARD PAYMENT, OPTIONAL CUSTOMER BALANCE
//
//    public Customer(ShoppingCart CusSC, ArrayList<Order> CusOrders) {
//        this.CusPI = new CusInfo();
//        this.CusCI = new ContactInfo();
//        this.CusAccount = new CusAcc();
//        this.CusSC = CusSC;
//        this.CusOrders = CusOrders;
//    }
//
//    public CusInfo getCusPI() {
//        return CusPI;
//    }
//
//    public void setCusPI(CusInfo CusPI) {
//        this.CusPI = CusPI;
//    }
//
//    public ContactInfo getCusCI() {
//        return CusCI;
//    }
//
//    public void setCusCI(ContactInfo CusCI) {
//        this.CusCI = CusCI;
//    }
//
//    public CusAcc getCusAccount() {
//        return CusAccount;
//    }
//
//    public void setCusAccount(CusAcc CusAccount) {
//        this.CusAccount = CusAccount;
//    }
//
//    public ShoppingCart getCusSC() {
//        return CusSC;
//    }
//
//    public void setCusSC(ShoppingCart CusSC) {
//        this.CusSC = CusSC;
//    }
//
//    public ArrayList<Order> getCusOrders() {
//        return CusOrders;
//    }
//
//    public void setCusOrders(ArrayList<Order> CusOrders) {
//        this.CusOrders = CusOrders;
//    }
//
//    public String getCusOrdersIDs() {
//        //String CusOrdersIDs = "[";
//        String CusOrdersIDs = "";
//        for (Order ord : CusOrders) {
//            CusOrdersIDs = CusOrdersIDs + ord.getOrdID() + ',';
//        }
//
//        if (CusOrdersIDs.charAt(CusOrdersIDs.length() - 1) == ',') {
//            CusOrdersIDs = CusOrdersIDs.substring(0, CusOrdersIDs.length() - 2);
//        }
//        //CusOrdersIDs = CusOrdersIDs + ']';
//        return CusOrdersIDs;
//    }
//
//    @Override
//    public String toString() {
//        return CusAccount.getAccID() + ";" + CusCI + ";" + CusPI + ";" + CusSC.getOrdID() + ";" + getCusOrdersIDs();
//    }
//
//    public static Customer parseCusFromString(String cusLine, ArrayList<CusAcc> CusAccList, ArrayList<Order> OrdList) {
//        CusAcc cusAccount = new CusAcc();
//        PersonalInfo cusPI = new PersonalInfo();
//        ContactInfo cusCI = new ContactInfo();
//        ShoppingCart cusSC = new ShoppingCart();
//        ArrayList<Order> cusOrders = new ArrayList<>();
//        try {
//            System.out.println(cusLine);
//            String[] cusData = cusLine.split(";");
//            if (cusData.length != 5) {
//                throw (new Exception("Customer Info is incomplete!" + cusLine));
//            } else {
//                for (CusAcc acc : CusAccList) {
//                    if (acc.getAccID().equals(cusData[0])) {
//                        cusAccount = acc;
//                    } else {
//                        throw (new Exception("Customer Account not found!" + cusLine));
//                    }
//                }
//                cusPI = PersonalInfo.parsePIFromString(cusData[1]);
//                cusCI = ContactInfo.parseCIFromString(cusData[2]);
//                cusSC = ShoppingCart.parseSCFromString(cusData[3]);
//                String[] cusOrdersIDsData = supLine.split(",");
//                for (String id : supProductsIDsData) {
//                    for (Product pro : ProList) {
//                        if (pro.getProID().equals(id)) {
//                            supProductsList.add(pro);
//                        }
//                    }
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return new Supplier(sup[0], sup[1], supPersonInCharge, supCI, sup[2], supProductsList);
//    }
//}
//class Supplier {
//
//    private String SupID;
//    private String SupName;
//    private PersonalInfo SupPersonInCharge;
//    private ContactInfo SupCI;
//    private String SupRemarks;
////    private ArrayList<Product> SupProducts;
//    private static int SupCounter;
//
//    public Supplier() {
//        this.SupPersonInCharge = new PersonalInfo();
//        this.SupCI = new ContactInfo();
//        addSupCounter();
//    }
//
//    public Supplier(String SupID, String SupName, PersonalInfo SupPersonInCharge, ContactInfo SupCI, String SupRemarks) {
//        this.SupID = SupID;
//        this.SupName = SupName;
//        this.SupPersonInCharge = SupPersonInCharge;
//        this.SupCI = SupCI;
//        this.SupRemarks = SupRemarks;
//    }
//
//    public String getSupID() {
//        return SupID;
//    }
//
//    public void setSupID(String SupID) {
//        this.SupID = SupID;
//    }
//
//    public String getSupName() {
//        return SupName;
//    }
//
//    public void setSupName(String SupName) {
//        this.SupName = SupName;
//    }
//
//    public PersonalInfo getSupPersonInCharge() {
//        return SupPersonInCharge;
//    }
//
//    public void setSupPersonInCharge(PersonalInfo SupPersonInCharge) {
//        this.SupPersonInCharge = SupPersonInCharge;
//    }
//
//    public ContactInfo getSupCI() {
//        return SupCI;
//    }
//
//    public void setSupCI(ContactInfo SupCI) {
//        this.SupCI = SupCI;
//    }
//
//    public String getSupRemarks() {
//        return SupRemarks;
//    }
//
//    public void setSupRemarks(String SupRemarks) {
//        this.SupRemarks = SupRemarks;
//    }
//
//    public static int getSupCounter() {
//        return SupCounter;
//    }
//
//    public static void setSupCounter(int SupCounter) {
//        Supplier.SupCounter = SupCounter;
//    }
//
//    public static void addSupCounter() {
//        Supplier.SupCounter += 1;
//    }
//
//    public static void minusSupCounter() {
//        Supplier.SupCounter -= 1;
//    }
//
////    public String getSupProductsIDs() {
////        //String SupProductsIDs = "[";
////        String SupProductsIDs = "";
////        for (Product pro : SupProducts) {
////            SupProductsIDs = SupProductsIDs + pro.getProID() + ',';
////        }
////
////        if (SupProductsIDs.charAt(SupProductsIDs.length() - 1) == ',') {
////            SupProductsIDs = SupProductsIDs.substring(0, SupProductsIDs.length() - 2);
////        }
////        //SupProductsIDs = SupProductsIDs + ']';
////        return SupProductsIDs;
////    }
//    @Override
//    public String toString() {
//        return SupID + "\t" + SupName + "\t" + SupPersonInCharge + "\t" + SupCI + "\t" + SupRemarks;
//    }
//
//    public static Supplier parseSupFromString(String supLine) {
//        String[] sup = new String[3];
//        PersonalInfo supPersonInCharge = new PersonalInfo();
//        ContactInfo supCI = new ContactInfo();
//        //ArrayList<Product> supProducts = new ArrayList<>();
//        try {
//            System.out.println(supLine);
//            String[] supData = supLine.split("\t");
//            if (supData.length != 5) {
//                throw (new Exception("Supplier Info is incomplete!" + supLine));
//            } else {
//                sup[0] = supData[0];
//                sup[1] = supData[1];
//                supPersonInCharge = PersonalInfo.parsePIFromString(supData[2]);
//                supCI = ContactInfo.parseCIFromString(supData[3]);
//                sup[2] = supData[4];
////                String[] supProductsIDsData = supData[5].split(",");
////                for (String id : supProductsIDsData) {
////                    for (Product pro : ProList) {
////                        if (pro.getProID().equals(id)) {
////                            supProducts.add(pro);
////                        }
////                    }
////                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return new Supplier(sup[0], sup[1], supPersonInCharge, supCI, sup[2]);
//    }
//}
//class Product {
//
//    enum ProductType {
//        Stationery, Food, Fashion, Other
//    }
//    //https://stackoverflow.com/a/8353371
//    protected String ProID; //Metadata Idea: P0010001001
//    private String ProName;
//    private int ProStock;//Item Remaining
//    private double ProPrice;
//    protected double ProPackingCharge;
//    private double ProWeight;
//    private ArrayList<String> ProModels;
//    private ProductType ProCategory;
//    private Supplier ProSupplier;
//    private static int ProStationeryCounter, ProFoodCounter, ProFashionCounter, ProOtherCounter;
//
//    public Product() {
//
//    }
//
//    //https://www.geeksforgeeks.org/passing-and-returning-objects-in-java/
//    public Product(Product Pro) {
//        this.ProID = Pro.ProID;
//        this.ProName = Pro.ProName;
//        this.ProStock = Pro.ProStock;
//        this.ProPrice = Pro.ProPrice;
//        this.ProPackingCharge = Pro.ProPackingCharge;
//        this.ProWeight = Pro.ProWeight;
//        this.ProModels = Pro.ProModels;
//        this.ProCategory = Pro.ProCategory;
//        this.ProSupplier = Pro.ProSupplier;
//        //addProCategoryCounter(this.ProCategory);
//    }
//
//    public Product(String ProName, int ProStock, double ProPrice, double ProWeight, ArrayList<String> ProModels, ProductType ProCategory, Supplier ProSupplier) {
//        this.ProName = ProName;
//        this.ProStock = ProStock;
//        this.ProPrice = ProPrice;
//        this.ProWeight = ProWeight;
//        this.ProModels = ProModels;
//        this.ProCategory = ProCategory;
//        this.ProSupplier = ProSupplier;
//        addProCategoryCounter(this.ProCategory);
//        switch (this.ProCategory) {
//            case Stationery:
//                this.ProID = "P0" + String.format("%02d", this.ProCategory.ordinal() + 1) + String.format("%04d", ProStationeryCounter + 1);
//                //ProStationeryCounter+=1;
//                break;
//            case Food:
//                this.ProID = "P0" + String.format("%02d", this.ProCategory.ordinal() + 1) + String.format("%04d", ProFoodCounter + 1);
//                //ProFoodCounter+=1;
//                break;
//            case Fashion:
//                this.ProID = "P0" + String.format("%02d", this.ProCategory.ordinal() + 1) + String.format("%04d", ProFashionCounter + 1);
//                //ProFashionCounter+=1;
//                break;
//            case Other:
//                this.ProID = "P0" + String.format("%02d", this.ProCategory.ordinal() + 1) + String.format("%04d", ProOtherCounter + 1);
//                //ProOtherCounter+=1;
//                break;
//
//        }
////        this.ProPackingCharge = this.ProWeight/0.50*6.00 - ((this.ProWeight/0.50*6.00) % 6.00) + 6.00;
//        if ((this.ProWeight / 0.50 * 6.00) % 6.00 != 0) {
//            this.ProPackingCharge = this.ProWeight / 0.50 * 6.00 - ((this.ProWeight / 0.50 * 6.00) % 6.00) + 6.00;//6 Ringgit per 0.5kg
//        } else {
//            this.ProPackingCharge = this.ProWeight / 0.50 * 6.00;
//        }
//    }
//
//    public Product(String ProID, String ProName, int ProStock, double ProPrice, double ProPackingCharge, double ProWeight, ArrayList<String> ProModels, ProductType ProCategory, Supplier ProSupplier) {
//        this.ProID = ProID;
//        this.ProName = ProName;
//        this.ProStock = ProStock;
//        this.ProPrice = ProPrice;
//        this.ProPackingCharge = ProPackingCharge;
//        this.ProWeight = ProWeight;
//        this.ProModels = ProModels;
//        this.ProCategory = ProCategory;
//        this.ProSupplier = ProSupplier;
//        //addProCategoryCounter(this.ProCategory);
//    }
//
//    public String getProID() {
//        return ProID;
//    }
//
//    public void setProID(String ProID) {
//        this.ProID = ProID;
//    }
//
//    public String getProName() {
//        return ProName;
//    }
//
//    public void setProName(String ProName) {
//        this.ProName = ProName;
//    }
//
//    public int getProStock() {
//        return ProStock;
//    }
//
//    public void setProStock(int ProStock) {
//        this.ProStock = ProStock;
//    }
//
//    public double getProPrice() {
//        return ProPrice;
//    }
//
//    public void setProPrice(double ProPrice) {
//        this.ProPrice = ProPrice;
//    }
//
//    public double getProPackingCharge() {
//        return ProPackingCharge;
//    }
//
//    public void setProPackingCharge(double ProPackingCharge) {
//        this.ProPackingCharge = ProPackingCharge;
//    }
//
//    public double getProWeight() {
//        return ProWeight;
//    }
//
//    public void setProWeight(double ProWeight) {
//        this.ProWeight = ProWeight;
//    }
//
//    public ArrayList<String> getProModels() {
//        return ProModels;
//    }
//
//    public void setProModels(ArrayList<String> ProModels) {
//        this.ProModels = ProModels;
//    }
//
//    public ProductType getProCategory() {
//        return ProCategory;
//    }
//
//    public void setProCategory(ProductType ProCategory) {
//        this.ProCategory = ProCategory;
//    }
//
//    public Supplier getProSupplier() {
//        return ProSupplier;
//    }
//
//    public void setProSupplier(Supplier ProSupplier) {
//        this.ProSupplier = ProSupplier;
//    }
//
//    public static void addProCategoryCounter(ProductType ProCategory) {
//        switch (ProCategory) {
//            case Stationery:
//                ProStationeryCounter += 1;
//                break;
//            case Food:
//                ProFoodCounter += 1;
//                break;
//            case Fashion:
//                ProFashionCounter += 1;
//                break;
//            case Other:
//                ProOtherCounter += 1;
//                break;
//        }
//    }
//
//    //Only Call when Cancel, Not Delete
//    public static void minusProCategoryCounter(ProductType ProCategory) {
//        switch (ProCategory) {
//            case Stationery:
//                ProStationeryCounter -= 1;
//                break;
//            case Food:
//                ProFoodCounter -= 1;
//                break;
//            case Fashion:
//                ProFashionCounter -= 1;
//                break;
//            case Other:
//                ProOtherCounter -= 1;
//                break;
//        }
//    }
//
////    public void generateProID(){
////        //https://stackoverflow.com/a/13792127
////        this.ProID='P'+String.format("%03d", getProCategory().ordinal()+1);
////    }
//    public static int getProStationeryCounter() {
//        return ProStationeryCounter;
//    }
//
//    public static void setProStationeryCounter(int ProStationeryCounter) {
//        Product.ProStationeryCounter = ProStationeryCounter;
//    }
//
//    public static int getProFoodCounter() {
//        return ProFoodCounter;
//    }
//
//    public static void setProFoodCounter(int ProFoodCounter) {
//        Product.ProFoodCounter = ProFoodCounter;
//    }
//
//    public static int getProFashionCounter() {
//        return ProFashionCounter;
//    }
//
//    public static void setProFashionCounter(int ProFashionCounter) {
//        Product.ProFashionCounter = ProFashionCounter;
//    }
//
//    public static int getProOtherCounter() {
//        return ProOtherCounter;
//    }
//
//    public static void setProOtherCounter(int ProOtherCounter) {
//        Product.ProOtherCounter = ProOtherCounter;
//    }
//
//    public String getProModelsList() {
//        //String ProModelsList = "[";
//        String ProModelsList;
//        //https://stackoverflow.com/questions/599161/best-way-to-convert-an-arraylist-to-a-string
//        StringBuilder ProModelsListBuilder = new StringBuilder();
//        for (String model : ProModels) {
//            ProModelsListBuilder.append(model);
//            ProModelsListBuilder.append(",");
//        }
//        ProModelsList = ProModelsListBuilder.toString();
//        if (ProModelsList.charAt(ProModelsList.length() - 1) == ',') {
//            ProModelsList = ProModelsList.substring(0, ProModelsList.length() - 2);
//        }
//
//        //SupProductsIDs = SupProductsIDs + ']';
//        return ProModelsList;
//    }
//
//    public void minusProStock(int OIQuantity) {
//        try {
//            if (this.ProStock - OIQuantity < 0) {
//                int exceedCount = OIQuantity - this.ProStock;
//                throw (new Exception("Order Item quantity exceed by" + exceedCount));
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        ;
//    }
//
//    @Override
//    public String toString() {
//        return ProID + "\t" + ProName + "\t" + ProStock + "\t" + ProPrice + "\t" + ProPackingCharge + "\t=" + ProWeight + "\t" + getProModelsList() + "\t" + ProCategory + ProSupplier.getSupID();
//    }
//
//    public static Product parseProFromString(String proLine, ArrayList<Supplier> SupplierList) {
//        String[] pro = new String[6];
//        ArrayList<String> proModels = new ArrayList<>();
//        Supplier proSup = new Supplier();
//        try {
//            System.out.println(proLine);
//            String[] proData = proLine.split("\t");
//            if (proData.length != 9) {
//                throw (new Exception("Product Info is incomplete!" + proLine));
//            } else {
//                pro[0] = proData[0];
//                pro[1] = proData[1];
//                pro[2] = proData[2];
//                pro[3] = proData[3];
//                pro[4] = proData[4];
//                pro[5] = proData[5];
//                String[] proModelsData = proData[6].split(",");
//                for (String model : proModelsData) {
//                    proModels.add(model);
//                }
//                pro[6] = proData[7];
//                for (Supplier sup : SupplierList) {
//                    if (proData[8].equals(sup.getSupID())) {
//                        proSup = sup;
//
//                    }
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return new Product(pro[0], pro[1], Integer.parseInt(pro[2]), Double.parseDouble(pro[3]), Double.parseDouble(pro[4]), Double.parseDouble(pro[5]), proModels, ProductType.valueOf(pro[6]), proSup);
//    }
//
//}
//class FragilePro extends Product {
//
//    public FragilePro() {
//    }
//
//    public FragilePro(Product Pro) {
//        super(Pro);
//
//    }
//
//    public FragilePro(String ProName, int ProStock, double ProPrice, double ProWeight, ArrayList<String> ProModels, ProductType ProCategory, Supplier ProSupplier) {
//        super(ProName, ProStock, ProPrice, ProWeight, ProModels, ProCategory, ProSupplier);
//        switch (ProCategory) {
//            case Stationery:
//                this.ProID = "P1" + String.format("%02d", ProCategory.ordinal() + 1) + String.format("%04d", getProStationeryCounter() + 1);
//                //setProStationeryCounter(getProStationeryCounter()+1);
//                break;
//            case Food:
//                this.ProID = "P1" + String.format("%02d", ProCategory.ordinal() + 1) + String.format("%04d", getProFoodCounter() + 1);
//                //setProFoodCounter(getProFoodCounter()+1);
//                break;
//            case Fashion:
//                this.ProID = "P1" + String.format("%02d", ProCategory.ordinal() + 1) + String.format("%04d", getProFashionCounter() + 1);
//                //setProFashionCounter(getProFashionCounter()+1);
//                break;
//            case Other:
//                this.ProID = "P1" + String.format("%02d", ProCategory.ordinal() + 1) + String.format("%04d", getProFashionCounter() + 1);
//                //setProOtherCounter(getProFashionCounter()+1);
//                break;
//
//        }
//        if ((ProWeight / 0.50 * 10.00) % 10.00 != 0) {
//            ProPackingCharge = ProWeight / 0.50 * 10.00 - ((ProWeight / 0.50 * 10.00) % 10.00) + 10.00;//10 Ringgit per 0.5kg
//        } else {
//            ProPackingCharge = ProWeight / 0.50 * 10.00;//10 Ringgit per 0.5kg
//        }
//    }
//
//    public FragilePro(String ProID, String ProName, int ProStock, double ProPrice, double ProPackingCharge, double ProWeight, ArrayList<String> ProModels, ProductType ProCategory, Supplier ProSupplier) {
//        super(ProID, ProName, ProStock, ProPrice, ProPackingCharge, ProWeight, ProModels, ProCategory, ProSupplier);
//    }
//
////    public void generateProPackingCharge() {
////
////        double baseCharge = 10.00;
////        double realCharge = 0.00;
////
////        realCharge = getProWeight() / 0.50 * baseCharge;//10 Ringgit per 0.5kg
////
////        if (realCharge % baseCharge != 0) {
////            realCharge = realCharge - (realCharge % baseCharge) + baseCharge;
////        }
////
////        setProPackingCharge(realCharge);
////    }
//}
//class OrderItem extends Product {
//
//    private String OIID; //ORD001-P001000101
//    private int OIQuantity;
//    private String OIModel;
//    private double OIPrice;
//    private double OIPackingCharge;
//
//    public OrderItem() {
//    }
//
//    public OrderItem(Product Pro, String OIID, int OIQuantity, String OIModel, double OIPrice, double OIPackingCharge) {
//        super(Pro);
//        this.OIID = OIID;
//        this.OIQuantity = OIQuantity;
//        this.OIModel = OIModel;
//        this.OIPrice = OIPrice;
//        this.OIPackingCharge = OIPackingCharge;
//    }
//
//    public OrderItem(Order OIOrd, Product OIPro, int OIQuantity, String OIModel) {
//        this.OIQuantity = OIQuantity;
//        OIPro.minusProStock(this.OIQuantity);
//        this.OIModel = OIModel;
//        this.OIID = OIOrd.getOrdID() + '-' + OIPro.getProID() + String.format("%02d", OIPro.getProModels().indexOf(OIModel) + 1);
//        this.OIPrice = OIPro.getProPrice() * OIQuantity;
//        this.OIPackingCharge = OIPro.getProPackingCharge() * OIQuantity;
//    }
//
////    public OrderItem(String ProID, String ProName, int ProStock, double ProPrice, double ProPackingCharge, double ProWeight, ArrayList<String> ProModels, ProductType ProCategory, Supplier ProSupplier, int OIQuantity, String OIModel) {
////        super(ProID, ProName, ProStock, ProPrice, ProPackingCharge, ProWeight, ProModels, ProCategory, ProSupplier);
////        this.OIQuantity = OIQuantity;
////        this.OIModel = OIModel;
////    }
//
//    public OrderItem( String ProID, String ProName, int ProStock, double ProPrice, double ProPackingCharge, double ProWeight, ArrayList<String> ProModels, ProductType ProCategory, Supplier ProSupplier, String OIID, int OIQuantity, String OIModel) {
//        super(ProID, ProName, ProStock, ProPrice, ProPackingCharge, ProWeight, ProModels, ProCategory, ProSupplier);
//        this.OIID = OIID;
//        this.OIQuantity = OIQuantity;
//        this.OIModel = OIModel;
//        this.OIPrice = ProPrice * OIQuantity;
//        this.OIPackingCharge = ProPackingCharge * OIQuantity;
//    }
//
//
//    
//
//    public String getOIID() {
//        return OIID;
//    }
//
//    public void setOIID(String OIID) {
//        this.OIID = OIID;
//    }
//
//    public int getOIQuantity() {
//        return OIQuantity;
//    }
//
//    public void setOIQuantity(int OIQuantity) {
//        this.OIQuantity = OIQuantity;
//    }
//
//    public String getOIModel() {
//        return OIModel;
//    }
//
//    public void setOIModel(String OIModel) {
//        this.OIModel = OIModel;
//    }
//
//    public double getOIPrice() {
//        return OIPrice;
//    }
//
//    public void setOIPrice(double OIPrice) {
//        this.OIPrice = OIPrice;
//    }
//
//    public double getOIPackingCharge() {
//        return OIPackingCharge;
//    }
//
//    public void setOIPackingCharge(double OIPackingCharge) {
//        this.OIPackingCharge = OIPackingCharge;
//    }
//
//    public void generateOIPrice() {
//        OIPrice = getProPrice() * OIQuantity;
//    }
//
//    public void generateOIPackingCharge() {
//        OIPackingCharge = getProPackingCharge() * OIQuantity;
//    }
//
//    @Override
//    public String toString() {
//        return OIID + "\t" + OIQuantity + "\t" + OIModel + "\t" + OIPrice + "\t" + OIPackingCharge;
//    }
//
//    public static OrderItem parseOrderItemFromString() {
//
//        String[] pro = new String[6];
//        ArrayList<String> proModels = new ArrayList<>();
//        Supplier proSup = new Supplier();
//        try {
//            System.out.println(proLine);
//            String[] proData = proLine.split("\t");
//            if (proData.length != 9) {
//                throw (new Exception("Product Info is incomplete!" + proLine));
//            } else {
//                pro[0] = proData[0];
//                pro[1] = proData[1];
//                pro[2] = proData[2];
//                pro[3] = proData[3];
//                pro[4] = proData[4];
//                pro[5] = proData[5];
//                String[] proModelsData = proData[6].split(",");
//                for (String model : proModelsData) {
//                    proModels.add(model);
//                }
//                pro[6] = proData[7];
//                for (Supplier sup : SupplierList) {
//                    if (proData[8].equals(sup.getSupID())) {
//                        proSup = sup;
//
//                    }
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return new Product(pro[0], pro[1], Integer.parseInt(pro[2]), Double.parseDouble(pro[3]), Double.parseDouble(pro[4]), Double.parseDouble(pro[5]), proModels, ProductType.valueOf(pro[6]), proSup);
//    }
//
//}
//abstract class OrderDetails {
//
//    protected String OrdID; //ORD000001
//    protected LocalDateTime OrdModifyDT;
//    protected ArrayList<OrderItem> OrdItems;
//
//    public OrderDetails() {
//        this.OrdItems = new ArrayList<>();
//        this.OrdModifyDT = LocalDateTime.now();
//    }
//
//    public OrderDetails(String OrdID, LocalDateTime OrdModifyDT, ArrayList<OrderItem> OrdItems) {
//        this.OrdID = OrdID;
//        this.OrdModifyDT = OrdModifyDT;
//        this.OrdItems = OrdItems;
//    }
//
//    public String getOrdID() {
//        return OrdID;
//    }
//
//    public void setOrdID(String OrdID) {
//        this.OrdID = OrdID;
//    }
//
//    public LocalDateTime getOrdModifyDT() {
//        return OrdModifyDT;
//    }
//
//    public void setOrdModifyDT(LocalDateTime OrdModifyDT) {
//        this.OrdModifyDT = OrdModifyDT;
//    }
//
//    public ArrayList<OrderItem> getOrdItems() {
//        return OrdItems;
//    }
//
//    public void setOrdItems(ArrayList<OrderItem> OrdItems) {
//        this.OrdItems = OrdItems;
//    }
//
//    public String getOrdItemsIDs() {
//        //String OrdItemsIDs = "[";
//        String OrdItemsIDs = "";
//        for (OrderItem item : OrdItems) {
//            OrdItemsIDs = OrdItemsIDs + item.getOIID() + ',';
//        }
//
//        if (OrdItemsIDs.charAt(OrdItemsIDs.length() - 1) == ',') {
//            OrdItemsIDs = OrdItemsIDs.substring(0, OrdItemsIDs.length() - 2);
//        }
//        //OrdItemsIDs = OrdItemsIDs + ']';
//        return OrdItemsIDs;
//    }
//
//    @Override
//    public abstract String toString();
//}

//class ShoppingCart extends OrderDetails {
//
//    public ShoppingCart(String AccID) {
//        this.OrdID = "SC" + AccID;
//    }
//
//    @Override
//    public String toString() {
//        return OrdID + "\t" + OrdModifyDT + "\t" + getOrdItemsIDs();
//    }
//}

//class Order extends OrderDetails {
//
//    enum OrderStatus {
//        Waiting, Shipped, Completed, Cancelled
//    }
//    private static int OrdCounter;//TODO Modify with Total ID
//    private LocalDateTime OrdCreateDT;
//    private OrderStatus OrdStatus;
//    private String OrdShipment;
//
//    public Order() {
//        this.OrdID = "ORD" + String.format("%06d", OrdCounter + 1);
//        this.OrdCreateDT = LocalDateTime.now();
//        this.OrdStatus = OrderStatus.Waiting;
//        addOrdCounter();
//    }
//
//    public Order(String OrdID, OrderStatus OrdStatus, LocalDateTime OrdCreateDT, LocalDateTime OrdModifyDT, ArrayList<OrderItem> OrdItems, String OrdShipment) {
//        super(OrdID, OrdModifyDT, OrdItems);
//        this.OrdStatus = OrdStatus;
//        this.OrdCreateDT = OrdCreateDT;
//        this.OrdShipment = OrdShipment;
//    }
//
//    public static int getOrdCounter() {
//        return OrdCounter;
//    }
//
//    public static void setOrdCounter(int OrdCounter) {
//        Order.OrdCounter = OrdCounter;
//    }
//
//    public LocalDateTime getOrdCreateDT() {
//        return OrdCreateDT;
//    }
//
//    public void setOrdCreateDT(LocalDateTime OrdCreateDT) {
//        this.OrdCreateDT = OrdCreateDT;
//    }
//
//    public OrderStatus getOrdStatus() {
//        return OrdStatus;
//    }
//
//    public void setOrdStatus(OrderStatus OrdStatus) {
//        this.OrdStatus = OrdStatus;
//    }
//
////     public void generateOrdID() {
////        String numOrdID = String.format("%06d", getOrdIDCounter());
////        //https://www.mysamplecode.com/2012/03/java-add-leading-zeros-number.html
////        setOrdID("ORD" + String.format("%06d", getOrdIDCounter()));
////        setOrdIDCounter(getOrdIDCounter() + 1);
////    }
//    public static void addOrdCounter() {
//        Order.OrdCounter += 1;
//    }
//
//    public static void minusOrdCounter() {
//        Order.OrdCounter -= 1;
//    }
//
//    @Override
//    public String toString() {
//        return OrdID + "\t" + OrdStatus + "\t" + OrdCreateDT + "\t" + OrdModifyDT + "\t" + OrdShipment + "\t" + getOrdItemsIDs();
//    }
//}

public class RetailOrderManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test Login and Account Register
        ArrayList<CusAcc> CusAccounts = new ArrayList<>();
        ArrayList<AdminAcc> AdminAccounts = new ArrayList<>();

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
