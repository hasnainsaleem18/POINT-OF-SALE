
package model;

import dataBase.DatabaseConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class removeInventoryModel {
    
    private String ProductCode;
    
    public boolean remove() {
        
        String sql = "DELETE FROM inventory WHERE Product_Code = ?";
        try (Connection conn = DatabaseConfig.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, ProductCode);
            
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }
}
