package Chapter8.CustomerInheritance;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 1000;
		
		Customer Lee = new Customer(10010, "�̼���");
		Lee.bonusPoint = 1000;
		System.out.println(Lee.getCustomerName()+ "���� �����ؾ� �ϴ� �ݾ��� " + Lee.calcPrice(price) + "�� �Դϴ�.");
		
		VIPCustomer Kim = new VIPCustomer(10020, "������", 12345);
		Kim.bonusPoint = 1000;
		System.out.println(Kim.getCustomerName()+ "���� �����ؾ� �ϴ� �ݾ��� " + Kim.calcPrice(price) + "�� �Դϴ�.");
		
		Customer vc = new VIPCustomer(10030, "������", 2000);
		vc.bonusPoint = 1000;
		System.out.println(vc.getCustomerName()+ "���� �����ؾ� �ϴ� �ݾ��� " + vc.calcPrice(price) + "�� �Դϴ�.");
	}
}