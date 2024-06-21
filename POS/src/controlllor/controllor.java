
package controlllor;

import view.loginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CashierModel;
import model.cartModel;
import model.model1;

public class controllor {
    
    private loginView view1;
    private model1 Model1;
    private CashierModel m;
    //private dashboardControllor dControllor;

    public controllor(loginView view1, model1 Model1) {
        this.view1 = view1;
        this.Model1 = Model1;
        cartModel m = new cartModel();
        
        view1.getSubmitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = view1.getUsertxt().getText().trim();
                String password = view1.getPasswordtxt().getText().trim(); // Ensure you get the password as a char array

                if (view1.getCashier().isSelected() && !view1.getAdmin().isSelected()) 
                {
                    if (Model1.checkCashierCredentials(username, password)) 
                    {
                        
                        
                        new dashboardControllor(); // Initialize dashboard controller for cashier
                    } 
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "Incorrect credentials, please try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
                    }
                } 
                else if (view1.getAdmin().isSelected() && !view1.getCashier().isSelected()) 
                {
                    if (Model1.checkAdminCredentials(username, password)) 
                    {
                        new dashboardControllor(); // Initialize dashboard controller for admin
                    } 
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "Incorrect credentials, please try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
                    }
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Kindly enter employee type, please try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });        
        view1.getCashier().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED)
                {
                    view1.getAdmin().setSelected(false);
                }
            }
        });
        
        
        view1.getAdmin().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED)
                {
                    view1.getCashier().setSelected(false);
                }
            }
        });
        
        
        
    }
    
   

    
    
    
}
