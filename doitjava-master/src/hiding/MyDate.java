package hiding;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		if(month == 2) {
			System.out.println("�����Դϴ�");
		}else {
			this.day = day;
		}
	}
}
