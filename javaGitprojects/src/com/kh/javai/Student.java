package com.kh.javai;

// class에 접근제한자를 설정하지 않으면
// default로 설정되고 다른 패키지에서 사용할 수 없다.
public class Student {
	//필드(데이터 집합)
	public static int count = 0;
	private String name; //나이
	private int age; //나이
	private String gender; //성별
	private int mathScore; //수학점수
	private int enScore; // 영어점수
	private int koScore; // 국어점수
	
	//생성자
	//인스턴스 객체를 생성할 떄 데이터를 초기화하기위해
	//자동으로 한번만 실행하는 특별한 메서드
	//메서드처럼 접근해서 실행할 수 없으며 class의 이름과 동일한 이름을 가진다.
	//초기화를 위한 메서드이기 때문에 반환값은 없다.
	/* 기본생성자
	 * 생성자를 아무것도 작성하지 않았을 때
	 * 컴파일러가 기본적으로 생성해주는 생성자
	 * (아무 기능이 없다.)
	 * public Student(){}
	 */
	public Student(){
		System.out.println("student의 기본생성자");
	}
	//생성자는 여러개 생성이 가능하다.
	//생성자가 여러개일때는 매개변수를 통해서 식별한다.
	//에매한 생성자는 사용을 지양한다.
	public Student(String tName, int tAge, String tGender){
		count++;
		name = tName;
		age = tAge;
		gender = tGender;
	}
	
	
	
	//메서드(기능 집합)
	//info메서드 생성
	//저는 oo살의 상oo ooo입니다. 출력기능
	public void info() {
		System.out.println("저는 "+age+"살의 상"+gender+" "+name+"입니다.");
	}
	
	//set메서드(setter) => 필드데이터에 값을 저장하기위한 메서드
	public void setEnScore(int tEnScore) {
		if (tEnScore < 0) {
			enScore = 0;
			return;
		}
		enScore = tEnScore;
	}
	
	public void setKoScore(int tKoScore) {
		if (tKoScore < 0) {
			koScore = 0;
			return;
		}
		koScore = tKoScore;
	}
	
	public void setMathScore(int tMathScore) {
		if (tMathScore < 0) {
			mathScore = 0;
			return;
		}
		mathScore = tMathScore;
	}
	
	//get메서드(getter) => 필드데이터에 값을 사용하기 위한 메서드
	public int getEnScore() {
		return enScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	
	public int getKoScroe() {
		return koScore;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	// 기능을 담당하는 메서드
	// 토탈값을 반환하는 메서드
	public int getTotal() {
		int total = (mathScore + koScore + enScore);
		return total;
	}
	
	public float getAvg() {
	//	int total = (mathScore + koScore + enScore);
		return (getTotal()/3.0f);
	}
	
	//합격인지 불합격인지 결과를 출력해주는 메서드
	public void checkPass() {
		if (koScore >= 40 && enScore >= 40 && mathScore >= 40 && getAvg() >= 60) {
			System.out.print("합격입니다.");
		} else {
			System.out.print("불합격입니다.");
		}
	}
	
	public boolean checkPassIsTrue() {
		if (koScore >= 40 && enScore >= 40 && mathScore >= 40 && getAvg() >= 60) {
			return true;
		} else {
			return false;
		}
	}
	
	//displayMyInfo 메서드를 만들어보자
	// 매게변수는 없고
	//리턴값도 존재하지않는다.
	// 실행해 결과로
	// 저는 oo살의 ooo입니다.
	// 국어 : 00점
	// 영어 : 00점
	// 수학 : 00점
	// 합계 : 00점
	// 평균 : 00점
	// 으로 시험에 합격하였습니다.
	
	public void displayMyInfo() {
		// 저는 oo살의 ooo입니다.
		System.out.println("저는 "+age+"살의 "+name+"입니다.");
		// 국어 : 00점
		System.out.println("국어 : " + koScore);
		// 영어 : 00점
		System.out.println("영어 : " + enScore);
		// 수학 : 00점
		System.out.println("수학 : " + mathScore);
		// 합계 : 00점
		System.out.println("합계 : " + getTotal());
		// 평균 : 00점
		System.out.println("평균 : " + getAvg());
		
		if(checkPassIsTrue()) {
			System.out.println("으로 시험에 합격하였습니다.");
		} else {
			System.out.println("으로 시험에 불합격하였습니다.");
		}
	}
	
	public static void showCount() {
		System.out.print(count);
	}
}
