package Chapter10.scheduler;

public class PriorityAllocation implements Scheduler{
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
	}
	
	public void sendCallToAgent() {
		System.out.println("���� SKILL ���� ���� �������� �켱������ ����մϴ�.");
	}
}
