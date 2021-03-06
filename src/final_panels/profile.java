/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_panels;

import panels.*;
import com.sun.javafx.iio.ios.IosImageLoader;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import hmss_project.admin;
import hmss_project.medicine;
import hmss_project.vendor;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class profile extends javax.swing.JPanel {

    /**
     * Creates new form AddEmployee
     */
    
    public profile() throws SQLException {
        initComponents();
        
        vendor v = new vendor();
        admin a = new admin();
        v = a.searchVendor(v.toVName(v.tkvidLog()));
        VendorName.setText(v.getVendorName());
        VendorAdress.setText(v.getVendorAdress());
        VendorPhoneNo.setText(v.getPhoneNO()+"");
        VendorUname.setText(v.getPersonUserName());
        VendorPass.setText(v.getPersonPassword());

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addvendor_name = new javax.swing.JPanel();
        vendor_name = new javax.swing.JLabel();
        vendor_phone = new javax.swing.JLabel();
        vendor_address = new javax.swing.JLabel();
        vendor_username = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        vendor_password = new javax.swing.JLabel();
        VendorPhoneNo = new javax.swing.JLabel();
        VendorAdress = new javax.swing.JLabel();
        VendorUname = new javax.swing.JLabel();
        VendorPass = new javax.swing.JLabel();
        VendorName = new javax.swing.JLabel();

        addvendor_name.setBackground(new java.awt.Color(242, 242, 242));
        addvendor_name.setAutoscrolls(true);

        vendor_name.setBackground(new java.awt.Color(36, 49, 60));
        vendor_name.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vendor_name.setForeground(new java.awt.Color(192, 59, 43));
        vendor_name.setText("Name");

        vendor_phone.setBackground(new java.awt.Color(36, 49, 60));
        vendor_phone.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vendor_phone.setForeground(new java.awt.Color(192, 59, 43));
        vendor_phone.setText("PhoneNo");

        vendor_address.setBackground(new java.awt.Color(36, 49, 60));
        vendor_address.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vendor_address.setForeground(new java.awt.Color(192, 59, 43));
        vendor_address.setText("Address");

        vendor_username.setBackground(new java.awt.Color(36, 49, 60));
        vendor_username.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vendor_username.setForeground(new java.awt.Color(192, 59, 43));
        vendor_username.setText("Username");

        jLabel14.setBackground(new java.awt.Color(36, 49, 60));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(63, 85, 105));
        jLabel14.setText("Profile");

        vendor_password.setBackground(new java.awt.Color(36, 49, 60));
        vendor_password.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vendor_password.setForeground(new java.awt.Color(192, 59, 43));
        vendor_password.setText("Password");

        VendorPhoneNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VendorPhoneNo.setForeground(new java.awt.Color(51, 51, 51));
        VendorPhoneNo.setText("jLabel1");

        VendorAdress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VendorAdress.setForeground(new java.awt.Color(51, 51, 51));
        VendorAdress.setText("jLabel1");

        VendorUname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VendorUname.setForeground(new java.awt.Color(51, 51, 51));
        VendorUname.setText("jLabel1");

        VendorPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VendorPass.setForeground(new java.awt.Color(51, 51, 51));
        VendorPass.setText("jLabel1");

        VendorName.setBackground(new java.awt.Color(102, 102, 102));
        VendorName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VendorName.setForeground(new java.awt.Color(51, 51, 51));
        VendorName.setText("jLabel1");

        javax.swing.GroupLayout addvendor_nameLayout = new javax.swing.GroupLayout(addvendor_name);
        addvendor_name.setLayout(addvendor_nameLayout);
        addvendor_nameLayout.setHorizontalGroup(
            addvendor_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addvendor_nameLayout.createSequentialGroup()
                .addGroup(addvendor_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addvendor_nameLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(vendor_name)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addvendor_nameLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(addvendor_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(VendorPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VendorPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VendorUname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VendorAdress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VendorName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addvendor_nameLayout.createSequentialGroup()
                                .addGroup(addvendor_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vendor_password, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vendor_username, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vendor_phone)
                                    .addComponent(vendor_address))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(131, 131, 131))
            .addGroup(addvendor_nameLayout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addvendor_nameLayout.setVerticalGroup(
            addvendor_nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addvendor_nameLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel14)
                .addGap(29, 29, 29)
                .addComponent(vendor_name)
                .addGap(20, 20, 20)
                .addComponent(VendorName)
                .addGap(18, 18, 18)
                .addComponent(vendor_phone)
                .addGap(20, 20, 20)
                .addComponent(VendorPhoneNo)
                .addGap(18, 18, 18)
                .addComponent(vendor_address)
                .addGap(18, 18, 18)
                .addComponent(VendorAdress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addComponent(vendor_username)
                .addGap(21, 21, 21)
                .addComponent(VendorUname)
                .addGap(18, 18, 18)
                .addComponent(vendor_password)
                .addGap(18, 18, 18)
                .addComponent(VendorPass)
                .addGap(468, 468, 468))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addvendor_name, javax.swing.GroupLayout.PREFERRED_SIZE, 805, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addvendor_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VendorAdress;
    private javax.swing.JLabel VendorName;
    private javax.swing.JLabel VendorPass;
    private javax.swing.JLabel VendorPhoneNo;
    private javax.swing.JLabel VendorUname;
    private javax.swing.JPanel addvendor_name;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel vendor_address;
    private javax.swing.JLabel vendor_name;
    private javax.swing.JLabel vendor_password;
    private javax.swing.JLabel vendor_phone;
    private javax.swing.JLabel vendor_username;
    // End of variables declaration//GEN-END:variables
}
