package model;

import dataBase.DatabaseConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SupplyModel {
    
    private static final Map<String, String> searchCriteriaMapping;
    static {
        searchCriteriaMapping = new HashMap<>();
        searchCriteriaMapping.put("Order ID", "o.Order_Id");
        searchCriteriaMapping.put("Product", "o.Product");
        searchCriteriaMapping.put("Supplier Name", "s.Supplier_Name");
    }

    public List<Object[]> getSupplyData() {
        List<Object[]> data = new ArrayList<>();
        String query = "SELECT o.Order_Id, o.Product, o.Unit, o.MinimunQty, o.MaximumQty, o.Supplier_Id, s.Supplier_Id, s.Supplier_Name, s.Supplier_Contact, s.Supplier_Address " +
                       "FROM `Order` o JOIN Supplier s ON o.Supplier_Id = s.Supplier_Id";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                data.add(new Object[]{
                    rs.getInt("Order_Id"),
                    rs.getString("Product"),
                    rs.getString("Unit"),
                    rs.getInt("MinimunQty"),
                    rs.getInt("MaximumQty"),
                    rs.getInt("Supplier_Id"),
                    rs.getString("Supplier_Name"),
                    rs.getString("Supplier_Contact"),
                    rs.getString("Supplier_Address")
                });
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return data;
    }

    public List<Object[]> searchData(String searchCriteria, String searchValue) {
        List<Object[]> data = new ArrayList<>();
        String columnName = searchCriteriaMapping.get(searchCriteria);
        if (columnName == null) {
            throw new IllegalArgumentException("Invalid search criteria: " + searchCriteria);
        }
        String query = "SELECT o.Order_Id, o.Product, o.Unit, o.MinimunQty, o.MaximumQty, o.Supplier_Id, s.Supplier_Id, s.Supplier_Name, s.Supplier_Contact, s.Supplier_Address " +
                       "FROM `Order` o JOIN Supplier s ON o.Supplier_Id = s.Supplier_Id WHERE " + columnName + " LIKE ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, "%" + searchValue + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    data.add(new Object[]{
                        rs.getInt("Order_Id"),
                        rs.getString("Product"),
                        rs.getString("Unit"),
                        rs.getInt("MinimunQty"),
                        rs.getInt("MaximumQty"),
                        rs.getInt("Supplier_Id"),
                        rs.getString("Supplier_Name"),
                        rs.getString("Supplier_Contact"),
                        rs.getString("Supplier_Address")
                    });
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return data;
    }

    private static final Map<String, String> orderByCriteriaMapping;
    static {
        orderByCriteriaMapping = new HashMap<>();
        orderByCriteriaMapping.put("Order ID", "o.Order_Id");
        orderByCriteriaMapping.put("Product", "o.Product");
        orderByCriteriaMapping.put("Supplier Name", "s.Supplier_Name");
    }

    public List<Object[]> orderData(String orderByCriteria) {
        List<Object[]> data = new ArrayList<>();
        String columnName = orderByCriteriaMapping.get(orderByCriteria);
        if (columnName == null) {
            throw new IllegalArgumentException("Invalid order by criteria: " + orderByCriteria);
        }
        String query = "SELECT o.Order_Id, o.Product, o.Unit, o.MinimunQty, o.MaximumQty, o.Supplier_Id, s.Supplier_Id, s.Supplier_Name, s.Supplier_Contact, s.Supplier_Address " +
                       "FROM `Order` o JOIN Supplier s ON o.Supplier_Id = s.Supplier_Id ORDER BY " + columnName;
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                data.add(new Object[]{
                    rs.getInt("Order_Id"),
                    rs.getString("Product"),
                    rs.getString("Unit"),
                    rs.getInt("MinimunQty"),
                    rs.getInt("MaximumQty"),
                    rs.getInt("Supplier_Id"),
                    rs.getString("Supplier_Name"),
                    rs.getString("Supplier_Contact"),
                    rs.getString("Supplier_Address")
                });
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return data;
    }
}
