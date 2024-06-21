
package model;

import dataBase.DatabaseConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class model1 {
  
    public static int idd;
    private String usernameAdmin;
    private String passwordAdmin;
    private String usernameCashier;
    private String passwordCashier;
    
    
     public int getId() {
        return idd;
    }
    public void setId(int id) {
        idd = id;
    }
    
    
    public boolean checkAdminCredentials(String username, String password) {
        String query = "SELECT * FROM Admin WHERE Username = ? AND Password = ?";
        try (Connection connection = DatabaseConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            
            try (ResultSet rs = preparedStatement.executeQuery()) {
                return rs.next();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void login(String username, String password) {
    String sql = "SELECT Id FROM Cashier WHERE Username = ? AND Password = ?";
    try (Connection conn = DatabaseConfig.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            int cashierId = rs.getInt("Id");
            setId(cashierId);
        } else {
            // Handle invalid login
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    
    public boolean checkCashierCredentials(String username, String password) {
        String query = "SELECT * FROM Cashier WHERE Username = ? AND Password = ?";
        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            login(username, password);
            try (ResultSet rs = preparedStatement.executeQuery()) {
                return rs.next();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getUsernameAdmin() {
        return usernameAdmin;
    }

    public void setUsernameAdmin(String usernameAdmin) {
        this.usernameAdmin = usernameAdmin;
    }

    public String getPasswordAdmin() {
        return passwordAdmin;
    }

    public void setPasswordAdmin(String passwordAdmin) {
        this.passwordAdmin = passwordAdmin;
    }

    public String getUsernameCashier() {
        return usernameCashier;
    }

    public void setUsernameCashier(String usernameCashier) {
        this.usernameCashier = usernameCashier;
    }

    public String getPasswordCashier() {
        return passwordCashier;
    }

    public void setPasswordCashier(String passwordCashier) {
        this.passwordCashier = passwordCashier;
    }    
}
