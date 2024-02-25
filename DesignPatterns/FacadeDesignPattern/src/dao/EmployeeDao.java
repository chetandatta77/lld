package dao;

import dto.Employee;

public class EmployeeDao {

    public void insert(){
        //insert employee details into the db
    }

    public void updateEmployeeName(int empId){
        //update employee details
    }

    public Employee getEmployeeDetails(String emailId){
        //return employee details based on emailId
        return new Employee();
    }

    public Employee getEmployeeDetails(int empId){
        //return employee details based on empId;
        return new Employee();
    }
}
