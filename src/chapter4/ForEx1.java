package chapter4;

public class ForEx1 {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		
		for(num = 0; num<= 10; num++) {
			sum += num;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
