package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = "�̻��";
		studentLee.setSudentName("�̻��");
		System.out.println(studentLee.getSudentName());
	}

}
