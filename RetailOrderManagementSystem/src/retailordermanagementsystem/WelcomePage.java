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
public class WelcomePage extends javax.swing.JPanel {

    /**
     * Creates new form WelcomePage
     */
    public WelcomePage() {
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

        labelTitle = new javax.swing.JLabel();
        buttonAdmin = new javax.swing.JButton();
        buttonUser = new javax.swing.JButton();
        buttonUserIcon = new javax.swing.JButton();
        buttonAdminIcon = new javax.swing.JButton();

        setBackground(new java.awt.Color(221, 229, 246));

        labelTitle.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(109, 147, 236));
        labelTitle.setText("Welcome To Overcooked Retail Store");

        buttonAdmin.setBackground(new java.awt.Color(108, 152, 255));
        buttonAdmin.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        buttonAdmin.setForeground(new java.awt.Color(255, 255, 255));
        buttonAdmin.setText("Admin");
        buttonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdminActionPerformed(evt);
            }
        });

        buttonUser.setBackground(new java.awt.Color(108, 152, 255));
        buttonUser.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        buttonUser.setForeground(new java.awt.Color(255, 255, 255));
        buttonUser.setText("User");

        buttonUserIcon.setBackground(new java.awt.Color(221, 229, 246));
        buttonUserIcon.setBorder(null);
        buttonUserIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUserIconActionPerformed(evt);
            }
        });

        buttonAdminIcon.setBackground(new java.awt.Color(221, 229, 246));
        buttonAdminIcon.setBorder(null);
        buttonAdminIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdminIconActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(buttonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAdminIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonUser, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(buttonUserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonUserIcon)
                    .addComponent(buttonAdminIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonUser, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(188, 188, 188))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdminActionPerformed
        LoginDialog adminLoginDialog = new LoginDialog(null, true, 'A');
        adminLoginDialog.show();
    }//GEN-LAST:event_buttonAdminActionPerformed

    private void buttonUserIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUserIconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonUserIconActionPerformed

    private void buttonAdminIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdminIconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAdminIconActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdmin;
    private javax.swing.JButton buttonAdminIcon;
    private javax.swing.JButton buttonUser;
    private javax.swing.JButton buttonUserIcon;
    private javax.swing.JLabel labelTitle;
    // End of variables declaration//GEN-END:variables
}
