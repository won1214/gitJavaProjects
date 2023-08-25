package template;

public class ManualCar extends Car{
	public void drive() {
		System.out.println("사람이 운전.");
		System.out.println("사람이 핸들을 조작");
	}
	
	public void stop() {
		System.out.println("브레이크로 정지함");
	}
	
	public void wiper() {
		System.out.println("사람이 빠르기를 조절함.");
	}
}
