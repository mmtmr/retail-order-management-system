/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Maxine
 */
public class CusInfo extends PersonalInfo {

    private int PIRewardPoint;
    private LocalDate PIDateOfBirth;
    private ArrayList<Voucher> PIVoucher;

    public CusInfo() {
    }

//    public CusInfo(String PIFName, String PILName, char PIGender) {
//        super(PIFName, PILName, PIGender);
//    }
//    public CusInfo(int PIRewardPoint, LocalDate PIDateOfBirth) {
//        this.PIRewardPoint = PIRewardPoint;
//        this.PIDateOfBirth = PIDateOfBirth;
//    }
    //New
    public CusInfo(String PIFName, String PILName, Gender PIGender, LocalDate PIDateOfBirth) {
        super(PIFName, PILName, PIGender);
        this.PIDateOfBirth = PIDateOfBirth;
        this.PIRewardPoint = 0;
        this.PIVoucher = new ArrayList();
        generatePIVoucher();
    }

    //Normal Load
    public CusInfo(String PIFName, String PILName, Gender PIGender, LocalDate PIDateOfBirth, int PIRewardPoint) {
        super(PIFName, PILName, PIGender);
        this.PIRewardPoint = PIRewardPoint;
        this.PIDateOfBirth = PIDateOfBirth;
        this.PIVoucher = new ArrayList();
        generatePIVoucher();
    }

    public int getPIRewardPoint() {
        return PIRewardPoint;
    }

    public void setPIRewardPoint(int PIRewardPoint) {
        this.PIRewardPoint = PIRewardPoint;
    }
    public void addPIRewardPoint(int PIRewardPoint) {
        this.PIRewardPoint += PIRewardPoint;
    }

    public LocalDate getPIDateOfBirth() {
        return PIDateOfBirth;
    }

    public void setPIDateOfBirth(LocalDate PIDateOfBirth) {
        this.PIDateOfBirth = PIDateOfBirth;
    }

    public ArrayList<Voucher> getPIVoucher() {
        return PIVoucher;
    }

    public void setPIVoucher(ArrayList<Voucher> PIVoucher) {
        this.PIVoucher = PIVoucher;
    }

    public final void generatePIVoucher() {
        if (PIRewardPoint >= 10000) {
            PIVoucher.add(new Voucher(VoucherType.VVIP));
        } else if (PIRewardPoint >= 5000) {
            PIVoucher.add(new Voucher(VoucherType.VIP));
        }else{
            PIVoucher.add(new Voucher(VoucherType.Newbie));
        }
        if (PIDateOfBirth.getMonth()==LocalDate.now().getMonth()) {
            PIVoucher.add(new Voucher(VoucherType.Birthday));
        }
    }

    @Override
    public String toString() {
        return PIFName + "|" + PILName + "|" + PIGender + "|" + PIDateOfBirth + "|" + PIRewardPoint;
    }

    public static String[] parseCusInfoFromString(String piLine) throws Exception {
        String[] piData = piLine.split("\\|");
        if (piData.length != 5) {
            throw (new Exception("Customer Info is incomplete!" + piLine));
        } else {
            return piData;
        }
    }
}
