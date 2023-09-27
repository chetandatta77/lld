import Dao.EmployeeDao;
import Dao.EmployeeDaoProxy;
import dto.EmployeeDo;

public class ProxyPattern {
    public static void main(String[] args) {
        try{
            EmployeeDao employeeDao = new EmployeeDaoProxy();
            employeeDao.create("USER", new EmployeeDo());
            System.out.println("Operation successful");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
