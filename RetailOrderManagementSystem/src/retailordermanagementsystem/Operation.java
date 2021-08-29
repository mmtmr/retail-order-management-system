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

    public static ArrayList<Account> AccList = new ArrayList();
    public static ArrayList<ProductDetails> ProList = new ArrayList();
    //private static ArrayList<FragilePro> FragileProList;
    public static ArrayList<Supplier> SupList = new ArrayList();
    public static ArrayList<OrderItem> OIList = new ArrayList();
    public static ArrayList<ShoppingCart> SCList = new ArrayList();
    public static ArrayList<Order> OrdList = new ArrayList();
    public static ArrayList<Customer> CusList = new ArrayList();

    //Create or Read file
    //https://stackoverflow.com/a/24029850
    public static void readAccountData() throws IOException {
        File accountFile = new File("account.txt");
        if (!accountFile.isFile() && !accountFile.createNewFile()) {
            throw new IOException("Error creating new file: " + accountFile.getAbsolutePath());
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
                ProductDetails.buildProFromString(proLine);
            }
        } finally {
            proRead.close();
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
                Supplier sup = Supplier.parseSupFromString(supLine, ProList);
                SupList.add(sup);
            }
        } finally {
            supRead.close();
        }
    }

    public static void readOrderItemData() throws IOException {
        File oiFile = new File("orderitem.txt");
        if (!oiFile.isFile() && !oiFile.createNewFile()) {
            throw new IOException("Error creating new file: " + oiFile.getAbsolutePath());
        }
        BufferedReader oiRead = new BufferedReader(new FileReader(oiFile));
        try {
            //Read
            //https://stackoverflow.com/a/39552075
            String oiLine;

            while ((oiLine = oiRead.readLine()) != null) {
                //System.out.println(oiLine);
                OrderItem oi = OrderItem.parseOIFromString(oiLine, ProList);
                OIList.add(oi);
            }
        } finally {
            oiRead.close();
        }
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

            while ((ordLine = ordRead.readLine()) != null) {
                //System.out.println(ordLine);
                String[] ordData = ordLine.split("\t");

//                if (ordData.length!=4) {
//                    throw new IOException("Order file is damaged!");
//                }
                //https://www.studytonight.com/java-examples/how-to-convert-string-to-arraylist-in-java
                if ("OR".equals(ordData[0].substring(0, 2))) {
                    Order ord = Order.parseOrdFromString(ordLine);
                    OrdList.add(ord);
                    
                } else if ("SPC".equals(ordData[0].substring(0, 3))) {
                    ShoppingCart sc = ShoppingCart.parseSCFromString(ordLine);
                    OrdList.add(sc);
                }
            }
        } finally {
            ordRead.close();
        }
    }

    public static void readCustomerData() throws IOException {
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
                Customer cus = Customer.parseCusFromString(cusLine, AccList, OrdList, SCList);
                CusList.add(cus);

            }
        } finally {
            cusRead.close();
        }
    }

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

//    public static void writeSCData(ShoppingCart sc) throws IOException {
//        File scFile = new File("order.txt");
//        if (!scFile.isFile() && !scFile.createNewFile()) {
//            throw new IOException("Error creating new file: " + scFile.getAbsolutePath());
//        }
//        PrintWriter scWrite = new PrintWriter(new BufferedWriter(new FileWriter(scFile, true)));
//        try {
//            scWrite.println(sc);
//        } finally {
//            scWrite.close();
//        }
//    }
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
                accWrite.println(acc);
            }
        } finally {
            accWrite.close();
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

    public static void destroyCustomerObject(Customer cus) throws Exception {
        CusList.remove(cus);
        rewriteCustomerData();
        AccList.remove(cus.getCusAccount());
        CusAcc.minusCACounter();
        rewriteAccountData();
        JOptionPane.showMessageDialog(null, "Customer information and account is deleted.");
    }

}