package view;

import controlllor.SupplierController;
import model.SupplierModel;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class SupplierView extends javax.swing.JFrame {
     //private  SupplierController controller;
    
    public SupplierView() {
        initComponents();
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("supplier");
        setLocationRelativeTo(null);
        setVisible(true);
        //controller = new SupplierController(this, model);
    }
    
    public void updateTable(DefaultTableModel tableModel) {
        SupplierTable.setModel(tableModel);
        //supplierTable.setModel(tableModel);
    }
    
    public String[] getSupplierDataFromUser() {
    // Implementation to prompt the user for supplier data and return as a String array
    // [supplierName, supplierContact, address]
    return new String[] {
        JOptionPane.showInputDialog("Enter supplier name:"),
        JOptionPane.showInputDialog("Enter supplier contact (+92-xxxxxxxxxx):"),
        JOptionPane.showInputDialog("Enter address:")
    };
}

   
    public String getSupplierIDFromUser() {
        return JOptionPane.showInputDialog(this, "Enter supplier ID:");
    }

    public int getSelectedRowIndex() {
        return SupplierTable.getSelectedRow();
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public int showConfirmationMessage(String message) {
        return JOptionPane.showConfirmDialog(this, message, "Confirmation", JOptionPane.YES_NO_OPTION);
    }

    public void addAddButtonListener(ActionListener listener) {
        BtAdd.addActionListener(listener);
    }

    public void addUpdateButtonListener(ActionListener listener) {
        BtUpdate.addActionListener(listener);
    }

    public void addDeleteButtonListener(ActionListener listener) {
        BtDelete.addActionListener(listener);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtAdd = new javax.swing.JButton();
        BtUpdate = new javax.swing.JButton();
        BtDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SupplierTable = new javax.swing.JTable();
        SupplierLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtAdd.setText("Add");
        BtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAddActionPerformed(evt);
            }
        });

        BtUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtUpdate.setText("Update");
        BtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtUpdateActionPerformed(evt);
            }
        });

        BtDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtDelete.setText("Delete");
        BtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        SupplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID", "Supplier Name", "Supplier Contact", "Address"
            }
        ));
        jScrollPane2.setViewportView(SupplierTable);

        SupplierLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        SupplierLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SupplierLabel.setText("Supplier Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(SupplierLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SupplierLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAddActionPerformed
       //controller.addSupplier();
    }//GEN-LAST:event_BtAddActionPerformed

    private void BtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtUpdateActionPerformed
        // controller.updateSupplier();
    }//GEN-LAST:event_BtUpdateActionPerformed

    private void BtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeleteActionPerformed
      // controller.deleteSupplier();
    }//GEN-LAST:event_BtDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAdd;
    private javax.swing.JButton BtDelete;
    private javax.swing.JButton BtUpdate;
    private javax.swing.JLabel SupplierLabel;
    private javax.swing.JTable SupplierTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    
    public JButton getBtAdd() {
        return BtAdd;
    }

    public void setBtAdd(JButton BtAdd) {
        this.BtAdd = BtAdd;
    }

    public JButton getBtDelete() {
        return BtDelete;
    }

    public void setBtDelete(JButton BtDelete) {
        this.BtDelete = BtDelete;
    }

    public JButton getBtUpdate() {
        return BtUpdate;
    }

    public void setBtUpdate(JButton BtUpdate) {
        this.BtUpdate = BtUpdate;
    }

    public JLabel getSupplierLabel() {
        return SupplierLabel;
    }

    public void setSupplierLabel(JLabel SupplierLabel) {
        this.SupplierLabel = SupplierLabel;
    }

    public JTable getSupplierTable() {
        return SupplierTable;
    }

    public void setSupplierTable(JTable SupplierTable) {
        this.SupplierTable = SupplierTable;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    
}
