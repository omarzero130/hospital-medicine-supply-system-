/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_panels;

import hmss_project.admin;
import hmss_project.medicine;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hassan
 */
public class ListMedicines extends javax.swing.JPanel {

    
    
    /**
     * Creates new form ListEmployee
     */
    
    AddMedicine add;
    
    public ListMedicines() {
        initComponents();
        
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

        setBackground(new java.awt.Color(242, 242, 242));

        listTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        listTable.setForeground(new java.awt.Color(36, 49, 60));
        listTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "Price", "company"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1218, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void addRowsTojTable()
    {
        int y=0;
        Object rowData[] = new Object[4];
        admin a = new admin();
        ArrayList<medicine> medicines = a.ListMedicines();
        DefaultTableModel model = (DefaultTableModel) listTable.getModel();
        for(medicine m : medicines)
        {
            rowData[0] = m.getMedicineName();
            rowData[1] = m.getMedicineType();
            rowData[2] = m.getMedicinePrice();
            rowData[3] = m.getMedicineCompany();
            model.addRow(rowData);
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
