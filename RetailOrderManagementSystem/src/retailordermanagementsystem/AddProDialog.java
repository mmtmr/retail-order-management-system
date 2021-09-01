/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailordermanagementsystem;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static retailordermanagementsystem.Operation.*;

/**
 *
 * @author Maxine
 */
public class AddProDialog extends javax.swing.JDialog {

    DefaultTableModel model;

    /**
     * Creates new form AddProDialog
     */
    public AddProDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public AddProDialog(java.awt.Frame parent, boolean modal, DefaultTableModel model) {
        super(parent, modal);
        this.model = model;
        initComponents();
    }
//https://stackoverflow.com/questions/1291704/how-do-i-populate-a-jcombobox-with-an-arraylist/29461313

    private DefaultComboBoxModel<String> getComboBoxModel(ArrayList<Supplier> SupList) {
        String[] comboBoxModel = new String[SupList.size()];
        for (int i = 0; i < SupList.size(); i++) {
            comboBoxModel[i] = SupList.get(i).getSupName();
        }
        return new DefaultComboBoxModel<>(comboBoxModel);
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
        labelName = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        labelWeight = new javax.swing.JLabel();
        labelModel = new javax.swing.JLabel();
        labelCategory = new javax.swing.JLabel();
        labelSupplier = new javax.swing.JLabel();
        textModel = new javax.swing.JTextField();
        textPrice = new javax.swing.JTextField();
        textWeight = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        buttonCancel = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        labelType = new javax.swing.JLabel();
        labelStock = new javax.swing.JLabel();
        spinnerStock = new javax.swing.JSpinner();
        comboCategory = new javax.swing.JComboBox<>();
        comboSupplier = new javax.swing.JComboBox<>();
        radioFragile = new javax.swing.JRadioButton();
        radioNonFragile = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelName.setText("Name");

        labelPrice.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelPrice.setText("Price");

        labelWeight.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelWeight.setText("Weight");

        labelModel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelModel.setText("Model");

        labelCategory.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelCategory.setText("Category");

        labelSupplier.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelSupplier.setText("Supplier");

        textModel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        textModel.setText("<Add First Model>");

        textPrice.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        textWeight.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        textName.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });

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

        labelType.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelType.setText("Type");

        labelStock.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        labelStock.setText("Model Stock");

        spinnerStock.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        comboCategory.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        comboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stationery", "Food", "Fashion", "Other" }));
        comboCategory.setSelectedIndex(-1);

        comboSupplier.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        comboSupplier.setModel(getComboBoxModel(SupList));
        comboSupplier.setSelectedIndex(-1);

        radioFragile.setText("Fragile");

        radioNonFragile.setText("Non-Fragile");
        radioNonFragile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNonFragileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelWeight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelSupplier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(labelType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textModel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textWeight, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textName)
                                .addComponent(spinnerStock)
                                .addComponent(comboCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(radioFragile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioNonFragile))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPrice)
                    .addComponent(textPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textWeight)
                    .addComponent(labelWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textModel)
                    .addComponent(labelModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategory)
                    .addComponent(comboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSupplier)
                    .addComponent(comboSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStock)
                    .addComponent(spinnerStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelType)
                    .addComponent(radioFragile)
                    .addComponent(radioNonFragile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        labelTitle.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        labelTitle.setText("New Product");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameActionPerformed

    private void radioNonFragileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNonFragileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNonFragileActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        Product pro = new Product();
        try {
            String name = textName.getText();
            Double price = Double.parseDouble(textPrice.getText());
            Double weight = Double.parseDouble(textWeight.getText());
            String model = textModel.getText();
            String categoryname=(String) comboCategory.getSelectedItem();
            ProductType category = ProductType.valueOf(categoryname);
            String suppliername = (String) comboSupplier.getSelectedItem();
            Supplier supplier = Supplier.searchSupFromName(suppliername);
            int stock = (Integer) spinnerStock.getValue();
            Boolean isFragile;
            if (radioFragile.isSelected()) {
                isFragile = true;
            } else if (radioNonFragile.isSelected()) {
                isFragile = false;
            } else {
                throw (new Exception("Fragile type is not valid! Please try again."));
            }

            //Validation
            Validation.validateProductInput(name, model);

            pro = new Product(name, price, weight, category, isFragile, model, stock);
            ProList.add(pro);
            supplier.getSupProducts().add(pro);
            Operation.writeProductData(pro);
            Operation.rewriteSupplierData();
            //this.model.addRow(new Object[]{pro.getProID(), category, name, price, model, stock, weight, isFragile, suppliername});
            JOptionPane.showMessageDialog(null, "Product added.");
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
            java.util.logging.Logger.getLogger(AddProDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddProDialog dialog = new AddProDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> comboCategory;
    private javax.swing.JComboBox<String> comboSupplier;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelCategory;
    private javax.swing.JLabel labelModel;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelStock;
    private javax.swing.JLabel labelSupplier;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelType;
    private javax.swing.JLabel labelWeight;
    private javax.swing.JRadioButton radioFragile;
    private javax.swing.JRadioButton radioNonFragile;
    private javax.swing.JSpinner spinnerStock;
    private javax.swing.JTextField textModel;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPrice;
    private javax.swing.JTextField textWeight;
    // End of variables declaration//GEN-END:variables
}