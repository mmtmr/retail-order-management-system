/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static retailordermanagementsystem.Operation.*;

/**
 *
 * @author Maxine
 */
public class EditOrderDialog extends javax.swing.JDialog {

    Order order;
    OrderStatus old;

    /**
     * Creates new form EditOrderDialog
     */

    
    public EditOrderDialog(java.awt.Frame parent, boolean modal, Order order) {
        super(parent, modal);
        this.order = order;
        old = order.getOrdStatus();
        initComponents();
        showShoppingCartList();
    }

    public EditOrderDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        showShoppingCartList();
    }

     public void showShoppingCartList() {
        DefaultTableModel model = (DefaultTableModel) tableOrderItems.getModel();
        int i = 0;

        model.setRowCount(0);
        for (OrderItem oi : order.getOrdItems()) {
            model.addRow(new Object[]{oi.getProName() + " " + oi.getOIModel(), oi.getProPrice(), oi.getOIPackingCharge(), oi.getOIQuantity(), oi.getOIPrice()});
        }
        tableOrderItems.setModel(model);
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
        jPanel2 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        loadOrderID = new javax.swing.JLabel();
        labelOrderDate = new javax.swing.JLabel();
        labelOrderTotal = new javax.swing.JLabel();
        labelOrderTracking = new javax.swing.JLabel();
        labelOrderStatus = new javax.swing.JLabel();
        labelContactInstruction = new javax.swing.JLabel();
        labelEmailInstruction = new javax.swing.JLabel();
        labelEmailStore = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        buttonSaveChanges = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOrderItems = new javax.swing.JTable();
        buttonUpdatePayment = new javax.swing.JButton();
        textShipment = new javax.swing.JTextField();
        textDate = new javax.swing.JTextField();
        textTotal = new javax.swing.JTextField();
        comboStatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        labelTitle.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        labelTitle.setText("Order Details");

        loadOrderID.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addComponent(loadOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        labelOrderDate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelOrderDate.setText("Order Date");

        labelOrderTotal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelOrderTotal.setText("Order Total");

        labelOrderTracking.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelOrderTracking.setText("Order Tracking No.");

        labelOrderStatus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelOrderStatus.setText("Order Status");

        labelContactInstruction.setText("Please call +06-9999888 to contact us!");

        labelEmailInstruction.setText("Kindly email us for more enquiries at");

        labelEmailStore.setForeground(new java.awt.Color(102, 204, 255));
        labelEmailStore.setText(" overcooked@store.com");

        buttonCancel.setText("Cancel Order");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonSaveChanges.setText("Save Changes");
        buttonSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveChangesActionPerformed(evt);
            }
        });

        tableOrderItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Name", "Unit Price", "Packing Charge", "Quantity", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableOrderItems);

        buttonUpdatePayment.setText("Update Payment");
        buttonUpdatePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdatePaymentActionPerformed(evt);
            }
        });

        textShipment.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textShipment.setText(order.getOrdShipment());

        textDate.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textDate.setText(order.getOrdCreateDT().toString());

        textTotal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        textTotal.setText(Double.toString(order.getOrdAmt()));

        comboStatus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        comboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unpaid", "ToShip", "Shipping", "Completed", "Cancelled" }));
        comboStatus.setSelectedItem(order.getOrdStatus().name());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEmailInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(labelEmailStore))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(labelContactInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addGap(96, 96, 96))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonUpdatePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelOrderTracking, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textShipment)
                                    .addComponent(textDate)
                                    .addComponent(textTotal)
                                    .addComponent(comboStatus, 0, 322, Short.MAX_VALUE))))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelOrderDate, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(textDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textShipment, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelOrderTracking, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUpdatePayment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(labelContactInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailInstruction)
                    .addComponent(labelEmailStore))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveChangesActionPerformed
        try {
            LocalDateTime dt = LocalDateTime.parse(textDate.getText());
            Double total = Double.parseDouble(textTotal.getText());
            String shipmentcode = textShipment.getText();
            String statusname = (String) comboStatus.getSelectedItem();
            OrderStatus status = OrderStatus.valueOf(statusname);
            Validation.validateShipmentInput(shipmentcode);
            if (old != status) {
                switch (status) {
                    case Unpaid:
                        order.setOrdPayment(new Payment(null, null, null));
                        order.setOrdStatus(status);
                        break;
                    case ToShip:
                        order.setOrdStatus(status);
                        break;
                    case Shipping:
                        order.setOrdStatus(status);
                        break;
                    case Completed:
                        order.setOrdStatus(status);
                        break;
                    case Cancelled:
                        throw new Exception ("Please use the Cancel button below.");
                }
            }
            order.setOrdCreateDT(dt);
            order.setOrdAmt(total);
            order.setOrdShipment(shipmentcode);
            order.setOrdModifyDT(LocalDateTime.now());
            rewriteOrderData();
            JOptionPane.showMessageDialog(null, "Order changes is saved!");
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buttonSaveChangesActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        try {
            if (order.getOrdStatus() != OrderStatus.Unpaid && order.getOrdStatus() != OrderStatus.ToShip) {
                throw new Exception("This order cannot be cancelled.");
            }
            order.setOrdStatus(OrderStatus.Cancelled);
            for (OrderItem oi : order.getOrdItems()) {
                oi.modifyOIQuantity(oi.getOIQuantity());
            }
            rewriteOrderData();
            JOptionPane.showMessageDialog(null, "Order is cancelled! Refund is being processed...");
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonUpdatePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdatePaymentActionPerformed
        try {

            //DefaultTableModel model =  (DefaultTableModel)tableCusList.getModel();
            if (order.getOrdStatus() == OrderStatus.Cancelled) {
                throw new Exception("This order payment cannot be updated.");
            }
            PaymentDialog paymentDialog = new PaymentDialog(null, true, order);
            paymentDialog.show();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_buttonUpdatePaymentActionPerformed

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
            java.util.logging.Logger.getLogger(EditOrderDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditOrderDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditOrderDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditOrderDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditOrderDialog dialog = new EditOrderDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonSaveChanges;
    private javax.swing.JButton buttonUpdatePayment;
    private javax.swing.JComboBox<String> comboStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelContactInstruction;
    private javax.swing.JLabel labelEmailInstruction;
    private javax.swing.JLabel labelEmailStore;
    private javax.swing.JLabel labelOrderDate;
    private javax.swing.JLabel labelOrderStatus;
    private javax.swing.JLabel labelOrderTotal;
    private javax.swing.JLabel labelOrderTracking;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel loadOrderID;
    private javax.swing.JTable tableOrderItems;
    private javax.swing.JTextField textDate;
    private javax.swing.JTextField textShipment;
    private javax.swing.JTextField textTotal;
    // End of variables declaration//GEN-END:variables
}
