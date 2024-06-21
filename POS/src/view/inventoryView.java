
package view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class inventoryView extends javax.swing.JFrame {

    public inventoryView() {
        initComponents();
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Inventory");
        setLocationRelativeTo(null);
        setVisible(true);
        
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPannel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        topPannel = new javax.swing.JPanel();
        crudPannel = new javax.swing.JPanel();
        buttomRemove = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        productPannel = new javax.swing.JPanel();
        codeField = new javax.swing.JTextField();
        productSearch = new javax.swing.JButton();
        productName = new javax.swing.JTextField();
        OR = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Category", "Quantity", "Price", "unit(mg,ml)"
            }
        ));
        jScrollPane1.setViewportView(productTable);

        topPannel.setBackground(new java.awt.Color(0, 153, 102));

        crudPannel.setBackground(new java.awt.Color(0, 153, 102));
        crudPannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        buttomRemove.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        buttomRemove.setText("Remove");
        buttomRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomRemoveActionPerformed(evt);
            }
        });

        buttonAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crudPannelLayout = new javax.swing.GroupLayout(crudPannel);
        crudPannel.setLayout(crudPannelLayout);
        crudPannelLayout.setHorizontalGroup(
            crudPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttomRemove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        crudPannelLayout.setVerticalGroup(
            crudPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crudPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(crudPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd)
                    .addComponent(UpdateButton)
                    .addComponent(buttomRemove))
                .addGap(19, 19, 19))
        );

        productPannel.setBackground(new java.awt.Color(0, 153, 102));
        productPannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        codeField.setForeground(new java.awt.Color(153, 153, 153));
        codeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeFieldActionPerformed(evt);
            }
        });
        codeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeFieldKeyTyped(evt);
            }
        });

        productSearch.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        productSearch.setText("Search");
        productSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productSearchActionPerformed(evt);
            }
        });

        productName.setForeground(new java.awt.Color(153, 153, 153));
        productName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        OR.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        OR.setText("OR");

        javax.swing.GroupLayout productPannelLayout = new javax.swing.GroupLayout(productPannel);
        productPannel.setLayout(productPannelLayout);
        productPannelLayout.setHorizontalGroup(
            productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(OR)
                .addGap(18, 18, 18)
                .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(productSearch)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        productPannelLayout.setVerticalGroup(
            productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productPannelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(codeField)
                    .addComponent(productName)
                    .addComponent(productSearch)
                    .addComponent(OR))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        refreshButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        refreshButton.setText("Refresh");

        javax.swing.GroupLayout topPannelLayout = new javax.swing.GroupLayout(topPannel);
        topPannel.setLayout(topPannelLayout);
        topPannelLayout.setHorizontalGroup(
            topPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPannelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(productPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(refreshButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(crudPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        topPannelLayout.setVerticalGroup(
            topPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshButton)
                .addGap(40, 40, 40))
            .addGroup(topPannelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(topPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crudPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backPannelLayout = new javax.swing.GroupLayout(backPannel);
        backPannel.setLayout(backPannelLayout);
        backPannelLayout.setHorizontalGroup(
            backPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backPannelLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        backPannelLayout.setVerticalGroup(
            backPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPannelLayout.createSequentialGroup()
                .addComponent(topPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getProductSearch() {
        return productSearch;
    }

    public void setProductSearch(JButton productSearch) {
        this.productSearch = productSearch;
    }

    public JButton getRefreshButton() {
        return refreshButton;
    }

    public void setRefreshButton(JButton refreshButton) {
        this.refreshButton = refreshButton;
    }

    public JButton getUpdateButton() {
        return UpdateButton;
    }

    public void setUpdateButton(JButton UpdateButton) {
        this.UpdateButton = UpdateButton;
    }

    public JPanel getBackPannel() {
        return backPannel;
    }

    public void setBackPannel(JPanel backPannel) {
        this.backPannel = backPannel;
    }

    public JButton getButtomRemove() {
        return buttomRemove;
    }

    public void setButtomRemove(JButton buttomRemove) {
        this.buttomRemove = buttomRemove;
    }

    public JButton getButtonAdd() {
        return buttonAdd;
    }

    public void setButtonAdd(JButton buttonAdd) {
        this.buttonAdd = buttonAdd;
    }

    

    public JTextField getCodeField() {
        return codeField;
    }

    public void setCodeField(JTextField codeField) {
        this.codeField = codeField;
    }

    public JPanel getCrudPannel() {
        return crudPannel;
    }

    public void setCrudPannel(JPanel crudPannel) {
        this.crudPannel = crudPannel;
    }

    

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    
    public JTextField getProductName() {
        return productName;
    }

    public void setProductName(JTextField productName) {
        this.productName = productName;
    }

    public JPanel getProductPannel() {
        return productPannel;
    }

    public void setProductPannel(JPanel productPannel) {
        this.productPannel = productPannel;
    }

    

    public JPanel getTopPannel() {
        return topPannel;
    }

    public void setTopPannel(JPanel topPannel) {
        this.topPannel = topPannel;
    }
    
    
    private void codeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeFieldActionPerformed
        
    }//GEN-LAST:event_codeFieldActionPerformed

    private void codeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeFieldKeyTyped
       
    }//GEN-LAST:event_codeFieldKeyTyped

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed

    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttomRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomRemoveActionPerformed

    }//GEN-LAST:event_buttomRemoveActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void productSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productSearchActionPerformed

    }//GEN-LAST:event_productSearchActionPerformed


    public JTable getProductTable() {
        return productTable;
    }

    public void setProductTable(JTable productTable) {
        this.productTable = productTable;
    }
    
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OR;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JPanel backPannel;
    private javax.swing.JButton buttomRemove;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JTextField codeField;
    private javax.swing.JPanel crudPannel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField productName;
    private javax.swing.JPanel productPannel;
    private javax.swing.JButton productSearch;
    private javax.swing.JTable productTable;
    private javax.swing.JButton refreshButton;
    private javax.swing.JPanel topPannel;
    // End of variables declaration//GEN-END:variables
}
