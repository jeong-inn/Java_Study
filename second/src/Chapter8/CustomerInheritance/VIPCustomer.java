package Chapter8.CustomerInheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer(int, String, int) ������ ȣ��");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + " ��� ���� ���̵�� " + agentID + "�Դϴ�.";
	}
	
	public int getAgentID() {
		return agentID;
	}
}
