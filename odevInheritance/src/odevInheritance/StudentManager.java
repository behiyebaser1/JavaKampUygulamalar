package odevInheritance;

public class StudentManager extends UserManager {

	@Override
	public void list(User[] user) {
		// TODO Auto-generated method stub
		super.list(user);
	}
	
	
	public void listToDepartment(Student[] student) {
		
		System.out.println("\nSistemdeki öğrencilerin bölümleri : \n");
		for(Student students  : student) {
			
			System.out.println(students.getFirstName() + " " + students.getLastName() + " --> " +
			students.getDepartment());
		}
		
		
	}
	
	
	

}
