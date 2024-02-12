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
public class DepartmentDirectory {
    
    ArrayList<Department> departmentList = new ArrayList<>();

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }
    
    public void addNewDepartment(Department department) {
        departmentList.add(department);
    }    
    
    
}
