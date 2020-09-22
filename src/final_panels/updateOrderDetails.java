/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_panels;

import GUI.adminDashboard;
import hmss_project.Vend_med;
import hmss_project.admin;
import hmss_project.order;
import hmss_project.orderDetails;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/**
 *
 * @author hassan
 */
public final class updateOrderDetails extends javax.swing.JFrame {
    
    int OID;
    int VID;
    
    ArrayList<JLabel> medicineNo = new ArrayList<>();
    ArrayList<JComboBox> medicineName = new ArrayList<>();
    ArrayList<JComboBox> medicineType = new ArrayList<>();
    ArrayList<JTextField> medicineQuantity = new ArrayList<>();
    
    ArrayList<JLabel> NewMedicineNo = new ArrayList<>();
    ArrayList<JComboBox> NewMedicineName = new ArrayList<>();
    ArrayList<JComboBox> NewMedicineType = new ArrayList<>();
    ArrayList<JTextField> NewMedicineQuantity = new ArrayList<>();
    ArrayList<JPanel> NewRow = new ArrayList<>();
    JPanel NewLargePanel = new JPanel();

    
    BorderLayout B = new BorderLayout();
    ArrayList<JPanel> row = new ArrayList<>();
    JPanel largePanel = new JPanel();
    
    ArrayList<orderDetails> OD;
    
    String m_name,m_type;
    int m_quantity;
    orderDetails od;
    
    int i = 0;

    
    admin a = new admin();
    Vend_med VM = new Vend_med();

    public void setOID(int OID) {
        this.OID = OID;
    }

    public int getOID() {
        return OID;
    }

    public void setVID(int VID) {
        this.VID = VID;
    }

    public int getVID() {
        return VID;
    }
    
    

    addOrder AO;
    
