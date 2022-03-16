package thisex;

class BrithDay{
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

public class ThisExample {

	public static void main(String[] args) {
		BrithDay bDay = new BrithDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();

	}

}
