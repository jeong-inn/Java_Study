package Chapter10.interfaceex;

public class Customer implements Buy, Sell{
	public void sell() {
		System.out.println("판매하기");
	}
	
	public void buy() {
		System.out.println("구매하기");
	}
}
