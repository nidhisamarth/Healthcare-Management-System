/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Finance;

import Hospital.Employee;
import Hospital.Hospital;
import Hospital.LabTest;
import Hospital.PatientTest;
import Warehouse.Warehouse;
import Warehouse.WarehouseOrderList;

/**
 *
 * @author shrey
 */
public class FinanceLandingPage extends javax.swing.JPanel {

    /**
     * Creates new form FinanceLandingPage
     */
    Hospital hospital;
    Employee employee;
    Warehouse warehouse;
    public FinanceLandingPage(Hospital hospital, Employee employee, Warehouse warehouse) {
        initComponents();
        this.hospital = hospital;
        this.warehouse = warehouse;
        
    String labRevenue = txtlabRevenue.getText();
    String appointmentRevenue = txtappointmentRevenue.getText();
    String totalDoctors = txttotalDoctors.getText();
    String totalPatients = txtPatients.getText();
    String warehouseBills = txtwarehouseBills.getText();
    String grossRevenue =   txtgrossRevenue.getText();
    populateData();
    }
    
    public void populateData() {
        
        //lab revenue
        Double labTestTotal = 0.0;
        for(PatientTest patientTest : hospital.getPatientTestDirectory().getPatientTestList()) {
            labTestTotal += Double.valueOf(patientTest.getLabTest().getTestPrice());
        }
        txtlabRevenue.setText(labTestTotal.toString());
        
        Double appointmentRevenue = Double.valueOf(hospital.getPatientAppointmentDirectory().getPatientAppointmentList().size() * 100);
        txtappointmentRevenue.setText(String.valueOf(appointmentRevenue));
        txttotalDoctors.setText(String.valueOf(hospital.getEmployeeDirectory().getEmployeeList().stream().filter(r -> r.isDoctor()).count()));
        txtPatients.setText(String.valueOf(hospital.getPatientDirectory().getPatientList().size()));
        
        Double warehouseOrderTotal = 0.0;
        if(warehouse.getWarehouseOrderList() != null) {
            for(WarehouseOrderList warehouseOrderList : warehouse.getWarehouseOrderList()) {
                warehouseOrderTotal += Double.valueOf(warehouseOrderList.getTotalAmount());
            }
        }

        txtwarehouseBills.setText(warehouseOrderTotal.toString());
        txtgrossRevenue.setText(String.valueOf(labTestTotal + appointmentRevenue - warehouseOrderTotal));
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtlabRevenue = new javax.swing.JTextField();
        txtappointmentRevenue = new javax.swing.JTextField();
        txttotalDoctors = new javax.swing.JTextField();
        txtPatients = new javax.swing.JTextField();
        txtwarehouseBills = new javax.swing.JTextField();
        txtgrossRevenue = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Finance ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel2.setText("Lab Revenue : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jLabel3.setText("Appointment Revenue :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel4.setText("No of Doctors :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel5.setText("Patients Registered:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jLabel6.setText("Warehouse Bills:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jLabel7.setText("Gross Revenue :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, 20));

        txtlabRevenue.setEditable(false);
        txtlabRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlabRevenueActionPerformed(evt);
            }
        });
        add(txtlabRevenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 230, 30));

        txtappointmentRevenue.setEditable(false);
        txtappointmentRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtappointmentRevenueActionPerformed(evt);
            }
        });
        add(txtappointmentRevenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 230, 30));

        txttotalDoctors.setEditable(false);
        add(txttotalDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 202, 230, 30));

        txtPatients.setEditable(false);
        add(txtPatients, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 230, 30));

        txtwarehouseBills.setEditable(false);
        add(txtwarehouseBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 312, 230, 30));

        txtgrossRevenue.setEditable(false);
        add(txtgrossRevenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 230, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9.jpg"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void txtlabRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlabRevenueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlabRevenueActionPerformed

    private void txtappointmentRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtappointmentRevenueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtappointmentRevenueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtPatients;
    private javax.swing.JTextField txtappointmentRevenue;
    private javax.swing.JTextField txtgrossRevenue;
    private javax.swing.JTextField txtlabRevenue;
    private javax.swing.JTextField txttotalDoctors;
    private javax.swing.JTextField txtwarehouseBills;
    // End of variables declaration//GEN-END:variables
}