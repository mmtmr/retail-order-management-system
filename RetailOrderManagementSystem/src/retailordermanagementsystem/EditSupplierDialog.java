/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Maxine
 */
public class EditSupplierDialog extends javax.swing.JDialog {

    Supplier sup;

    /**
     * Creates new form EditSupplierDialog
     */
    public EditSupplierDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public EditSupplierDialog(java.awt.Frame parent, boolean modal, Supplier sup) {
        super(parent, modal);
        this.sup=sup;
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

        jPanel1 = new javax.swing.JPanel();
        labelSupplierName = new javax.swing.JLabel();
        labelFirstName1 = new javax.swing.JLabel();
        labelLastName1 = new javax.swing.JLabel();
        labelSupPhone = new javax.swing.JLabel();
        labelSupState = new javax.swing.JLabel();
        textSupStreet = new javax.swing.JTextField();
        textSupPhone = new javax.swing.JTextField();
        textPICFirstName = new javax.swing.JTextField();
        textPICLastName = new javax.swing.JTextField();
        textSupplierName = new javax.swing.JTextField();
        buttonCancel = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelSupEmail = new javax.swing.JLabel();
        textSupEmail = new javax.swing.JTextField();
        labelSupStreet = new javax.swing.JLabel();
        labelSupCity = new javax.swing.JLabel();
        textSupCity = new javax.swing.JTextField();
        labelSupPostcode = new javax.swing.JLabel();
        textSupPostcode = new javax.swing.JTextField();
        comboSupState = new javax.swing.JComboBox<>();
        radioPICFemale = new javax.swing.JRadioButton();
        labelGender1 = new javax.swing.JLabel();
        radioPICMale = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelSupplierName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelSupplierName.setText("Supplier Name");

        labelFirstName1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelFirstName1.setText("PIC First Name");

        labelLastName1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelLastName1.setText("PIC Last Name");

        labelSupPhone.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelSupPhone.setText("Phone");

        labelSupState.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelSupState.setText("State");

        textSupStreet.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        textSupStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSupStreetActionPerformed(evt);
            }
        });

        textSupPhone.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        textPICFirstName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        textPICLastName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        textSupplierName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        buttonCancel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        buttonCancel.setText("Cancel");
        buttonCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonSave.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        buttonSave.setText("Save");
        buttonSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(100, 100, 192));

        labelTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("Edit Supplier");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelSupEmail.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelSupEmail.setText("Email");

        textSupEmail.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        textSupEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSupEmailActionPerformed(evt);
            }
        });

        labelSupStreet.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelSupStreet.setText("Street");

        labelSupCity.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelSupCity.setText("City");

        textSupCity.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        textSupCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSupCityActionPerformed(evt);
            }
        });

        labelSupPostcode.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelSupPostcode.setText("Postcode");

        textSupPostcode.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        textSupPostcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSupPostcodeActionPerformed(evt);
            }
        });

        comboSupState.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboSupState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select State>", "Wilayah Persekutuan", "Selangor", "Putrajaya", "Labuan", "Perlis", "Kedah", "Terengganu", "Pahang", "Perak", "Kelantan", "Penang", "Selangor", "Negeri Sembilan", "Johor", "Malacca", "Sabah", "Sarawak" }));

        radioPICFemale.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        radioPICFemale.setText("Female");

        labelGender1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelGender1.setText("PIC Gender");

        radioPICMale.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        radioPICMale.setText("Male");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSupplierName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFirstName1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(labelLastName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelGender1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSupState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSupPostcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSupCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSupStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSupEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSupPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textPICFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPICLastName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSupPhone, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSupStreet, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSupEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSupCity, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboSupState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textSupPostcode)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioPICMale, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioPICFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textSupplierName))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPICFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPICLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioPICFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radioPICMale, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelGender1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSupPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSupPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSupEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSupEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSupStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSupStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSupCity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSupCity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSupPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSupPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSupState, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSupState, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void loadSupData() {
        try {
            textSupplierName.setText(sup.getSupName());
            textPICFirstName.setText(sup.getSupPersonInCharge().getPIFName());
            textPICLastName.setText(sup.getSupPersonInCharge().getPILName());
            if (sup.getSupPersonInCharge().getPIGender() == Gender.M) {
                radioPICMale.setSelected(true);
            } else if (sup.getSupPersonInCharge().getPIGender() == Gender.F) {
                radioPICFemale.setSelected(true);
            }
            textSupPhone.setText(sup.getSupCI().getCIPhone());
            textSupEmail.setText(sup.getSupCI().getCIEmail());
            textSupStreet.setText(sup.getSupCI().getCIAddStreet());
            textSupCity.setText(sup.getSupCI().getCIAddCity());
            comboSupState.setSelectedItem(sup.getSupCI().getCIAddState());
            textSupPostcode.setText(sup.getSupCI().getCIAddPostcode());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    private void textSupStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSupStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSupStreetActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        try {
            String supname = textSupplierName.getText();
            String picfname = textPICFirstName.getText();
            String piclname = textPICLastName.getText();
            Gender picgender;
            if (radioPICMale.isSelected()) {
                picgender = Gender.M;
            } else if (radioPICFemale.isSelected()) {
                picgender = Gender.F;
            } else {
                throw (new Exception("Gender is not valid! Please try again."));
            }
            String phone = textSupPhone.getText();
            String email = textSupEmail.getText();
            String street = textSupStreet.getText();
            String city = textSupCity.getText();
            String state = (String) comboSupState.getSelectedItem();
            String postcode = textSupPostcode.getText();

            //Validation
            Validation.validateSupplierInput(supname, picfname, piclname, phone, email, street, city, state, postcode);
            //Supplier(String SupName, String PIFName, String PILName, Gender PIGender, String CIPhone, String CIEmail, String CIAddStreet, String CIAddCity, String CIAddState, String CIAddPostcode)
            sup.editSupplier(supname, picfname, piclname, picgender, phone, email, street, city, state, postcode);
            Operation.rewriteSupplierData();
            JOptionPane.showMessageDialog(null, "Supplier modification saved.");
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void textSupEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSupEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSupEmailActionPerformed

    private void textSupCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSupCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSupCityActionPerformed

    private void textSupPostcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSupPostcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSupPostcodeActionPerformed

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
            java.util.logging.Logger.getLogger(EditSupplierDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSupplierDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSupplierDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSupplierDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditSupplierDialog dialog = new EditSupplierDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonSave;
    private javax.swing.JComboBox<String> comboSupState;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelFirstName1;
    private javax.swing.JLabel labelGender1;
    private javax.swing.JLabel labelLastName1;
    private javax.swing.JLabel labelSupCity;
    private javax.swing.JLabel labelSupEmail;
    private javax.swing.JLabel labelSupPhone;
    private javax.swing.JLabel labelSupPostcode;
    private javax.swing.JLabel labelSupState;
    private javax.swing.JLabel labelSupStreet;
    private javax.swing.JLabel labelSupplierName;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JRadioButton radioPICFemale;
    private javax.swing.JRadioButton radioPICMale;
    private javax.swing.JTextField textPICFirstName;
    private javax.swing.JTextField textPICLastName;
    private javax.swing.JTextField textSupCity;
    private javax.swing.JTextField textSupEmail;
    private javax.swing.JTextField textSupPhone;
    private javax.swing.JTextField textSupPostcode;
    private javax.swing.JTextField textSupStreet;
    private javax.swing.JTextField textSupplierName;
    // End of variables declaration//GEN-END:variables
}
