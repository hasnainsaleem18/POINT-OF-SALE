package controlllor;

import model.SupplierModel;
import view.SupplierView;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

public class SupplierController {
    private SupplierView view;
    private SupplierModel model;

    public SupplierController() {
        SupplierView v = new SupplierView();
        SupplierModel m = new SupplierModel();
        view = v;
        model = m;
        
        view.getBtAdd().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Prompt for supplier ID and validate it
                    String idInput = JOptionPane.showInputDialog(view, "Enter supplier ID:");
                    int id = Integer.parseInt(idInput);  // Parse the ID, assuming it's an integer
                    if (id <= 0) {
                        throw new NumberFormatException("Supplier ID must be positive");
                    }

                    // Prompt for supplier name
                    String supplierName = JOptionPane.showInputDialog(view, "Enter supplier name:");
                    if (supplierName == null || supplierName.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(view, "Supplier name cannot be empty.");
                        return;
                    }

                    // Prompt for supplier contact with validation
                    String supplierContact;
                    while (true) {
                        supplierContact = JOptionPane.showInputDialog(view, "Enter supplier contact (+92-xxxxxxxxxx):");
                        if (supplierContact.matches("\\+92-\\d{10}")) {
                            break;
                        } else {
                            JOptionPane.showMessageDialog(view, "Invalid contact format. Please enter in the format +92-xxxxxxxxxx.");
                        }
                    }

                    // Prompt for address
                    String address = JOptionPane.showInputDialog(view, "Enter address:");
                    if (address == null || address.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(view, "Address cannot be empty.");
                        return;
                    }
                     
                    model.setSupplierID(id);
                    model.setSupplierName(supplierName);
                    model.setAddress(address);
                    model.setSupplierContact(supplierContact);
                    
                    if (model.saveToDatabase())
                    {
                        JOptionPane.showMessageDialog(view, "Supplier added successfully.");
                        loadTableData();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(view, "Supplier not added successfully.");
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(view, "Invalid supplier ID. Please enter a valid integer.");
                }
            }
        });
        
        view.getBtDelete().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int selectedRow = view.getSelectedRowIndex();
                    if (selectedRow >= 0) {
                        int confirmation = view.showConfirmationMessage("Are you sure you want to delete this supplier?");
                        if (confirmation == JOptionPane.YES_OPTION) {
                            int supplierID = (int) view.getSupplierTable().getValueAt(selectedRow, 0);
                            if (model.deleteSupplier(supplierID)) {
                                loadTableData();
                                view.showMessage("Supplier deleted successfully.");
                            } else {
                                view.showMessage("Failed to delete supplier.");
                            }
                        }
                    } else {
                        view.showMessage("Please select a supplier to delete.");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    view.showMessage("An error occurred while trying to delete the supplier.");
                }
            }
        });
        
        view.getBtUpdate().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = view.getSelectedRowIndex();
                if (selectedRow >= 0) {
                    int supplierID = (int) view.getSupplierTable().getValueAt(selectedRow, 0);
                    SupplierModel existingSupplier = model.getSupplierById(supplierID);
                    if (existingSupplier != null) {
                        String[] supplierData = view.getSupplierDataFromUser();
                        String supplierName = supplierData[0].isEmpty() ? existingSupplier.getSupplierName() : supplierData[0];
                        String supplierContact = supplierData[1].isEmpty() ? existingSupplier.getSupplierContact() : supplierData[1];
                        String address = supplierData[2].isEmpty() ? existingSupplier.getAddress() : supplierData[2];

                        // Validate contact number format
                        if (supplierContact.matches("\\+92-\\d{10}")) {
                            // Contact number format is valid
                            existingSupplier.setSupplierName(supplierName);
                            existingSupplier.setSupplierContact(supplierContact);
                            existingSupplier.setAddress(address);
                            model.updateSupplier(supplierID, existingSupplier);
                            loadTableData();
                            view.showMessage("Supplier updated successfully.");
                        } else {
                            // Invalid contact number format
                            view.showMessage("Invalid contact number format. Please enter in the format +92-##########.");
                        }
                    } else {
                        view.showMessage("Supplier not found.");
                    }
                } else {
                    view.showMessage("Please select a supplier to update.");
                }
            }
        });

        // Load initial data into the table
        loadTableData();
    }
    private void loadTableData() {
        List<SupplierModel> suppliers = model.getAllSuppliers();
        DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Supplier ID", "Supplier Name", "Supplier Contact", "Address"}, 0);

        for (SupplierModel supplier : suppliers) {
            tableModel.addRow(new Object[]{
                    supplier.getSupplierID(),
                    supplier.getSupplierName(),
                    supplier.getSupplierContact(),
                    supplier.getAddress()
            });
        }

        view.updateTable(tableModel);
    }
    
}
