//package exception;
//
//public class IDFormatTest {
//	private String userID;
//	
//	public String getUserID() {
//		return userID;
//	}
//	
//	public void setUserID(String userID) throws IDFormalException {
//		if(userID == null) {
//			throw new IDFormalException("아이디는 null일 수 없습니다");
//		}else if(userID.length() < 8 || userID.length() > 20) {
//			throw new IDFormalException("아이디는 8자 이상 20자 이하로 쓰세요");
//		}
//		this.userID = userID;
//	}
//	public static void main(String[] args) {
//		IDFormalException test = new IDFormalException();
//		String userID = null;
//		try {
//			test.setUserID(userID);
//		} catch (IDFormalException e) {
//			System.out.println(e.getMessage());
//		}
//	}
//
//}
