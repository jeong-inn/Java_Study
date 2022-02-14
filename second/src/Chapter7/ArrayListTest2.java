package Chapter7;
import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		
		student.add(new Student(1001, "James"));
		student.add(new Student(1002, "Tomas"));
		student.add(new Student(1003, "Edward"));
		
		for(int i = 0; i < student.size(); i++) {
			Student lang = student.get(i);
			lang.showStudentInfo();
		}
		
		System.out.println(" === 향상된 for문 사용 ===");
		for(Student lang : student) {
			lang.showStudentInfo();
		}
	}

}
