/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;
import javax.swing.UIManager;

/**
 *
 * @author user
 */
public class OrderConfirmation extends javax.swing.JPanel {

    /**
     * Creates new form OrderConfirmation
     */
    public OrderConfirmation() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrderItems = new javax.swing.JTable();
        labelDAName = new javax.swing.JLabel();
        labelDAPhone = new javax.swing.JLabel();
        labelOrderTotalAmount = new javax.swing.JLabel();
        labelDAAddress = new javax.swing.JLabel();
        labelOrderDate = new javax.swing.JLabel();
        labelOrderTotal = new javax.swing.JLabel();
        labelDeliveryAddress = new javax.swing.JLabel();
        labelRemarks = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelOrderID = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        buttonMakePayment = new javax.swing.JButton();
        labelContactInstruction = new javax.swing.JLabel();
        labelEmailInstruction = new javax.swing.JLabel();
        labelEmailStore = new javax.swing.JLabel();
        loadOrderDate = new javax.swing.JLabel();
        textMessageToSeller = new javax.swing.JTextField();

        tableOrderItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Product Name", "Unit Price", "Quantity", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableOrderItems);
        if (tableOrderItems.getColumnModel().getColumnCount() > 0) {
            tableOrderItems.getColumnModel().getColumn(0).setPreferredWidth(5);
            tableOrderItems.getColumnModel().getColumn(1).setPreferredWidth(200);
            tableOrderItems.getColumnModel().getColumn(2).setPreferredWidth(35);
            tableOrderItems.getColumnModel().getColumn(3).setPreferredWidth(35);
            tableOrderItems.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        labelDAName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        labelDAPhone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        labelOrderTotalAmount.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelOrderTotalAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelDAAddress.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        labelOrderDate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelOrderDate.setText("Order Date");

        labelOrderTotal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelOrderTotal.setText("Order Total");

        labelDeliveryAddress.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelDeliveryAddress.setText("Delivery Address");

        labelRemarks.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelRemarks.setText("Remarks");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        labelTitle.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        labelTitle.setText("Order ID");

        labelOrderID.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addComponent(labelOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOrderID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        buttonCancel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonMakePayment.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        buttonMakePayment.setText("Make Payment");

        labelContactInstruction.setText("Please call +06-9999888 to contact us!");

        labelEmailInstruction.setText("Kindly email us for more enquiries at");

        labelEmailStore.setForeground(new java.awt.Color(102, 204, 255));
        labelEmailStore.setText(" overcooked@store.com");

        loadOrderDate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        textMessageToSeller.setText("Leave a message to seller (Optional)");
        textMessageToSeller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMessageToSellerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(buttonMakePayment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancel)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEmailInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(labelEmailStore))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(labelContactInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(357, 357, 357)
                            .addComponent(labelOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelOrderTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelDeliveryAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelRemarks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelDAName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelDAPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelDAAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                        .addComponent(loadOrderDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textMessageToSeller)))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDeliveryAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDAName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(labelDAPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(labelDAAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelRemarks, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(textMessageToSeller))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOrderTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMakePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(labelContactInstruction)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailInstruction)
                    .addComponent(labelEmailStore))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void textMessageToSellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMessageToSellerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMessageToSellerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonMakePayment;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelContactInstruction;
    private javax.swing.JLabel labelDAAddress;
    private javax.swing.JLabel labelDAName;
    private javax.swing.JLabel labelDAPhone;
    private javax.swing.JLabel labelDeliveryAddress;
    private javax.swing.JLabel labelEmailInstruction;
    private javax.swing.JLabel labelEmailStore;
    private javax.swing.JLabel labelOrderDate;
    private javax.swing.JLabel labelOrderID;
    private javax.swing.JLabel labelOrderTotal;
    private javax.swing.JLabel labelOrderTotalAmount;
    private javax.swing.JLabel labelRemarks;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel loadOrderDate;
    private javax.swing.JTable tableOrderItems;
    private javax.swing.JTextField textMessageToSeller;
    // End of variables declaration//GEN-END:variables
}
