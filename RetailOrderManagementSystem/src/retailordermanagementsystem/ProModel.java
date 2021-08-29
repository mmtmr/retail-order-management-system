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
public class ProModel{
    private String PMName;
    private int PMStock;

    public ProModel() {
    }

    public ProModel(String PMName, int PMStock ) {
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

    
    public void minusPMStock(int OIQuantity) {
        try {
            if (PMStock - OIQuantity < 0) {
                int exceedCount = OIQuantity - PMStock;
                throw (new Exception("Order Item quantity exceed by" + exceedCount));
            } else {
                PMStock-=OIQuantity;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    

}
