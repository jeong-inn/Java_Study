package Chapter9.gamelevel;

public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� Jump�մϴ�.");		
	}

	@Override
	public void turn() {
		System.out.println("�ѹ��� ���ϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** ������ �����Դϴ�. *****");		
	}
}