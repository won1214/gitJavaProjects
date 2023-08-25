package abstractex;

public abstract class Computer {
	
	//추상 메서드 선언
	//display()와 typing()은 하위 클래스에 따라 구현이 달라짐.
	
	public abstract void display();
	public abstract void typing();
	
	
	//구현 메서드 선언
	//Computer 를 상속 받는 클래스 중 turnOn()과 turnOff() 구현 코드는 공통.
	
	public void turnOn() {
		System.out.println("전원을 킵니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
