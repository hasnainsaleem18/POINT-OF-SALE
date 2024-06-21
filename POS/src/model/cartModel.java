package model;

import dataBase.DatabaseConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import view.cartView;
import model.model1;

public class cartModel {

    private String ProductCode;
    private String productName;
    private String productUnit;
    private String productCategory;
    private Float productPrice;
    private Float productQuantity;
    
    

    public void savePaymentDetails(float totalAmount) {
        String date = java.time.LocalDate.now().toString(); // Get current date
        int invoiceNo = generateInvoiceNo(); // Generate a unique invoice number
        int cashierId = model1.idd; // Get the cashier ID from the session

        String sql = "INSERT INTO Payment (Invoice_No, Total, Date, Cashier_Id) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, invoiceNo);
            pstmt.setFloat(2, totalAmount);
            pstmt.setString(3, date);
            pstmt.setInt(4, cashierId);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int generateInvoiceNo() {
        int invoiceNo = 1;
        String sql = "SELECT MAX(Invoice_No) FROM Payment";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            if (rs.next()) {
                invoiceNo = rs.getInt(1) + 1;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return invoiceNo;
    }

    public void updateInventoryDatabase(cartView c) {
    DefaultTableModel cartModel = (DefaultTableModel) c.getProductTable().getModel();
    int rowCount = cartModel.getRowCount();

    for (int row = 0; row < rowCount; row++) {
        String productCode = cartModel.getValueAt(row, 0).toString();
        float quantity = Float.parseFloat(cartModel.getValueAt(row, 2).toString());

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("UPDATE Inventory SET Product_Quantity = Product_Quantity - ? WHERE Product_Code = ?")) {
            pstmt.setFloat(1, quantity);
            pstmt.setString(2, productCode);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated."); // Print number of rows updated
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    public static List<String[]> getInventoryItems() {
        List<String[]> inventory = new ArrayList<>();
        try (Connection conn = DatabaseConfig.getConnection()) {
            String query = "SELECT Product_Code, Product_Name, Product_Unit, Product_Quantity, Product_Price FROM Inventory";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String code = rs.getString("Product_Code");
                String name = rs.getString("Product_Name");
                String unit = rs.getString("Product_Unit");
                String quantity = rs.getString("Product_Quantity");
                String price = rs.getString("Product_Price");

                inventory.add(new String[]{code, name, unit, quantity, price});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return inventory;
    }
    

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public Float getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Float productQuantity) {
        this.productQuantity = productQuantity;
    }
}
