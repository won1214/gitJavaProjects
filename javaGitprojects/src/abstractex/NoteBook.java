package abstractex;

public abstract class NoteBook extends Computer{
	
	public void display() {
		System.out.println("NoteBook display()");
	}
	
	//상속 받은 추상메서드를 모두 구현하지 않고 display() 하나만 구현하였음.
	//추상메서드 public abstract void typing(); 을 가지고 있기 때문에 추상클래스가 됨
	
}
