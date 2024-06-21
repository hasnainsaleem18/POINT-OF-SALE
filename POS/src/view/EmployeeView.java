package view;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EmployeeView extends javax.swing.JFrame {


    public EmployeeView() {
        initComponents();
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Employee");
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Emp_Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CashierTable = new javax.swing.JTable();
        BtAdd = new javax.swing.JButton();
        BtUpdate = new javax.swing.JButton();
        BtDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AdminTable = new javax.swing.JTable();
        AdminLabel = new javax.swing.JLabel();
        CashierLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Emp_Label.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        Emp_Label.setForeground(new java.awt.Color(0, 51, 51));
        Emp_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Emp_Label.setText("Employee Data");
        Emp_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        CashierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Username", "Password", "Cash_Drawer"
            }
        ));
        jScrollPane1.setViewportView(CashierTable);

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

        AdminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Username", "Password"
            }
        ));
        jScrollPane2.setViewportView(AdminTable);

        AdminLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AdminLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminLabel.setText("Admin");

        CashierLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CashierLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CashierLabel.setText("Cashier");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Emp_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CashierLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Emp_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AdminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CashierLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAddActionPerformed
        
    }//GEN-LAST:event_BtAddActionPerformed

    private void BtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtUpdateActionPerformed
        
    }//GEN-LAST:event_BtUpdateActionPerformed

    private void BtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeleteActionPerformed
 
    }//GEN-LAST:event_BtDeleteActionPerformed


    public JButton getBtAdd() {
        return BtAdd;
    }

    public JButton getBtDelete() {
        return BtDelete;
    }

    public JButton getBtUpdate() {
        return BtUpdate;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLabel;
    private javax.swing.JTable AdminTable;
    private javax.swing.JButton BtAdd;
    private javax.swing.JButton BtDelete;
    private javax.swing.JButton BtUpdate;
    private javax.swing.JLabel CashierLabel;
    private javax.swing.JTable CashierTable;
    private javax.swing.JLabel Emp_Label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    public JTable getAdminTable() {
        return AdminTable;
    }
    public JTable getCashierTable() {
        return CashierTable;
    }
}
