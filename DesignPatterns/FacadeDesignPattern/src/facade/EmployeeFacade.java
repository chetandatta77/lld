package facade;

import dao.EmployeeDao;
import dto.Employee;

public class EmployeeFacade {
    EmployeeDao employeeDao;

    public EmployeeFacade() {
        this.employeeDao = new EmployeeDao();
    }

    public void insert(){
        employeeDao.insert();
    }

    public Employee getEmployeeDetails(int empId){
        return employeeDao.getEmployeeDetails(empId);
    }
}
