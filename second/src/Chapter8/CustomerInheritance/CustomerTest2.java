package Chapter8.CustomerInheritance;
import java.util.ArrayList;

public class CustomerTest2 {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer Lee = new Customer(10010, "�̼���");
		Customer Shin = new Customer(10020, "�Ż��Ӵ�");
		Customer Hong = new GoldCustomer(10030, "ȫ�浿");
		Customer Youl = new GoldCustomer(10040, "������");
		Customer Kim = new VIPCustomer(10050, "������", 12345);
		
		customerList.add(Lee);
		customerList.add(Shin);
		customerList.add(Hong);
		customerList.add(Youl);
		customerList.add(Kim);
		
		System.out.println("===== �� ���� ��� =====");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== �������� ���ʽ� ����Ʈ ��� =====");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�� �Դϴ�.");
		}

	}

}
