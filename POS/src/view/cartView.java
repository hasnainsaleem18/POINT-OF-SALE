
package view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class cartView extends javax.swing.JFrame {

    public cartView() {
        initComponents();
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Cart");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topPannel = new javax.swing.JPanel();
        productPannel = new javax.swing.JPanel();
        codeField = new javax.swing.JTextField();
        productName = new javax.swing.JTextField();
        OR = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        productCombo = new javax.swing.JComboBox<>();
        crudPannel = new javax.swing.JPanel();
        buttomRemove = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        proceedButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TOTALTEXT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        topPannel.setBackground(new java.awt.Color(0, 153, 102));

        productPannel.setBackground(new java.awt.Color(0, 153, 102));
        productPannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

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

        productName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });

        OR.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        OR.setText("OR");

        buttonAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        productCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prescription Medications", "Over-the-Counter (OTC) Medications", "First Aid Supplies", "Personal Care Products", "Medical Devices and Supplies", "Baby Care Products", "Feminine Hygiene Products", "Allergy and Sinus Relief", "Digestive Health", "Pain Relief", "Homeopathic Remedies", "Cold and Flu Remedies", "Eye and Ear Care", "Smoking Cessation Aids" }));

        javax.swing.GroupLayout productPannelLayout = new javax.swing.GroupLayout(productPannel);
        productPannel.setLayout(productPannelLayout);
        productPannelLayout.setHorizontalGroup(
            productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OR)
                .addGap(18, 18, 18)
                .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(buttonAdd)
                .addGap(63, 63, 63))
        );
        productPannelLayout.setVerticalGroup(
            productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productPannelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(codeField)
                    .addComponent(productName)
                    .addComponent(OR)
                    .addComponent(buttonAdd)
                    .addComponent(productCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        crudPannel.setBackground(new java.awt.Color(0, 153, 102));
        crudPannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        buttomRemove.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        buttomRemove.setText("Remove");
        buttomRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomRemoveActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        refreshButton.setText("Refresh");

        javax.swing.GroupLayout crudPannelLayout = new javax.swing.GroupLayout(crudPannel);
        crudPannel.setLayout(crudPannelLayout);
        crudPannelLayout.setHorizontalGroup(
            crudPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttomRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refreshButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        crudPannelLayout.setVerticalGroup(
            crudPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crudPannelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(crudPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton)
                    .addComponent(buttomRemove)
                    .addComponent(refreshButton))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout topPannelLayout = new javax.swing.GroupLayout(topPannel);
        topPannel.setLayout(topPannelLayout);
        topPannelLayout.setHorizontalGroup(
            topPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(crudPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        topPannelLayout.setVerticalGroup(
            topPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPannelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(topPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crudPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Quantity", "Price", "unit(mg,ml)", "Total"
            }
        ));
        jScrollPane1.setViewportView(productTable);

        jPanel5.setBackground(new java.awt.Color(0, 153, 102));

        proceedButton.setBackground(new java.awt.Color(0, 102, 204));
        proceedButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        proceedButton.setText("Proceed To Payment");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setText("TOTAL: ");

        TOTALTEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTALTEXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(proceedButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TOTALTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proceedButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(TOTALTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(topPannel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(topPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeFieldActionPerformed

    }//GEN-LAST:event_codeFieldActionPerformed

    private void codeFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeFieldKeyTyped

    }//GEN-LAST:event_codeFieldKeyTyped

    private void buttomRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomRemoveActionPerformed

    }//GEN-LAST:event_buttomRemoveActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed

    }//GEN-LAST:event_buttonAddActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void productNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameActionPerformed

    private void TOTALTEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTALTEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TOTALTEXTActionPerformed

    public JTextField getTOTALTEXT() {
        return TOTALTEXT;
    }

    public void setTOTALTEXT(JTextField TOTALTEXT) {
        this.TOTALTEXT = TOTALTEXT;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JComboBox<String> getProductCombo() {
        return productCombo;
    }

    public void setProductCombo(JComboBox<String> productCombo) {
        this.productCombo = productCombo;
    }

    public JTable getProductTable() {
        return productTable;
    }

    public void setProductTable(JTable productTable) {
        this.productTable = productTable;
    }

    public JButton getUpdateButton() {
        return UpdateButton;
    }

    public void setUpdateButton(JButton UpdateButton) {
        this.UpdateButton = UpdateButton;
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

    

    public JButton getProceedButton() {
        return proceedButton;
    }

    public void setProceedButton(JButton proceedButton) {
        this.proceedButton = proceedButton;
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
    
    

    public JButton getRefreshButton() {
        return refreshButton;
    }

    public void setRefreshButton(JButton refreshButton) {
        this.refreshButton = refreshButton;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OR;
    private javax.swing.JTextField TOTALTEXT;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton buttomRemove;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JTextField codeField;
    private javax.swing.JPanel crudPannel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton proceedButton;
    private javax.swing.JComboBox<String> productCombo;
    private javax.swing.JTextField productName;
    private javax.swing.JPanel productPannel;
    private javax.swing.JTable productTable;
    private javax.swing.JButton refreshButton;
    private javax.swing.JPanel topPannel;
    // End of variables declaration//GEN-END:variables
}
