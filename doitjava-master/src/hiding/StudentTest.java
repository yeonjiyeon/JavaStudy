package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = "이상원";
		studentLee.setSudentName("이상원");
		System.out.println(studentLee.getSudentName());
	}

}
