package Chapter8.CustomerInheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer Lee = new Customer();
		Lee.setCustomerName("�̼���");
		Lee.setCustomerID(10010);
		Lee.bonusPoint = 1000;
		
		System.out.println(Lee.showCustomerInfo());
		
		VIPCustomer Kim = new VIPCustomer(10020, "������", 12345);
		Kim.bonusPoint = 1000;
		System.out.println(Kim.showCustomerInfo());
		System.out.println("==== �������� ���ʽ� ����Ʈ ��� =====");
		
		int price = 10000;
		int LeePrice = Lee.calcPrice(price);
		int KimPrice = Kim.calcPrice(price);
		
		System.out.println(Lee.getCustomerName() + "���� " + LeePrice + "�� �����߽��ϴ�.");
		System.out.println(Lee.showCustomerInfo());
		System.out.println(Kim.getCustomerName() + "���� " + KimPrice + "�� �����߽��ϴ�.");
		System.out.println(Kim.showCustomerInfo());

	}
}
