/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.util.ArrayList;

/**
 *
 * @author saurabhsrivastava
 */
public class Patient {
    String id;
    String patientName;
    String patientPhoneNumber;
    String patientEmail;

    ArrayList<PatientTest> patientTestList = new ArrayList<>();

    public String getPatientId() {
        return id;
    }

    public void setPatientId(String id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public ArrayList<PatientTest> getPatientTestList() {
        return patientTestList;
    }

    public void setPatientTestList(ArrayList<PatientTest> patientTestList) {
        this.patientTestList = patientTestList;
    }

    public Patient(String id, String patientName, String patientPhoneNumber, String patientEmail) {
        this.id = id;
        this.patientName = patientName;
        this.patientPhoneNumber = patientPhoneNumber;
        this.patientEmail = patientEmail;
    }
    
    public void addNewPatientAppointment(PatientTest patientTest) {
        patientTestList.add(patientTest);
    }

    @Override
    public String toString() {
        return patientName ;
    }
    
    
   
    
}