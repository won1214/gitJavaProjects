package com.kh.khanun;

public class Animal {
	//필드
	String name;
	int age;
	String gender;
	
	//생성자
	public Animal(String name, int age, String gender) {
		this.name = name;
		this.age =age;
		this.gender = gender;
	}
	
	//메서드
	 void makeSound() {
		System.out.println(name + "이 소리를 냅니다.");
	}
	
}
