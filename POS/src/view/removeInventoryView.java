
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class removeInventoryView extends javax.swing.JFrame {

    public removeInventoryView() {
        initComponents();
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Remove");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NewOrderLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        code = new javax.swing.JLabel();
        codeTXT = new javax.swing.JTextField();
        BtConfimOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));

        NewOrderLabel.setBackground(new java.awt.Color(0, 153, 102));
        NewOrderLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NewOrderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewOrderLabel.setText("Remove Product");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NewOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(NewOrderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        code.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        code.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        code.setText("Code:");

        codeTXT.setForeground(new java.awt.Color(153, 153, 153));
        codeTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTXTActionPerformed(evt);
            }
        });

        BtConfimOrder.setBackground(new java.awt.Color(153, 153, 153));
        BtConfimOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtConfimOrder.setText("REMOVE");
        BtConfimOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConfimOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(BtConfimOrder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(BtConfimOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codeTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTXTActionPerformed

    private void BtConfimOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConfimOrderActionPerformed

    }//GEN-LAST:event_BtConfimOrderActionPerformed


    public JButton getBtConfimOrder() {
        return BtConfimOrder;
    }

    public void setBtConfimOrder(JButton BtConfimOrder) {
        this.BtConfimOrder = BtConfimOrder;
    }

    public JLabel getNewOrderLabel() {
        return NewOrderLabel;
    }

    public void setNewOrderLabel(JLabel NewOrderLabel) {
        this.NewOrderLabel = NewOrderLabel;
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

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtConfimOrder;
    private javax.swing.JLabel NewOrderLabel;
    private javax.swing.JLabel code;
    private javax.swing.JTextField codeTXT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
