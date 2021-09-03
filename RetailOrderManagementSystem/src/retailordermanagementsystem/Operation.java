/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maxine
 */
public class Operation {

    public static Account opUser;
    public static Customer opCus;
    public static ArrayList<Account> AccList = new ArrayList();
    public static ArrayList<Product> ProList = new ArrayList();
    public static ArrayList<Supplier> SupList = new ArrayList();
    public static ArrayList<Order> OrdList = new ArrayList();
    public static ArrayList<Customer> CusList = new ArrayList();

    //Create or Read file
    //https://stackoverflow.com/a/24029850
    public static void readAccountData() throws IOException {
        File accountFile = new File("account.txt");
        if (!accountFile.isFile()) {
            if (accountFile.createNewFile()) {
                PrintWriter accWrite = new PrintWriter(new BufferedWriter(new FileWriter(accountFile, true)));
                accWrite.println(new AdminAcc("admin", "123456"));
                accWrite.close();
            } else {
                throw new IOException("Error creating new file: " + accountFile.getAbsolutePath());
            }
        }
        BufferedReader accRead = new BufferedReader(new FileReader(accountFile));
        try {
            //Read
            //https://stackoverflow.com/a/39552075
            String accLine;
            while ((accLine = accRead.readLine()) != null) {
                Account.buildAccFromString(accLine);
                //System.out.println(accLine);
//                String[] accData = accLine.split("\t");
//
//                if (accData[0].substring(0, 2).equals("CA")) {
//                    buildAccFromString(accLine);
//                    //System.out.println(acc);
//                    //CusAcc.setCACounter(CusAcc.getCACounter()+1);
//                } else if (accData[0].substring(0, 2).equals("AA")) {
//                    AdminAcc acc = AdminAcc.parseAccountFromString(accLine);
//                    AccList.add(acc);
//                    //AdminAcc.setAACounter(AdminAcc.getAACounter()+1);
//                }
            }
        } finally {
            accRead.close();
            String AccID;
            for (int i = AccList.size() - 1; i >= 0; i--) {
                if (CusAcc.getCACounter() != 0 && AdminAcc.getAACounter() != 0) {
                    break;
                }
                AccID = AccList.get(i).getAccID();
                if (AccID.contains("CA")) {
                    CusAcc.setCACounter(Integer.parseInt(AccID.substring(2, AccID.length())));
                } else if (AccID.contains("AA")) {
                    AdminAcc.setAACounter(Integer.parseInt(AccID.substring(2, AccID.length())));
                }
            }
        }
    }

    public static void readProductData() throws IOException {
        File proFile = new File("product.txt");
        if (!proFile.isFile() && !proFile.createNewFile()) {
            throw new IOException("Error creating new file: " + proFile.getAbsolutePath());
        }
        BufferedReader proRead = new BufferedReader(new FileReader(proFile));
        try {
            //Read
            //https://stackoverflow.com/a/39552075
            String proLine;

            while ((proLine = proRead.readLine()) != null) {
                System.out.println(proLine);
                //String[] proData = proLine.split("\t");

//                if (proData.length!=4) {
//                    throw new IOException("Product file is damaged!");
//                }
                //https://www.studytonight.com/java-examples/how-to-convert-string-to-arraylist-in-java
                Product.buildProFromString(proLine);
            }
        } finally {
            proRead.close();
            String ProID;
            for (int i = ProList.size() - 1; i >= 0; i--) {
                if (Product.getProStationeryCounter() != 0 && Product.getProFashionCounter() != 0 && Product.getProFoodCounter() != 0 && Product.getProOtherCounter() != 0) {
                    break;
                }
                ProID = ProList.get(i).getProID();
                switch (ProList.get(i).getProCategory()) {
                    case Stationery:
                        Product.setProStationeryCounter(Integer.parseInt(ProID.substring(4, ProID.length())));
                        break;
                    case Fashion:
                        Product.setProFashionCounter(Integer.parseInt(ProID.substring(4, ProID.length())));
                        break;
                    case Food:
                        Product.setProFoodCounter(Integer.parseInt(ProID.substring(4, ProID.length())));
                        break;
                    case Other:
                        Product.setProOtherCounter(Integer.parseInt(ProID.substring(4, ProID.length())));
                        break;
                }
            }
        }
    }

