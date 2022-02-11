package Chapter5;

public class ClassEx2 {

	long orderNum;
	String ID;
	int day;
	String name;
	String num;
	String address;
	
	public static void main(String[] args) {
		ClassEx2 first = new ClassEx2();
		first.orderNum = 201803120001l;
		first.ID = "abc123";
		first.day = 20180312;
		first.name = "홍길순";
		first.num = "PD0345-12";
		first.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println(first.orderNum);
		System.out.println(first.ID);
		System.out.println(first.day);
		System.out.println(first.name);
		System.out.println(first.num);
		System.out.println(first.address);

	}

}
