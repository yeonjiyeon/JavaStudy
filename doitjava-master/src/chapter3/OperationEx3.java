package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10)< 10) && ((i = i + 2)< 10);//뒤에 문장이 실행되지 않아서 i=2
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2)< 10);//뒤에 문장이 실행되지 않아서 i=2
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
