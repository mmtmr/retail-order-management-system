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
public class CustomerProductDetails extends javax.swing.JPanel {

    /**
     * Creates new form CustomerProductDetails
     */
    public CustomerProductDetails() {
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

        buttonGroupAddBuy = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelProductDetails = new javax.swing.JLabel();
        labelPDName = new javax.swing.JLabel();
        labelPDPrice = new javax.swing.JLabel();
        labelPDCategory = new javax.swing.JLabel();
        labelPDWeight = new javax.swing.JLabel();
        labelPDModel = new javax.swing.JLabel();
        labelPDQuantity = new javax.swing.JLabel();
        labelPDFragile = new javax.swing.JLabel();
        loadPDName = new javax.swing.JLabel();
        loadPDPrice = new javax.swing.JLabel();
        loadPDCategory = new javax.swing.JLabel();
        loadPDWeight = new javax.swing.JLabel();
        spinnerPDQuantity = new javax.swing.JSpinner();
        comboPDModel = new javax.swing.JComboBox<>();
        loadPDFragile = new javax.swing.JLabel();
        buttonAddToCart = new javax.swing.JButton();
        buttonBuyNow = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        labelProductDetails.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelProductDetails.setText("Product Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(labelProductDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        labelPDName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelPDName.setText("Name");

        labelPDPrice.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelPDPrice.setText("Price");

        labelPDCategory.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelPDCategory.setText("Category");

        labelPDWeight.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelPDWeight.setText("Weight");

        labelPDModel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelPDModel.setText("Model");

        labelPDQuantity.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelPDQuantity.setText("Quantity");

        labelPDFragile.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelPDFragile.setText("Fragile");

        loadPDName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        loadPDPrice.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        loadPDCategory.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        loadPDWeight.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        spinnerPDQuantity.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        comboPDModel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        comboPDModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        loadPDFragile.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        buttonAddToCart.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        buttonAddToCart.setText("Add To Cart");
        buttonAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddToCartActionPerformed(evt);
            }
        });

        buttonBuyNow.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        buttonBuyNow.setText("Cancel");
        buttonGroupAddBuy.add(buttonBuyNow);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPDFragile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPDQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPDModel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPDWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPDCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPDPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(labelPDName, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loadPDPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loadPDCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loadPDWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loadPDName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spinnerPDQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboPDModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadPDFragile, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(buttonBuyNow, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelPDCategory, labelPDFragile, labelPDModel, labelPDName, labelPDPrice, labelPDQuantity, labelPDWeight});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonAddToCart, buttonBuyNow});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPDName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelPDPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelPDCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPDWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadPDWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPDModel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboPDModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPDQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerPDQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPDFragile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadPDFragile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loadPDName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loadPDPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loadPDCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(buttonBuyNow, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {labelPDCategory, labelPDFragile, labelPDModel, labelPDName, labelPDPrice, labelPDQuantity, labelPDWeight});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonAddToCart, buttonBuyNow});

    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddToCartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddToCartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddToCart;
    private javax.swing.JButton buttonBuyNow;
    private javax.swing.ButtonGroup buttonGroupAddBuy;
    private javax.swing.JComboBox<String> comboPDModel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPDCategory;
    private javax.swing.JLabel labelPDFragile;
    private javax.swing.JLabel labelPDModel;
    private javax.swing.JLabel labelPDName;
    private javax.swing.JLabel labelPDPrice;
    private javax.swing.JLabel labelPDQuantity;
    private javax.swing.JLabel labelPDWeight;
    private javax.swing.JLabel labelProductDetails;
    private javax.swing.JLabel loadPDCategory;
    private javax.swing.JLabel loadPDFragile;
    private javax.swing.JLabel loadPDName;
    private javax.swing.JLabel loadPDPrice;
    private javax.swing.JLabel loadPDWeight;
    private javax.swing.JSpinner spinnerPDQuantity;
    // End of variables declaration//GEN-END:variables
}
