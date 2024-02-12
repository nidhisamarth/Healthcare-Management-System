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
public class PatientDirectory {
    
    ArrayList<Patient> patientList = new ArrayList();

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public void addNewPatient(Patient patient) {
        patientList.add(patient);
    } 
    
}
