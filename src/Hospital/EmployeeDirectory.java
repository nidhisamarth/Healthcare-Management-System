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
public class EmployeeDirectory {
    
    ArrayList<Employee> employeeList = new ArrayList<>();

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public void addNewEmployee(Employee employee) {
        employeeList.add(employee);
    }
    
    public boolean authenticateUserLogin(String username,String password)
    {
        for (Employee employee : employeeList)
            if (employee.getFirstName().equals(username) && employee.getPassword().equals(password)){
                return true;
            }
        return false;
    }
    
    public Employee getEmployeeDetails(String username)
    {
        for (Employee employee : employeeList)
            if (employee.getFirstName().equals(username)){
                return employee;
            }
        return null;
    }
    
}
