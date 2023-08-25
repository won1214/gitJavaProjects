package template;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("===자율 주행하는 자동차====");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("===사람이 운전하는 자동차====");
		Car hisCar = new ManualCar();
		hisCar.run();
		
		
		//일반 메서드는 하위 클래스에서 재정의 가능
		//ex) start()와 turnOff()도 추가기능 필요하면 하위클래스에서 재정의 가능.
		
		//템플릿 메서드는 로직 흐름을 정의하는 역할.
		//모든 하위 클래스가 공통으로 사용하고 코드를 변경하면 안되기 때문에 final 선언.
		
	}
}
