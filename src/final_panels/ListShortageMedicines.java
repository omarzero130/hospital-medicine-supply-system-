/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_panels;

import hmss_project.admin;
import hmss_project.medicine;
import hmss_project.vendor;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hassan
 */
public class ListShortageMedicines extends javax.swing.JPanel {

    /**
     * Creates new form ListEmployee
     */
    
    public ListShortageMedicines() throws SQLException {
        initComponents();
        addRowsTojTable();
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

        setBackground(new java.awt.Color(242, 242, 242));

        listTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        listTable.setForeground(new java.awt.Color(36, 49, 60));
        listTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MedicineName", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listTable.setGridColor(new java.awt.Color(26, 177, 136));
        jScrollPane1.setViewportView(listTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 400, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void addRowsTojTable() throws SQLException
    {
        int y=0;
        DefaultTableModel model = (DefaultTableModel) listTable.getModel();
        Object rowData[] = new Object[2];
        admin a = new admin();
        if(a.getShortageListNum()>0)
        {
            ArrayList<medicine> med = a.listShortageMedicines();

            for(medicine m : med)
            {
                rowData[0] = m.getMedicineName();
                rowData[1] = m.getQuantity();

                model.addRow(rowData);
            }
        }
        
        
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listTable;
    // End of variables declaration//GEN-END:variables

    private void addRowsTolistTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}