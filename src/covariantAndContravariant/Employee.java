package covariantAndContravariant;

public class Employee extends Person {
	

	public Employee(String name, int age,String employerName,int employeeId) {
		super(name, age);
		this.employeeId = employeeId;
		this.employerName = employerName;
		// TODO Auto-generated constructor stub
	}
	
	private String employerName;
	private int employeeId;

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

}
