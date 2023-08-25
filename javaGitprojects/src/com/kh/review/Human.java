package com.kh.review;

//접근제한자 반환자료형 메서드이름(매개변수) {
//실행할코드
//return(반환자료형에 맞는 값);
//}

public class Human {
private String name;
private int age;
private String residentNumber;
private char gender; // f -> 여자 m -> 남자 
public Book[] bookList;

public Human() {
}

//필드를 전부 초기화하는 매개변수를 가지고 있는 생성자
//생성자 : 객체의 데이터들을 전부 초기화하기 위한 특수목적의 메서드
//리턴값을 가지고 있지않고 객체 생성시 1번만 호출된다.
//오버로딩 가능
public Human(String name, int age, String residentNumber, char gender) {
 this.name = name;
 this.age = age;
 this.residentNumber = residentNumber;
 this.gender = gender;
 bookList = new Book[10];
}

public Book[] getBookList() {
	return this.bookList;
}

//getter, setter, toString
public String getName() {
 // 내 필드에 있는 name을 돌려주는거
 return this.name;
}

public void setName(String name) {
 this.name = name;
}

public int getAge() {
 return this.age;
}

public void setAge(int age) {
 this.age = age;
}

public String getResidentNumber() {
 return residentNumber;
}

public void setResidentNumber(String residentNumber) {
 this.residentNumber = residentNumber;
}

public char getGender() {
 return gender;
}

public void setGender(char gender) {
 this.gender = gender;
}

public String toString() {
 return this.name + " " + this.age + "살 " + this.residentNumber + " " + this.gender;
}

public String infoAge() {
 return "제 10년후 나이는 " + (this.age + 10) + "살입니다.";
}

}
