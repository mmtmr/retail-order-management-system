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
public class Voucher {
   private VoucherType VouType;
   private double VouDiscount;
   
    public Voucher() {
    }

    public Voucher(VoucherType VouType) {
        this.VouType = VouType;
        switch(this.VouType){
            case VVIP:
                VouDiscount=0.2;
                break;
            case VIP:
                VouDiscount=0.1;
                break;
            case Birthday:
                VouDiscount=0.3;
                break;
            case Newbie:
                VouDiscount=0.05;
                break;
        }
    }

    public Voucher(VoucherType VouType, double VouDiscount) {
        this.VouType = VouType;
        this.VouDiscount = VouDiscount;
    }

    public VoucherType getVouType() {
        return VouType;
    }

    public void setVouType(VoucherType VouType) {
        this.VouType = VouType;
    }

    public double getVouDiscount() {
        return VouDiscount;
    }

    public void setVouDiscount(double VouDiscount) {
        this.VouDiscount = VouDiscount;
    }

    @Override
    public String toString() {
        return VouType+"|"+VouDiscount;
    }
   
   public static String[][] parseVouFromString(String vouTypeLine, String vouDiscountLine) throws Exception {
        int validInt;
        String[] vouTypeData=vouTypeLine.split("|");
        String[] vouDiscountData=vouDiscountLine.split("|");
        String[][] vouData = new String[vouTypeData.length][2];
        if (vouTypeData.length != vouDiscountData.length) {
            throw (new Exception("Voucher is incomplete!" + vouTypeLine + vouDiscountLine));
        }
        for (int i = 0; i < vouTypeData.length; i++) {
            vouData[i][0]=vouTypeData[i];
            vouData[i][1]=vouDiscountData[i];
            validInt=Integer.parseInt(vouData[i][1]);   
        }
        return vouData;
        
    }
}
