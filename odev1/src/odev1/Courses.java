package odev1;

public class Courses {
	
	public Courses(){
		System.out.println("Kurslarým");
		
	}
	public Courses(String courseName, String courseTeacher, int courseCompletion) {
		
		this();
		this.courseCompletion = courseCompletion;
		this.courseName = courseName;
		this.courseTeacher = courseTeacher;
			
	}

	String courseName;
	String courseTeacher;
	int courseCompletion;
	
	
	
}
