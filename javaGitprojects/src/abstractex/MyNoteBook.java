package abstractex;

public class MyNoteBook extends NoteBook{
	public void typing() {
		System.out.println("MyNoteBook typing()");
	}
	
	//MyNoteBook은 모든 추상메서드가 구현된 클래스이므로 abstract 예약어 사용 안 함.
	//NoteBook이 display()를 구현했고 그거 상속 받았으니 
	// MyNoteBook에서도 display()구현된 셈.
}
