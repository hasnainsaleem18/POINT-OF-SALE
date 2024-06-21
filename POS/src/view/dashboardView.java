
package view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class dashboardView extends javax.swing.JFrame {
    
    Color DefaultColor, ClickColor, DefaultColor1;
    
    public dashboardView() {
        initComponents();
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Dashboard");
        setLocationRelativeTo(null);
        setVisible(true);
        
        DefaultColor = new Color(0,102,153);
        ClickColor = new Color(0,153,102);
        
        inventoryPannel.setBackground(DefaultColor);
        inventoryButton.setBackground(DefaultColor);
        
        cartButton.setBackground(DefaultColor);
        cartPannel.setBackground(DefaultColor);
        
        employeeButton.setBackground(DefaultColor);
        employee.setBackground(DefaultColor);
        
        orderButton.setBackground(DefaultColor);
        orderPannel.setBackground(DefaultColor);
        
        supplyButton.setBackground(DefaultColor);
        supplyPannel.setBackground(DefaultColor);
        
        supplierbutton.setBackground(DefaultColor);
        supplierpannel.setBackground(DefaultColor);
        
        DefaultColor1 = new Color(204,0,51);
        loginButton.setBackground(DefaultColor1);
  
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPannel = new javax.swing.JPanel();
        topPannel = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        leftPannel = new javax.swing.JPanel();
        cartPannel = new javax.swing.JPanel();
        cartButton = new javax.swing.JButton();
        inventoryPannel = new javax.swing.JPanel();
        inventoryButton = new javax.swing.JButton();
        orderPannel = new javax.swing.JPanel();
        orderButton = new javax.swing.JButton();
        supplyPannel = new javax.swing.JPanel();
        supplyButton = new javax.swing.JButton();
        employee = new javax.swing.JPanel();
        employeeButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        supplierpannel = new javax.swing.JPanel();
        supplierbutton = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backPannel.setBackground(new java.awt.Color(204, 204, 204));

        topPannel.setBackground(new java.awt.Color(0, 153, 102));

        dashboard.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        dashboard.setText("DASHBOARD");

        javax.swing.GroupLayout topPannelLayout = new javax.swing.GroupLayout(topPannel);
        topPannel.setLayout(topPannelLayout);
        topPannelLayout.setHorizontalGroup(
            topPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPannelLayout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(dashboard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPannelLayout.setVerticalGroup(
            topPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPannelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(dashboard)
                .addGap(22, 22, 22))
        );

        leftPannel.setBackground(new java.awt.Color(0, 102, 153));
        leftPannel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leftPannelMouseEntered(evt);
            }
        });

        cartPannel.setBackground(new java.awt.Color(0, 102, 153));
        cartPannel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cartPannelMouseEntered(evt);
            }
        });

        cartButton.setBackground(new java.awt.Color(0, 102, 153));
        cartButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        cartButton.setForeground(new java.awt.Color(255, 255, 255));
        cartButton.setText("Cart");
        cartButton.setBorder(null);
        cartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cartButtonMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout cartPannelLayout = new javax.swing.GroupLayout(cartPannel);
        cartPannel.setLayout(cartPannelLayout);
        cartPannelLayout.setHorizontalGroup(
            cartPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartPannelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cartPannelLayout.setVerticalGroup(
            cartPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cartButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        inventoryPannel.setBackground(new java.awt.Color(0, 102, 153));
        inventoryPannel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventoryPannelMouseEntered(evt);
            }
        });

        inventoryButton.setBackground(new java.awt.Color(0, 102, 153));
        inventoryButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        inventoryButton.setForeground(new java.awt.Color(255, 255, 255));
        inventoryButton.setText("Inventory");
        inventoryButton.setBorder(null);
        inventoryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventoryButtonMouseEntered(evt);
            }
        });
        inventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inventoryPannelLayout = new javax.swing.GroupLayout(inventoryPannel);
        inventoryPannel.setLayout(inventoryPannelLayout);
        inventoryPannelLayout.setHorizontalGroup(
            inventoryPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inventoryPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        inventoryPannelLayout.setVerticalGroup(
            inventoryPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inventoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        orderPannel.setBackground(new java.awt.Color(0, 102, 153));

        orderButton.setBackground(new java.awt.Color(0, 102, 153));
        orderButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        orderButton.setForeground(new java.awt.Color(255, 255, 255));
        orderButton.setText("Order");
        orderButton.setBorder(null);

        javax.swing.GroupLayout orderPannelLayout = new javax.swing.GroupLayout(orderPannel);
        orderPannel.setLayout(orderPannelLayout);
        orderPannelLayout.setHorizontalGroup(
            orderPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        orderPannelLayout.setVerticalGroup(
            orderPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        supplyPannel.setBackground(new java.awt.Color(0, 102, 153));

        supplyButton.setBackground(new java.awt.Color(0, 102, 153));
        supplyButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        supplyButton.setForeground(new java.awt.Color(255, 255, 255));
        supplyButton.setText("Supply");
        supplyButton.setBorder(null);

        javax.swing.GroupLayout supplyPannelLayout = new javax.swing.GroupLayout(supplyPannel);
        supplyPannel.setLayout(supplyPannelLayout);
        supplyPannelLayout.setHorizontalGroup(
            supplyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplyPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(supplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        supplyPannelLayout.setVerticalGroup(
            supplyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supplyButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        employee.setBackground(new java.awt.Color(0, 102, 153));

        employeeButton.setBackground(new java.awt.Color(0, 102, 153));
        employeeButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        employeeButton.setForeground(new java.awt.Color(255, 255, 255));
        employeeButton.setText("Employee");
        employeeButton.setBorder(null);

        javax.swing.GroupLayout employeeLayout = new javax.swing.GroupLayout(employee);
        employee.setLayout(employeeLayout);
        employeeLayout.setHorizontalGroup(
            employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(employeeButton)
                .addGap(18, 18, 18))
        );
        employeeLayout.setVerticalGroup(
            employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(employeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 153));

        loginButton.setBackground(new java.awt.Color(204, 0, 51));
        loginButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Logout");
        loginButton.setBorder(null);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        supplierpannel.setBackground(new java.awt.Color(0, 102, 153));

        supplierbutton.setBackground(new java.awt.Color(0, 102, 153));
        supplierbutton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        supplierbutton.setForeground(new java.awt.Color(255, 255, 255));
        supplierbutton.setText("Supplier");
        supplierbutton.setBorder(null);

        javax.swing.GroupLayout supplierpannelLayout = new javax.swing.GroupLayout(supplierpannel);
        supplierpannel.setLayout(supplierpannelLayout);
        supplierpannelLayout.setHorizontalGroup(
            supplierpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, supplierpannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(supplierbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        supplierpannelLayout.setVerticalGroup(
            supplierpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(supplierbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout leftPannelLayout = new javax.swing.GroupLayout(leftPannel);
        leftPannel.setLayout(leftPannelLayout);
        leftPannelLayout.setHorizontalGroup(
            leftPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supplyPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cartPannel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventoryPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(leftPannelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(supplierpannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPannelLayout.setVerticalGroup(
            leftPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPannelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(inventoryPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cartPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(supplyPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(employee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(supplierpannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        welcome.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        welcome.setText("Welcome To Gulz Pharmacy");

        javax.swing.GroupLayout backPannelLayout = new javax.swing.GroupLayout(backPannel);
        backPannel.setLayout(backPannelLayout);
        backPannelLayout.setHorizontalGroup(
            backPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backPannelLayout.createSequentialGroup()
                .addComponent(leftPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(welcome)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        backPannelLayout.setVerticalGroup(
            backPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPannelLayout.createSequentialGroup()
                .addComponent(topPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backPannelLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(welcome)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backPannelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(leftPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 578, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButtonActionPerformed
           
    }//GEN-LAST:event_inventoryButtonActionPerformed

    private void inventoryButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryButtonMouseEntered
   
    }//GEN-LAST:event_inventoryButtonMouseEntered

    private void leftPannelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftPannelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_leftPannelMouseEntered

    private void inventoryPannelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryPannelMouseEntered
        
    }//GEN-LAST:event_inventoryPannelMouseEntered

    private void cartButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMouseEntered

    }//GEN-LAST:event_cartButtonMouseEntered

    private void cartPannelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartPannelMouseEntered

    }//GEN-LAST:event_cartPannelMouseEntered

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    public Color getDefaultColor1() {
        return DefaultColor1;
    }

    public void setDefaultColor1(Color DefaultColor1) {
        this.DefaultColor1 = DefaultColor1;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JButton getSupplierbutton() {
        return supplierbutton;
    }

    public void setSupplierbutton(JButton supplierbutton) {
        this.supplierbutton = supplierbutton;
    }

    public JPanel getSupplierpannel() {
        return supplierpannel;
    }

    public void setSupplierpannel(JPanel supplierpannel) {
        this.supplierpannel = supplierpannel;
    }

    public JButton getSupplyButton() {
        return supplyButton;
    }

    public void setSupplyButton(JButton supplyButton) {
        this.supplyButton = supplyButton;
    }

    public JPanel getSupplyPannel() {
        return supplyPannel;
    }

    public void setSupplyPannel(JPanel supplyPannel) {
        this.supplyPannel = supplyPannel;
    }

    public JPanel getOrderPannel() {
        return orderPannel;
    }

    public void setOrderPannel(JPanel orderPannel) {
        this.orderPannel = orderPannel;
    }

    public JPanel getEmployee() {
        return employee;
    }

    public void setEmployee(JPanel employee) {
        this.employee = employee;
    }

    public JButton getEmployeeButton() {
        return employeeButton;
    }

    public JButton getOrderButton() {
        return orderButton;
    }

    public void setOrderButton(JButton orderButton) {
        this.orderButton = orderButton;
    }

    
    public Color getDefaultColor() {
        return DefaultColor;
    }

    public void setDefaultColor(Color DefaultColor) {
        this.DefaultColor = DefaultColor;
    }

    public Color getClickColor() {
        return ClickColor;
    }

    public void setClickColor(Color ClickColor) {
        this.ClickColor = ClickColor;
    }

    public JPanel getBackPannel() {
        return backPannel;
    }

    public void setBackPannel(JPanel backPannel) {
        this.backPannel = backPannel;
    }

    public JButton getCartButton() {
        return cartButton;
    }

    public void setCartButton(JButton cartButton) {
        this.cartButton = cartButton;
    }

    public JPanel getCartPannel() {
        return cartPannel;
    }

    public void setCartPannel(JPanel cartPannel) {
        this.cartPannel = cartPannel;
    }

    public JLabel getDashboard() {
        return dashboard;
    }

    public void setDashboard(JLabel dashboard) {
        this.dashboard = dashboard;
    }

    public JButton getInventoryButton() {
        return inventoryButton;
    }

    public void setInventoryButton(JButton inventoryButton) {
        this.inventoryButton = inventoryButton;
    }

    public JPanel getInventoryPannel() {
        return inventoryPannel;
    }

    public void setInventoryPannel(JPanel inventoryPannel) {
        this.inventoryPannel = inventoryPannel;
    }

    public JPanel getLeftPannel() {
        return leftPannel;
    }

    public void setLeftPannel(JPanel leftPannel) {
        this.leftPannel = leftPannel;
    }


    public JPanel getTopPannel() {
        return topPannel;
    }

    public void setTopPannel(JPanel topPannel) {
        this.topPannel = topPannel;
    }

    public JLabel getWelcome() {
        return welcome;
    }

    public void setWelcome(JLabel welcome) {
        this.welcome = welcome;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPannel;
    private javax.swing.JButton cartButton;
    private javax.swing.JPanel cartPannel;
    private javax.swing.JLabel dashboard;
    private javax.swing.JPanel employee;
    private javax.swing.JButton employeeButton;
    private javax.swing.JButton inventoryButton;
    private javax.swing.JPanel inventoryPannel;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel leftPannel;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JPanel orderPannel;
    private javax.swing.JButton supplierbutton;
    private javax.swing.JPanel supplierpannel;
    private javax.swing.JButton supplyButton;
    private javax.swing.JPanel supplyPannel;
    private javax.swing.JPanel topPannel;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
