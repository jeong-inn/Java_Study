package chapter4;

public class IfEx3 {

	public static void main(String[] args) {
		int score = 85;
		int grade;
		
		if(score <= 59) 
			grade = 'F';
		else if(score <= 69)
			grade = 'D';
		else if(score <= 79)
			grade = 'C';
		else if(score <= 89)
			grade = 'B';
		else
			grade = 'A';
		
		System.out.println("학점은 " + (char)grade + "입니다.");
	}

}
