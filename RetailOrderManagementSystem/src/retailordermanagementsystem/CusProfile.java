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
public class CusProfile extends javax.swing.JPanel {

    /**
     * Creates new form CusProfile
     */
    public CusProfile() {
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

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        buttonGroupGender = new javax.swing.ButtonGroup();
        textPhone = new javax.swing.JTextField();
        memberLabelPoint = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        labelMemberLevel = new javax.swing.JLabel();
        labelLastLoginDT = new javax.swing.JLabel();
        labelLastRegisterDT = new javax.swing.JLabel();
        comboState = new javax.swing.JComboBox<>();
        labelStreet = new javax.swing.JLabel();
        textStreet = new javax.swing.JTextField();
        labelCity = new javax.swing.JLabel();
        labelFirstName = new javax.swing.JLabel();
        textCity = new javax.swing.JTextField();
        labelLastName = new javax.swing.JLabel();
        labelState = new javax.swing.JLabel();
        textFirstName = new javax.swing.JTextField();
        labelPostcode = new javax.swing.JLabel();
        textLastName = new javax.swing.JTextField();
        textPostcode = new javax.swing.JTextField();
        labelPhone = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        labelEmail = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        labelGender = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        labelBirthday = new javax.swing.JLabel();
        textBirthday = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();

        textPhone.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        textPhone.setText("+6012-3456789");
        textPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPhoneActionPerformed(evt);
            }
        });

        memberLabelPoint.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        memberLabelPoint.setText("jLabel10");

        textEmail.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        textEmail.setText("example@gmail.com");

        labelMemberLevel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelMemberLevel.setText("jLabel11");

        labelLastLoginDT.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelLastLoginDT.setText("jLabel1");

        labelLastRegisterDT.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelLastRegisterDT.setText("jLabel2");

        comboState.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        comboState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select State>", "Kuala Lumpur", "Selangor", "Putrajaya", "Labuan", "Perlis", "Kedah", "Terengganu", "Pahang", "Perak", "Kelantan", "Penang", "Selangor", "Negeri Sembilan", "Johor", "Malacca", "Sabah", "Sarawak" }));

        labelStreet.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelStreet.setText("Street");

        textStreet.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        labelCity.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelCity.setText("City");

        labelFirstName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelFirstName.setText("First Name");

        textCity.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        labelLastName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelLastName.setText("Last Name");

        labelState.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelState.setText("State");

        textFirstName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        labelPostcode.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelPostcode.setText("Postcode");

        textLastName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        textPostcode.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        textPostcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPostcodeActionPerformed(evt);
            }
        });

        labelPhone.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelPhone.setText("Phone Number");

        buttonSave.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        buttonSave.setText("Save Changes");
        buttonSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        labelEmail.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelEmail.setText("Email");

        buttonCancel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        buttonCancel.setText("Cancel");
        buttonCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelGender.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelGender.setText("Gender");

        buttonGroupGender.add(radioMale);
        radioMale.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });

        buttonGroupGender.add(radioFemale);
        radioFemale.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        radioFemale.setText("Female");

        labelBirthday.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelBirthday.setText("Birthday");

        textBirthday.setText("YYYY-MM-DD");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        labelTitle.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        labelTitle.setText("Customer Profile");
        labelTitle.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                labelTitleAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(labelTitle)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radioFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(labelLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textBirthday)
                                    .addComponent(textLastName)
                                    .addComponent(textFirstName)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(labelCity, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(labelState, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(labelPostcode, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(labelStreet, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textEmail)
                                    .addComponent(textPhone)
                                    .addComponent(textStreet)
                                    .addComponent(textCity)
                                    .addComponent(comboState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textPostcode)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelLastLoginDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(labelLastRegisterDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(memberLabelPoint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addComponent(labelMemberLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(155, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelCity, labelEmail, labelFirstName, labelLastName, labelPhone, labelPostcode, labelState, labelStreet});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(labelLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(radioFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textStreet, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(labelStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textCity, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboState, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelMemberLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38)
                        .addComponent(memberLabelPoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(labelLastLoginDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(labelLastRegisterDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(211, 211, 211))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMaleActionPerformed

    private void textPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPhoneActionPerformed

    private void textPostcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPostcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPostcodeActionPerformed

    private void labelTitleAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_labelTitleAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_labelTitleAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JButton buttonSave;
    private javax.swing.JComboBox<String> comboState;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBirthday;
    private javax.swing.JLabel labelCity;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelLastLoginDT;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelLastRegisterDT;
    private javax.swing.JLabel labelMemberLevel;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelPostcode;
    private javax.swing.JLabel labelState;
    private javax.swing.JLabel labelStreet;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel memberLabelPoint;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
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
