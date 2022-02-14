package Chapter7;

public class Student {
	int studentID;
	String name;
	
	void showStudentInfo() {
		System.out.println(studentID +", " + name);
	}
	
	public Student(int studentID, String name){
		this.studentID = studentID;
		this.name = name;
	}
}
