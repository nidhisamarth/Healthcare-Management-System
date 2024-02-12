/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HospitalMedicalInventryWorkArea;

import Hospital.Employee;
import UI.MainFrame;
import Warehouse.Warehouse;
import Warehouse.WarehouseOrder;
import Warehouse.WarehouseOrderList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrey
 */
public class ViewOrderStatus extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrderStatus
     */
    Warehouse warehouse;
    Employee employee;
    public ViewOrderStatus(Warehouse warehouse, Employee employee) {
        initComponents();
        this.warehouse = warehouse;
        this.employee = employee;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("View Order Status");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 210, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Equipment Name", "Quantity", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 640, 230));

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setText("< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/13.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
WarehouseAdminLandingPage walp = new WarehouseAdminLandingPage(warehouse, employee);
           MainFrame.mfInstance.setMainframeSplitFrame(walp);            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        if(warehouse.getWarehouseOrderList() != null) {
            for(WarehouseOrderList warehouseOrderListArray : warehouse.getWarehouseOrderList()) {
                String orderId = warehouseOrderListArray.getId();
                for(WarehouseOrder warehouseOrder : warehouseOrderListArray.getWarehouseOrderList()) {
                    Object[] row = new Object[4];
                    row[0] = orderId;
                    row[1] = warehouseOrder.getEquipName();
                    row[2] = warehouseOrder.getQuantity();
                    row[3] = warehouseOrder.isIsDelivered() == true ? "Delivered" : "Not Delivered";
                    model.addRow(row);
                }
            }            
        }
        
    }
}