    public static void readSupplierData() throws IOException {
        File supFile = new File("supplier.txt");
        if (!supFile.isFile() && !supFile.createNewFile()) {
            throw new IOException("Error creating new file: " + supFile.getAbsolutePath());
        }
        BufferedReader supRead = new BufferedReader(new FileReader(supFile));
        try {
            //Read
            //https://stackoverflow.com/a/39552075
            String supLine;
            while ((supLine = supRead.readLine()) != null) {
                //System.out.println(supLine);
                Supplier.buildSupFromString(supLine);
            }
        } finally {
            supRead.close();
            String SupID;
            for (int i = SupList.size() - 1; i >= 0; i--) {
                if (Supplier.getSupCounter() != 0) {
                    break;
                }
                SupID = SupList.get(i).getSupID();
                Supplier.setSupCounter(Integer.parseInt(SupID.substring(3, SupID.length())));
            }
        }
    }

//    public static void readOrderItemData() throws IOException {
//        File oiFile = new File("orderitem.txt");
//        if (!oiFile.isFile() && !oiFile.createNewFile()) {
//            throw new IOException("Error creating new file: " + oiFile.getAbsolutePath());
//        }
//        BufferedReader oiRead = new BufferedReader(new FileReader(oiFile));
//        try {
//            //Read
//            //https://stackoverflow.com/a/39552075
//            String oiLine;
//
//            while ((oiLine = oiRead.readLine()) != null) {
//                //System.out.println(oiLine);
//                OrderItem oi = OrderItem.parseOIFromString(oiLine, oiList);
//                OIList.add(oi);
//            }
//        } finally {
//            oiRead.close();
//        }
//    }
    public static void readCustomerData() throws IOException, Exception {
        File customerFile = new File("customer.txt");
        if (!customerFile.isFile() && !customerFile.createNewFile()) {
            throw new IOException("Error creating new file: " + customerFile.getAbsolutePath());
        }

        BufferedReader cusRead = new BufferedReader(new FileReader(customerFile));
        try {
            //Read
            //https://stackoverflow.com/a/39552075
            String cusLine;

            while ((cusLine = cusRead.readLine()) != null) {
                Customer.buildCusFromString(cusLine);

            }
        } finally {
            cusRead.close();
            String CusID;
            for (int i = CusList.size() - 1; i >= 0; i--) {
                if (Customer.getCusCounter() != 0) {
                    break;
                }
                CusID = CusList.get(i).getCusID();
                Customer.setCusCounter(Integer.parseInt(CusID.substring(3, CusID.length())));
            }
        }
//        File orderFile = new File("order.txt");
//        if (!orderFile.isFile() && !orderFile.createNewFile()) {
//            throw new IOException("Error creating new file: " + orderFile.getAbsolutePath());
//        }
//        BufferedReader ordRead = new BufferedReader(new FileReader(orderFile));
//
//        try {
//            //Read
//            //https://stackoverflow.com/a/39552075
//            String ordLine;
//
//            //System.out.println(ordLine);
//            for (Customer cus : CusList) {
//                int index = 0;
//                while ((ordLine = ordRead.readLine()) != null) {
//                    String[] ordData = ordLine.split("\t");
//
////                if (ordData.length!=4) {
////                    
////                }
//                    //https://www.studytonight.com/java-examples/how-to-convert-string-to-arraylist-in-java
//                    if (("SPC" + cus.getCusAccount().getAccID()).equals(ordData[0])) {
////                    Order ord = Order.parseOrdFromString(ordLine);
////                    OrdList.add(ord);
//                        index++;
//                    }
//
//                }
//                if (index == 0) {
//                    throw new Exception("Shopping cart not found! New Shopping Cart created.");
//                }
//            }
//        } finally {
//            ordRead.close();
//        }
    }

