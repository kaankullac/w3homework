
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Kaan");
		student1.setLastName("Küllaç");
		student1.setCourseTaken("Java Kursu");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setCourseGiven("Java Kursu");
		
		User[] users = new User[] {student1,instructor1};
		System.out.println("Kullanýcýlar: ");
		
		for(User user:users) {
			System.out.println(user.getId()+user.getFirstName()+user.getLastName());
		}
		
		Student[] students = new Student[] {student1};
		System.out.println("Öðrenciler");
		for(Student student:students) {
			System.out.println(student.getId() + student.getFirstName()+ student.getLastName()+": "+student.getCourseTaken());
			
		}
		Instructor[] instructors = new Instructor[] {instructor1};
		System.out.println("Eðitmenler");
		for(Instructor instructor:instructors) {
			System.out.println(instructor.getId()+instructor.getFirstName()+instructor.getLastName()+": "+instructor.getCourseGiven());
		}
		
	
	}

}
