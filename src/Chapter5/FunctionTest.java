package Chapter5;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 10;
		
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);
		
	}
	
	public static void add(int a, int b) {
		int result = a + b;
		System.out.println(a + " + " + b + " = " + result);
	}
	
	public static void sub(int a, int b) {
		int result = a - b;
		System.out.println(a + " * " + b + " = " + result);

	}
	
	public static void mul(int a, int b) {
		int result = a * b;
		System.out.println(a + " - " + b + " = " + result);
	}
	
	public static int div(int a, int b) {
		if (b == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			int result = a / b;
			System.out.println(a + " / " + b + " = " + result);
		}
		return a+b;
	}
}
