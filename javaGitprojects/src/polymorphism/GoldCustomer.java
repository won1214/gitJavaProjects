package polymorphism;

public class GoldCustomer extends Customer{
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	public int calcPRice(int price) {
		bonuspoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