    public static void readOrderData() throws IOException {
        File orderFile = new File("order.txt");
        if (!orderFile.isFile() && !orderFile.createNewFile()) {
            throw new IOException("Error creating new file: " + orderFile.getAbsolutePath());
        }
        BufferedReader ordRead = new BufferedReader(new FileReader(orderFile));

        try {
            //Read
            //https://stackoverflow.com/a/39552075

            String ordLine;
            String[] oiIDs = new String[100];
            //String[] ordData = ordLine.split("\t");
            int i = 0, j = 0;
            while ((ordLine = ordRead.readLine()) != null) {
                //System.out.println(ordLine);

                if (j == 0) {
                    oiIDs = OrderDetails.buildOrdFromString(ordLine);
                    i = 0;
                    if (oiIDs != null) {
                        j = oiIDs.length;
                    }
                } else {
                    OrderItem.addOIFromString(ordLine, oiIDs[i]);
                    i += 1;
                    j -= 1;
                }

//                if (ordData.length!=4) {
//                    throw new IOException("Order file is damaged!");
//                }
                //https://www.studytonight.com/java-examples/how-to-convert-string-to-arraylist-in-java
            }
        } finally {
            ordRead.close();
            String OrdID;
            for (int i = OrdList.size() - 1; i >= 0; i--) {
                if (Order.getOrdCounter() != 0) {
                    break;
                }
                OrdID = OrdList.get(i).getOrdID().split("-")[0];
                if (OrdID.contains("OR")) {
                    Order.setOrdCounter(Integer.parseInt(OrdID.substring(2, OrdID.length())));
                }
            }
        }
    }

//    public static void readSCDataToCus() throws Exception {
//        File orderFile = new File("order.txt");
//        if (!orderFile.isFile() && !orderFile.createNewFile()) {
//            throw new IOException("Error creating new file: " + orderFile.getAbsolutePath());
//        }
//        BufferedReader ordRead = new BufferedReader(new FileReader(orderFile));
//
//        try {
//            //Read
//            //https://stackoverflow.com/a/39552075
//            String ordLine;
//
//            while ((ordLine = ordRead.readLine()) != null) {
//                //System.out.println(ordLine);
//                for (Customer cus : CusList) {
//                    String[] ordData = ordLine.split("\t");
//
////                if (ordData.length!=4) {
////                    
////                }
//                //https://www.studytonight.com/java-examples/how-to-convert-string-to-arraylist-in-java
//                if (("SPC" + accID).equals(ordData[0])) {
////                    Order ord = Order.parseOrdFromString(ordLine);
////                    OrdList.add(ord);
//
//                }throw new Exception("Shopping cart not found!");
//                }
//                
//            }
//        } finally {
//            ordRead.close();
//        }
//    }
    public static void writeAccountData(Account acc) throws IOException {
        File accFile = new File("account.txt");
        if (!accFile.isFile() && !accFile.createNewFile()) {
            throw new IOException("Error creating new file: " + accFile.getAbsolutePath());
        }
        PrintWriter accWrite = new PrintWriter(new BufferedWriter(new FileWriter(accFile, true)));
        try {
            accWrite.println(acc);
        } finally {
            accWrite.close();
        }

    }

    public static void writeSupplierData(Supplier sup) throws IOException {
        File supFile = new File("supplier.txt");
        if (!supFile.isFile() && !supFile.createNewFile()) {
            throw new IOException("Error creating new file: " + supFile.getAbsolutePath());
        }
        PrintWriter supWrite = new PrintWriter(new BufferedWriter(new FileWriter(supFile, true)));
        try {
            supWrite.println(sup);
        } finally {
            supWrite.close();
        }

    }

    public static void writeProductData(Product pro) throws IOException {
        File proFile = new File("product.txt");
        if (!proFile.isFile() && !proFile.createNewFile()) {
            throw new IOException("Error creating new file: " + proFile.getAbsolutePath());
        }
        PrintWriter proWrite = new PrintWriter(new BufferedWriter(new FileWriter(proFile, true)));
        try {
            proWrite.println(pro);
        } finally {
            proWrite.close();
        }

    }

