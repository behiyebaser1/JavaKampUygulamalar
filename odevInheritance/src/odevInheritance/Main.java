package odevInheritance;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor("Engin", "Demiroğ","Java");
		Instructor instructor2 = new Instructor("Ömer", "Şahin", "C#");
		
		Student student1 =  new Student("Behiye", "Başer", "Bilgisayar Mühendisliği");
		Student student2 =  new Student("Eren", "Yılmaz","Makine Mühendisliği");
		Student student3 =  new Student("Mustafa", "Demir","Bilgisayar Mühendisliği");
		Student student4 =  new Student("Aslı", "Doğan","Elektrik-Elektronik Mühendisliği");
		
		UserManager userManager = new UserManager();
		//userManager.add(instructor1);
		//userManager.add(student2);
		
		User[] users  = {instructor1, instructor2, student1, student2, student3, student4};
		
		Instructor[] instructors= {instructor1, instructor2};
		Student[] students  = {student1, student2, student3, student4};
		
		
		userManager.addMultiple(users);
		
		userManager.list(users);
		
		InstructorManager instructorManager  = new InstructorManager();
		instructorManager.listToBranch(instructors);
		
		StudentManager studentManager  = new StudentManager();
		studentManager.listToDepartment(students);
		
		
	

	}

}
