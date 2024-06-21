package controlllor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CashierModel;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import view.EmployeeView;
import model.AdminModel;

public class EmployeeController {
    private EmployeeView view;
    private AdminModel admin;
    private CashierModel cashier;

    public EmployeeController() {
        this.view = new EmployeeView();
        loadAdminData();
        loadCashierData();

        view.getBtAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Prompt the user to select table for adding employee
                String[] options = {"Admin", "Cashier"};
                String selectedOption = (String) JOptionPane.showInputDialog(view, "Select table for adding employee:", "Choose Table", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                // Check if the user selected an option
                if (selectedOption != null) {
                    // Prompt the user to enter employee details using dialog boxes
                    String empName = JOptionPane.showInputDialog(view, "Enter Employee Name:");
                    String username = JOptionPane.showInputDialog(view, "Enter Username:");
                    String password = JOptionPane.showInputDialog(view, "Enter Password:");

                    // Checking if the user clicked "Cancel" or closed the dialog
                    if (empName != null && username != null && password != null) {
                        if (selectedOption.equals("Cashier")) {
                            double cashDrawer = 0.0;
                            cashier = new CashierModel(empName, username, password);
                            cashier.setCashDrawer(cashDrawer);
                            cashier.addCashierToDatabase();
                        } else {
                            admin = new AdminModel(empName, username, password);
                            admin.addAdminToDatabase();
                        }
                    }

                    if (selectedOption.equals("Admin")) {
                        refreshAdminTable();
                    } else {
                        refreshCashierTable();
                    }
                }
            }
        });

        view.getBtDelete().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndexAdmin = view.getAdminTable().getSelectedRow();
                int selectedIndexCashier = view.getCashierTable().getSelectedRow();

                if (selectedIndexAdmin != -1) {
                    int option = JOptionPane.showConfirmDialog(view, "Are you sure you want to delete this employee from Admin table?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        int id = (int) view.getAdminTable().getValueAt(selectedIndexAdmin, 0);
                        admin = new AdminModel("", "", ""); // Initialize the admin object
                        admin.deleteAdmin(id);
                        refreshAdminTable();
                    }
                } else if (selectedIndexCashier != -1) {
                    int option = JOptionPane.showConfirmDialog(view, "Are you sure you want to delete this employee from Cashier table?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        int id = (int) view.getCashierTable().getValueAt(selectedIndexCashier, 0);
                        cashier = new CashierModel("", "", ""); // Initialize the cashier object
                        cashier.deleteCashier(id);
                        refreshCashierTable();
                    }
                } else {
                    JOptionPane.showMessageDialog(view, "Please select a row to delete.", "Delete Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        view.getBtUpdate().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndexAdmin = view.getAdminTable().getSelectedRow();
                int selectedIndexCashier = view.getCashierTable().getSelectedRow();

                if (selectedIndexAdmin != -1) {
                    DefaultTableModel adminModel = (DefaultTableModel) view.getAdminTable().getModel();
                    int ID = (int) adminModel.getValueAt(selectedIndexAdmin, 0);
                    String empName = (String) adminModel.getValueAt(selectedIndexAdmin, 1);
                    String username = (String) adminModel.getValueAt(selectedIndexAdmin, 2);
                    String password = (String) adminModel.getValueAt(selectedIndexAdmin, 3);

                    String updatedEmpName = JOptionPane.showInputDialog(view, "Enter Updated Employee Name:", empName);
                    String updatedUsername = JOptionPane.showInputDialog(view, "Enter Updated Username:", username);
                    String updatedPassword = JOptionPane.showInputDialog(view, "Enter Updated Password:", password);

                    if (updatedEmpName != null && updatedUsername != null && updatedPassword != null) {
                        admin = new AdminModel(updatedEmpName, updatedUsername, updatedPassword);
                        admin.updateAdmin(ID, updatedEmpName, updatedUsername, updatedPassword);
                    }
                } else if (selectedIndexCashier != -1) {
                    DefaultTableModel cashierModel = (DefaultTableModel) view.getCashierTable().getModel();
                    int ID = (int) cashierModel.getValueAt(selectedIndexCashier, 0);
                    String empName = (String) cashierModel.getValueAt(selectedIndexCashier, 1);
                    String username = (String) cashierModel.getValueAt(selectedIndexCashier, 2);
                    String password = (String) cashierModel.getValueAt(selectedIndexCashier, 3);

                    String updatedEmpName = JOptionPane.showInputDialog(view, "Enter Updated Employee Name:", empName);
                    String updatedUsername = JOptionPane.showInputDialog(view, "Enter Updated Username:", username);
                    String updatedPassword = JOptionPane.showInputDialog(view, "Enter Updated Password:", password);

                    if (updatedEmpName != null && updatedUsername != null && updatedPassword != null) {
                        cashier = new CashierModel(updatedEmpName, updatedUsername, updatedPassword);
                        cashier.setCashDrawer(0.0);
                        cashier.updateCashier(ID, updatedEmpName, updatedUsername, updatedPassword);
                    }
                } else {
                    JOptionPane.showMessageDialog(view, "Please select a row to update.", "Update Error", JOptionPane.ERROR_MESSAGE);
                }

                if (selectedIndexAdmin != -1) {
                    refreshAdminTable();
                } else if (selectedIndexCashier != -1) {
                    refreshCashierTable();
                }
            }
        });
    }

    private void refreshAdminTable() {
        DefaultTableModel model = (DefaultTableModel) view.getAdminTable().getModel();
        model.setRowCount(0); // Clear existing rows
        loadAdminData(); // Reload data from the database
    }

    private void refreshCashierTable() {
        DefaultTableModel model = (DefaultTableModel) view.getCashierTable().getModel();
        model.setRowCount(0); // Clear existing rows
        loadCashierData(); // Reload data from the database
    }

    private void loadAdminData() {
        DefaultTableModel model = (DefaultTableModel) view.getAdminTable().getModel();
        List<AdminModel> adminList = AdminModel.loadAdminData();
        for (AdminModel admin : adminList) {
            model.addRow(new Object[]{admin.getID(), admin.getEmp_Name(), admin.getUsername(), admin.getPassword()});
        }
    }

    private void loadCashierData() {
        DefaultTableModel model = (DefaultTableModel) view.getCashierTable().getModel();
        List<CashierModel> cashierList = CashierModel.loadCashierData();
        for (CashierModel cashier : cashierList) {
            model.addRow(new Object[]{cashier.getID(), cashier.getEmp_Name(), cashier.getUsername(), cashier.getPassword()});
        }
    }
}
