
package controlllor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import model.addInventoryModel;
import view.addInventoryView;
import view.inventoryView;

public class addInventoryControllor {
    
    private addInventoryModel addModel;
    private inventoryControllor iControllor;

    public addInventoryControllor(inventoryControllor iControllor) {
        
        this.iControllor = iControllor;
        addInventoryView aInventoryView = new addInventoryView();
        addModel = new addInventoryModel();
        
        aInventoryView.getProductName().setForeground(Color.GRAY);
        aInventoryView.getProductName().setText("Panadol");
        
        aInventoryView.getCodeTXT().setForeground(Color.GRAY);
        aInventoryView.getCodeTXT().setText("1234");
        
        aInventoryView.getUnitField().setForeground(Color.GRAY);
        aInventoryView.getUnitField().setText("500mg, 100ml, 3.3oz");
        
        aInventoryView.getQuantityTXT().setForeground(Color.GRAY);
        aInventoryView.getQuantityTXT().setText("3");
        
        aInventoryView.getPriceTXT().setForeground(Color.GRAY);
        aInventoryView.getPriceTXT().setText("RS. 40");
        
        aInventoryView.getProductName().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (aInventoryView.getProductName().getText().equals("Panadol")) {
                    aInventoryView.getProductName().setText("");
                    aInventoryView.getProductName().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (aInventoryView.getProductName().getText().isEmpty()) {
                    aInventoryView.getProductName().setText("Panadol");
                    aInventoryView.getProductName().setForeground(Color.GRAY); 
                }
            }
        });
        
        aInventoryView.getCodeTXT().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (aInventoryView.getCodeTXT().getText().equals("1234")) {
                    aInventoryView.getCodeTXT().setText("");
                    aInventoryView.getCodeTXT().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (aInventoryView.getCodeTXT().getText().isEmpty()) {
                    aInventoryView.getCodeTXT().setText("1234");
                    aInventoryView.getCodeTXT().setForeground(Color.GRAY); 
                }
            }
        });
        
        aInventoryView.getUnitField().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (aInventoryView.getUnitField().getText().equals("500mg, 100ml, 3.3oz")) {
                    aInventoryView.getUnitField().setText("");
                    aInventoryView.getUnitField().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (aInventoryView.getUnitField().getText().isEmpty()) {
                    aInventoryView.getUnitField().setText("500mg, 100ml, 3.3oz");
                    aInventoryView.getUnitField().setForeground(Color.GRAY); 
                }
            }
        });
        
        aInventoryView.getQuantityTXT().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (aInventoryView.getQuantityTXT().getText().equals("3")) {
                    aInventoryView.getQuantityTXT().setText("");
                    aInventoryView.getQuantityTXT().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (aInventoryView.getQuantityTXT().getText().isEmpty()) {
                    aInventoryView.getQuantityTXT().setText("3");
                    aInventoryView.getQuantityTXT().setForeground(Color.GRAY); 
                }
            }
        });
        
        aInventoryView.getPriceTXT().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (aInventoryView.getPriceTXT().getText().equals("RS. 40")) {
                    aInventoryView.getPriceTXT().setText("");
                    aInventoryView.getPriceTXT().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (aInventoryView.getPriceTXT().getText().isEmpty()) {
                    aInventoryView.getPriceTXT().setText("RS. 40");
                    aInventoryView.getPriceTXT().setForeground(Color.GRAY); 
                }
            }
        });
        
        
        aInventoryView.getBtConfimOrder().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                addModel.setProductCode(aInventoryView.getCodeTXT().getText());
                addModel.setProductName(aInventoryView.getProductName().getText());
                addModel.setProductUnit(aInventoryView.getUnitField().getText());
                String quantity = aInventoryView.getQuantityTXT().getText();
                addModel.setProductQuantity(Float.parseFloat(quantity));
                addModel.setProductCategory(aInventoryView.getCategoryJumbo().getSelectedItem().toString());
                String price = aInventoryView.getPriceTXT().getText();
                addModel.setProductPrice(Float.parseFloat(price));
                
                if (addModel.saveToDatabase()) {
                    iControllor.addToInventoryTable(addModel.getProductCode(), addModel.getProductName(), addModel.getProductCategory(), addModel.getProductQuantity().toString(), addModel.getProductPrice().toString(), addModel.getProductUnit());
                    JOptionPane.showMessageDialog(null, "Product added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to add product.", "Error", JOptionPane.ERROR_MESSAGE);
                }
           
            }
        });
        
        
    }
    
    
    
}
