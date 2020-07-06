package takeout.assistant.model;

public class BeanAdministrator {
	public static BeanAdministrator currentLoginUser=null;
	private String EmployeeID;
	private String staff_name;
	private String login_password;
	
	public static BeanAdministrator getCurrentLoginUser() {
		return currentLoginUser;
	}
	public static void setCurrentLoginUser(BeanAdministrator currentLoginUser) {
		BeanAdministrator.currentLoginUser = currentLoginUser;
	}
	
	public String getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	public String getLogin_password() {
		return login_password;
	}
	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}
	
	
}
