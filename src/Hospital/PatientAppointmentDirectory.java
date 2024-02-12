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
public class PatientAppointmentDirectory {
    ArrayList<PatientAppointment> patientAppointmentList = new ArrayList<>();

    public ArrayList<PatientAppointment> getPatientAppointmentList() {
        return patientAppointmentList;
    }

    public void setPatientAppointmentList(ArrayList<PatientAppointment> patientAppointmentList) {
        this.patientAppointmentList = patientAppointmentList;
    }
    
    public void addNewPatientAppointment(PatientAppointment patientAppointment) {
        patientAppointmentList.add(patientAppointment);
    }
    
}
