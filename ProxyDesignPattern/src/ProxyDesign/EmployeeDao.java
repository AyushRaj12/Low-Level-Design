package ProxyDesign;

public interface EmployeeDao {
   public void create(String Client,EmployeeDo obj) throws Exception;
   public void delete(String Client,int EmployeeId) throws Exception;
   public EmployeeDo get(String Client,int EmployeeId) throws Exception;
}
