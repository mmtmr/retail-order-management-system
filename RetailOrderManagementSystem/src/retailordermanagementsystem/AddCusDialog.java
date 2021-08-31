/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static retailordermanagementsystem.Operation.AccList;
import static retailordermanagementsystem.Operation.CusList;
import static retailordermanagementsystem.Validation.*;

/**
 *
 * @author Maxine
 */
public class AddCusDialog extends javax.swing.JDialog {
    DefaultTableModel model;

    /**
     * Creates new form AddCusDialog
     */
    public AddCusDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public AddCusDialog(java.awt.Frame parent, boolean modal, DefaultTableModel model) {
        super(parent, modal);
        this.model = model;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        buttonSave = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        labelBirthday = new javax.swing.JLabel();
        textPhone = new javax.swing.JTextField();
        textBirthday = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        labelGender = new javax.swing.JLabel();
        labelStreet = new javax.swing.JLabel();
        textStreet = new javax.swing.JTextField();
        radioMale = new javax.swing.JRadioButton();
        labelCity = new javax.swing.JLabel();
        comboState = new javax.swing.JComboBox<>();
        labelFirstName = new javax.swing.JLabel();
        textCity = new javax.swing.JTextField();
        radioFemale = new javax.swing.JRadioButton();
        labelLastName = new javax.swing.JLabel();
        labelState = new javax.swing.JLabel();
        textFirstName = new javax.swing.JTextField();
        labelPostcode = new javax.swing.JLabel();
        textLastName = new javax.swing.JTextField();
        textPostcode = new javax.swing.JTextField();
        labelPhone = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelAccountName = new javax.swing.JLabel();
        textAccountName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonSave.setBackground(new java.awt.Color(153, 204, 255));
        buttonSave.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buttonSave.setForeground(new java.awt.Color(0, 102, 255));
        buttonSave.setText("Save");
        buttonSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonCancel.setBackground(new java.awt.Color(153, 204, 255));
        buttonCancel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buttonCancel.setForeground(new java.awt.Color(0, 102, 255));
        buttonCancel.setText("Cancel");
        buttonCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        labelBirthday.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelBirthday.setText("Birthday");

        textPhone.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        textPhone.setText("+6012-3456789");

        textBirthday.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textBirthday.setText("YYYY-MM-DD");

        textEmail.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        labelGender.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelGender.setText("Gender");

        labelStreet.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelStreet.setText("Street");

        textStreet.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        buttonGroupGender.add(radioMale);
        radioMale.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        radioMale.setText("Male");

        labelCity.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelCity.setText("City");

        comboState.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        comboState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select State>", "Kuala Lumpur", "Selangor", "Putrajaya", "Labuan", "Perlis", "Kedah", "Terengganu", "Pahang", "Perak", "Kelantan", "Penang", "Selangor", "Negeri Sembilan", "Johor", "Malacca", "Sabah", "Sarawak" }));

        labelFirstName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelFirstName.setText("First Name");

        textCity.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        buttonGroupGender.add(radioFemale);
        radioFemale.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        radioFemale.setText("Female");

        labelLastName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelLastName.setText("Last Name");

        labelState.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelState.setText("State");

        textFirstName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        labelPostcode.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelPostcode.setText("Postcode");

        textLastName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        textPostcode.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        labelPhone.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelPhone.setText("Phone");

        labelEmail.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelEmail.setText("Email");

        labelAccountName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelAccountName.setText("Acccount Name");

        textAccountName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        labelTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 0, 102));
        labelTitle.setText("New Customer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(textAccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(textFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(textLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(radioFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(textBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(textStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCity, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(textCity, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelState, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(comboState, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(textPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 21, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAccountName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelGender))
                    .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelState, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        CusAcc acc = new CusAcc();
        Customer cus = new Customer();
        try {

            //            String AccountName=textAccountName.getText();
            String fname = textFirstName.getText();
            String lname = textLastName.getText();
            Gender gender;
            if (radioMale.isSelected()) {
                gender = Gender.M;
            } else if (radioFemale.isSelected()) {
                gender = Gender.F;
            } else {
                throw (new Exception("Gender is not valid! Please try again."));
            }
            LocalDate birthday = LocalDate.parse(textBirthday.getText());
            String phone = textPhone.getText();
            String email = textEmail.getText();
            String street = textStreet.getText();
            String city = textCity.getText();
            String state = (String) comboState.getSelectedItem();
            String postcode = textPostcode.getText();
            
            //Validate input
            //Validation.validateAccountInput(textAccountName.getText(), "123456");
            //public static void validateCustomerInput(String fname, String lname, String phone, String email, String AddStreet, String AddCity, String AddState, String AddPostcode, String accname) throws Exception {
            validateCustomerInput(fname, lname, phone, email, street, city, state, postcode, textAccountName.getText());
            
            acc = new CusAcc(textAccountName.getText(), "123456");
            AccList.add(acc);
            //validateCustomer(fname, lname, phone, email, street, city, state, postcode, acc.getAccID(), acc.getAccPassword());
            cus = new Customer(fname, lname, gender, birthday, phone, email, street, city, state, postcode, acc);
            CusList.add(cus);
            //String PIFName, String PILName, Gender PIGender, LocalDate PIDateOfBirth,String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode,CusAcc CusAccount
            //            cus.getCusOrdersIDs();
            //            System.out.println(cus);
            Operation.writeAccountData(acc);
            Operation.writeOrderData(cus.getCusAccount().getCusSC());
            Operation.writeCustomerData(cus);
            model.addRow(new Object[]{cus.getCusAccount().getAccID(), cus.getCusAccount().getAccName(), cus.getCusPI().getPIFName(), cus.getCusPI().getPILName(), cus.getCusPI().getPIGender(), cus.getCusPI().getPIDateOfBirth(), cus.getCusPI().getPIRewardPoint(), cus.getCusCI().getCIPhone(), cus.getCusCI().getCIEmail(), cus.getCusCI().getCIAddStreet(), cus.getCusCI().getCIAddCity(), cus.getCusCI().getCIAddState(), cus.getCusCI().getCIAddPostcode()});
            JOptionPane.showMessageDialog(null, "Customer added");
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddCusDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCusDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCusDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCusDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddCusDialog dialog = new AddCusDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JButton buttonSave;
    private javax.swing.JComboBox<String> comboState;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAccountName;
    private javax.swing.JLabel labelBirthday;
    private javax.swing.JLabel labelCity;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelPostcode;
    private javax.swing.JLabel labelState;
    private javax.swing.JLabel labelStreet;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField textAccountName;
    private javax.swing.JTextField textBirthday;
    private javax.swing.JTextField textCity;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textFirstName;
    private javax.swing.JTextField textLastName;
    private javax.swing.JTextField textPhone;
    private javax.swing.JTextField textPostcode;
    private javax.swing.JTextField textStreet;
    // End of variables declaration//GEN-END:variables
}
