
package controlllor;

import java.awt.Color;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.addInventoryModel;
import view.addInventoryView;
import view.dashboardView;
import view.inventoryView;

public class inventoryControllor {
    
    private inventoryView v;
    //private dashboardView view;

    public inventoryControllor() {

//        dashboardView dview = new dashboardView();
//        view = dview;
//        view.setVisible(false);
        
        inventoryView iView = new inventoryView();
        v = iView;
        refreshInventoryTable();
        
//        
//        Color CColor = view.getClickColor();
//        //Color DColor = view.getDefaultColor();
//        
//        view.getInventoryButton().setBackground(CColor);
//        view.getInventoryPannel().setBackground(CColor);
        
        iView.getCodeField().setForeground(Color.GRAY);
        iView.getCodeField().setText("Code");
        
        iView.getProductName().setForeground(Color.GRAY);
        iView.getProductName().setText("Product Name");
        
        
        iView.getCodeField().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (iView.getCodeField().getText().equals("Code")) {
                    iView.getCodeField().setText("");
                    iView.getCodeField().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (iView.getCodeField().getText().isEmpty()) {
                    iView.getCodeField().setText("Code");
                    iView.getCodeField().setForeground(Color.GRAY); 
                }
            }
        });
        
        
        iView.getProductName().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (iView.getProductName().getText().equals("Product Name")) {
                    iView.getProductName().setText("");
                    iView.getProductName().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (iView.getProductName().getText().isEmpty()) {
                    iView.getProductName().setText("Product Name");
                    iView.getProductName().setForeground(Color.GRAY); 
                }
            }
        });
        
        iView.getButtonAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //inventoryControllor v = null;
                addInventoryControllor aInventoryControllor = new addInventoryControllor(inventoryControllor.this);
                
            }
        });
        
        iView.getButtomRemove().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //inventoryControllor v = null;
                removeInventoryControllor rInventoryControllor = new removeInventoryControllor(inventoryControllor.this);
                
            }
        });
        
        iView.getUpdateButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //inventoryControllor v = null;
                updateInventoryControllor uInventoryControllor = new updateInventoryControllor(inventoryControllor.this);
                
            }
        });
        
        iView.getRefreshButton().addActionListener(new ActionListener() { // Add this block
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshInventoryTable();
            }
        });
        
        iView.getProductSearch().addActionListener(new ActionListener() { // Add this block
            @Override
            public void actionPerformed(ActionEvent e) {
                String code = iView.getCodeField().getText().trim();
                String productName = iView.getProductName().getText().trim();
                if (!code.equals("Code")) {
                    //System.out.println("jjjj");
                    searchByCode(code);
                } else if (!productName.equals("Product Name")) {
                    searchByName(productName);
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter product code or product name to search.", "Search Error", JOptionPane.ERROR_MESSAGE);
                }
            }
                
            
        });
    
    }

    public void searchByCode(String code) {
            DefaultTableModel model = (DefaultTableModel) v.getProductTable().getModel();
            model.setRowCount(0); // Clear existing data

            addInventoryModel inventoryModel = new addInventoryModel();
            List<addInventoryModel> products = inventoryModel.searchByCode(code); // Fetch products from the database

            for (addInventoryModel product : products) {
                model.addRow(new Object[]{
                    product.getProductCode(),
                    product.getProductName(),
                    product.getProductCategory(),
                    product.getProductQuantity(),
                    product.getProductPrice(),
                    product.getProductUnit()
                });
            }
    }

    public void searchByName(String name) {
        DefaultTableModel model = (DefaultTableModel) v.getProductTable().getModel();
        model.setRowCount(0); // Clear existing data

        addInventoryModel inventoryModel = new addInventoryModel();
        List<addInventoryModel> products = inventoryModel.searchByName(name); // Fetch products from the database

        for (addInventoryModel product : products) {
            model.addRow(new Object[]{
                product.getProductCode(),
                product.getProductName(),
                product.getProductCategory(),
                product.getProductQuantity(),
                product.getProductPrice(),
                product.getProductUnit()
            });
        }
    }
    
    public inventoryView getInventoryView() {
        return v;
    }
    
    public void refreshInventoryTable() {
        DefaultTableModel model = (DefaultTableModel) v.getProductTable().getModel();
        model.setRowCount(0); // Clear existing data
        
        addInventoryModel inventoryModel = new addInventoryModel();
        List<addInventoryModel> products = inventoryModel.fetchData(); // Fetch products from the database
        
        for (addInventoryModel product : products) {
            model.addRow(new Object[]{
                product.getProductCode(), 
                product.getProductName(), 
                product.getProductCategory(), 
                product.getProductQuantity(), 
                product.getProductPrice(), 
                product.getProductUnit()
            });
        }
    }
    
    public void addToInventoryTable(String code, String productName, String Category, String quantity, String price, String unit ) {
        
        DefaultTableModel model = (DefaultTableModel) v.getProductTable().getModel();
        
        model.addRow(new Object[]{code, productName, Category, quantity, price, unit});
        refreshInventoryTable();
    }
    
    public boolean removeInventoryTable(String code) {
        refreshInventoryTable();
        boolean isProductFound = false;
        for (int i = 0; i < v.getProductTable().getRowCount(); i++) {
            String productCode = (String) v.getProductTable().getValueAt(i, 0);
            if (productCode.equals(code)) {
                isProductFound = true;
                ((DefaultTableModel) v.getProductTable().getModel()).removeRow(i);
                refreshInventoryTable();
                break; 
            }
        }

        if (!isProductFound) {
            JOptionPane.showMessageDialog(null, "Product not found in inventory.");
        }
        
        return isProductFound;
    }
    
    
}
