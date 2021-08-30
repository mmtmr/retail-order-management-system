/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.time.LocalDate;

/**
 *
 * @author Maxine
 */
public class CusInfo extends PersonalInfo {

    private int PIRewardPoint;
    private LocalDate PIDateOfBirth;

    //https://mkyong.com/java8/java-8-how-to-convert-string-to-localdate/
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
    }

    //Normal Load
    public CusInfo(String PIFName, String PILName, Gender PIGender, LocalDate PIDateOfBirth, int PIRewardPoint) {
        super(PIFName, PILName, PIGender);
        this.PIRewardPoint = PIRewardPoint;
        this.PIDateOfBirth = PIDateOfBirth;
    }
    
    //Load From String Array
    public CusInfo(String[] PILine) {
        super(PILine[0], PILine[1], Gender.valueOf(PILine[2]));
        
        this.PIDateOfBirth = LocalDate.parse(PILine[3]);
        this.PIRewardPoint = Integer.parseInt(PILine[4]);
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
        return PIFName + "," + PILName + "," + PIGender + "," + PIDateOfBirth + "," + PIRewardPoint;
    }

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
//        return new CusInfo(pi[0], pi[1], Gender.valueOf(pi[2]), LocalDate.parse(pi[4]), Integer.parseInt(pi[3]));
//    }
    
    public static String[] parseCusInfoFromString(String piLine) throws Exception {
        String[] piData = piLine.split(",");
        if (piData.length != 5) {
            throw (new Exception("Customer Info is incomplete!" + piLine));
        } else {
            return piData;
        }
    }
}
