/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author saurabhsrivastava
 */
public class PatientAppointment {
   
    String appointmentDate;
    String appointmentTime;
    String id;
    Patient patient;
    Employee employee;
    String desc;

    public PatientAppointment(String appointmentDate, String appointmentTime, String id, Patient patient, Employee employee) {
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.id = id;
        this.patient = patient;
        this.employee = employee;
    }

    public PatientAppointment(String appointmentDate, String appointmentTime, String id, Patient patient, Employee employee, String desc) {
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.id = id;
        this.patient = patient;
        this.employee = employee;
        this.desc = desc;
    }

    
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
}
