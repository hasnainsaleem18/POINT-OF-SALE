
package model;

import dataBase.DatabaseConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SupplierModel {
    private int supplierID;
    private String supplierName;
    private String supplierContact;
    private String address;

    public boolean saveToDatabase(){
        String query = "INSERT INTO Supplier (Supplier_Id, Supplier_Name, Supplier_Contact, Supplier_Address) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConfig.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, getSupplierID());
            stmt.setString(2, getSupplierName());
            stmt.setString(3, getSupplierContact());
            stmt.setString(4, getAddress());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean deleteSupplier(int supplierID) {
        String query = "DELETE FROM Supplier WHERE Supplier_Id = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, supplierID);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean updateSupplier(int supplierID, SupplierModel supplier) {
        String query = "UPDATE Supplier SET Supplier_Name = ?, Supplier_Contact = ?, Supplier_Address = ? WHERE Supplier_Id = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, supplier.getSupplierName());
            stmt.setString(2, supplier.getSupplierContact());
            stmt.setString(3, supplier.getAddress());
            stmt.setInt(4, supplierID);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public List<SupplierModel> getAllSuppliers() {
        List<SupplierModel> suppliers = new ArrayList<>();
        String query = "SELECT Supplier_Id, Supplier_Name, Supplier_Contact, Supplier_Address FROM Supplier";
        
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                SupplierModel supplier = new SupplierModel();
                supplier.setSupplierID(rs.getInt("Supplier_Id"));
                supplier.setSupplierName(rs.getString("Supplier_Name"));
                supplier.setSupplierContact(rs.getString("Supplier_Contact"));
                supplier.setAddress(rs.getString("Supplier_Address"));
                suppliers.add(supplier);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return suppliers;
    }

    // Mock method to get a supplier by ID
    public SupplierModel getSupplierById(int supplierID) {
        // Mock implementation, should be replaced with actual database query
        // For now, let's return a dummy supplier
        return new SupplierModel(); // Replace with actual logic
    }
    
    public List<Integer> getAllSupplierIDs() {
        List<Integer> supplierIDs = new ArrayList<>();
        String query = "SELECT Supplier_Id FROM Supplier";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                supplierIDs.add(rs.getInt("Supplier_Id"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return supplierIDs;
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierContact() {
        return supplierContact;
    }

    public void setSupplierContact(String supplierContact) {
        this.supplierContact = supplierContact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
