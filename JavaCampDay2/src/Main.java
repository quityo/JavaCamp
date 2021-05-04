

public class Main {

	public static void main(String[] args) {
		
		Courses courses1 = new Courses(
				1,
				"Software Developer Training Camp (C# + ANGULAR)");
		
		Courses courses2 = new Courses(
				2,
				"Software Developer Training Camp (Java + React)");
		
		Courses courses3 = new Courses();
				courses3.id= 3;
				courses3.courseName= "Basic Course for Introduction to Programming";
				
				
				
		Courses[] courses = {courses1, courses2, courses3};
				for (Courses course : courses) {
					System.out.println("Kurslar: " + "'"+ course.courseName+ "'");
				}
				
		Instructors instructors1 = new Instructors(
				1,
				"Engin",
				"DemirOg");
		Instructors instructors2 = new Instructors(
				2,
				"xxxx",
				"yyyy");
		
		Instructors instructors3 = new Instructors();
			instructors3.id=3;
			instructors3.name="oooo";
			instructors3.lastName="zzzz";	
			
			System.out.println("---------------------------------------------------");	
			Instructors[] instructors = {instructors1, instructors2, instructors3};
			for (Instructors instructor : instructors) {
				System.out.println("Egitmenler: " + "'"+ instructor.name+ " "+ instructor.lastName+"'");
			}
			System.out.println("---------------------------------------------------");	
			CourseManager courseManager = new CourseManager();
			courseManager.add(courses2, instructors1);;
			
	}

}