    /**
     * Creates new form addOrderDetails
     */
    public updateOrderDetails() throws SQLException {
        initComponents();
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    
    public void addRows(int x) throws SQLException
    {
        
        order ORD = a.searchOrderByID(this.getOID());
        orderDeleivered.setSelected(ORD.isOrderStatus());
        orderQuality.setSelected(ORD.isOrderQuality());
        
        OD = a.listorderdetails(this.getOID());
        System.out.println(OD.get(0).getOrderQuantity());
        for(int i=0;i<OD.size();i++)
        {
            medicineNo.add(new JLabel ("M"+" "+String.valueOf(i+1)));
            
            
            /*medicineName.add(new JTextField(OD.get(i).getMedicineName()));
            medicineType.add(new JTextField(OD.get(i).getMedicineType()));
            */
            medicineName.add(new JComboBox());
            medicineType.add(new JComboBox());
            for(int j=0;j<a.ListMedicines().size();j++)
            {
                medicineName.get(i).addItem(a.ListMedicines().get(j).getMedicineName());
                medicineType.get(i).addItem(a.ListMedicines().get(j).getMedicineType());
            }
            medicineName.get(i).setSelectedItem(OD.get(i).getMedicineName());
            medicineName.get(i).setSelectedItem(OD.get(i).getMedicineType());
            
            medicineQuantity.add(new JTextField(OD.get(i).getOrderQuantity()+""));
            
            medicineName.get(i).setForeground(new java.awt.Color(62,64,71));
            medicineType.get(i).setForeground(new java.awt.Color(62,64,71));
            medicineQuantity.get(i).setForeground(new java.awt.Color(62,64,71));
            
            medicineName.get(i).setPreferredSize(new Dimension(100,30));
            medicineType.get(i).setPreferredSize(new Dimension(100,30));
            medicineQuantity.get(i).setPreferredSize(new Dimension(100,30));
            medicineNo.get(i).setPreferredSize(new Dimension(30,30));
            
            row.add(new JPanel());
            row.get(i).setPreferredSize(new Dimension(500,35));
            
            row.get(i).add(medicineNo.get(i));
            row.get(i).add(medicineName.get(i));
            row.get(i).add(medicineType.get(i));
            row.get(i).add(medicineQuantity.get(i));

            row.get(i).setBackground(new java.awt.Color(242,242,242));
            largePanel.add(row.get(i));
            
        }
        largePanel.setPreferredSize(new Dimension(600,row.size()*35+60));
        largePanel.setBackground(new java.awt.Color(242,242,242));
        largePanel.setBorder(new EmptyBorder(30, 0, 0, 0));
        orderDetailsPanal.setLayout(B);
        orderDetailsPanal.add(largePanel,B.NORTH);
        
    }
 
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderDetailsPanal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        DeleteOrder = new javax.swing.JPanel();
        jAddEmployee3 = new javax.swing.JLabel();
        save_Btn4 = new javax.swing.JPanel();
        jAddEmployee4 = new javax.swing.JLabel();
        AddOrder = new javax.swing.JPanel();
        jAddEmployee5 = new javax.swing.JLabel();
        orderDeleivered = new javax.swing.JCheckBox();
        orderQuality = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        orderDetailsPanal.setBackground(new java.awt.Color(242, 242, 242));
        orderDetailsPanal.setForeground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout orderDetailsPanalLayout = new javax.swing.GroupLayout(orderDetailsPanal);
        orderDetailsPanal.setLayout(orderDetailsPanalLayout);
        orderDetailsPanalLayout.setHorizontalGroup(
            orderDetailsPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        orderDetailsPanalLayout.setVerticalGroup(
            orderDetailsPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));

        DeleteOrder.setBackground(new java.awt.Color(223, 74, 50));
        DeleteOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteOrderMouseClicked(evt);
            }
        });

        jAddEmployee3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jAddEmployee3.setForeground(new java.awt.Color(255, 255, 255));
        jAddEmployee3.setText("Delete");

        javax.swing.GroupLayout DeleteOrderLayout = new javax.swing.GroupLayout(DeleteOrder);
        DeleteOrder.setLayout(DeleteOrderLayout);
        DeleteOrderLayout.setHorizontalGroup(
            DeleteOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeleteOrderLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jAddEmployee3)
                .addGap(48, 48, 48))
        );
        DeleteOrderLayout.setVerticalGroup(
            DeleteOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAddEmployee3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        save_Btn4.setBackground(new java.awt.Color(0, 167, 87));
        save_Btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_Btn4save_BtnMouseClicked(evt);
            }
        });

        jAddEmployee4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jAddEmployee4.setForeground(new java.awt.Color(255, 255, 255));
        jAddEmployee4.setText("Update");

        javax.swing.GroupLayout save_Btn4Layout = new javax.swing.GroupLayout(save_Btn4);
        save_Btn4.setLayout(save_Btn4Layout);
        save_Btn4Layout.setHorizontalGroup(
            save_Btn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_Btn4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jAddEmployee4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        save_Btn4Layout.setVerticalGroup(
            save_Btn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_Btn4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAddEmployee4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        AddOrder.setBackground(new java.awt.Color(0, 167, 87));
        AddOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddOrderMouseClicked(evt);
            }
        });

        jAddEmployee5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jAddEmployee5.setForeground(new java.awt.Color(255, 255, 255));
        jAddEmployee5.setText("Add Order");

        javax.swing.GroupLayout AddOrderLayout = new javax.swing.GroupLayout(AddOrder);
        AddOrder.setLayout(AddOrderLayout);
        AddOrderLayout.setHorizontalGroup(
            AddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddOrderLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jAddEmployee5)
                .addGap(48, 48, 48))
        );
        AddOrderLayout.setVerticalGroup(
            AddOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAddEmployee5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        orderDeleivered.setText("order Delivered");
        orderDeleivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDeleiveredActionPerformed(evt);
            }
        });

        orderQuality.setText("order quality");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderQuality)
                    .addComponent(orderDeleivered))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_Btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(orderDeleivered)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(orderQuality))
                    .addComponent(AddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save_Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(orderDetailsPanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(orderDetailsPanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_Btn4save_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_Btn4save_BtnMouseClicked
        // TODO add your handling code here:
        try
        {
            order Ord = new order();
            Ord.setOrderStatus(orderDeleivered.isSelected());
            Ord.setOrderQuality(orderQuality.isSelected());
            Ord.setOrderID(this.getOID());
            a.setQualityAndDeleveryRes(Ord);
            
            for(int i =0; i<OD.size();i++)
            {
                m_name=(String) medicineName.get(i).getSelectedItem();
                m_type= (String) medicineType.get(i).getSelectedItem();
                m_quantity= Integer.parseInt(medicineQuantity.get(i).getText());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          m_quantity= Integer.parseInt(medicineQuantity.get(i).getText());
                od=new orderDetails(m_quantity, m_name, m_type);
                a.updateOrderDetails(od,this.getOID());
                a.Update_Medicine_vend(a.toMID(m_name), this.getOID());
            }
            
            int x=NewMedicineNo.size();
            for(int i =0; i<NewMedicineNo.size();i++)
            {
              if (!NewMedicineQuantity.get(i).getText().equals("")&&(Integer.parseInt(NewMedicineQuantity.get(i).getText()))>0){  
                m_name=NewMedicineName.get(i).getSelectedItem().toString();
                m_type= NewMedicineType.get(i).getSelectedItem().toString();
                m_quantity= Integer.parseInt(NewMedicineQuantity.get(i).getText());
                od=new orderDetails(m_quantity, m_name,this.getOID(), m_type);
                a.addOrderDetails(od);
                VM.setMID(a.toMID(m_name));
                VM.setVID(this.getVID());
                VM.setOID(this.getOID());
                a.insert_Medicine_vend(VM);
                x--;
            }else{
                  JOptionPane.showMessageDialog(null, "Enter Valid Quantity !");
              }}
            if(x==0){
            this.setVisible(false);
        }}
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Data NOT ADDED !");
        }
        
    }//GEN-LAST:event_save_Btn4save_BtnMouseClicked

    private void DeleteOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteOrderMouseClicked

        a.deleteOrder(this.getOID());
        a.Delete_Medicine_vend(this.getOID());
        this.setVisible(false);
        try {
            new adminDashboard().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(updateOrderDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_DeleteOrderMouseClicked

    private void AddOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddOrderMouseClicked
        // TODO add your handling code here:
        
        NewMedicineNo.add(new JLabel ("M"+" "+String.valueOf(i+1)));
            
        NewMedicineName.add(new JComboBox());
        NewMedicineType.add(new JComboBox());
        for(int j=0;j<a.ListMedicines().size();j++)
            {
                NewMedicineName.get(i).addItem(a.ListMedicines().get(j).getMedicineName());
                NewMedicineType.get(i).addItem(a.ListMedicines().get(j).getMedicineType());
            }
        NewMedicineQuantity.add(new JTextField());

        NewMedicineName.get(i).setForeground(new java.awt.Color(62,64,71));
        NewMedicineType.get(i).setForeground(new java.awt.Color(62,64,71));
        NewMedicineQuantity.get(i).setForeground(new java.awt.Color(62,64,71));

        NewMedicineName.get(i).setPreferredSize(new Dimension(100,30));
        NewMedicineType.get(i).setPreferredSize(new Dimension(100,30));
        NewMedicineQuantity.get(i).setPreferredSize(new Dimension(100,30));
        NewMedicineNo.get(i).setPreferredSize(new Dimension(30,30));

        NewRow.add(new JPanel());
        NewRow.get(i).setPreferredSize(new Dimension(500,35));

        NewRow.get(i).add(NewMedicineNo.get(i));
        NewRow.get(i).add(NewMedicineName.get(i));
        NewRow.get(i).add(NewMedicineType.get(i));
        NewRow.get(i).add(NewMedicineQuantity.get(i));

        NewRow.get(i).setBackground(new java.awt.Color(242,242,242));
        NewLargePanel.add(NewRow.get(i));
        NewLargePanel.setPreferredSize(new Dimension(600,NewRow.size()*35+60));
        NewLargePanel.setBackground(new java.awt.Color(242,242,242));
        NewLargePanel.setBorder(new EmptyBorder(0, 0, 0, 0));
        orderDetailsPanal.add(NewLargePanel,B.SOUTH);
        i++;
        
    }//GEN-LAST:event_AddOrderMouseClicked

    private void orderDeleiveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDeleiveredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderDeleiveredActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(updateOrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateOrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateOrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateOrderDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new updateOrderDetails().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(updateOrderDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddOrder;
    private javax.swing.JPanel DeleteOrder;
    private javax.swing.JLabel jAddEmployee3;
    private javax.swing.JLabel jAddEmployee4;
    private javax.swing.JLabel jAddEmployee5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox orderDeleivered;
    private javax.swing.JPanel orderDetailsPanal;
    private javax.swing.JCheckBox orderQuality;
    private javax.swing.JPanel save_Btn4;
    // End of variables declaration//GEN-END:variables

}
