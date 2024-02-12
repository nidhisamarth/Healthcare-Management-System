/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HospitalMedicalInventryWorkArea;

import Hospital.Employee;
import UI.MainFrame;
import Warehouse.Warehouse;

/**
 *
 * @author shrey
 */
public class WarehouseAdminLandingPage extends javax.swing.JPanel {

    /**
     * Creates new form MedInventryAdminWorkAreaJpanel
     */
    Warehouse warehouse;
     Employee employee;
    public WarehouseAdminLandingPage(Warehouse warehouse, Employee employee) {
        initComponents();
        this.warehouse = warehouse;
        this.employee = employee;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonTestDatabase = new javax.swing.JButton();
        jButtonPlaceOrder = new javax.swing.JButton();
        jButtonTestDatabase1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonTestDatabase.setBackground(new java.awt.Color(0, 153, 255));
        jButtonTestDatabase.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonTestDatabase.setText("View Order Status");
        jButtonTestDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestDatabaseActionPerformed(evt);
            }
        });
        add(jButtonTestDatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 430, 70));

        jButtonPlaceOrder.setBackground(new java.awt.Color(0, 153, 255));
        jButtonPlaceOrder.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonPlaceOrder.setText("Place Order");
        jButtonPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlaceOrderActionPerformed(evt);
            }
        });
        add(jButtonPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 430, 70));

        jButtonTestDatabase1.setBackground(new java.awt.Color(51, 153, 255));
        jButtonTestDatabase1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonTestDatabase1.setText("Medical Inventory Database");
        jButtonTestDatabase1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestDatabase1ActionPerformed(evt);
            }
        });
        add(jButtonTestDatabase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 430, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 860, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTestDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestDatabaseActionPerformed
        ViewOrderStatus vosjp = new ViewOrderStatus(warehouse, employee);
        MainFrame.mfInstance.setMainframeSplitFrame(vosjp);
    }//GEN-LAST:event_jButtonTestDatabaseActionPerformed

    private void jButtonPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlaceOrderActionPerformed
        MedicalSuppliesOrder msojp = new MedicalSuppliesOrder(warehouse, employee);
         MainFrame.mfInstance.setMainframeSplitFrame(msojp);
    }//GEN-LAST:event_jButtonPlaceOrderActionPerformed

    private void jButtonTestDatabase1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestDatabase1ActionPerformed
        // TODO add your handling code here:
        MedSuppliesDatabase msdjp = new MedSuppliesDatabase(warehouse, employee);
         MainFrame.mfInstance.setMainframeSplitFrame(msdjp);
    }//GEN-LAST:event_jButtonTestDatabase1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPlaceOrder;
    private javax.swing.JButton jButtonTestDatabase;
    private javax.swing.JButton jButtonTestDatabase1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}