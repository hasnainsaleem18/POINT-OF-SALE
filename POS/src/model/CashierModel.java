package model;

// Cashier subclass of Employee

import dataBase.DatabaseConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CashierModel extends EmployeeModel {
    private double CashDrawer;

    public CashierModel(String Emp_Name, String Username, String Password) {
        super(Emp_Name, Username, Password);
        this.CashDrawer = 0.0;
    }
    
    
    public void addCashierToDatabase() {
        String query = "INSERT INTO Cashier (Name, Username, Password, CashDrawer) VALUES (?, ?, ?, ?)";
        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, getEmp_Name());
            statement.setString(2, getUsername());
            statement.setString(3, getPassword());
            statement.setDouble(4, CashDrawer);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cashier added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding cashier: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updateCashier(int id, String empName, String username, String password) {
        String query = "UPDATE Cashier SET Name = ?, Username = ?, Password = ? WHERE Id = ?";
        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, empName);
            statement.setString(2, username);
            statement.setString(3, password);
            statement.setInt(4, id);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cashier updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating cashier: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deleteCashier(int id) {
        String query = "DELETE FROM Cashier WHERE Id = ?";

        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(query))  {
            statement.setInt(1, id);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cashier deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error deleting cashier: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static List<CashierModel> loadCashierData() {
        List<CashierModel> cashierList = new ArrayList<>();
        String query = "SELECT * FROM Cashier"; 
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            // Loop through the result set and create AdminModel objects
            while (rs.next()) {
                CashierModel cashier = new CashierModel(rs.getString("Name"), rs.getString("Username"), rs.getString("Password"));
                cashier.setID(rs.getInt("Id"));
                cashier.setCashDrawer(rs.getDouble("CashDrawer"));
                cashierList.add(cashier);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading Admin data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return cashierList;
    }

    public void setCashDrawer(double cashDrawer) {
        this.CashDrawer = cashDrawer;
    }

    public void processSale(double amount) {
            CashDrawer += amount;
        }

    public double getCashDrawer() {
        return CashDrawer;
    }
}
