package polymorphism;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonuspoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonuspoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo());
		System.out.println("\n========할인율과 보너스 포인트 계산===========\n");
		
//		int price = 10000;
		int leePrice = customerLee.calcPrice(10000);
		int KimPrice = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.getCustomerName() + "님이 " + leePrice + "원 지불하셨습니다.");
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println(customerKim.getCustomerName() + "님이 " + KimPrice + "원 지불하셨습니다.");
		System.out.println(customerKim.showCustomerInfo());
		
	}
}
