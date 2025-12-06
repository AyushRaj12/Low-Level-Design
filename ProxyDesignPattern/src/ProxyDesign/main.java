package ProxyDesign;

public class main {
  public static void main(String args[]) {
	  try {
	  EmployeeDao employeeobj=new EmployeeDaoProxy();
	  employeeobj.create("USER", new EmployeeDo(123,"Ayush"));
	  System.out.print("Operation Successful");
	  }catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
  }
}