    public static void writeOrderData(OrderDetails ord) throws IOException {
        File ordFile = new File("order.txt");
        if (!ordFile.isFile() && !ordFile.createNewFile()) {
            throw new IOException("Error creating new file: " + ordFile.getAbsolutePath());
        }

        PrintWriter ordWrite = new PrintWriter(new BufferedWriter(new FileWriter(ordFile, true)));
        try {
            ordWrite.println(ord);
        } finally {
            ordWrite.close();
        }
    }

    public static void writeCustomerData(Customer cus) throws IOException {
        File cusFile = new File("customer.txt");
        if (!cusFile.isFile() && !cusFile.createNewFile()) {
            throw new IOException("Error creating new file: " + cusFile.getAbsolutePath());
        }
        PrintWriter cusWrite = new PrintWriter(new BufferedWriter(new FileWriter(cusFile, true)));
        try {
            cusWrite.println(cus);
        } finally {
            cusWrite.close();
        }

    }

    public static void rewriteAccountData() throws IOException {
        File accFile = new File("account.txt");
        if (!accFile.isFile() && !accFile.createNewFile()) {
            throw new IOException("Error creating new file: " + accFile.getAbsolutePath());
        }
        PrintWriter accWrite = new PrintWriter(new BufferedWriter(new FileWriter(accFile, false)));
        try {
            for (Account acc : AccList) {
                if (acc != null) {
                    accWrite.println(acc);
                }
            }
        } finally {
            accWrite.close();
        }
    }

    public static void rewriteSupplierData() throws IOException {
        File supFile = new File("supplier.txt");
        if (!supFile.isFile() && !supFile.createNewFile()) {
            throw new IOException("Error creating new file: " + supFile.getAbsolutePath());
        }
        PrintWriter supWrite = new PrintWriter(new BufferedWriter(new FileWriter(supFile, false)));
        try {
            for (Supplier sup : SupList) {
                supWrite.println(sup);
            }
        } finally {
            supWrite.close();
        }
    }

    public static void rewriteProductData() throws IOException {
        File proFile = new File("product.txt");
        if (!proFile.isFile() && !proFile.createNewFile()) {
            throw new IOException("Error creating new file: " + proFile.getAbsolutePath());
        }
        PrintWriter proWrite = new PrintWriter(new BufferedWriter(new FileWriter(proFile, false)));
        try {
            for (Product pro : ProList) {
                proWrite.println(pro);
            }
        } finally {
            proWrite.close();
        }
    }

    public static void rewriteOrderData() throws IOException {
        File ordFile = new File("order.txt");
        if (!ordFile.isFile() && !ordFile.createNewFile()) {
            throw new IOException("Error creating new file: " + ordFile.getAbsolutePath());
        }
        PrintWriter ordWrite = new PrintWriter(new BufferedWriter(new FileWriter(ordFile, false)));
        try {
            for (Order ord : OrdList) {
                ordWrite.println(ord);
            }
            for (Customer cus : CusList) {
                if (cus.getCusAccount().getCusSC() != null) {
                    ordWrite.println(cus.getCusAccount().getCusSC());
                    System.out.println(cus.getCusAccount().getCusSC());
                }
            }
        } finally {
            ordWrite.close();
        }
    }

    public static void rewriteCustomerData() throws IOException {
        File cusFile = new File("customer.txt");
        if (!cusFile.isFile() && !cusFile.createNewFile()) {
            throw new IOException("Error creating new file: " + cusFile.getAbsolutePath());
        }
        PrintWriter cusWrite = new PrintWriter(new BufferedWriter(new FileWriter(cusFile, false)));
        try {
            for (Customer cus : CusList) {
                cusWrite.println(cus);
            }
        } finally {
            cusWrite.close();
        }
    }

