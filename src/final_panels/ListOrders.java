/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_panels;
import GUI.adminDashboard;
import hmss_project.admin;
import hmss_project.medicine;
import hmss_project.order;
import hmss_project.orderDetails;
import hmss_project.vendor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hassan
 */

public class ListOrders extends javax.swing.JPanel {

    /**
     * Creates new form ListEmployee
     * @throws java.sql.SQLException
     */
    AddMedicine p1=new AddMedicine();
    SearchMedicine p2=new SearchMedicine();
    ListMedicines p3=new ListMedicines();
    
    admin a = new admin();
   
    //orderDetails od = new orderDetails();
    updateOrderDetails UOD; 
    int k=0;

    
    public ListOrders() throws SQLException {
        initComponents();
        addRowsToTable();
        
    }

    public void deleteTable()
    {
        DefaultTableModel dm = (DefaultTableModel) listTable.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listTable = new javax.swing.JTable();
        OrderSearch_editText = new javax.swing.JTextField();
        list_btn = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        Search_error = new javax.swing.JLabel();
        search_btn1 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        listTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        listTable.setForeground(new java.awt.Color(36, 49, 60));
        listTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ld", "vendor name", "response", "date", "status", "quality"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listTable.setGridColor(new java.awt.Color(26, 177, 136));
        listTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(listTable);
        if (listTable.getColumnModel().getColumnCount() > 0) {
            listTable.getColumnModel().getColumn(0).setResizable(false);
        }

        OrderSearch_editText.setBackground(new java.awt.Color(204, 204, 204));
        OrderSearch_editText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        OrderSearch_editText.setForeground(new java.awt.Color(62, 64, 71));
        OrderSearch_editText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 85, 105)));
        OrderSearch_editText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderSearch_editTextActionPerformed(evt);
            }
        });

        list_btn.setBackground(new java.awt.Color(223, 74, 50));
        list_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_btnMouseClicked(evt);
            }
        });

        jLabel46.setBackground(new java.awt.Color(242, 242, 242));
        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("List All");

        javax.swing.GroupLayout list_btnLayout = new javax.swing.GroupLayout(list_btn);
        list_btn.setLayout(list_btnLayout);
        list_btnLayout.setHorizontalGroup(
            list_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(list_btnLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel46)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        list_btnLayout.setVerticalGroup(
            list_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(list_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Search_error.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Search_error.setForeground(new java.awt.Color(153, 0, 0));
        Search_error.setText("Search");

        search_btn1.setBackground(new java.awt.Color(0, 167, 87));
        search_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_btn1MouseClicked(evt);
            }
        });

        jLabel47.setBackground(new java.awt.Color(242, 242, 242));
        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Search");

        javax.swing.GroupLayout search_btn1Layout = new javax.swing.GroupLayout(search_btn1);
        search_btn1.setLayout(search_btn1Layout);
        search_btn1Layout.setHorizontalGroup(
            search_btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_btn1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel47)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        search_btn1Layout.setVerticalGroup(
            search_btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_btn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Search_error)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(list_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(OrderSearch_editText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(OrderSearch_editText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Search_error)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(list_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTableMouseClicked
        try {                                       
            UOD = new updateOrderDetails();
            UOD.setOID(this.tkOrdID());
            UOD.setVID(this.getVID());
            UOD.addRows(k);
            UOD.setVisible(true);
        
        } catch (SQLException ex) {
            Logger.getLogger(ListOrders.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listTableMouseClicked

    private void listTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTableMousePressed
        // TODO add your handling code here:
    
    
    
    }//GEN-LAST:event_listTableMousePressed

    private void OrderSearch_editTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderSearch_editTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderSearch_editTextActionPerformed

    private void list_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_btnMouseClicked
        // TODO add your handling code here:
        try
        {
            if(OrderSearch_editText.getText().equals(""))
            {
                Search_error.setText("enter medicine name !");
            }
            else
            {
                this.deleteTable();
                ArrayList<order> orders = a.ListOrders();
                this.addRWafterSearch(orders);
                
            }
        }
        catch(Exception e)
        {
            Search_error.setText("UNABLE TO LIST ORDERS !");
        }

    }//GEN-LAST:event_list_btnMouseClicked

    private void search_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btn1MouseClicked
        // TODO add your handling code here:
        try
        {
            if(OrderSearch_editText.getText().equals(""))
            {
                Search_error.setText("enter medicine name !");
            }
            else
            {
                this.deleteTable();
                ArrayList<order> orders = a.searchOrder(OrderSearch_editText.getText());
                this.addRWafterSearch(orders);
                
            }
        }
        catch(Exception e)
        {
            Search_error.setText("UNABLE TO SESRCH FOR ORDER !");
        }
    }//GEN-LAST:event_search_btn1MouseClicked
 
public int tkOrdID(){
    
    DefaultTableModel model = (DefaultTableModel) listTable.getModel();
    int selcRow = listTable.getSelectedRow();
    order x = new order();
    x.setOrderID(Integer.parseInt(model.getValueAt( selcRow , 0).toString()));
    k=x.getOrderID();
    return k;
    
}

public int getVID() throws SQLException
{
    DefaultTableModel model = (DefaultTableModel) listTable.getModel();
    int selcRow = listTable.getSelectedRow();
    
    String name = model.getValueAt( selcRow , 1).toString();
    
    return a.toVID(name);   
}

public void addRowsToTable() throws SQLException
    {
        DefaultTableModel model = (DefaultTableModel) listTable.getModel();
        Object rowData[] = new Object[6];
            ArrayList<order> allord = a.ListOrders();
            for(order m : allord)
            {
                rowData[0] = m.getOrderID();
                rowData[1] = a.toVName(m.getVendorID());
                rowData[2] = m.isVendorResponse();
                rowData[3] = m.getOrderTime();
                rowData[4] = m.isOrderStatus();
                rowData[5] = m.isOrderQuality();

                model.addRow(rowData);
            }
           
    }


public void addRWafterSearch (ArrayList<order> orders) throws SQLException{
        DefaultTableModel model = (DefaultTableModel) listTable.getModel();
        Object rowData[] = new Object[6];
        
        for(order m : orders)
        {
            rowData[0] = m.getOrderID();
            rowData[1] = a.toVName(m.getVendorID());
            rowData[2] = m.isVendorResponse();
            rowData[3] = m.getOrderTime();
            rowData[4] = m.isOrderStatus();
            rowData[5] = m.isOrderQuality();
            
            model.addRow(rowData);
        }
        
    }
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField OrderSearch_editText;
    private javax.swing.JLabel Search_error;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listTable;
    private javax.swing.JPanel list_btn;
    private javax.swing.JPanel search_btn1;
    // End of variables declaration//GEN-END:variables


}
