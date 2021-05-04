package odevInheritance;

public class InstructorManager extends UserManager {

	@Override
	public void list(User[] user) {
		// TODO Auto-generated method stub
		super.list(user);
	}
	
	
	public void listToBranch(Instructor[] instructor) {
		
		System.out.println("\nSistemde verilen kurslar : \n");
		for(Instructor instructors : instructor) {
			
			System.out.println(instructors.getFirstName() +" "+ instructors.getLastName() + " --> " +
					instructors.getBranch());
		}
		
	}
	

}
