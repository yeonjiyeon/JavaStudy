package hiding;

public class Student {
	int sudentID;
	private String studentName;
	int grade;
	String address;
	
	public String getSudentName() {
		return studentName;
	}
	
	public void setSudentName(String stduentName) {
		this.studentName = stduentName;
	}
}
