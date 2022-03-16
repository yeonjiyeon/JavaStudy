package chapter2;

public class ImplicitConversion {
	public static void main(String argus[]) {
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;//20.0
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
	}
}
