package view;

import controlllor.SupplyController;
import model.SupplyModel;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SupplyView extends javax.swing.JFrame {

    private ActionListener searchListener;
    private ActionListener orderByListener;

    public SupplyView() {
        initComponents();
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("supply");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public JButton getBtSearch() {
        return BtSearch;
    }

    public JButton getBtOrderBy() {
        return BtOrderBy;
    }

    public JTable getJTable1() {
        return supplytable;
    }

    public void updateTable(List<Object[]> data) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{
            "Order ID", "Product", "Unit (mg/ml)", "Min QTY", "Max Qty", "Supplier ID", "Supplier Name", "Supplier Contact", "Supplier Address"
        });
        for (Object[] row : data) {
            model.addRow(row);
        }
        supplytable.setModel(model);
    }

    public String getSearchCriteria() {
        String[] options = {"Order ID", "Product", "Supplier Name"};
        return (String) JOptionPane.showInputDialog(
                this,
                "Select search criteria:",
                "Search Criteria",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
    }

    public String getSearchValue() {
        return JOptionPane.showInputDialog(this, "Enter search value:");
    }

    public String getOrderByCriteria() {
        String[] options = {"Order ID", "Product", "Supplier Name"};
        return (String) JOptionPane.showInputDialog(
                this,
                "Select order by criteria:",
                "Order By Criteria",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
    }


    public void addSearchListener(ActionListener listener) {
        this.searchListener = listener;
    }

    public void addOrderByListener(ActionListener listener) {
        this.orderByListener = listener;
    }

    public void showDialog(JDialog dialog) {
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    public JTable getSupplytable() {
        return supplytable;
    }

    public void setSupplytable(JTable supplytable) {
        this.supplytable = supplytable;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SupplyLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplytable = new javax.swing.JTable();
        BtSearch = new javax.swing.JButton();
        BtOrderBy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SupplyLabel.setBackground(new java.awt.Color(204, 204, 204));
        SupplyLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SupplyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SupplyLabel.setText("Supply");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        supplytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Product", "Unit (mg/ml)", "Min QTY", "Max Qty", "Supplier Id", "Supplier Name", "Supplier Contact", "Supplier Address"
            }
        ));
        jScrollPane1.setViewportView(supplytable);

        BtSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtSearch.setText("Search");
        BtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSearchActionPerformed(evt);
            }
        });

        BtOrderBy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtOrderBy.setText("Order By");
        BtOrderBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtOrderByActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(BtOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(363, 363, 363))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SupplyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SupplyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSearchActionPerformed
          if (searchListener != null) {
               searchListener.actionPerformed(evt);
            }
    }//GEN-LAST:event_BtSearchActionPerformed

    
    private void BtOrderByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtOrderByActionPerformed
         if (orderByListener != null) {
            orderByListener.actionPerformed(evt);
        }
    }//GEN-LAST:event_BtOrderByActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtOrderBy;
    private javax.swing.JButton BtSearch;
    private javax.swing.JLabel SupplyLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable supplytable;
    // End of variables declaration//GEN-END:variables
}
