
package controlllor;

import dataBase.DatabaseConfig;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.cartModel;
import model.model1;
import view.cartView;
import view.inventoryView;

public class cartControllor {
    
    private cartView c;
    private cartModel m;
    private inventoryView iView;
    private inventoryControllor controllor;
    private int selectedCartRow = -1;

    public cartControllor(inventoryControllor controllor) {
        this.controllor = controllor;
        this.iView = controllor.getInventoryView();
        //iView = iView;
        cartView CView = new cartView();
        c = CView;
        cartModel model = new cartModel();
        m = model;
        
        c.getCodeField().setForeground(Color.GRAY);
        c.getCodeField().setText("Code");
        
        c.getProductName().setForeground(Color.GRAY);
        c.getProductName().setText("Product Name");
        
        c.getCodeField().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (c.getCodeField().getText().equals("Code")) {
                    c.getCodeField().setText("");
                    c.getCodeField().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (c.getCodeField().getText().isEmpty()) {
                    c.getCodeField().setText("Code");
                    c.getCodeField().setForeground(Color.GRAY); 
                }
            }
        });
        
        
        
        c.getProductName().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (c.getProductName().getText().equals("Product Name")) {
                    c.getProductName().setText("");
                    c.getProductName().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (c.getProductName().getText().isEmpty()) {
                    c.getProductName().setText("Product Name");
                    c.getProductName().setForeground(Color.GRAY); 
                }
            }
        });

        c.getButtonAdd().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleAddButton();
            }
        });
        
        c.getRefreshButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                DefaultTableModel cartModel = (DefaultTableModel) c.getProductTable().getModel();
                cartModel.setRowCount(0); //
                updateTotal();
            }
        });
        
        c.getButtomRemove().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (selectedCartRow == -1) 
                {
                    JOptionPane.showMessageDialog(c, "No item selected in the cart", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                DefaultTableModel cartModel = (DefaultTableModel) c.getProductTable().getModel();
                String productCode = cartModel.getValueAt(selectedCartRow, 0).toString();
                Float quantityToRemove = Float.valueOf(cartModel.getValueAt(selectedCartRow, 2).toString());

                // Remove the row from the cart
                cartModel.removeRow(selectedCartRow);

            // Find the corresponding row in the inventory table and update the quantity
                int rows = iView.getProductTable().getRowCount();
                for (int row = 0; row < rows; row++) 
                {
                    String code = iView.getProductTable().getValueAt(row, 0).toString();
                    if (code.equals(productCode)) {
                        Float availableQuantity = Float.valueOf(iView.getProductTable().getValueAt(row, 3).toString());
                        iView.getProductTable().setValueAt(availableQuantity + quantityToRemove, row, 3);
                        break;
                    }
                }

                updateTotal();
                // Reset the selected row index
                selectedCartRow = -1;
            }   
        });
        
        c.getUpdateButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                handleUpdateButton();
            }
        });
        
        c.getProductTable().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    selectedCartRow = c.getProductTable().getSelectedRow();
                }
            }
        });
        
        c.getProceedButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                handlePaymentButton();
            }
        });

        
    }
    
    
    public cartView getCartView() {
        return c;
    }
    
    private void handleUpdateButton() {
    if (selectedCartRow == -1) {
        JOptionPane.showMessageDialog(c, "No item selected in the cart", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    DefaultTableModel cartModel = (DefaultTableModel) c.getProductTable().getModel();
    String productCode = cartModel.getValueAt(selectedCartRow, 0).toString();
    Float currentQuantity = Float.valueOf(cartModel.getValueAt(selectedCartRow, 2).toString());
    String currentUnit = cartModel.getValueAt(selectedCartRow, 4).toString();

    // Prompt the user for new quantity
    String newQuantityStr = JOptionPane.showInputDialog(c, "Enter new quantity:", currentQuantity);
    if (newQuantityStr == null) {
        return; // User cancelled the input
    }

    Float newQuantity;
    try {
        newQuantity = Float.valueOf(newQuantityStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(c, "Invalid quantity", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Prompt the user for new unit (if applicable)
    String newUnit = JOptionPane.showInputDialog(c, "Enter new unit:", currentUnit);
    

    // Validate if the unit and quantity exist in the inventory
    boolean validInventory = false;
    int rows = iView.getProductTable().getRowCount();
    for (int row = 0; row < rows; row++) {
        String code = iView.getProductTable().getValueAt(row, 0).toString();
        if (code.equals(productCode)) {
            Float availableQuantity = Float.valueOf(iView.getProductTable().getValueAt(row, 3).toString());
            String inventoryUnit = iView.getProductTable().getValueAt(row, 5).toString(); // Assuming unit is in column index 4
            if (newUnit.equals(inventoryUnit) && newQuantity <= availableQuantity) {
                validInventory = true;
                // Adjust the inventory quantity based on the difference
                Float adjustedQuantity = availableQuantity - (newQuantity - currentQuantity);
                iView.getProductTable().setValueAt(adjustedQuantity, row, 3);
                break;
            }
        }
    }

    if (!validInventory) {
        JOptionPane.showMessageDialog(c, "Invalid unit or insufficient quantity in inventory", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Float price = Float.valueOf(cartModel.getValueAt(selectedCartRow, 3).toString()); // Assuming price is in column index 3
    Float newTotal = price * newQuantity;
    cartModel.setValueAt(newQuantity, selectedCartRow, 2);
    cartModel.setValueAt(newUnit, selectedCartRow, 4);
    cartModel.setValueAt(newTotal, selectedCartRow, 5); // Update the total column in the cart table

    updateTotal(); // Recalculate the total for all items in the cart
    // Reset the selected row index
    selectedCartRow = -1;
}
    
    private void handlePaymentButton() {
    DefaultTableModel cartModel = (DefaultTableModel) c.getProductTable().getModel();
    int rowCount = cartModel.getRowCount();

    if (rowCount == 0) {
        JOptionPane.showMessageDialog(c, "No items in the cart to process payment", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Generate receipt
    StringBuilder receipt = new StringBuilder();
    receipt.append("Receipt\n");
    receipt.append("===================\n");
    float totalAmount = 0;

    for (int row = 0; row < rowCount; row++) {
        String productCode = cartModel.getValueAt(row, 0).toString();
        String productName = cartModel.getValueAt(row, 1).toString();
        String productUnit = cartModel.getValueAt(row, 4).toString(); // Get product unit from the cart
        //String productCategory = getProductCategoryFromCode(productCode); // You need to implement this method
        float quantity = Float.parseFloat(cartModel.getValueAt(row, 2).toString());
        float price = Float.parseFloat(cartModel.getValueAt(row, 3).toString());
        float total = Float.parseFloat(cartModel.getValueAt(row, 5).toString());

        // Update sales record
       

        receipt.append("Name: " + productName + ", Quantity: " + quantity + ", Price: " + price + ", Total: " + total + "\n");
        totalAmount += total;

        // Update inventory
        int inventoryRows = iView.getProductTable().getRowCount();
        for (int i = 0; i < inventoryRows; i++) {
            if (iView.getProductTable().getValueAt(i, 0).toString().equals(productCode)) {
                float availableQuantity = Float.parseFloat(iView.getProductTable().getValueAt(i, 3).toString());
                iView.getProductTable().setValueAt(availableQuantity - quantity, i, 3);
                break;
            }
        }
    }

    receipt.append("===================\n");
    receipt.append("Total Amount: " + totalAmount + "\n");
    JOptionPane.showMessageDialog(c, receipt.toString(), "Receipt", JOptionPane.INFORMATION_MESSAGE);

    // Save payment details to the database
    m.savePaymentDetails(totalAmount);
    m.updateInventoryDatabase(c);

    // Clear the cart
    cartModel.setRowCount(0);
    updateTotal();
}
    
    



    private void handleAddButton() {
        String productCode = c.getCodeField().getText().trim();

        String productName = c.getProductName().getText().trim();


        //JTable inventoryTable = i.getInventoryTable();
        
        int rows = iView.getProductTable().getRowCount();

        int productRow = -1;

        for (int row = 0; row < rows; row++) {
            String code = iView.getProductTable().getValueAt(row, 0).toString();

            String name = iView.getProductTable().getValueAt(row, 1).toString();
            
            if (code.equals(productCode) || name.equals(productName)) {
                productRow = row;
                break;
            }
        }

        if (productRow == -1) {
            JOptionPane.showMessageDialog(c, "Product not found in inventory", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Float availableQuantity = Float.valueOf(iView.getProductTable().getValueAt(productRow, 3).toString());
        
        String quantityStr = JOptionPane.showInputDialog(c, "Enter quantity:");
        
        if (quantityStr == null) {
            return; // User cancelled the inpus
        }

        Float quantity;
        try {
            quantity = Float.valueOf(quantityStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(c, "Invalid quantity", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (quantity > availableQuantity) {
            JOptionPane.showMessageDialog(c, "Insufficient quantity in inventory", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        addToCart(iView.getProductTable(), productRow, quantity);
        updateTotal();
    }
    
    private void addToCart(JTable inventoryTable, int productRow, Float quantity) {
        Float availableQuantity = Float.valueOf(inventoryTable.getValueAt(productRow, 3).toString());
        Float price = Float.valueOf(inventoryTable.getValueAt(productRow, 4).toString()); // Assuming the price is in the 6th column (index 5)
        Float total = price * quantity;

        // Update inventory table
        inventoryTable.setValueAt(availableQuantity - quantity, productRow, 3);

        // Add to cart table
        DefaultTableModel cartModel = (DefaultTableModel) c.getProductTable().getModel();
        Object[] product = new Object[] {
            inventoryTable.getValueAt(productRow, 0),
            inventoryTable.getValueAt(productRow, 1),
            quantity,
            inventoryTable.getValueAt(productRow, 4),
            inventoryTable.getValueAt(productRow, 5),
            total // Add the total to the cart table row
        };
        cartModel.addRow(product);
    }
    
    private void updateTotal() {
        DefaultTableModel cartModel = (DefaultTableModel) c.getProductTable().getModel();
        int rowCount = cartModel.getRowCount();
        float total = 0;

        for (int row = 0; row < rowCount; row++) {
            total += Float.parseFloat(cartModel.getValueAt(row, 5).toString());
        }

        c.getTOTALTEXT().setText("" + total);
    }

    
}
