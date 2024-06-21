
package model;

import dataBase.DatabaseConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


// Admin subclass
public class AdminModel extends EmployeeModel 
{
    private boolean isAdmin;

    public AdminModel(String Emp_Name, String Username, String Password) 
    {
        super(Emp_Name, Username, Password);
        this.isAdmin = true; // Assume all Admins are indeed Admins
    }

    public boolean isAdmin() {
        return isAdmin;
    }
    
    public void updateAdmin(int id, String empName, String username, String password) {
        String query = "UPDATE Admin SET Name = ?, Username = ?, Password = ? WHERE Id = ?";
        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, empName);
            statement.setString(2, username);
            statement.setString(3, password);
            statement.setInt(4, id);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Admin updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating admin: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deleteAdmin(int id) {
        String query = "DELETE FROM Admin WHERE Id = ?";

        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Admin deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error deleting admin: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void addAdminToDatabase() {
        String query = "INSERT INTO Admin (Name, Username, Password) VALUES (?, ?, ?)";
        try (Connection connection = DatabaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, getEmp_Name());
            statement.setString(2, getUsername());
            statement.setString(3, getPassword());
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Admin added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding admin: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static List<AdminModel> loadAdminData() {
        List<AdminModel> adminList = new ArrayList<>();
        String query = "SELECT * FROM Admin"; 
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            // Loop through the result set and create AdminModel objects
            
            while (rs.next()) {
                int id = rs.getInt("Id");
                String name = rs.getString("Name");
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                AdminModel admin = new AdminModel(name, username, password);
                admin.setID(id);
                adminList.add(admin);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading Admin data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return adminList;
    }
}
