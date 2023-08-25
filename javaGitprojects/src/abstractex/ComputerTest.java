package abstractex;

public class ComputerTest {
	public static void main(String[] args) {
//		Computer c1 = new Computer();  //Computer()는 추상 클래스.
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();	//MyNoteBook()은 추상 클래스.
		Computer c4 = new MyNoteBook();
		
		
		//추상 클래스는 인스턴스로 생성할 수 없음.
		//구현된 코드가 없으므로 수행할 수 있는 내용이 없음.
		
		
		/* 추상클래스는 상속을 하기 위해 만든 클래스.
		추상 클래스에서 구현하는 메서드는 하위 클래스에서도 사용할, 
		즉 하위 클래스에서도 구현 내용을 공유할 메서드를 구현.
		*/
		
		
	}
}
