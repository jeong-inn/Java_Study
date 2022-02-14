package Chapter6;

class BirthDay{
	int day;
	int month;
	int year;

	public void setYear(int year) {
		this.year = year;
	}

	public void printThis() {
		System.out.println(this);
	}
}

public class ThisEx {
	public static void main(String[] args) {
		BirthDay bday = new BirthDay();
		bday.setYear(2000);
		System.out.println(bday);
		bday.printThis();
	}
}
