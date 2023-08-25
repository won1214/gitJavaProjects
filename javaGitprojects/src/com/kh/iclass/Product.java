package com.kh.iclass;
import java.util.Scanner;

//접근지정자 class 클래스이름{}
class Product {
	// 필드		
	//필요한 데이터의 변수를 나열
	private String name;
	private int price;
	private int count;
	private String description;
	
	private final int MAX_COUNT = 50;
	
	
	//생성자
	//접근제한자 클래스 이름(매개변수) { }
	public Product(String name, int price, String description) {
		this.name = name == null ? "이름없음" : name;
		this.price = price < 0 ? 0 : price;
		this.count = this.MAX_COUNT;
		
		this.description = description == null ? "-" : description;
	}
	
	//3가지 기본 메서드 
	
	//getter(필드에 있는 데이터 반환), 
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getDescription() {
		return this.description;
	}
		
	//	setter(필드에 있는 데이터에 값 대입), 
	public void setName(String name ) {
		this.name = name;
	}
	
	public void setPrice(int price ) {
		this.price = price;
	}
	public void setDescription(String description ) {
		this.description = description;
	}
	
	//	toString(모든 데이터 정보 String으로 반환)
	public String toString() {
		String str = this.name + "\t" + this.price + "\t" + this.description;
		return str;
	}
	
	
}		
