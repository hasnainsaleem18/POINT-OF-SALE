
package view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class loginView extends javax.swing.JFrame {
    
    public loginView() {
        initComponents();
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setSize(400, 350);
        setTitle("Authentication");
        setLocationRelativeTo(null);
        setVisible(true);
        //setContentPane(contentPane);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        topPannel = new javax.swing.JPanel();
        logintxt = new javax.swing.JLabel();
        baclPannel = new javax.swing.JPanel();
        cashier = new javax.swing.JCheckBox();
        employee = new javax.swing.JLabel();
        admin = new javax.swing.JCheckBox();
        username = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));

        topPannel.setBackground(new java.awt.Color(0, 153, 102));

        logintxt.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        logintxt.setText(" LOGIN PAGE");

        javax.swing.GroupLayout topPannelLayout = new javax.swing.GroupLayout(topPannel);
        topPannel.setLayout(topPannelLayout);
        topPannelLayout.setHorizontalGroup(
            topPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        topPannelLayout.setVerticalGroup(
            topPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPannelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logintxt)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        baclPannel.setBackground(new java.awt.Color(0, 102, 153));

        cashier.setForeground(new java.awt.Color(255, 255, 255));
        cashier.setText("Cashier");
        cashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierActionPerformed(evt);
            }
        });

        employee.setForeground(new java.awt.Color(255, 255, 255));
        employee.setText("Employee:");

        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("User name:");

        usertxt.setBackground(new java.awt.Color(204, 204, 204));
        usertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertxtActionPerformed(evt);
            }
        });

        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password:");

        passwordtxt.setBackground(new java.awt.Color(204, 204, 204));
        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(102, 153, 255));
        submitButton.setText("Login");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout baclPannelLayout = new javax.swing.GroupLayout(baclPannel);
        baclPannel.setLayout(baclPannelLayout);
        baclPannelLayout.setHorizontalGroup(
            baclPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baclPannelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(baclPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submitButton)
                    .addGroup(baclPannelLayout.createSequentialGroup()
                        .addGroup(baclPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(baclPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(username)
                                .addComponent(employee)))
                        .addGap(18, 18, 18)
                        .addGroup(baclPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(baclPannelLayout.createSequentialGroup()
                                .addComponent(admin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cashier)))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        baclPannelLayout.setVerticalGroup(
            baclPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baclPannelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(baclPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employee)
                    .addComponent(admin)
                    .addComponent(cashier))
                .addGap(30, 30, 30)
                .addGroup(baclPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(baclPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(baclPannel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(topPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(baclPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertxtActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminActionPerformed

    private void cashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashierActionPerformed

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtxtActionPerformed

    public JCheckBox getAdmin() {
        return admin;
    }

    public void setAdmin(JCheckBox admin) {
        this.admin = admin;
    }

    public JCheckBox getCashier() {
        return cashier;
    }

    public void setCashier(JCheckBox cashier) {
        this.cashier = cashier;
    }

    public JLabel getPassword() {
        return password;
    }
    public void setPassword(JLabel password) {
        this.password = password;
    }

    public JTextField getPasswordtxt() {
        return passwordtxt;
    }

    public void setPasswordtxt(JTextField passwordtxt) {
        this.passwordtxt = passwordtxt;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }

    public JLabel getUsername() {
        return username;
    }

    public void setUsername(JLabel username) {
        this.username = username;
    }

    public JTextField getUsertxt() {
        return usertxt;
    }

    public void setUsertxt(JTextField usertxt) {
        this.usertxt = usertxt;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox admin;
    private javax.swing.JPanel baclPannel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JCheckBox cashier;
    private javax.swing.JLabel employee;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logintxt;
    private javax.swing.JLabel password;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JButton submitButton;
    private javax.swing.JPanel topPannel;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
