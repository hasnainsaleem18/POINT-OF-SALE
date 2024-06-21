
package controlllor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import model.addInventoryModel;
import model.removeInventoryModel;
import view.removeInventoryView;

public class removeInventoryControllor {
    
    private removeInventoryModel remoModel;
    private addInventoryModel addModel;
    private inventoryControllor iControllor;
    
    public removeInventoryControllor(inventoryControllor iControllor) {
        
        this.iControllor = iControllor;
        removeInventoryView riInventoryView = new removeInventoryView();
        addModel = new addInventoryModel();
        remoModel = new removeInventoryModel();
        
        riInventoryView.getCodeTXT().setForeground(Color.BLACK);
        riInventoryView.getCodeTXT().setText("1234");
        
        riInventoryView.getCodeTXT().addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (riInventoryView.getCodeTXT().getText().equals("1234")) {
                    riInventoryView.getCodeTXT().setText("");
                    riInventoryView.getCodeTXT().setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (riInventoryView.getCodeTXT().getText().isEmpty()) {
                    riInventoryView.getCodeTXT().setText("1234");
                    riInventoryView.getCodeTXT().setForeground(Color.GRAY); 
                }
            }
        });
        
        riInventoryView.getBtConfimOrder().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                remoModel.setProductCode(riInventoryView.getCodeTXT().getText());
                String productCode = riInventoryView.getCodeTXT().getText().trim();
                
                boolean any = iControllor.removeInventoryTable(productCode);
                if (any)
                {
                    remoModel.remove();
                    JOptionPane.showMessageDialog(null, "Product removed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Failed to remove product.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
    }
    
    
    
}
