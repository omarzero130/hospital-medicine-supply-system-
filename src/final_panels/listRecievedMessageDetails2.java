/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_panels;

import hmss_project.Vend_med;
import hmss_project.admin;
import hmss_project.message;
import hmss_project.order;
import hmss_project.orderDetails;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohamed Abd El-Meged
 */
public class listRecievedMessageDetails2 extends javax.swing.JFrame {

       /**
     * Creates new form NewJFrame
     */
        order or = new order();
        message msg = new message();
        admin a = new admin();        
        ArrayList<orderDetails> order; 
        
    public listRecievedMessageDetails2(order ord) throws SQLException{
        initComponents();
        or = ord;
        totalPrice.setText(or.getTotalPrice()+"");
        msg = a.searchMessage(or.getOrderID());
        estimatedTime.setText(msg.getOrderEstimatedTime()+"");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    int time;
            
            
    private listRecievedMessageDetails2() {
    
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        estimatedTime = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        rejectOrder = new javax.swing.JPanel();
        jAddEmployee1 = new javax.swing.JLabel();
        approveOrder = new javax.swing.JPanel();
        jAddEmployee2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 242, 242));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine name", "Medicine quantity", "Medicine price by one"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));

        jLabel2.setBackground(new java.awt.Color(36, 49, 60));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(192, 59, 43));
        jLabel2.setText("Total Price");

        jLabel3.setBackground(new java.awt.Color(36, 49, 60));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(192, 59, 43));
        jLabel3.setText("Estimated time / Days");

        estimatedTime.setText("jLabel1");

        totalPrice.setText("jLabel4");

        rejectOrder.setBackground(new java.awt.Color(122, 49, 60));
        rejectOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rejectOrderMouseClicked(evt);
            }
        });

        jAddEmployee1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jAddEmployee1.setForeground(new java.awt.Color(204, 204, 204));
        jAddEmployee1.setText("Reject order");

        javax.swing.GroupLayout rejectOrderLayout = new javax.swing.GroupLayout(rejectOrder);
        rejectOrder.setLayout(rejectOrderLayout);
        rejectOrderLayout.setHorizontalGroup(
            rejectOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rejectOrderLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jAddEmployee1)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        rejectOrderLayout.setVerticalGroup(
            rejectOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rejectOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAddEmployee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        approveOrder.setBackground(new java.awt.Color(36, 49, 60));
        approveOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approveOrderMouseClicked(evt);
            }
        });

        jAddEmployee2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jAddEmployee2.setForeground(new java.awt.Color(204, 204, 204));
        jAddEmployee2.setText("Approve order");

        javax.swing.GroupLayout approveOrderLayout = new javax.swing.GroupLayout(approveOrder);
        approveOrder.setLayout(approveOrderLayout);
        approveOrderLayout.setHorizontalGroup(
            approveOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(approveOrderLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jAddEmployee2)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        approveOrderLayout.setVerticalGroup(
            approveOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(approveOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAddEmployee2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(totalPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(estimatedTime)
                .addGap(139, 139, 139))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(rejectOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(380, Short.MAX_VALUE)
                    .addComponent(approveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(120, 120, 120)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estimatedTime)
                    .addComponent(totalPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(rejectOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(155, Short.MAX_VALUE)
                    .addComponent(approveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rejectOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rejectOrderMouseClicked
        
        try {
                // TODO add your handling code here:
                a.setResponse(this.or.getOrderID(), false);
                this.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(listRecievedMessageDetails2.class.getName()).log(Level.SEVERE, null, ex);
            }    
        
    }//GEN-LAST:event_rejectOrderMouseClicked

    private void approveOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveOrderMouseClicked
            
            
            try {
                
                order = a.listorderdetails(this.or.getOrderID());
                for(int i=0;i<this.order.size();i++)
                {
                    int oldQuantity = (int) a.searchMedicine(order.get(i).getMedicineName()).getQuantity();
                    int newQuantity = order.get(i).getOrderQuantity();
                    int finalQuantity = oldQuantity+newQuantity;
                    System.out.println(oldQuantity);
                    System.out.println(newQuantity);
                    System.out.println(finalQuantity);
                    a.setMedicineQuantity(finalQuantity, a.toMID(order.get(i).getMedicineName()));
                }
                a.setResponse(this.or.getOrderID(), true);
                this.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(listRecievedMessageDetails2.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    }//GEN-LAST:event_approveOrderMouseClicked

    /**
     * @param args the command line arguments
     */
     public  void addRW() throws SQLException{
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[3];
        ArrayList<orderDetails> orders = a.listorderdetails(this.or.getOrderID());
      
        for(orderDetails m : orders)
        {
            rowData[0] = m.getMedicineName();
            rowData[1] = m.getOrderQuantity();
            Vend_med VM = new Vend_med();
            VM.setMID(a.toMID(m.getMedicineName()));
            VM.setOID(or.getOrderID());
            VM.setVID(or.getVendorID());
            rowData[2] = a.getMedicinePrice(VM);
            model.addRow(rowData);
        }
        
         setDefaultCloseOperation(listRecievedMessageDetails2.DISPOSE_ON_CLOSE);
        
 }
     
     

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
            java.util.logging.Logger.getLogger(listRecievedMessageDetails2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listRecievedMessageDetails2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listRecievedMessageDetails2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listRecievedMessageDetails2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new listRecievedMessageDetails2().setVisible(true);
            }
        });
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel approveOrder;
    private javax.swing.JLabel estimatedTime;
    private javax.swing.JLabel jAddEmployee1;
    private javax.swing.JLabel jAddEmployee2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel rejectOrder;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables
}