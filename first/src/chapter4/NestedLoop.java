package chapter4;

public class NestedLoop {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan = 1; dan < 10; dan++) {
			for(times = 1; times <10; times++) {
				System.out.println(dan + " X " + times + " = " + (dan*times));
				}
			System.out.println(" ");
		}
	}

}
