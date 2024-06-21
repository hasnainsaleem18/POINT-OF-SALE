
package controlllor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.dashboardView;
import view.loginView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import view.inventoryView;

public class dashboardControllor {
    
   private inventoryView v;
   private inventoryControllor iControllor;
   private cartControllor cControllor;
   private EmployeeController eController;
   
    public dashboardControllor() {
        dashboardView view1 = new dashboardView();
        
        view1.getInventoryButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          
                iControllor = new inventoryControllor();
               
                
            }
        });
        
        view1.getCartButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          
                if (iControllor != null) { // Ensure inventoryControllor is initialized
                    if (cControllor == null) {
                        cControllor = new cartControllor(iControllor);
                    }
                    cControllor.getCartView().setVisible(true);
                } else {
                    // Show error or initialize inventoryControllor if needed
                    System.out.println("Inventory must be opened first.");
                }
                
            }
        });
        
        view1.getOrderButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          
                PlaceOrderController placeOrderController = new PlaceOrderController();
                
            }
        });
        
        view1.getEmployeeButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          
                eController = new EmployeeController();
                
            }
        });
        
        view1.getSupplyButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          
                SupplyController supplyController = new SupplyController();
                
            }
        });
        
        view1.getSupplierbutton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          
                SupplierController sc = new SupplierController();
                
            }
        });
        
        view1.getLoginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          
                System.exit(0);
                
            }
        });
        
        
        
        view1.getSupplierbutton().addMouseListener(new MouseListener() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                
                view1.getSupplierbutton().setBackground(view1.getClickColor());
                view1.getSupplierpannel().setBackground(view1.getClickColor());
                
                view1.getOrderButton().setBackground(view1.getDefaultColor());
                view1.getOrderPannel().setBackground(view1.getDefaultColor());
        
                view1.getInventoryPannel().setBackground(view1.getDefaultColor());
                view1.getInventoryButton().setBackground(view1.getDefaultColor());
                
                view1.getEmployeeButton().setBackground(view1.getDefaultColor());
                view1.getEmployee().setBackground(view1.getDefaultColor());
                
                view1.getCartButton().setBackground(view1.getDefaultColor());
                view1.getCartPannel().setBackground(view1.getDefaultColor());
                
               //view1.getLoginButton().setBackground(Color.red);
                
                view1.getSupplyButton().setBackground(view1.getDefaultColor());
                view1.getSupplyPannel().setBackground(view1.getDefaultColor());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                }

            @Override
            public void mouseClicked(MouseEvent e) {
                }

            @Override
            public void mousePressed(MouseEvent e) {
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }
        });
        
        view1.getSupplierpannel().addMouseListener(new MouseListener() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                
                view1.getSupplierbutton().setBackground(view1.getClickColor());
                view1.getSupplierpannel().setBackground(view1.getClickColor());
                
                view1.getOrderButton().setBackground(view1.getDefaultColor());
                view1.getOrderPannel().setBackground(view1.getDefaultColor());
        
                view1.getInventoryPannel().setBackground(view1.getDefaultColor());
                view1.getInventoryButton().setBackground(view1.getDefaultColor());
                
                view1.getEmployeeButton().setBackground(view1.getDefaultColor());
                view1.getEmployee().setBackground(view1.getDefaultColor());
                
                view1.getCartButton().setBackground(view1.getDefaultColor());
                view1.getCartPannel().setBackground(view1.getDefaultColor());
                
               
                
                view1.getSupplyButton().setBackground(view1.getDefaultColor());
                view1.getSupplyPannel().setBackground(view1.getDefaultColor());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                }

            @Override
            public void mouseClicked(MouseEvent e) {
                }

            @Override
            public void mousePressed(MouseEvent e) {
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }
        });
        
        view1.getOrderButton().addMouseListener(new MouseListener() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                
                view1.getSupplierbutton().setBackground(view1.getDefaultColor());
                view1.getSupplierpannel().setBackground(view1.getDefaultColor());
                
                view1.getOrderButton().setBackground(view1.getClickColor());
                view1.getOrderPannel().setBackground(view1.getClickColor());
        
                view1.getInventoryPannel().setBackground(view1.getDefaultColor());
                view1.getInventoryButton().setBackground(view1.getDefaultColor());
                
                view1.getEmployeeButton().setBackground(view1.getDefaultColor());
                view1.getEmployee().setBackground(view1.getDefaultColor());
                
                view1.getCartButton().setBackground(view1.getDefaultColor());
                view1.getCartPannel().setBackground(view1.getDefaultColor());
                
               
                
                view1.getSupplyButton().setBackground(view1.getDefaultColor());
                view1.getSupplyPannel().setBackground(view1.getDefaultColor());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                }

            @Override
            public void mouseClicked(MouseEvent e) {
                }

            @Override
            public void mousePressed(MouseEvent e) {
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }
        });
        
        view1.getOrderPannel().addMouseListener(new MouseListener() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                
                view1.getSupplierbutton().setBackground(view1.getDefaultColor());
                view1.getSupplierpannel().setBackground(view1.getDefaultColor());
                
                view1.getOrderButton().setBackground(view1.getClickColor());
                view1.getOrderPannel().setBackground(view1.getClickColor());
        
                view1.getInventoryPannel().setBackground(view1.getDefaultColor());
                view1.getInventoryButton().setBackground(view1.getDefaultColor());
                
                view1.getEmployeeButton().setBackground(view1.getDefaultColor());
                view1.getEmployee().setBackground(view1.getDefaultColor());
                
                view1.getCartButton().setBackground(view1.getDefaultColor());
                view1.getCartPannel().setBackground(view1.getDefaultColor());
              
                view1.getSupplyButton().setBackground(view1.getDefaultColor());
                view1.getSupplyPannel().setBackground(view1.getDefaultColor());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                }

            @Override
            public void mouseClicked(MouseEvent e) {
                }

            @Override
            public void mousePressed(MouseEvent e) {
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }
        });
        
        
        
        view1.getInventoryButton().addMouseListener(new MouseListener() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                
                view1.getSupplierbutton().setBackground(view1.getDefaultColor());
                view1.getSupplierpannel().setBackground(view1.getDefaultColor());
                
                view1.getOrderButton().setBackground(view1.getDefaultColor());
                view1.getOrderPannel().setBackground(view1.getDefaultColor());
                
                view1.getInventoryPannel().setBackground(view1.getClickColor());
                view1.getInventoryButton().setBackground(view1.getClickColor());
                
                view1.getEmployeeButton().setBackground(view1.getDefaultColor());
                view1.getEmployee().setBackground(view1.getDefaultColor());
                
                view1.getCartButton().setBackground(view1.getDefaultColor());
                view1.getCartPannel().setBackground(view1.getDefaultColor());
               
                
                view1.getSupplyButton().setBackground(view1.getDefaultColor());
                view1.getSupplyPannel().setBackground(view1.getDefaultColor());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                }

            @Override
            public void mouseClicked(MouseEvent e) {
                }

            @Override
            public void mousePressed(MouseEvent e) {
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }
        });
        
        view1.getEmployeeButton().addMouseListener(new MouseListener() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                
                view1.getSupplierbutton().setBackground(view1.getDefaultColor());
                view1.getSupplierpannel().setBackground(view1.getDefaultColor());
                
                view1.getInventoryPannel().setBackground(view1.getDefaultColor());
                view1.getInventoryButton().setBackground(view1.getDefaultColor());
                
                view1.getOrderButton().setBackground(view1.getDefaultColor());
                view1.getOrderPannel().setBackground(view1.getDefaultColor());
                
                view1.getEmployeeButton().setBackground(view1.getClickColor());
                view1.getEmployee().setBackground(view1.getClickColor());
                
                view1.getCartButton().setBackground(view1.getDefaultColor());
                view1.getCartPannel().setBackground(view1.getDefaultColor());
                
               
                
                view1.getSupplyButton().setBackground(view1.getDefaultColor());
                view1.getSupplyPannel().setBackground(view1.getDefaultColor());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                }

            @Override
            public void mouseClicked(MouseEvent e) {
                }

            @Override
            public void mousePressed(MouseEvent e) {
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }
        });
        
        view1.getEmployee().addMouseListener(new MouseListener() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                
                view1.getSupplierbutton().setBackground(view1.getDefaultColor());
                view1.getSupplierpannel().setBackground(view1.getDefaultColor());
                
                view1.getEmployeeButton().setBackground(view1.getClickColor());
                view1.getEmployee().setBackground(view1.getClickColor());
                
                view1.getInventoryPannel().setBackground(view1.getDefaultColor());
                view1.getInventoryButton().setBackground(view1.getDefaultColor());
                
                view1.getCartButton().setBackground(view1.getDefaultColor());
                view1.getCartPannel().setBackground(view1.getDefaultColor());
                
                
                
                view1.getOrderButton().setBackground(view1.getDefaultColor());
                view1.getOrderPannel().setBackground(view1.getDefaultColor());
                
                view1.getSupplyButton().setBackground(view1.getDefaultColor());
                view1.getSupplyPannel().setBackground(view1.getDefaultColor());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                }

            @Override
            public void mouseClicked(MouseEvent e) {
                }

            @Override
            public void mousePressed(MouseEvent e) {
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }
        });
        
        view1.getInventoryPannel().addMouseListener(new MouseListener() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                
                view1.getSupplierbutton().setBackground(view1.getDefaultColor());
                view1.getSupplierpannel().setBackground(view1.getDefaultColor());
                
                view1.getInventoryPannel().setBackground(view1.getClickColor());
                view1.getInventoryButton().setBackground(view1.getClickColor());
                
                view1.getEmployeeButton().setBackground(view1.getDefaultColor());
                view1.getEmployee().setBackground(view1.getDefaultColor());
                
                view1.getCartButton().setBackground(view1.getDefaultColor());
                view1.getCartPannel().setBackground(view1.getDefaultColor());
                
                
                
                view1.getOrderButton().setBackground(view1.getDefaultColor());
                view1.getOrderPannel().setBackground(view1.getDefaultColor());
                
                view1.getSupplyButton().setBackground(view1.getDefaultColor());
                view1.getSupplyPannel().setBackground(view1.getDefaultColor());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                }

            @Override
            public void mouseClicked(MouseEvent e) {
                }

            @Override
            public void mousePressed(MouseEvent e) {
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }
        });
        
        view1.getCartButton().addMouseListener(new MouseListener() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                
                view1.getSupplierbutton().setBackground(view1.getDefaultColor());
                view1.getSupplierpannel().setBackground(view1.getDefaultColor());
                
                view1.getInventoryPannel().setBackground(view1.getDefaultColor());
                view1.getInventoryButton().setBackground(view1.getDefaultColor());
                
                view1.getEmployeeButton().setBackground(view1.getDefaultColor());
                view1.getEmployee().setBackground(view1.getDefaultColor());
                
                view1.getCartButton().setBackground(view1.getClickColor());
                view1.getCartPannel().setBackground(view1.getClickColor());
                
               
                view1.getOrderButton().setBackground(view1.getDefaultColor());
                view1.getOrderPannel().setBackground(view1.getDefaultColor());
                
                view1.getSupplyButton().setBackground(view1.getDefaultColor());
                view1.getSupplyPannel().setBackground(view1.getDefaultColor());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                }

            @Override
            public void mouseClicked(MouseEvent e) {
                }

            @Override
            public void mousePressed(MouseEvent e) {
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }
        });
        
        view1.getCartPannel().addMouseListener(new MouseListener() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                
                view1.getSupplierbutton().setBackground(view1.getDefaultColor());
                view1.getSupplierpannel().setBackground(view1.getDefaultColor());
                
                view1.getInventoryPannel().setBackground(view1.getDefaultColor());
                view1.getInventoryButton().setBackground(view1.getDefaultColor());
                
                view1.getEmployeeButton().setBackground(view1.getDefaultColor());
                view1.getEmployee().setBackground(view1.getDefaultColor());
                
                view1.getCartButton().setBackground(view1.getClickColor());
                view1.getCartPannel().setBackground(view1.getClickColor());
                
                
                view1.getOrderButton().setBackground(view1.getDefaultColor());
                view1.getOrderPannel().setBackground(view1.getDefaultColor());
                
                view1.getSupplyButton().setBackground(view1.getDefaultColor());
                view1.getSupplyPannel().setBackground(view1.getDefaultColor());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                }

            @Override
            public void mouseClicked(MouseEvent e) {
                }

            @Override
            public void mousePressed(MouseEvent e) {
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }
        });
        
       
        
        view1.getSupplyButton().addMouseListener(new MouseListener() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                
                view1.getSupplierbutton().setBackground(view1.getDefaultColor());
                view1.getSupplierpannel().setBackground(view1.getDefaultColor());
                
                view1.getSupplyButton().setBackground(view1.getClickColor());
                view1.getSupplyPannel().setBackground(view1.getClickColor());
                
                view1.getInventoryPannel().setBackground(view1.getDefaultColor());
                view1.getInventoryButton().setBackground(view1.getDefaultColor());
                
                view1.getEmployeeButton().setBackground(view1.getDefaultColor());
                view1.getEmployee().setBackground(view1.getDefaultColor());
                
                view1.getCartButton().setBackground(view1.getDefaultColor());
                view1.getCartPannel().setBackground(view1.getDefaultColor());
                
                
                
                view1.getOrderButton().setBackground(view1.getDefaultColor());
                view1.getOrderPannel().setBackground(view1.getDefaultColor());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                }

            @Override
            public void mouseClicked(MouseEvent e) {
                }

            @Override
            public void mousePressed(MouseEvent e) {
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }
        });
        
        view1.getSupplyPannel().addMouseListener(new MouseListener() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                
                view1.getSupplierbutton().setBackground(view1.getDefaultColor());
                view1.getSupplierpannel().setBackground(view1.getDefaultColor());
                
                view1.getSupplyButton().setBackground(view1.getClickColor());
                view1.getSupplyPannel().setBackground(view1.getClickColor());
                
                view1.getInventoryPannel().setBackground(view1.getDefaultColor());
                view1.getInventoryButton().setBackground(view1.getDefaultColor());
                
                view1.getEmployeeButton().setBackground(view1.getDefaultColor());
                view1.getEmployee().setBackground(view1.getDefaultColor());
                
                view1.getCartButton().setBackground(view1.getDefaultColor());
                view1.getCartPannel().setBackground(view1.getDefaultColor());
                
               
                
                view1.getOrderButton().setBackground(view1.getDefaultColor());
                view1.getOrderPannel().setBackground(view1.getDefaultColor());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                }

            @Override
            public void mouseClicked(MouseEvent e) {
                }

            @Override
            public void mousePressed(MouseEvent e) {
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }
        });
    
    }
    
}
