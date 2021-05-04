package odevInheritance;

public class Student extends User{
	

	private String department;
	
	public Student(String firstName, String lastName, String department) {
		super(firstName, lastName);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
