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
public class PersonalInfo {

    protected String PIFName;
    protected String PILName;
    protected Gender PIGender;

    public PersonalInfo() {
    }

    public PersonalInfo(String PIFName, String PILName, Gender PIGender) {
        this.PIFName = PIFName;
        this.PILName = PILName;
        this.PIGender = PIGender;
    }
    
    //TODO validation
    public PersonalInfo(String[] PILine) {
        this.PIFName = PILine[0];
        this.PILName = PILine[1];
        this.PIGender = Gender.valueOf(PILine[2]);
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

    public Gender getPIGender() {
        return PIGender;
    }

    public void setPIGender(Gender PIGender) {
        this.PIGender = PIGender;
    }

//    public boolean validatePIGender(){
//        return (getPIGender()=='F'||getPIGender()=='M');
//    }
    @Override
    public String toString() {
        return PIFName + "|" + PILName + "|" + PIGender;
    }

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
//        return new PersonalInfo(pi[0], pi[1], Gender.valueOf(pi[2]));
//    }
    
    public static String[] parsePIFromString(String piLine) throws Exception {
        String[] piData = piLine.split("\\|");
        if (piData.length != 3) {
            throw (new Exception("Personal Info is incomplete!" + piLine));
        } else {
            return piData;
        }
    }
}
