package chapter4;

public class Ifexample2 {

	public static void main(String[] args) {
		int age = 9;
		int charge;

		if(age < 8) {
			charge = 1000;
			System.out.println("���� �� �Ƶ��Դϴ�");
		}else if(age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�");
		}else if(age < 20) {
			charge = 2500;
			System.out.println("��, ����л��Դϴ�");
		}else {
			charge = 3000;
			System.out.println("�Ϲ����Դϴ�");
		}
		System.out.println("������ "+ charge +"�Դϴ�");
		
		int score=77;
		char grade;
		if(score >= 90) {
			grade = 'A';
			
		}else if(score >= 80) {
			grade ='B';
			
		}else if(score >= 70) {
			grade ='C';
			
		}else if(score >= 60) {
			grade = 'D';
			
		}else {
			grade = 'F';
			
		}
		System.out.println("������ "+ grade +"�Դϴ�");
	}


	




}
