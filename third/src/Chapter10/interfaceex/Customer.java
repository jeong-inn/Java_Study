package Chapter10.interfaceex;

public class Customer implements Buy, Sell{
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
	}
	
	public void buy() {
		System.out.println("�����ϱ�");
	}
}
