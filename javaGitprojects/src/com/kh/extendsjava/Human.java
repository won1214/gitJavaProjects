package com.kh.extendsjava;

public class Human {
	//이름, 성별, 나이, 몸무게(소수점 포함)
	private String name;
	private String gender;
	private int age;
	private float weight;
	
	//전체 데이터 초기화하는 생성자
	public Human(String name, String gender, int age, float weight) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}
	
	
		//getter(값 가지고 옴)
		public String getName() {
			return name;
		}
		
		public String getGender(String gender) {
			return gender;
		}
		
		public int getAge(int age) {
			return age;
		}
		
		public float getWeight(float weight) {
			return weight;
		}
		
		//setter(값 넣어줌)
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setGender(String gender) {
			this.gender = gender;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		public void setWeight(float weight) {
			this.weight = weight;
		}
		
		//toString
		public String toString() {
			String str = this.name + "\t" + this.gender + "\t" + this.age + "\t" + this.weight;
			return str;
		}
	
	
	
	
	
}
