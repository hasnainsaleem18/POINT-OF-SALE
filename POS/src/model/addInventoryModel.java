package model;

import dataBase.DatabaseConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class addInventoryModel {
    
    private String ProductCode;
    private String productName;
    private String productUnit;
    private String productCategory;
    private Float productPrice;
    private Float productQuantity;

    public boolean saveToDatabase() {
        String sql = "INSERT INTO Inventory (Product_Code, Product_Name, Product_Unit, Product_Quantity, Product_Category, Product_Price) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, ProductCode);
            pstmt.setString(2, productName);
            pstmt.setString(3, productUnit);
            pstmt.setFloat(4, productQuantity);
            pstmt.setString(5, productCategory);
            pstmt.setFloat(6, productPrice);

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<addInventoryModel> fetchData() {
        String fetch = "SELECT * FROM Inventory"; // Update with your table name
        List<addInventoryModel> products = new ArrayList<>();

        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(fetch);
             ResultSet rs = preparedStatement.executeQuery()) {

            while (rs.next()) {
                addInventoryModel product = new addInventoryModel();
                product.setProductCode(rs.getString("product_code"));
                product.setProductName(rs.getString("product_name"));
                product.setProductCategory(rs.getString("product_category"));
                product.setProductQuantity(rs.getFloat("product_quantity"));
                product.setProductPrice(rs.getFloat("product_price"));
                product.setProductUnit(rs.getString("product_unit"));
                products.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    
    public List<addInventoryModel> searchByCode(String code) {
        List<addInventoryModel> products = new ArrayList<>();
        String query = "SELECT * FROM Inventory WHERE Product_Code = ?";
        try (Connection connection = DatabaseConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, code);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    addInventoryModel product = new addInventoryModel();
                    product.setProductCode(resultSet.getString("product_code"));
                    product.setProductName(resultSet.getString("product_name"));
                    product.setProductCategory(resultSet.getString("product_category"));
                    product.setProductQuantity(resultSet.getFloat("product_quantity"));
                    product.setProductPrice(resultSet.getFloat("product_price"));
                    product.setProductUnit(resultSet.getString("product_unit"));
                    products.add(product);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    // Method to search products by product name
    public List<addInventoryModel> searchByName(String name) {
        List<addInventoryModel> products = new ArrayList<>();
        String query = "SELECT * FROM Inventory WHERE Product_Name LIKE ?";
        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, "%" + name + "%");
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    addInventoryModel product = new addInventoryModel();
                    product.setProductCode(resultSet.getString("product_code"));
                    product.setProductName(resultSet.getString("product_name"));
                    product.setProductCategory(resultSet.getString("product_category"));
                    product.setProductQuantity(resultSet.getFloat("product_quantity"));
                    product.setProductPrice(resultSet.getFloat("product_price"));
                    product.setProductUnit(resultSet.getString("product_unit"));
                    products.add(product);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }
    
    public Float getProductQuantity() {
        
        return productQuantity;
    }

    public void setProductQuantity(Float productQuantity) {
        
        this.productQuantity = productQuantity;
        
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
}
