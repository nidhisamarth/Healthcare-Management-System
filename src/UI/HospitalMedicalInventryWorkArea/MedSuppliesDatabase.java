/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HospitalMedicalInventryWorkArea;

import Hospital.Employee;
import Hospital.PatientAppointment;
import UI.MainFrame;
import Warehouse.MedicalSupplyInventory;
import Warehouse.Warehouse;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrey
 */
public class MedSuppliesDatabase extends javax.swing.JPanel {

    /**
     * Creates new form MedSuppliesDatabase
     */
    Warehouse warehouse;
    Employee employee;
    public MedSuppliesDatabase(Warehouse warehouse, Employee employee) {
        initComponents();
        this.employee = employee;
        this.warehouse = warehouse;
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

        jLabelTitle2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTestDB = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle2.setText("Hospital Medical Supplies Database");
        add(jLabelTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 870, -1));

        jTableTestDB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Equipment Name", "Equipment Quantity", "Equipment Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTestDB);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 810, 370));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setText("< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           WarehouseAdminLandingPage walp = new WarehouseAdminLandingPage(warehouse, employee);
           MainFrame.mfInstance.setMainframeSplitFrame(walp);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitle2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTestDB;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTableTestDB.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        for(MedicalSupplyInventory medicalSupplyInventory : warehouse.getMedicalSupplyInventoryDirectory().getMedicalSupplyInventoryList()) {
            row[0] = medicalSupplyInventory.getEquipName();
            row[1] = medicalSupplyInventory.getQuantity();
            row[2] = medicalSupplyInventory.getPrice();
            model.addRow(row);
        }
    }
}