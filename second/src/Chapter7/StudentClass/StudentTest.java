package Chapter7.StudentClass;

public class StudentTest {
	public static void main(String[] args) {
		Student Lee = new Student(1001, "Lee");
		Lee.addSubject("����", 100);
		Lee.addSubject("����", 50);
		
		Student Kim = new Student(1002, "Kim");
		Kim.addSubject("����", 70);
		Kim.addSubject("����", 85);
		Kim.addSubject("����", 100);
		
		Lee.showStudentInfo();
		System.out.println("======================");
		Kim.showStudentInfo();
	}

}
