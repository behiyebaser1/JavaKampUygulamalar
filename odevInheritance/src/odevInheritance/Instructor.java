package odevInheritance;

public class Instructor extends User {
	
	private String branch;
	
	public Instructor(String firstName, String lastName, String branch) {
		super(firstName, lastName);
		this.branch = branch;
	}
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}
