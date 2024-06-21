
package model;

import dataBase.DatabaseConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class updateInventoryModel {
    
    private String productName;
    private String productUnit;
    private String productCategory;
    private Float productPrice;
    private Float productQuantity;
    
    public boolean verifyProductCode(String code) {
        String query = "SELECT * FROM inventory WHERE Product_Code = ?";
        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, code);
            try (ResultSet rs = preparedStatement.executeQuery()) {
                return rs.next();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    
    public boolean updateProduct(String code) {
        String query = "UPDATE inventory SET Product_Name = ?, Product_Unit = ?, Product_Quantity = ?, Product_Category = ?, Product_Price = ? WHERE Product_Code = ?";
        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, productName);
            preparedStatement.setString(2, productUnit);
            preparedStatement.setFloat(3, productQuantity);
            preparedStatement.setString(4, productCategory);
            preparedStatement.setFloat(5, productPrice);
            preparedStatement.setString(6, code);
            int affectedRows = preparedStatement.executeUpdate();
            return affectedRows > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

   
    
    public Float getProductQuantity() {
        
        return productQuantity;
    }

    public void setProductQuantity(Float productQuantity) {
        
        this.productQuantity = productQuantity;
        
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
