package Chapter8.CustomerInheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer Lee = new Customer();
		Lee.setCustomerName("이순신");
		Lee.setCustomerID(10010);
		Lee.bonusPoint = 1000;
		
		System.out.println(Lee.showCustomerInfo());
		
		VIPCustomer Kim = new VIPCustomer(10020, "김유신", 12345);
		Kim.bonusPoint = 1000;
		System.out.println(Kim.showCustomerInfo());
		System.out.println("==== 할인율과 보너스 포인트 계산 =====");
		
		int price = 10000;
		int LeePrice = Lee.calcPrice(price);
		int KimPrice = Kim.calcPrice(price);
		
		System.out.println(Lee.getCustomerName() + "님이 " + LeePrice + "원 지불했습니다.");
		System.out.println(Lee.showCustomerInfo());
		System.out.println(Kim.getCustomerName() + "님이 " + KimPrice + "원 지불했습니다.");
		System.out.println(Kim.showCustomerInfo());

	}
}
