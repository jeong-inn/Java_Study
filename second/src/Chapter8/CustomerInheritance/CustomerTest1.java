package Chapter8.CustomerInheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		/*
		Customer Lee = new Customer();
		Lee.setCustomerID(10010);
		Lee.setCustomerName("�̼���");
		Lee.bonusPoint = 1000;
		System.out.println(Lee.showCustomerInfo());
		*/
		
		VIPCustomer Kim = new VIPCustomer(10020, "������", 100);
		Kim.bonusPoint = 1000;
		System.out.println(Kim.showVIPInfo());
	}
}
