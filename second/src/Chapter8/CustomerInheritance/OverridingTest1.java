package Chapter8.CustomerInheritance;

public class OverridingTest1 {
	public static void main(String[] args) {
		Customer Lee = new Customer(10010, "�̼���");
		Lee.bonusPoint = 1000;
		
		VIPCustomer Kim = new VIPCustomer(10020, "������", 12345);
		Kim.bonusPoint = 1000;
		
		int price = 10000;
		System.out.println(Lee.getCustomerName()+ "���� �����ؾ� �ϴ� �ݾ��� " + Lee.calcPrice(price) + "�� �Դϴ�.");
		System.out.println(Kim.getCustomerName()+ "���� �����ؾ� �ϴ� �ݾ��� " + Kim.calcPrice(price) + "�� �Դϴ�.");

	}
}
