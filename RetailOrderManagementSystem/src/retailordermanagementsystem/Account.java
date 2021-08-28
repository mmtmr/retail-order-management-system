/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.time.*;
import static retailordermanagementsystem.Validation.validateAccount;

/**
 *
 * @author Maxine
 */
public abstract class Account {

    protected String AccID;
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
        if (validateAccount(AccName, AccPassword)) {
            this.AccName = AccName;
            this.AccPassword = AccPassword;
            this.AccRegisterDT = LocalDateTime.now();
            this.AccLastLoginDT = LocalDateTime.now();
        }
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

    //public static Account parseAccountFromString(String accLine);  
}
