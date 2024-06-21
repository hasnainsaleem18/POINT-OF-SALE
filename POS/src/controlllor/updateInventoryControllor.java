
package controlllor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import model.updateInventoryModel;
import view.updateInventoryView;

public class updateInventoryControllor {
    
    private updateInventoryModel upModel;
    private inventoryControllor iControllor;
    
    public updateInventoryControllor(inventoryControllor iControllor) {
        
        this.iControllor = iControllor;
        updateInventoryView uInventoryView = new updateInventoryView();
        upModel = new updateInventoryModel();
        
        uInventoryView.getProductName().setEnabled(false);
        uInventoryView.getUnitField().setEnabled(false);
        uInventoryView.getQuantityTXT().setEnabled(false);
        uInventoryView.getPriceTXT().setEnabled(false);
        uInventoryView.getCategoryJumbo().setEnabled(false);
        uInventoryView.getBtConfimOrder().setEnabled(false);
        
        uInventoryView.getProductName().setForeground(Color.GRAY);
        uInventoryView.getProductName().setText("Panadol");
        
        uInventoryView.getCodeTXT().setForeground(Color.GRAY);
        uInventoryView.getCodeTXT().setText("1234");
        
        uInventoryView.getUnitField().setForeground(Color.GRAY);
        uInventoryView.getUnitField().setText("500mg, 100ml, 3.3oz");
        
        uInventoryView.getQuantityTXT().setForeground(Color.GRAY);
        uInventoryView.getQuantityTXT().setText("3");
        
        uInventoryView.getPriceTXT().setForeground(Color.GRAY);
        uInventoryView.getPriceTXT().setText("RS. 40");
        
        uInventoryView.getProductName().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (uInventoryView.getProductName().getText().equals("Panadol")) {
                    uInventoryView.getProductName().setText("");
                    uInventoryView.getProductName().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (uInventoryView.getProductName().getText().isEmpty()) {
                    uInventoryView.getProductName().setText("Panadol");
                    uInventoryView.getProductName().setForeground(Color.GRAY); 
                }
            }
        });
        
        uInventoryView.getCodeTXT().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (uInventoryView.getCodeTXT().getText().equals("1234")) {
                    uInventoryView.getCodeTXT().setText("");
                    uInventoryView.getCodeTXT().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (uInventoryView.getCodeTXT().getText().isEmpty()) {
                    uInventoryView.getCodeTXT().setText("1234");
                    uInventoryView.getCodeTXT().setForeground(Color.GRAY); 
                }
            }
        });
        
        uInventoryView.getUnitField().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (uInventoryView.getUnitField().getText().equals("500mg, 100ml, 3.3oz")) {
                    uInventoryView.getUnitField().setText("");
                    uInventoryView.getUnitField().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (uInventoryView.getUnitField().getText().isEmpty()) {
                    uInventoryView.getUnitField().setText("500mg, 100ml, 3.3oz");
                    uInventoryView.getUnitField().setForeground(Color.GRAY); 
                }
            }
        });
        
        uInventoryView.getQuantityTXT().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (uInventoryView.getQuantityTXT().getText().equals("3")) {
                    uInventoryView.getQuantityTXT().setText("");
                    uInventoryView.getQuantityTXT().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (uInventoryView.getQuantityTXT().getText().isEmpty()) {
                    uInventoryView.getQuantityTXT().setText("3");
                    uInventoryView.getQuantityTXT().setForeground(Color.GRAY); 
                }
            }
        });
        
        uInventoryView.getPriceTXT().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (uInventoryView.getPriceTXT().getText().equals("RS. 40")) {
                    uInventoryView.getPriceTXT().setText("");
                    uInventoryView.getPriceTXT().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (uInventoryView.getPriceTXT().getText().isEmpty()) {
                    uInventoryView.getPriceTXT().setText("RS. 40");
                    uInventoryView.getPriceTXT().setForeground(Color.GRAY); 
                }
            }
        });
        
        uInventoryView.getSearchButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String code = uInventoryView.getCodeTXT().getText().trim();
                if (upModel.verifyProductCode(code)) {
                    uInventoryView.getProductName().setEnabled(true);
                    uInventoryView.getUnitField().setEnabled(true);
                    uInventoryView.getQuantityTXT().setEnabled(true);
                    uInventoryView.getPriceTXT().setEnabled(true);
                    uInventoryView.getCategoryJumbo().setEnabled(true);
                    uInventoryView.getBtConfimOrder().setEnabled(true);
                } else {
                    uInventoryView.getCodeTXT().setText("1234");
                    uInventoryView.getCodeTXT().setForeground(Color.GRAY);
                    JOptionPane.showMessageDialog(null, "Invalid product code.", "Verification Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        uInventoryView.getBtConfimOrder().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String code = uInventoryView.getCodeTXT().getText().trim();
                if (upModel.verifyProductCode(code)) {
                    upModel.setProductName(uInventoryView.getProductName().getText());
                    upModel.setProductUnit(uInventoryView.getUnitField().getText());
                    String quantity = uInventoryView.getQuantityTXT().getText();
                    upModel.setProductQuantity(Float.parseFloat(quantity));
                    upModel.setProductCategory(uInventoryView.getCategoryJumbo().getSelectedItem().toString());
                    String price = uInventoryView.getPriceTXT().getText();
                    upModel.setProductPrice(Float.parseFloat(price));
                    
                    if (upModel.updateProduct(code)) {
                        JOptionPane.showMessageDialog(null, "Product updated successfully.", "Update Success", JOptionPane.INFORMATION_MESSAGE);
                        iControllor.refreshInventoryTable();
                        // Optionally, you can refresh the inventory table here
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to update product.", "Update Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                } else {
                    uInventoryView.getCodeTXT().setText("1234");
                    uInventoryView.getCodeTXT().setForeground(Color.GRAY);
                    JOptionPane.showMessageDialog(null, "Failed to update product.", "Update Error", JOptionPane.ERROR_MESSAGE);
                
                }
            }
        });
        
        
    }
    
}
