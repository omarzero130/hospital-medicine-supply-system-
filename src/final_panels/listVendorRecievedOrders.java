/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_panels;

import hmss_project.Vend_med;
import hmss_project.admin;
import hmss_project.message;
import hmss_project.orderDetails;
import hmss_project.vendor;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.TextArea;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/**
 *
 * @author hassan
 */
public final class listVendorRecievedOrders extends javax.swing.JFrame {
    
    int OID;
    int MID;
    
    ArrayList<JLabel> medicineNo = new ArrayList<>();
    ArrayList<JLabel> medicineName = new ArrayList<>();
    ArrayList<JLabel> medicineType = new ArrayList<>();
    ArrayList<JLabel> medicineQuantity = new ArrayList<>();
    ArrayList<JTextField> medicinePrice = new ArrayList<>();

    
    BorderLayout B = new BorderLayout();
    ArrayList<JPanel> row = new ArrayList<>();
    JPanel largePanel = new JPanel();
    
    Vend_med VM = new Vend_med();    
    
    vendor v = new vendor();
    
    ArrayList<orderDetails> OD ;

    public void setOID(int OID) {
        this.OID = OID;
    }

    public int getOID() {
        return OID;
    }

    addOrder AO;
    
    /**
     * Creates new form addOrderDetails
     */
    public listVendorRecievedOrders() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    
    public void addRows() throws SQLException
    {
        OD = v.ListOrderDetails(this.getOID());
        for(int i=0;i<OD.size();i++)
        {
            medicineNo.add(new JLabel ("M"+" "+String.valueOf(i+1)));
            medicineName.add(new JLabel (OD.get(i).getMedicineName()));
            medicineType.add(new JLabel (OD.get(i).getMedicineType()));
            medicineQuantity.add(new JLabel (OD.get(i).getOrderQuantity()+""));
            medicinePrice.add(new JTextField(""));
            
            medicineName.get(i).setForeground(new java.awt.Color(62,64,71));
            medicineType.get(i).setForeground(new java.awt.Color(62,64,71));
            medicineQuantity.get(i).setForeground(new java.awt.Color(62,64,71));
            medicinePrice.get(i).setForeground(new java.awt.Color(62,64,71));
            
            medicineNo.get(i).setPreferredSize(new Dimension(30,30));
            medicineName.get(i).setPreferredSize(new Dimension(100,30));
            medicineType.get(i).setPreferredSize(new Dimension(100,30));
            medicineQuantity.get(i).setPreferredSize(new Dimension(100,30));
            medicinePrice.get(i).setPreferredSize(new Dimension(30,30));

            row.add(new JPanel());
            row.get(i).setPreferredSize(new Dimension(600,35));
            
            row.get(i).add(medicineNo.get(i));
            row.get(i).add(medicineName.get(i));
            row.get(i).add(medicineType.get(i));
            row.get(i).add(medicineQuantity.get(i));
            row.get(i).add(medicinePrice.get(i));
            
            row.get(i).setBackground(new java.awt.Color(242,242,242));
            largePanel.add(row.get(i));
            
        }
        
        
        largePanel.setPreferredSize(new Dimension(700,row.size()*35+60));
        largePanel.setBackground(new java.awt.Color(242,242,242));
        largePanel.setBorder(new EmptyBorder(30, 0, 0, 0));
        listRecievedOrders.setLayout(B);
        listRecievedOrders.add(largePanel,B.NORTH);
        
        
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
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        listRecievedOrders = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        DeleteOrder = new javax.swing.JPanel();
        jAddEmployee3 = new javax.swing.JLabel();
        save_Btn4 = new javax.swing.JPanel();
        jAddEmployee4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("jButton1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listRecievedOrders.setBackground(new java.awt.Color(242, 242, 242));
        listRecievedOrders.setForeground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout listRecievedOrdersLayout = new javax.swing.GroupLayout(listRecievedOrders);
        listRecievedOrders.setLayout(listRecievedOrdersLayout);
        listRecievedOrdersLayout.setHorizontalGroup(
            listRecievedOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        listRecievedOrdersLayout.setVerticalGroup(
            listRecievedOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));

        DeleteOrder.setBackground(new java.awt.Color(223, 74, 50));
        DeleteOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteOrderMouseClicked(evt);
            }
        });

        jAddEmployee3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jAddEmployee3.setForeground(new java.awt.Color(204, 204, 204));
        jAddEmployee3.setText("Reject order");

        javax.swing.GroupLayout DeleteOrderLayout = new javax.swing.GroupLayout(DeleteOrder);
        DeleteOrder.setLayout(DeleteOrderLayout);
        DeleteOrderLayout.setHorizontalGroup(
            DeleteOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteOrderLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jAddEmployee3)
                .addContainerGap(32, Short.MAX_VALUE))
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
        jAddEmployee4.setForeground(new java.awt.Color(204, 204, 204));
        jAddEmployee4.setText("Accept order");

        javax.swing.GroupLayout save_Btn4Layout = new javax.swing.GroupLayout(save_Btn4);
        save_Btn4.setLayout(save_Btn4Layout);
        save_Btn4Layout.setHorizontalGroup(
            save_Btn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_Btn4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jAddEmployee4)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        save_Btn4Layout.setVerticalGroup(
            save_Btn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_Btn4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAddEmployee4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(DeleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save_Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save_Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));

        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(62, 64, 71));
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jTextField1.setForeground(new java.awt.Color(62, 64, 71));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listRecievedOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(listRecievedOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_Btn4save_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_Btn4save_BtnMouseClicked
        // TODO add your handling code here:
      
        try
        {
            float total=0;
            float M_Price = 0;
            float O_Price = 0;
            int M_Quantity = 0;
            for(int i =0; i<OD.size();i++)
            {
                 if (!medicinePrice.get(i).getText().equals("")&&(Float.parseFloat(medicinePrice.get(i).getText())>0)){
                M_Price = Float.parseFloat(medicinePrice.get(i).getText());
                VM.setMID(v.toMID(medicineName.get(i).getText()));
                VM.setOID(this.getOID());
                VM.setPrice(M_Price);
                v.Update_Medicine_Price(VM);
                M_Quantity = Integer.parseInt(medicineQuantity.get(i).getText());
                total=total+(M_Quantity*M_Price);
            }
            else{
                    JOptionPane.showMessageDialog(null, "Enter Valid Price !");
                    }
            }
            
            v.setTotlaPrice(this.getOID(),total);
            String msg = jTextArea2.getText();
            int time = Integer.parseInt(jTextField1.getText());
            message m = new message();
            m.setMessageNotes(msg);
            m.setOrderEstimatedTime(time);
            m.setOrderStatus(true);
            m.setVendorID(v.tkvidLog());
            m.setOrderID(this.getOID());
            v.sendAcceptMessage(m);
            v.updateOrderStatus(this.getOID(), true);
            
            this.setVisible(false);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
    }//GEN-LAST:event_save_Btn4save_BtnMouseClicked

    private void DeleteOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteOrderMouseClicked

        try {
            String msg = jTextArea2.getText();
            message m = new message();
            m.setMessageNotes(msg);
            m.setOrderStatus(false);
            m.setVendorID(v.tkvidLog());
            m.setOrderID(this.getOID());
            v.sendRejectMessage(m);
            v.updateOrderStatus(this.getOID(),false);
            v.Delete_Medicine_vend(this.getOID());
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(listVendorRecievedOrders.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_DeleteOrderMouseClicked

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
            java.util.logging.Logger.getLogger(listVendorRecievedOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listVendorRecievedOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listVendorRecievedOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listVendorRecievedOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listVendorRecievedOrders().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DeleteOrder;
    private javax.swing.JLabel jAddEmployee3;
    private javax.swing.JLabel jAddEmployee4;
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel listRecievedOrders;
    private javax.swing.JPanel save_Btn4;
    // End of variables declaration//GEN-END:variables


}
