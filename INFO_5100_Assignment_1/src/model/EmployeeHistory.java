/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Rishab
 */
public class EmployeeHistory {
   
    private ArrayList<Employee> empList;
    
    public EmployeeHistory(){
        this.empList = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }
    
    public Employee addEmployee(){
        
        Employee emp = new Employee();
        empList.add(emp);
        
        return emp;
        
    }
    
    
    public ArrayList<Employee> getEmployeeList(){
        return empList;
    }

//    public Employee updateEmployee(Employee selectedEmp , int selectRowIndex){
//        
////        empList.re
////        //empList.set(selectRowIndex, selectedEmp)
////        
////        return emp;
//        
//    }
    
    
    public void deleteEmployee(Employee selectedEmp) {

        empList.remove(selectedEmp);
        
    }
    
}
