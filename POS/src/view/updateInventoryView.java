
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class updateInventoryView extends javax.swing.JFrame {

    public updateInventoryView() {
        initComponents();
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("UPDATE");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NewOrderLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        code = new javax.swing.JLabel();
        codeTXT = new javax.swing.JTextField();
        product = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        Unit = new javax.swing.JLabel();
        UnitField = new javax.swing.JTextField();
        quantityTXT = new javax.swing.JTextField();
        quantity = new javax.swing.JLabel();
        Category = new javax.swing.JLabel();
        categoryJumbo = new javax.swing.JComboBox<>();
        BtConfimOrder = new javax.swing.JButton();
        price = new javax.swing.JLabel();
        priceTXT = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        NewOrderLabel.setBackground(new java.awt.Color(0, 153, 102));
        NewOrderLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NewOrderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewOrderLabel.setText("Update Product");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(NewOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(NewOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        code.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        code.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        code.setText("Code:");

        codeTXT.setForeground(new java.awt.Color(153, 153, 153));
        codeTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTXTActionPerformed(evt);
            }
        });

        product.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        product.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product.setText(" Product Name:");

        productName.setForeground(new java.awt.Color(153, 153, 153));
        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });

        Unit.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        Unit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Unit.setText("Unit:");

        UnitField.setForeground(new java.awt.Color(153, 153, 153));
        UnitField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnitFieldActionPerformed(evt);
            }
        });

        quantityTXT.setForeground(new java.awt.Color(153, 153, 153));
        quantityTXT.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        quantity.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        quantity.setText("Quantity:");

        Category.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        Category.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Category.setText("  Category:");

        categoryJumbo.setForeground(new java.awt.Color(153, 153, 153));
        categoryJumbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prescription Medications", "Over-the-Counter (OTC) Medications", "First Aid Supplies", "Personal Care Products", "Medical Devices and Supplies", "Baby Care Products", "Feminine Hygiene Products", "Allergy and Sinus Relief", "Digestive Health", "Pain Relief", "Homeopathic Remedies", "Cold and Flu Remedies", "Eye and Ear Care", "Smoking Cessation Aids" }));
        categoryJumbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryJumboActionPerformed(evt);
            }
        });

        BtConfimOrder.setBackground(new java.awt.Color(153, 153, 153));
        BtConfimOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtConfimOrder.setText("UPDATE");
        BtConfimOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConfimOrderActionPerformed(evt);
            }
        });

        price.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        price.setText("         Price:");

        priceTXT.setForeground(new java.awt.Color(153, 153, 153));
        priceTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTXTActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(153, 153, 153));
        searchButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        searchButton.setText("Search");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Unit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quantityTXT)
                            .addComponent(UnitField)
                            .addComponent(productName)
                            .addComponent(categoryJumbo, 0, 210, Short.MAX_VALUE)
                            .addComponent(priceTXT)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(searchButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtConfimOrder)
                .addGap(73, 73, 73))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Unit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UnitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryJumbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(BtConfimOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codeTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTXTActionPerformed

    private void productNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameActionPerformed

    private void UnitFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnitFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnitFieldActionPerformed

    private void categoryJumboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryJumboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryJumboActionPerformed

    private void BtConfimOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConfimOrderActionPerformed

    }//GEN-LAST:event_BtConfimOrderActionPerformed

    private void priceTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTXTActionPerformed

    public JButton getBtConfimOrder() {
        return BtConfimOrder;
    }

    public void setBtConfimOrder(JButton BtConfimOrder) {
        this.BtConfimOrder = BtConfimOrder;
    }

    public JLabel getCategory() {
        return Category;
    }

    public void setCategory(JLabel Category) {
        this.Category = Category;
    }

    public JLabel getNewOrderLabel() {
        return NewOrderLabel;
    }

    public void setNewOrderLabel(JLabel NewOrderLabel) {
        this.NewOrderLabel = NewOrderLabel;
    }

    public JLabel getUnit() {
        return Unit;
    }

    public void setUnit(JLabel Unit) {
        this.Unit = Unit;
    }

    public JTextField getUnitField() {
        return UnitField;
    }

    public void setUnitField(JTextField UnitField) {
        this.UnitField = UnitField;
    }

    public JComboBox<String> getCategoryJumbo() {
        return categoryJumbo;
    }

    public void setCategoryJumbo(JComboBox<String> categoryJumbo) {
        this.categoryJumbo = categoryJumbo;
    }

    public JLabel getCode() {
        return code;
    }

    public void setCode(JLabel code) {
        this.code = code;
    }

    public JTextField getCodeTXT() {
        return codeTXT;
    }

    public void setCodeTXT(JTextField codeTXT) {
        this.codeTXT = codeTXT;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JLabel getPrice() {
        return price;
    }

    public void setPrice(JLabel price) {
        this.price = price;
    }

    public JTextField getPriceTXT() {
        return priceTXT;
    }

    public void setPriceTXT(JTextField priceTXT) {
        this.priceTXT = priceTXT;
    }

    public JLabel getProduct() {
        return product;
    }

    public void setProduct(JLabel product) {
        this.product = product;
    }

    public JTextField getProductName() {
        return productName;
    }

    public void setProductName(JTextField productName) {
        this.productName = productName;
    }

    public JLabel getQuantity() {
        return quantity;
    }

    public void setQuantity(JLabel quantity) {
        this.quantity = quantity;
    }

    public JTextField getQuantityTXT() {
        return quantityTXT;
    }

    public void setQuantityTXT(JTextField quantityTXT) {
        this.quantityTXT = quantityTXT;
    }

    public JButton getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(JButton searchButton) {
        this.searchButton = searchButton;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtConfimOrder;
    private javax.swing.JLabel Category;
    private javax.swing.JLabel NewOrderLabel;
    private javax.swing.JLabel Unit;
    private javax.swing.JTextField UnitField;
    private javax.swing.JComboBox<String> categoryJumbo;
    private javax.swing.JLabel code;
    private javax.swing.JTextField codeTXT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel price;
    private javax.swing.JTextField priceTXT;
    private javax.swing.JLabel product;
    private javax.swing.JTextField productName;
    private javax.swing.JLabel quantity;
    private javax.swing.JTextField quantityTXT;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
