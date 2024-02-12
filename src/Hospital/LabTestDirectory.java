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
public class LabTestDirectory {
    
    ArrayList<LabTest> labTestList = new ArrayList<>();

    public ArrayList<LabTest> getLabTestList() {
        return labTestList;
    }

    public void setLabTestList(ArrayList<LabTest> labTestList) {
        this.labTestList = labTestList;
    }
    
     public void addTest(LabTest labTest){
        labTestList.add(labTest);
    }
     
    public void addNewLabTest(LabTest labTest) {
        labTestList.add(labTest);
    }
    
    public LabTest findLabTestByName(String testName){
        for(LabTest labTest: labTestList){
            if(labTest.testName.equals(testName))
                return labTest;
        }
        return null;
    }
    
}
