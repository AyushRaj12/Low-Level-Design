package ProxyDesign;

public class EmployeeDaoProxy implements EmployeeDao {
	
	EmployeeDao empDaoObj;
	
	public EmployeeDaoProxy() {
		empDaoObj=new EmployeeDaoImpl();
	}
	
	@Override
	public void create(String Client, EmployeeDo obj)throws Exception{
		if(Client.equals("ADMIN")) {
			empDaoObj.create(Client, obj);
			return;
		}
		throw new Exception("Access Denied");

	}

	@Override
	public void delete(String Client, int employeeId)throws Exception {
		if(Client.equals("ADMIN")) {
			empDaoObj.delete(Client, employeeId);
			return;
		}
		throw new Exception("Access Denied");

	}

	@Override
	public EmployeeDo get(String Client, int employeeId) throws Exception{
		if(Client.equals("ADMIN") || Client.equals("USER")) {
			return empDaoObj.get(Client, employeeId);
		}
		throw new Exception("Access Denied");

	}

}
