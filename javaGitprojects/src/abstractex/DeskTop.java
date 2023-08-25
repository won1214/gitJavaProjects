package abstractex;

public class DeskTop extends Computer{
	
	public void display() {
		System.out.println("DeskTop display()");
	}
	
	public void typing() {
		System.out.println("DeskTop typing()");
	}
	
	// 추상 클래스(Computer)를 상속받은 하위클래스(DeskTop)가
	//모든 추상메서드들의 몸체 코드를 작성했기 때문에 
	//(즉, 추상메서드를 모두 구현했으므로) 구체적인 클래스가 됨
	
}
