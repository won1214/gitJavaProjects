package inhertiance;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID,customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
//		System.out.println("VIPCustomer (int, String, int) 생성자 호출");
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는" + agentID +"입니다.";
	}
	
	public int calcPrice(int price) {
		bonuspoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
	
//	public String showCustomerInfo() {
//		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonuspoint + "입니다.";
//	}
}
