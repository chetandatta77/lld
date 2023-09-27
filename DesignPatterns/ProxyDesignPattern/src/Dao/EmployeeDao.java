package Dao;

import dto.EmployeeDo;

public interface EmployeeDao {

    //create employee object
    public void create(String client, EmployeeDo obj) throws Exception;

    //delete employee object with given id
    public void delete(String client, int employeeId) throws Exception;

    //get employee object with given id
    public EmployeeDo get(String client, int employeeId) throws Exception;
}
