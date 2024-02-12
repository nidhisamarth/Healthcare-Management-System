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
public class PatientTestDirectory {
    ArrayList<PatientTest> patientTestList = new ArrayList<>();

    public ArrayList<PatientTest> getPatientTestList() {
        return patientTestList;
    }

    public void setPatientTestList(ArrayList<PatientTest> patientTestList) {
        this.patientTestList = patientTestList;
    }
    
    public void addNewPatientTest(PatientTest patientTest) {
        patientTestList.add(patientTest);
    }
}
