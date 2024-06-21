package controlllor;

import model.OrderModel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.List;
import view.PlaceOrderView;

import java.util.Random;
import javax.swing.JOptionPane;
import model.SupplierModel;

public class PlaceOrderController {

    private PlaceOrderView placeOrderView;
    private OrderModel orderModel;
    private SupplierModel sm;

    public PlaceOrderController() {
        
       PlaceOrderView pview = new PlaceOrderView();
       placeOrderView = pview;
       OrderModel newOrder = new OrderModel();
       orderModel = newOrder;
       SupplierModel supplierModel = new SupplierModel();
       sm = supplierModel;
       

        placeOrderView.getOrderIDField().addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                generateUniqueOrderID();
            }

            @Override
            public void focusLost(FocusEvent e) {
                
                }
            
        });
        
        placeOrderView.getBtConfimOrder().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                confirmOrder();
                
                
            }
        });
        
        showPlaceOrderView();

    }

    void showPlaceOrderView() {
        placeOrderView.setVisible(true);
        placeOrderView.setLocationRelativeTo(null);
       
        List<Integer> supplierIDs = sm.getAllSupplierIDs();
        //placeOrderView.setjComboBox1(supplierIDs);
        placeOrderView.populateSupplierComboBox(supplierIDs);
    }

    private void closePlaceOrderView() {
        placeOrderView.dispose();
    }


    
     public void confirmOrder() {
            // Get order details from the view
            String productName = placeOrderView.getProductName();
            String unit = placeOrderView.getUnit();
            int minQuantity = Integer.parseInt(placeOrderView.getMinQuantity());
            int maxQuantity = Integer.parseInt(placeOrderView.getMaxQuantity());
            String supplierid = placeOrderView.getSupplier();
            int orderId = Integer.parseInt(placeOrderView.getOrderIDField().getText());
            int id = Integer.parseInt(supplierid);
             if (validateInput()) {
            // Create a new OrderModel object with the order details
            
            orderModel.setOrderNo(orderId);
            orderModel.setMaxQty(maxQuantity);
            orderModel.setMinQty(minQuantity);
            orderModel.setSupplier(id);
            orderModel.setUnit(unit);
            orderModel.setProductName(productName);

            if (orderModel.saveOrderToDatabase()) {
                JOptionPane.showMessageDialog(null, "Order added successfully");
            } else {
               JOptionPane.showMessageDialog(null, "Order not added.");
            }
        }
    }
    
    private void generateUniqueOrderID() {
        int orderId = 0;
        boolean uniqueIDFound = false;
        while (!uniqueIDFound) {
            orderId = generateRandomOrderId();
            if (!orderModel.isOrderIdExistsInDatabase(orderId)) {
                //orderModel.setOrderNo(orderId);
                placeOrderView.setOrderIDField(orderId);
                uniqueIDFound = true;
            }
        }
     
    }

    private int generateRandomOrderId() {
        // Generate a random order ID
        return new Random().nextInt(10000) + 1;
    }

   private boolean validateInput() {
    // Get input values from the view
    String productName = placeOrderView.getProductName();
    String unit = placeOrderView.getUnit();
    String minQuantity = placeOrderView.getMinQuantity();
    String maxQuantity = placeOrderView.getMaxQuantity();
    String supplierName = placeOrderView.getSupplier();

    // Check if any field is empty
    if (productName.isEmpty() || unit.isEmpty() || minQuantity.isEmpty() || maxQuantity.isEmpty() || supplierName.isEmpty()) {
        JOptionPane.showMessageDialog(placeOrderView, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validate quantity fields as integers
    try {
        int minQty = Integer.parseInt(minQuantity);
        int maxQty = Integer.parseInt(maxQuantity);

        // Check if max quantity is greater than or equal to min quantity
        if (maxQty < minQty) {
            JOptionPane.showMessageDialog(placeOrderView, "Max quantity must be greater than or equal to min quantity!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(placeOrderView, "Quantity must be a valid integer!", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Other validation rules can be added as needed

    return true; // Return true if all validations pass
}
}
