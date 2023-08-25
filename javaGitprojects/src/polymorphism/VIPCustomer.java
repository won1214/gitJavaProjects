package polymorphism;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID  ) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int calcPrice(int price) {
		bonuspoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo() {
	return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonuspoint + "입니다.";
	}
	
	public int getAgentID() {
		return agentID;
	}

	
	
}
