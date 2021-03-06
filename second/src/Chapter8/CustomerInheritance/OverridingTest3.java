package Chapter8.CustomerInheritance;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 1000;
		
		Customer Lee = new Customer(10010, "이순신");
		Lee.bonusPoint = 1000;
		System.out.println(Lee.getCustomerName()+ "님이 지불해야 하는 금액은 " + Lee.calcPrice(price) + "원 입니다.");
		
		VIPCustomer Kim = new VIPCustomer(10020, "김유신", 12345);
		Kim.bonusPoint = 1000;
		System.out.println(Kim.getCustomerName()+ "님이 지불해야 하는 금액은 " + Kim.calcPrice(price) + "원 입니다.");
		
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		System.out.println(vc.getCustomerName()+ "님이 지불해야 하는 금액은 " + vc.calcPrice(price) + "원 입니다.");
	}
}