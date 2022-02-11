package Chapter5;

public class ClassEx1 {
	
	int age;
	String name;
	boolean married;
	int kids;
	
	public static void main(String[] args) {
		ClassEx1 J = new ClassEx1();
		J.age = 40;
		J.name = "James";
		J.married = true;
		J.kids = 3;
		
		System.out.println(J.age);
		System.out.println(J.name);
		System.out.println(J.married);
		System.out.println(J.kids);
		
	}

}
