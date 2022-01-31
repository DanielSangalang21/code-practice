package DSProject;

public class Student {
	private String name;
	private String rollNo;
	private String cgpa;

	public Student(String name, String rollNo, String cgpa) {
		this.name = name;
		this.rollNo = rollNo;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + this.name + " Roll no: " + this.rollNo + " CGPA: " + this.cgpa;
	}
}
