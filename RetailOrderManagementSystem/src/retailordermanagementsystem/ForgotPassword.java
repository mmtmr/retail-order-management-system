/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

/**
 *
 * @author user
 */
public class ForgotPassword extends javax.swing.JPanel {

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
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

        labelForgotPasswordTitle = new javax.swing.JLabel();
        labelFPInstruction = new javax.swing.JLabel();
        labelFPInstruction2 = new javax.swing.JLabel();
        textEmailUsername = new javax.swing.JTextField();
        labelRememberPassword = new javax.swing.JLabel();
        buttonFPLogin = new javax.swing.JButton();
        buttonResetPassword = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(174, 173, 173));
        setPreferredSize(new java.awt.Dimension(400, 600));

        labelForgotPasswordTitle.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        labelForgotPasswordTitle.setForeground(new java.awt.Color(84, 79, 79));
        labelForgotPasswordTitle.setText("Forgot Password?");

        labelFPInstruction.setForeground(new java.awt.Color(102, 102, 102));
        labelFPInstruction.setText("Please enter registered username / emaill");

        labelFPInstruction2.setForeground(new java.awt.Color(102, 102, 102));
        labelFPInstruction2.setText("to reset password");

        textEmailUsername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textEmailUsername.setText("Email / Username");

        labelRememberPassword.setForeground(new java.awt.Color(102, 102, 102));
        labelRememberPassword.setText("Remember Password?");

        buttonFPLogin.setBackground(new java.awt.Color(174, 173, 173));
        buttonFPLogin.setForeground(new java.awt.Color(255, 0, 51));
        buttonFPLogin.setText("Login");
        buttonFPLogin.setBorder(null);
        buttonFPLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFPLoginActionPerformed(evt);
            }
        });

        buttonResetPassword.setBackground(new java.awt.Color(102, 102, 102));
        buttonResetPassword.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        buttonResetPassword.setForeground(new java.awt.Color(204, 204, 204));
        buttonResetPassword.setText("Reset Password");
        buttonResetPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonResetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetPasswordActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Please call +06-9999888 to contact us!");

        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Kindly email us for more enquiries at");

        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText(" overcooked@store.com");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\OODJ PIC\\forgot password.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelForgotPasswordTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelFPInstruction2)
                                .addGap(72, 72, 72))
                            .addComponent(labelFPInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textEmailUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelRememberPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(buttonFPLogin)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)))
                        .addGap(35, 35, 35))))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelForgotPasswordTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFPInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelFPInstruction2)
                .addGap(37, 37, 37)
                .addComponent(textEmailUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRememberPassword)
                    .addComponent(buttonFPLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonResetPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFPLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFPLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFPLoginActionPerformed

    private void buttonResetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonResetPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFPLogin;
    private javax.swing.JButton buttonResetPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelFPInstruction;
    private javax.swing.JLabel labelFPInstruction2;
    private javax.swing.JLabel labelForgotPasswordTitle;
    private javax.swing.JLabel labelRememberPassword;
    private javax.swing.JTextField textEmailUsername;
    // End of variables declaration//GEN-END:variables
}
