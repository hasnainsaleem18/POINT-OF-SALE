package model;

import dataBase.DatabaseConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class OrderModel {
   
    private int orderNo;
    private LocalDate orderDate;
    private String productName;
    private String Unit;
    private int MinQty;
    private int MaxQty;
    private int supplier;

    public boolean saveOrderToDatabase() {
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO `Order` (Order_Id, Product, Unit, MinimunQty, MaximumQty, Supplier_Id) VALUES (?, ?, ?, ?, ?, ?)")) {
            stmt.setInt(1, getOrderNumber());
            stmt.setString(2, getProductName());
            stmt.setString(3, getUnit());
            stmt.setInt(4, getMinQty());
            stmt.setInt(5, getMaxQty());
            stmt.setInt(6, getSupplier());
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean isOrderIdExistsInDatabase(int orderId) {
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT Order_Id FROM `Order` WHERE Order_Id = ?")) {
            stmt.setInt(1, orderId);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public int getOrderNumber() {
        return orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getProductName() {
        return productName;
    }

    public String getUnit() {
        return Unit;
    }

    public int getSupplier() {
        return supplier;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public void setOrderDate() {
        this.orderDate = LocalDate.now();
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUnit(String Unit){
        this.Unit = Unit;
    }

    public int getMinQty() {
        return MinQty;
    }

    public void setMinQty(int MinQty) {
        this.MinQty = MinQty;
    }

    public int getMaxQty() {
        return MaxQty;
    }

    public void setMaxQty(int MaxQty) {
        this.MaxQty = MaxQty;
    }
   
    public void setSupplier(int supplier) {
        this.supplier = supplier;
    }
}
