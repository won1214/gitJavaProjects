package template;

public abstract class Car {
	
	//추상메서드 -> 자동차 종류에 따라 구현 내용이 달라지는 부분
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	
	//자동차 종류 상관 없이 공통으로 사용하는 메서드
	public void StartCar() {
		System.out.println("시동을 켭니다");
	}
	
	//템플릿 메서드 : 메서드 실행 순서와 시나리오 정의하는 것.
	//따라서 바뀔 수 없음. -> final 예약어 사용해 선언함.
	final public void run() {
		StartCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
	
	//자동차 종류 상관 없이 공통으로 사용하는 메서드
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
}
