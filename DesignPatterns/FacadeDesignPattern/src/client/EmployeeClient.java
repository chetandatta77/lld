package client;

import dto.Employee;
import facade.EmployeeFacade;

public class EmployeeClient {
    public void getEmployeeDetails(){
        EmployeeFacade facade = new EmployeeFacade();
        Employee employeeDetails = facade.getEmployeeDetails(12424);
    }
}
