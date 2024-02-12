/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;



/**
 *
 * @author saurabhsrivastava
 */
public class PatientTest {
    
    String testDate;
    boolean reportAvalaible;
    String testId;
    LabTest labTest;
    Patient patient;
    String descr;
    String doctorName;

    public PatientTest(String testDate, boolean reportAvalaible, String testId, LabTest labTest, Patient patient, String descr, String doctorName) {
        this.testDate = testDate;
        this.reportAvalaible = reportAvalaible;
        this.testId = testId;
        this.labTest = labTest;
        this.patient = patient;
        this.descr = descr;
        this.doctorName = doctorName;
    }

    public PatientTest(String testDate, boolean reportAvalaible, String testId, LabTest labTest, Patient patient, String descr) {
        this.testDate = testDate;
        this.reportAvalaible = reportAvalaible;
        this.testId = testId;
        this.labTest = labTest;
        this.patient = patient;
        this.descr = descr;
    }

    public PatientTest(String testDate, boolean reportAvalaible, String testId) {
        this.testDate = testDate;
        this.reportAvalaible = reportAvalaible;
        this.testId = testId;
    }
    

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public boolean isReportAvalaible() {
        return reportAvalaible;
    }

    public void setReportAvalaible(boolean reportAvalaible) {
        this.reportAvalaible = reportAvalaible;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public LabTest getLabTest() {
        return labTest;
    }

    public void setLabTest(LabTest labTest) {
        this.labTest = labTest;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        return testDate ;
    }
  
}
