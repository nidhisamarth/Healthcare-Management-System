/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DataRead.DataReader;
import Hospital.Department;
import Hospital.Employee;
import Hospital.EmployeeDirectory;
import Hospital.Hospital;
import Hospital.LabTest;
import Hospital.Patient;
import Hospital.PatientAppointment;
import Hospital.PatientTest;
import Hospital.Role;
import Hospital.UserAccount;
import Hospital.UserAccountDirectory;
import UI.Delivery.Delivery;
import UI.DoctorLogin.DoctorLandingPage;
import UI.Finance.FinanceLandingPage;
import UI.HospitalMedicalInventryWorkArea.WarehouseAdminLandingPage;
import UI.ReceptionistLogin.ReceptionistLandingPage;
import UI.Technician.Technician;
import Warehouse.MedicalSupplyInventory;
import Warehouse.Warehouse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.CardLayout;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author shrey
 */
public class MainFrame extends javax.swing.JFrame {
    Hospital hospital = new Hospital();
    Warehouse warehouse = new Warehouse();
    UserAccount userAccountLogin;
     public static MainFrame mfInstance;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        
        initComponents();
        createData();
        mfInstance = this;
    }

    
    public void createData() {
         DataReader dataReader = null;
        try{
            dataReader = new DataReader("/Users/saurabhsrivastava/Desktop/FinalProject/final-project-fusionforce/FinalApplication/src/UI/DepartmentData.csv");
            String[] nextRow = null;
            nextRow = dataReader.getNextRow();
            for(int i = 0; i < 5; i++) {
               Department d1 = new Department(nextRow[0], Long.parseLong(nextRow[1]));
               hospital.addNewDepartment(d1);
               nextRow = dataReader.getNextRow();
            }
            
            dataReader = new DataReader("/Users/saurabhsrivastava/Desktop/FinalProject/final-project-fusionforce/FinalApplication/src/UI/EmployeeData.csv");
            nextRow = null;
            nextRow = dataReader.getNextRow();
            for(int i = 0; i < 13; i++) {
               Employee e1 = new Employee(nextRow[0], nextRow[1], Integer.parseInt(nextRow[2]), Integer.parseInt(nextRow[3]), hospital.getDepartmentDirectory().getDepartmentList().get(i%5), Role.RoleType.Doctor.name(),nextRow[4]);
               hospital.addNewEmployee(e1);
               nextRow = dataReader.getNextRow();
            }
            for(int i = 13; i < 18; i++) {
               Employee e1 = new Employee(nextRow[0], nextRow[1], Integer.parseInt(nextRow[2]), Integer.parseInt(nextRow[3]), null, Role.RoleType.Technician.name(), nextRow[4]);
               hospital.addNewEmployee(e1);
               nextRow = dataReader.getNextRow();
            }
            for(int i = 18; i < 20; i++) {
               Employee e1 = new Employee(nextRow[0], nextRow[1], Integer.parseInt(nextRow[2]), Integer.parseInt(nextRow[3]), null, Role.RoleType.Receptionist.name(), nextRow[4]);
               hospital.addNewEmployee(e1);
               nextRow = dataReader.getNextRow();
            }
            for(int i = 20; i < 21; i++) {
               Employee e1 = new Employee(nextRow[0], nextRow[1], Integer.parseInt(nextRow[2]), Integer.parseInt(nextRow[3]), null, Role.RoleType.WarehouseAdmin.name(), nextRow[4]);
               hospital.addNewEmployee(e1);
               nextRow = dataReader.getNextRow();
            }
            for(int i = 21; i < 22; i++) {
               Employee e1 = new Employee(nextRow[0], nextRow[1], Integer.parseInt(nextRow[2]), Integer.parseInt(nextRow[3]), null, Role.RoleType.DeliveryManager.name(), nextRow[4]);
               hospital.addNewEmployee(e1);
               nextRow = dataReader.getNextRow();
            }
            for(int i = 22; i < 23; i++) {
               Employee e1 = new Employee(nextRow[0], nextRow[1], Integer.parseInt(nextRow[2]), Integer.parseInt(nextRow[3]), null, Role.RoleType.FinanceAdmin.name(), nextRow[4]);
               hospital.addNewEmployee(e1);
               nextRow = dataReader.getNextRow();
            }             
                                                
            dataReader = new DataReader("/Users/saurabhsrivastava/Desktop/FinalProject/final-project-fusionforce/FinalApplication/src/UI/LabTestData.csv");
            nextRow = null;
            nextRow = dataReader.getNextRow();
            for(int i = 0; i < 5; i++) {
               LabTest l1 = new LabTest(nextRow[0], nextRow[1], nextRow[2]);
               hospital.addNewLabTest(l1);
               nextRow = dataReader.getNextRow();
            }
            
            dataReader = new DataReader("/Users/saurabhsrivastava/Desktop/FinalProject/final-project-fusionforce/FinalApplication/src/UI/PatientData.csv");
            nextRow = null;
            nextRow = dataReader.getNextRow();
            for(int i = 0; i < 20; i++) {
               Patient p1 = new Patient(nextRow[0], nextRow[1], nextRow[2], nextRow[3]);
               hospital.addNewPatient(p1);
               nextRow = dataReader.getNextRow();
            }
                                    
            dataReader = new DataReader("/Users/saurabhsrivastava/Desktop/FinalProject/final-project-fusionforce/FinalApplication/src/UI/PatientTestData.csv");
            nextRow = null;
            nextRow = dataReader.getNextRow();
            for(int i = 0; i < 20; i++) {
               PatientTest p1 = new PatientTest(nextRow[0], Boolean.parseBoolean(nextRow[1]), nextRow[2], hospital.getLabTestDirectory().getLabTestList().get(i%5), hospital.getPatientDirectory().getPatientList().get(i), "Normal");
               hospital.addNewPatientTest(p1);
               nextRow = dataReader.getNextRow();
            }
            
                                                
            dataReader = new DataReader("/Users/saurabhsrivastava/Desktop/FinalProject/final-project-fusionforce/FinalApplication/src/UI/PatientAppointment.csv");
            nextRow = null;
            nextRow = dataReader.getNextRow();
            List<Employee> employees = hospital.getEmployeeDirectory().getEmployeeList().stream().filter(r -> r.isDoctor()).collect(Collectors.toList());
            for(int i = 0; i < 40; i++) {
               PatientAppointment p1 = new PatientAppointment(nextRow[0], nextRow[1], nextRow[2], hospital.getPatientDirectory().getPatientList().get(i%20), employees.get(i%13), nextRow[3]);
               Employee employee = employees.get(i%13);
               employee.addNewPatientAppointment(p1);
               hospital.addNewPatientAppointment(p1);
               nextRow = dataReader.getNextRow();
            }
            
            dataReader = new DataReader("/Users/saurabhsrivastava/Desktop/FinalProject/final-project-fusionforce/FinalApplication/src/UI/MedicalInvetory.csv");
            nextRow = null;
            nextRow = dataReader.getNextRow();
            for(int i = 0; i < 22; i++) {
               MedicalSupplyInventory m1 = new MedicalSupplyInventory(nextRow[0],nextRow[1], nextRow[2], nextRow[3]);
               warehouse.addMedicalSupplyInventory(m1);
               nextRow = dataReader.getNextRow();
            }
        }
        catch(Exception e){
            System.out.print("Caught Exception");
        }
        String temp = "";
    }
    public void setMainframeSplitFrame(javax.swing.JPanel p){
        jSplitPane1.setRightComponent(p);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanelWorkArea = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelLogin1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelWorkArea.setBackground(new java.awt.Color(0, 204, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelWorkAreaLayout = new javax.swing.GroupLayout(jPanelWorkArea);
        jPanelWorkArea.setLayout(jPanelWorkAreaLayout);
        jPanelWorkAreaLayout.setHorizontalGroup(
            jPanelWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1328, Short.MAX_VALUE)
        );
        jPanelWorkAreaLayout.setVerticalGroup(
            jPanelWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanelWorkArea);

        jPanelLogin1.setBackground(new java.awt.Color(153, 204, 255));
        jPanelLogin1.setPreferredSize(new java.awt.Dimension(200, 800));

        loginJButton.setBackground(new java.awt.Color(255, 255, 204));
        loginJButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        logoutJButton.setBackground(new java.awt.Color(255, 255, 204));
        logoutJButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logoutJButton.setText("Logout");
        logoutJButton.setToolTipText("");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(255, 255, 204));
        btnSignUp.setFont(new java.awt.Font("Poor Richard", 3, 24)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLogin1Layout = new javax.swing.GroupLayout(jPanelLogin1);
        jPanelLogin1.setLayout(jPanelLogin1Layout);
        jPanelLogin1Layout.setHorizontalGroup(
            jPanelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogin1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelLogin1Layout.createSequentialGroup()
                        .addGroup(jPanelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelLogin1Layout.createSequentialGroup()
                        .addGroup(jPanelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSignUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordField)
                            .addComponent(loginJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(logoutJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginJLabel)
                        .addGap(47, 47, 47))))
        );
        jPanelLogin1Layout.setVerticalGroup(
            jPanelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogin1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(jPanelLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLogin1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(loginJLabel))
                    .addGroup(jPanelLogin1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(logoutJButton)
                .addGap(160, 160, 160)
                .addComponent(btnSignUp)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanelLogin1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        String username = userNameJTextField.getText();
        String password = passwordField.getText();
     
        
        if(hospital.getEmployeeDirectory().authenticateUserLogin(username, password))
        {

            Employee employee = hospital.getEmployeeDirectory().getEmployeeDetails(username);
            logoutJButton.setEnabled(true); 
            userNameJTextField.setEnabled(false);
            passwordField.setEnabled(false);
            loginJButton.setEnabled(false);
//            
            if(employee.getRole().equals("Doctor"))
            {
                btnSignUp.setEnabled(false);
                DoctorLandingPage doctorpanel = new DoctorLandingPage(hospital, employee);
                jSplitPane1.setRightComponent(doctorpanel);
                
                
            }
            else if(employee.getRole().equals("Technician"))
            {
                btnSignUp.setEnabled(false);
                Technician tchjp = new Technician(hospital, employee);
                jSplitPane1.setRightComponent(tchjp);
                
            }
            else if(employee.getRole().equals("Receptionist"))
            {
                btnSignUp.setEnabled(false);
                ReceptionistLandingPage rlpjp = new ReceptionistLandingPage(hospital, employee);
                jSplitPane1.setRightComponent(rlpjp);
                
            }
            
            else if(employee.getRole().equals("WarehouseAdmin"))
            {
                btnSignUp.setEnabled(false);
                WarehouseAdminLandingPage walp = new WarehouseAdminLandingPage(warehouse, employee);
                jSplitPane1.setRightComponent(walp);
                
            }
            else if(employee.getRole().equals("DeliveryManager"))
            {
                btnSignUp.setEnabled(false);
                Delivery djp = new Delivery(warehouse, employee);
                jSplitPane1.setRightComponent(djp);
                
            }
            else if(employee.getRole().equals("FinanceAdmin"))
            {
                btnSignUp.setEnabled(false);
                FinanceLandingPage flpjp = new FinanceLandingPage(hospital, employee, warehouse);
                jSplitPane1.setRightComponent(flpjp);
                
            }
            
        }
        else{
                 JOptionPane.showMessageDialog(this, "Invalid credentials");
            }
 

    }//GEN-LAST:event_loginJButtonActionPerformed

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
  
        userAccountLogin = null; 
        userNameJTextField.setText(""); 
        passwordField.setText("");
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);
        logoutJButton.setEnabled(false);
        jSplitPane1.setRightComponent(jPanelWorkArea);
         btnSignUp.setEnabled(true);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        
         SignUp sujp = new SignUp(hospital, this);
         jSplitPane1.setRightComponent(sujp);
               

   

    }//GEN-LAST:event_btnSignUpActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanelLogin1;
    private javax.swing.JPanel jPanelWorkArea;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables

public void switchToLoginPage() {
        // Enable the necessary components, clear fields, and set the content panel to the login page
        userAccountLogin = null;
        userNameJTextField.setText("");
        passwordField.setText("");
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);
        logoutJButton.setEnabled(false);
        btnSignUp.setEnabled(true);
        jSplitPane1.setRightComponent(jPanelWorkArea);
    }



}

