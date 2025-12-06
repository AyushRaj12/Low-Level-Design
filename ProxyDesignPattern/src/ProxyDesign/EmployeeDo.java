package ProxyDesign;

public class EmployeeDo {
     int EmplyoyeeId;
     String EmployeeName;
	 public EmployeeDo(int employeeId,String employeeName) {
		this.EmplyoyeeId=employeeId;
		this.EmployeeName=employeeName;
	 }
	public int getEmplyoyeeId() {
		return EmplyoyeeId;
	}
	public void setEmplyoyeeId(int emplyoyeeId) {
		EmplyoyeeId = emplyoyeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
}
