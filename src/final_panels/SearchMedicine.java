/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_panels;

import hmss_project.Exceptions;
import hmss_project.admin;
import hmss_project.medicine;


/**
 *
 * @author hassan
 */
public class SearchMedicine extends javax.swing.JPanel {

    admin a = new admin();
    Exceptions e = new Exceptions();
    
    /**
     * Creates new form searchEmployee
     */
    public SearchMedicine() {
        initComponents();
        Search_error.setText(" ");
        update_error.setText(" ");
        Delete_error.setText(" ");
        
        this.medicineType.addItem("Pills");
        this.medicineType.addItem("Ointment");
        this.medicineType.addItem("Injection");
        this.medicineType.addItem("Suppository");
        this.medicineType.addItem("Sparay");
        this.medicineType.addItem("Syrup");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPanel_addEmployee = new javax.swing.JPanel();
        MedicineSearch_editText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        update_medicinePrice_editText = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        update_medicineCompany_editText = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        delete_btn = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        update_medicineName_editText = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        update_btn = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        search_btn = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        Search_error = new javax.swing.JLabel();
        update_error = new javax.swing.JLabel();
        Delete_error = new javax.swing.JLabel();
        medicineType = new javax.swing.JComboBox<>();

        adminPanel_addEmployee.setBackground(new java.awt.Color(242, 242, 242));
        adminPanel_addEmployee.setAutoscrolls(true);

        MedicineSearch_editText.setBackground(new java.awt.Color(242, 242, 242));
        MedicineSearch_editText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MedicineSearch_editText.setForeground(new java.awt.Color(62, 64, 71));
        MedicineSearch_editText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 85, 105)));
        MedicineSearch_editText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicineSearch_editTextActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(36, 49, 60));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(62, 64, 71));
        jLabel3.setText("Price");

        update_medicinePrice_editText.setBackground(new java.awt.Color(242, 242, 242));
        update_medicinePrice_editText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        update_medicinePrice_editText.setForeground(new java.awt.Color(62, 64, 71));
        update_medicinePrice_editText.setBorder(null);

        jSeparator4.setBackground(new java.awt.Color(62, 64, 71));
        jSeparator4.setForeground(new java.awt.Color(62, 64, 71));

        jLabel10.setBackground(new java.awt.Color(36, 49, 60));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(62, 64, 71));
        jLabel10.setText("Type");

        jLabel11.setBackground(new java.awt.Color(36, 49, 60));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(62, 64, 71));
        jLabel11.setText("Company");

        update_medicineCompany_editText.setBackground(new java.awt.Color(242, 242, 242));
        update_medicineCompany_editText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        update_medicineCompany_editText.setForeground(new java.awt.Color(62, 64, 71));
        update_medicineCompany_editText.setBorder(null);

        jSeparator6.setBackground(new java.awt.Color(62, 64, 71));
        jSeparator6.setForeground(new java.awt.Color(62, 64, 71));

        jLabel14.setBackground(new java.awt.Color(36, 49, 60));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(62, 64, 71));
        jLabel14.setText("Search for medicine  ");

        jLabel15.setBackground(new java.awt.Color(36, 49, 60));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(26, 177, 136));

        delete_btn.setBackground(new java.awt.Color(223, 74, 50));
        delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_btnMouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Delete");

        javax.swing.GroupLayout delete_btnLayout = new javax.swing.GroupLayout(delete_btn);
        delete_btn.setLayout(delete_btnLayout);
        delete_btnLayout.setHorizontalGroup(
            delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_btnLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel28)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        delete_btnLayout.setVerticalGroup(
            delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setBackground(new java.awt.Color(36, 49, 60));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(62, 64, 71));
        jLabel6.setText("Name");

        update_medicineName_editText.setBackground(new java.awt.Color(242, 242, 242));
        update_medicineName_editText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        update_medicineName_editText.setForeground(new java.awt.Color(62, 64, 71));
        update_medicineName_editText.setBorder(null);

        jSeparator16.setBackground(new java.awt.Color(62, 64, 71));
        jSeparator16.setForeground(new java.awt.Color(62, 64, 71));

        update_btn.setBackground(new java.awt.Color(0, 167, 87));
        update_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_btnMouseClicked(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Update");

        javax.swing.GroupLayout update_btnLayout = new javax.swing.GroupLayout(update_btn);
        update_btn.setLayout(update_btnLayout);
        update_btnLayout.setHorizontalGroup(
            update_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_btnLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel45)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        update_btnLayout.setVerticalGroup(
            update_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(update_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        search_btn.setBackground(new java.awt.Color(223, 74, 50));
        search_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_btnMouseClicked(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Search");

        javax.swing.GroupLayout search_btnLayout = new javax.swing.GroupLayout(search_btn);
        search_btn.setLayout(search_btnLayout);
        search_btnLayout.setHorizontalGroup(
            search_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_btnLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel46)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        search_btnLayout.setVerticalGroup(
            search_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Search_error.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Search_error.setForeground(new java.awt.Color(223, 74, 50));
        Search_error.setText("Search");

        update_error.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update_error.setForeground(new java.awt.Color(223, 74, 50));
        update_error.setText("Update");

        Delete_error.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Delete_error.setForeground(new java.awt.Color(223, 74, 50));
        Delete_error.setText("Delete");

        javax.swing.GroupLayout adminPanel_addEmployeeLayout = new javax.swing.GroupLayout(adminPanel_addEmployee);
        adminPanel_addEmployee.setLayout(adminPanel_addEmployeeLayout);
        adminPanel_addEmployeeLayout.setHorizontalGroup(
            adminPanel_addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanel_addEmployeeLayout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel14)
                .addGap(0, 306, Short.MAX_VALUE))
            .addGroup(adminPanel_addEmployeeLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(adminPanel_addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanel_addEmployeeLayout.createSequentialGroup()
                        .addGroup(adminPanel_addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanel_addEmployeeLayout.createSequentialGroup()
                        .addGroup(adminPanel_addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(update_medicinePrice_editText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update_medicineCompany_editText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medicineType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(adminPanel_addEmployeeLayout.createSequentialGroup()
                                .addComponent(Search_error)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator16, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MedicineSearch_editText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update_medicineName_editText)
                            .addGroup(adminPanel_addEmployeeLayout.createSequentialGroup()
                                .addGroup(adminPanel_addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update_error))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(adminPanel_addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Delete_error)
                                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(85, 85, 85))))
        );
        adminPanel_addEmployeeLayout.setVerticalGroup(
            adminPanel_addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanel_addEmployeeLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(MedicineSearch_editText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminPanel_addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanel_addEmployeeLayout.createSequentialGroup()
                        .addComponent(Search_error)
                        .addGap(88, 88, 88)
                        .addGroup(adminPanel_addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update_medicineName_editText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanel_addEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(31, 31, 31)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(update_medicinePrice_editText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(medicineType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(12, 12, 12)
                .addGroup(adminPanel_addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(adminPanel_addEmployeeLayout.createSequentialGroup()
                        .addComponent(update_medicineCompany_editText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminPanel_addEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_error)
                    .addComponent(Delete_error))
                .addGap(26, 26, 26)
                .addComponent(jLabel15)
                .addGap(522, 522, 522))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(adminPanel_addEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1218, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(adminPanel_addEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MedicineSearch_editTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicineSearch_editTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicineSearch_editTextActionPerformed

    private void search_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseClicked
        // TODO add your handling code here:
        try
            {if(MedicineSearch_editText.getText().equals(""))
            {
                Search_error.setText("enter medicine name !");
            }
            else
            {

                medicine m = a.searchMedicine(MedicineSearch_editText.getText());
                update_medicineName_editText.setText(m.getMedicineName());
                update_medicinePrice_editText.setText(m.getMedicinePrice()+"");
                medicineType.setSelectedItem(m.getMedicineType());
                update_medicineCompany_editText.setText(m.getMedicineCompany());
                Search_error.setText("SEARCH SUCCEEDED");
            }
        }
        catch(Exception e)
        {
            Search_error.setText("UNABLE TO SESRCH FOR MEDICINE !");
        }
        
    }//GEN-LAST:event_search_btnMouseClicked

    private void update_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_btnMouseClicked
 // TODO add your handling code here:
        
        try
        {
            medicine m = new medicine();
            if(update_medicineName_editText.getText().equals("")||update_medicinePrice_editText.getText().equals("")
                    ||medicineType.getSelectedItem().equals("")||update_medicineCompany_editText.getText().equals(""))
            {
                update_error.setText("please fill the empty places !");
            }
            else
                m.setMedicineName(update_medicineName_editText.getText());
                m.setMedicineType((String) medicineType.getSelectedItem());
                m.setMedicineCompany(update_medicineCompany_editText.getText());
                m.setMedicinePrice(Float.parseFloat(update_medicinePrice_editText.getText()));
                a.addMedicine(m);
                update_error.setText("MEDICINE UPDATED SUCCESSFULLY !");
                resetPanelData();
        }
        catch(Exception e)
        {
            update_error.setText("UNABLE TO UPDATE MEDICINE !");
        }
 
    }//GEN-LAST:event_update_btnMouseClicked

    private void delete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseClicked
 // TODO add your handling code here:
        try{
            
            if(update_medicineName_editText.getText().equals(""))
            {
                Delete_error.setText("enter medicine name !");
            }
            else
            {
                a.deleteMedicine(update_medicineName_editText.getText());
                Delete_error.setText("DELETED SUCCESSFULLY");
                resetPanelData();
            }

        }
        catch(Exception e)
        {
            Delete_error.setText("UNABLE TO DELETE MEDICINE !");
        }
            }//GEN-LAST:event_delete_btnMouseClicked
      
    protected void resetPanelData()
    {
        MedicineSearch_editText.setText("");
        update_medicineName_editText.setText("");
        update_medicinePrice_editText.setText("");
        update_medicineCompany_editText.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Delete_error;
    private javax.swing.JTextField MedicineSearch_editText;
    private javax.swing.JLabel Search_error;
    private javax.swing.JPanel adminPanel_addEmployee;
    private javax.swing.JPanel delete_btn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JComboBox<String> medicineType;
    private javax.swing.JPanel search_btn;
    private javax.swing.JPanel update_btn;
    private javax.swing.JLabel update_error;
    private javax.swing.JTextField update_medicineCompany_editText;
    private javax.swing.JTextField update_medicineName_editText;
    private javax.swing.JTextField update_medicinePrice_editText;
    // End of variables declaration//GEN-END:variables
}
