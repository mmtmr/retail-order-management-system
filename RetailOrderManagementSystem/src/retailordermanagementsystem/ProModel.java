/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author Maxine
 */
public class ProModel {

    private String PMName;
    private int PMStock;

    public ProModel() {
    }

    public ProModel(String PMName, int PMStock) {
        this.PMName = PMName;
        this.PMStock = PMStock;
    }

    public String getPMName() {
        return PMName;
    }

    public void setPMName(String PMName) {
        this.PMName = PMName;
    }

    public int getPMStock() {
        return PMStock;
    }

    public void setPMStock(int PMStock) {
        this.PMStock = PMStock;
    }

//    public void addPMStock(int OIQuantity) {
//        PMStock += OIQuantity;
//    }

    public void minusPMStock(int OIQuantity) {
        try {
            if (PMStock - OIQuantity < 0) {
                int exceedCount = OIQuantity - PMStock;
                throw (new Exception("Order Item quantity exceed by" + exceedCount));
            } else {
                PMStock -= OIQuantity;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return PMName + ", " + PMStock;
    }

    //validate null
    public static String[][] parsePMFromString(String pmNamesLine, String pmStocksLine) throws Exception {
        int validInt;
        String[] pmNamesData = pmNamesLine.split(",");
        String[] pmStocksData = pmStocksLine.split(",");
        String[][] pmData = new String[pmNamesData.length][2];
        if (pmNamesData.length != pmStocksData.length) {
            throw (new Exception("Product Model is incomplete!" + pmNamesLine + pmStocksLine));
        }
        for (int i = 0; i < pmNamesData.length; i++) {
            pmData[i][0] = pmNamesData[i];
            pmData[i][1] = pmStocksData[i];
            validInt = Integer.parseInt(pmData[i][1]);
        }
        return pmData;

    }

}
