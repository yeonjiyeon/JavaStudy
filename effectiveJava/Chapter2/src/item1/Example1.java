package item1;

public class Example1 {
//정적 팩토리 메서드 : 클래스의 인스턴스를 반환해 준다.
	public static Boolean valueOf(boolean b) {
		return b? Boolean.TRUE : Boolean.FALSE;
	}
}
