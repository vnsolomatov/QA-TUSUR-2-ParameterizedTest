public class Main {

		public static void main(String[] args) {
			
			Student s1 = new Student();
			s1.setFirstName("Ivan");
			s1.setLastName("SIDORov-Kuri");
			s1.setAge(25);
						
			Student s2 = new Student("Ivan", "nIkulin", 87);			
			Student s3 = new Student("kONStantin","petrov", 33);
			Student s4 = new Student("Vladimir","Solomatov", 61);
			
			System.out.println(s1.getFullName() + ", " + s1.getAge());
			System.out.println(s2.getFullName() + ", " + s2.getAge());
			System.out.println(s3.getFullName() + ", " + s3.getAge());
			System.out.println(s4.getFullName());
			
			Student[] students = { s1,s2,s3};
			  Student[] students2 = {new Student("Alexandr", "Ivanov", 20), new Student("Vladimir", "Petrov", 18),
						new Student("Aleksey", "Alekseev", 35)};
			
			System.out.println("AVG= "+Student.avgAge(students2));
			System.out.println("MAX= "+Student.maxAge(students));
			System.out.println("MIN= "+Student.minAge(students));			  
		}
}
