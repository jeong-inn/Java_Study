package Chapter10.Calc;

public class CompleteCalc extends Calculator{
	public int times(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1/num2; 
		}else
			return Calc.ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc �������̽��� �����߽��ϴ�.");
	}
}
