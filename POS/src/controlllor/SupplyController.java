package controlllor;

import model.SupplyModel;
import view.SupplyView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SupplyController {
    private SupplyView view;
    private SupplyModel model;

    public SupplyController() {
        view = new SupplyView();
        model = new SupplyModel();
        
        // Add action listeners to view components
        this.view.getBtSearch().addActionListener(new SearchButtonListener());
        this.view.getBtOrderBy().addActionListener(new OrderByButtonListener());
        // Initialize the view with data from the model
        updateView(model.getSupplyData());
    }
    
    public void showSupply() {
        view.setVisible(true);
    }
    
    public void updateView(List<Object[]> data) {
        view.updateTable(data);
    }
    
    private class SearchButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String searchCriteria = view.getSearchCriteria();
            String searchValue = view.getSearchValue();
            if (searchCriteria != null && !searchCriteria.isEmpty() && searchValue != null && !searchValue.isEmpty()) {
                List<Object[]> searchData = model.searchData(searchCriteria, searchValue);
                if (!searchData.isEmpty()) {
                    view.updateTable(searchData);
                } else {
                    JOptionPane.showMessageDialog(view, "No matching data found.");
                }
            }
        }
    }

    private class OrderByButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String orderByCriteria = view.getOrderByCriteria();
            if (orderByCriteria != null && !orderByCriteria.isEmpty()) {
                List<Object[]> orderedData = model.orderData(orderByCriteria);
                if (!orderedData.isEmpty()) {
                    view.updateTable(orderedData);
                } else {
                    JOptionPane.showMessageDialog(view, "No data available for ordering.");
                }
            }
        }
    }
}
