package view;

import model.SupplierModel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;


public class PlaceOrderView extends javax.swing.JFrame {

    public PlaceOrderView() {
        
        initComponents();
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Place Order");
        setLocationRelativeTo(null);
        setVisible(true);
           
         ProductNameField.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusGained(java.awt.event.FocusEvent evt) {
                ProductNameFieldFocusGained(evt);
                ProductNameField.setForeground(Color.BLACK);
            }
        });
        UnitField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UnitFieldFocusGained(evt);
                UnitField.setForeground(Color.BLACK);
            }
        });
        
        MinField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MinFieldFocusGained(evt);
                MinField.setForeground(Color.BLACK);
            }
        });
        
        MaxField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MaxFieldFocusGained(evt);
                MaxField.setForeground(Color.BLACK);
            }
        });

    }
    
    public void populateSupplierComboBox(List<Integer> supplierIDs) {
        // Clear existing items
        jComboBox1.removeAllItems();

        // Populate combo box with supplier IDs
        for (Integer id : supplierIDs) {
            String item = id.toString();
            jComboBox1.addItem(item);
        }
    }

//    private void populateSupplierDropdown() {
//        SupplierModel supp = new SupplierModel();
//         // Retrieve the list of sample suppliers
//        List<SupplierModel> suppliers = SupplierModel.initializeSampleSuppliers();
//
//        // Initialize the supplier names array with the size of the suppliers list
//        String[] supplierNames = new String[suppliers.size()];
//
//        // Populate the supplier names array
//        for (int i = 0; i < suppliers.size(); i++) {
//            supplierNames[i] = suppliers.get(i).getSupplierName();
//        }
//
//        // Clear existing items
//        jComboBox1.removeAllItems();
//
//        // Add supplier names to the dropdown
//        for (String name : supplierNames) {
//            jComboBox1.addItem(name);
//        }
//
//    }
    

    public JTextField getOrderIDField() {
        return OrderIDField;
    }
    
    public void setOrderIDField(int orderId){
        OrderIDField.setText(String.valueOf(orderId));
    }

    
    private void ProductNameFieldFocusGained(java.awt.event.FocusEvent evt) {                                          
        ProductNameField.setText(""); // Clear the text field when it gains focus
    }

    private void UnitFieldFocusGained(java.awt.event.FocusEvent evt) {                                          
        UnitField.setText(""); // Clear the text field when it gains focus
    }
    
    private void MinFieldFocusGained(java.awt.event.FocusEvent evt) {                                          
        MinField.setText(""); // Clear the text field when it gains focus
    }
    private void MaxFieldFocusGained(java.awt.event.FocusEvent evt) {                                          
        MaxField.setText(""); // Clear the text field when it gains focus
    }


    public void setConfirmOrderListener(java.awt.event.ActionListener listener) {
        BtConfimOrder.addActionListener(listener);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewOrderLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        productLabel = new javax.swing.JLabel();
        ProductNameField = new javax.swing.JTextField();
        UnitLabel = new javax.swing.JLabel();
        QtyLabel = new javax.swing.JLabel();
        MaxLabel = new javax.swing.JLabel();
        MinLabel = new javax.swing.JLabel();
        UnitField = new javax.swing.JTextField();
        MinField = new javax.swing.JTextField();
        MaxField = new javax.swing.JTextField();
        SupplierLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        OrderIDField = new javax.swing.JTextField();
        OrderIDlabel = new javax.swing.JLabel();
        BtConfimOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NewOrderLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NewOrderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewOrderLabel.setText("Add New Order");

        productLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        productLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productLabel.setText(" Product Name");

        ProductNameField.setForeground(new java.awt.Color(153, 153, 153));
        ProductNameField.setText("e.g Panadol");
        ProductNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameFieldActionPerformed(evt);
            }
        });

        UnitLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UnitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UnitLabel.setText("Unit");

        QtyLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QtyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QtyLabel.setText("Quantity");
        QtyLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        MaxLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MaxLabel.setText("Maximum Qty");

        MinLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MinLabel.setText("Minimum Qty");

        UnitField.setForeground(new java.awt.Color(153, 153, 153));
        UnitField.setText("e.g 500mg, 100ml , 3.3oz");

        MinField.setForeground(new java.awt.Color(153, 153, 153));
        MinField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        MinField.setText(" e.g 2");

        MaxField.setForeground(new java.awt.Color(153, 153, 153));
        MaxField.setText("e.g 30");

        SupplierLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SupplierLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SupplierLabel.setText("Supplier");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        OrderIDField.setForeground(new java.awt.Color(0, 51, 51));
        OrderIDField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                OrderIDFieldFocusGained(evt);
            }
        });
        OrderIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderIDFieldActionPerformed(evt);
            }
        });

        OrderIDlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        OrderIDlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OrderIDlabel.setText("Order ID");

        BtConfimOrder.setBackground(new java.awt.Color(153, 153, 153));
        BtConfimOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtConfimOrder.setText("Confirm Order");
        BtConfimOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConfimOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MaxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaxField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QtyLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UnitField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(productLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrderIDlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OrderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProductNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SupplierLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(BtConfimOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderIDlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UnitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UnitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(QtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MaxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SupplierLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(BtConfimOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NewOrderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NewOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void OrderIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderIDFieldActionPerformed

    private void BtConfimOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConfimOrderActionPerformed

    }//GEN-LAST:event_BtConfimOrderActionPerformed

    private void ProductNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductNameFieldActionPerformed

    private void OrderIDFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OrderIDFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderIDFieldFocusGained

    public JButton getBtConfimOrder() {
        return BtConfimOrder;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    
    public String getProductName() {
        return ProductNameField.getText();
    }

    public String getUnit() {
         String UnitText = UnitField.getText();
        return UnitText;
    }

    public String getMinQuantity() {
        String quantityText = MinField.getText().trim();
        return quantityText;
    }
    
    public String getMaxQuantity() {
        String quantityText = MaxField.getText().trim();
        return quantityText;
    }

    
    public String getSupplier() {
        return (String) jComboBox1.getSelectedItem();
    }

   
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtConfimOrder;
    private javax.swing.JTextField MaxField;
    private javax.swing.JLabel MaxLabel;
    private javax.swing.JTextField MinField;
    private javax.swing.JLabel MinLabel;
    private javax.swing.JLabel NewOrderLabel;
    private javax.swing.JTextField OrderIDField;
    private javax.swing.JLabel OrderIDlabel;
    private javax.swing.JTextField ProductNameField;
    private javax.swing.JLabel QtyLabel;
    private javax.swing.JLabel SupplierLabel;
    private javax.swing.JTextField UnitField;
    private javax.swing.JLabel UnitLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel productLabel;
    // End of variables declaration//GEN-END:variables
    
    

}
