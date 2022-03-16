package inheritance;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String cutomerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	public Customer() {
		cutomerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer ������ ȣ��");
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		cutomerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int,string) ������ ȣ��");
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCutomerGrade() {
		return cutomerGrade;
	}

	public void setCutomerGrade(String cutomerGrade) {
		this.cutomerGrade = cutomerGrade;
	}


	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName+"���� �����"+cutomerGrade+"�̸�, ���ʽ� ����Ʈ��"+bonusPoint+"�Դϴ�";
	}
}
