package chapter4;

public class ForExample1 {

	public static void main(String[] args) {
		int i;
		int sum;
		for(i = 1, sum = 0; i<= 10; i++) {
			sum += i;
		}
		System.out.println("1���� 10������ ����" +sum+ "�Դϴ�.");
		
		for(i = 1; i<= 10; i++) {
			System.out.println("�ȳ��ϼ���"+i);
		}
	}

}