    //https://stackoverflow.com/a/45211459
    public static void removeShoppingCart(String accID) throws IOException {
        File ordFile = new File("order.txt");
        File temp = new File("temp.txt");
        BufferedReader ordRead = new BufferedReader(new FileReader(ordFile));
        if (!ordFile.isFile()) {
            throw new IOException("Error openning order.txt!");
        }
        if (!temp.createNewFile()) {
            throw new IOException("Error creating new file: " + temp.getAbsolutePath());
        }
        PrintWriter tempWrite = new PrintWriter(new BufferedWriter(new FileWriter(temp, false)));
        String removeID = "SC" + accID.substring(3, accID.length());
        try {
            String currentLine;
            while ((currentLine = ordRead.readLine()) != null) {
                String trimmedLine = currentLine.trim();
                if (trimmedLine.contains(removeID)) {
                    currentLine = "";
                }
                tempWrite.write(currentLine + System.getProperty("line.separator"));

            }
            tempWrite.close();
            ordFile.delete();
            temp.renameTo(ordFile);
            temp.delete();
        } finally {
            ordRead.close();
        }

        //BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
    }

    public static void destroyAccountObject(Account acc) throws Exception {
        removeShoppingCart(acc.getAccID());
        AccList.remove(acc);
        Customer.searchCusFromAccID(acc.getAccID()).setCusAccount(new CusAcc());
        //CusAcc.minusCACounter();
        rewriteCustomerData();
        rewriteAccountData();
        rewriteOrderData();
        JOptionPane.showMessageDialog(null, "Account is deleted.");
    }

    public static void destroyProductObject(Product pro) throws Exception {
        ProList.remove(pro);
        rewriteProductData();
        Supplier.searchSupFromProID(pro.getProID()).getSupProducts().remove(pro);
        rewriteSupplierData();
        JOptionPane.showMessageDialog(null, "Product information is deleted.");
    }

    public static void destroyOrderItem(OrderItem oi) throws IOException {
        String ids[] = oi.getOIID().split("-");
        try {
            if (ids[0].contains("SP")) {
                Customer cus = Customer.searchCusFromAccID("CA" + ids[0].substring(3, ids[0].length()));
                cus.getCusAccount().getCusSC().getOrdItems().remove(oi);
            } else if (oi.getOIID().contains("OR")) {
                Order ord = Order.searchOrderFromID(ids[0]);
                for (OrderItem o : ord.getOrdItems()) {
                    if (o.getOIID().equals(oi.getOIID())) {
                        ord.getOrdItems().remove(oi);
                    }
                }
            } else {
                throw (new Exception("Order item is not deleted!" + oi.getOIID()));
            }
            oi.modifyOIQuantity(oi.getOIQuantity() * -1);
        } catch (Exception e) {
            System.out.println(e);
        }
        rewriteProductData();
        rewriteOrderData();
        JOptionPane.showMessageDialog(null, "Order item is deleted.");
        //BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
    }

    public static void destroyOrder(Order ord) throws Exception {
        OrdList.remove(ord);
        rewriteOrderData();
        Customer.searchCusFromOrdID(ord.getOrdID()).getCusOrders().remove(ord);
        rewriteCustomerData();
        JOptionPane.showMessageDialog(null, "Order information is deleted.");
    }

    public static void destroySupplierObject(Supplier sup) throws Exception {
        SupList.remove(sup);
        rewriteSupplierData();
        //Supplier.minusSupCounter();
        rewriteSupplierData();
        JOptionPane.showMessageDialog(null, "Supplier information is deleted.");
    }

    public static void destroyCustomerObject(Customer cus) throws Exception {
        CusList.remove(cus);
        rewriteCustomerData();
        removeShoppingCart(cus.getCusAccount().getAccID());
        AccList.remove(cus.getCusAccount());
        //CusAcc.minusCACounter();
        rewriteAccountData();
        rewriteOrderData();
        JOptionPane.showMessageDialog(null, "Customer information and account is deleted.");
    }

//    public static void loginAdmin(String accName, String accPassword) throws Exception {
//        removeShoppingCart(acc.getAccID());
//        AccList.remove(acc);
//        CusAcc.minusCACounter();
//        rewriteCustomerData();
//        rewriteAccountData();
//        rewriteOrderData();
//        JOptionPane.showMessageDialog(null, "Account is deleted.");
//    }
}
