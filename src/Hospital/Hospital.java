/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author saurabhsrivastava
 */
public class Hospital {
    
    EmployeeDirectory employeeDirectory;
    
    DepartmentDirectory departmentDirectory;
    
    PatientDirectory patientDirectory;
    
    LabTestDirectory labTestDirectory;
    
    PatientTestDirectory patientTestDirectory;
    
    PatientAppointmentDirectory patientAppointmentDirectory;

    public PatientAppointmentDirectory getPatientAppointmentDirectory() {
        return patientAppointmentDirectory;
    }

    public void setPatientAppointmentDirectory(PatientAppointmentDirectory patientAppointmentDirectory) {
        this.patientAppointmentDirectory = patientAppointmentDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public DepartmentDirectory getDepartmentDirectory() {
        return departmentDirectory;
    }

    public void setDepartmentDirectory(DepartmentDirectory departmentDirectory) {
        this.departmentDirectory = departmentDirectory;
    }
  
    
    public void addNewEmployee(Employee employee) {
        if(employeeDirectory == null) employeeDirectory = new EmployeeDirectory();
        employeeDirectory.addNewEmployee(employee);
    }
    
    public void addNewDepartment(Department department) {
        if(departmentDirectory == null) departmentDirectory = new DepartmentDirectory();
        departmentDirectory.addNewDepartment(department);
    }
    
    public void addNewPatient(Patient patient) {
        if(patientDirectory == null) patientDirectory = new PatientDirectory();
        patientDirectory.addNewPatient(patient);
    }
    
    public void addNewLabTest(LabTest labTest) {
        if(labTestDirectory == null) labTestDirectory = new LabTestDirectory();
        labTestDirectory.addNewLabTest(labTest);
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public LabTestDirectory getLabTestDirectory() {
        return labTestDirectory;
    }

    public void setLabTestDirectory(LabTestDirectory labTestDirectory) {
        this.labTestDirectory = labTestDirectory;
    }

    public PatientTestDirectory getPatientTestDirectory() {
        return patientTestDirectory;
    }

    public void setPatientTestDirectory(PatientTestDirectory patientTestDirectory) {
        this.patientTestDirectory = patientTestDirectory;
    }
    
    public void addNewPatientTest(PatientTest patientTest) {
        if(patientTestDirectory == null) patientTestDirectory = new PatientTestDirectory();
        patientTestDirectory.addNewPatientTest(patientTest);
    }
    
    public void addNewPatientAppointment(PatientAppointment patientAppointment) {
        if(patientAppointmentDirectory == null) patientAppointmentDirectory = new PatientAppointmentDirectory();
        patientAppointmentDirectory.addNewPatientAppointment(patientAppointment);
    }
}
