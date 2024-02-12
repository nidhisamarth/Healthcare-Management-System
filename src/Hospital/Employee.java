/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 *
 * @author saurabhsrivastava
 */
public class Employee {
    
    String firstName;
    String lastName;
    long id;
    long salary;
    Department department;
    String password;
    ArrayList<PatientAppointment> patientAppointmentList = new ArrayList<>();

    public ArrayList<PatientAppointment> getPatientAppointmentList() {
        return patientAppointmentList;
    }

    public void setPatientAppointmentList(ArrayList<PatientAppointment> patientAppointmentList) {
        this.patientAppointmentList = patientAppointmentList;
    }

    

    public Employee(String firstName, String lastName, long id, long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    
    public Employee(String firstName, String lastName, long id, long salary, Department department, String role, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.role = role;
        this.password = password;
    }

    public long getSalary() {
        return salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    String role;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private String hashPassword(String ps){
        String dgt = null;
        try{
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(ps.getBytes());
            byte[] h = m.digest();
            StringBuilder sb = new StringBuilder(2*h.length);
            for(byte b: h){
                sb.append(String.format("%02x", b & 0xff)); 
            }
            dgt = sb.toString();
        }catch(NoSuchAlgorithmException ex) {
        }
        
        return dgt;
    }
    public boolean isDoctor(){
        return (this.role.equals("Doctor"));
    }
    
    public boolean isReceiptionist(){
        return (this.role.equals("Receiptionist"));
    }

    public boolean isTechnician(){
        return (this.role.equals("Technician"));
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void addNewPatientAppointment(PatientAppointment patientAppointment) {
        patientAppointmentList.add(patientAppointment);
    }

    public Employee() {
    }
  
    
}
