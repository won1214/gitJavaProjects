package com.kh.extendsjava;
import java.util.Scanner;

public class MainStart {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Human[] humanList = new Human[10];
		
		humanList[0] = new Human("김지원", "여자", 23, 50.0f);
		humanList[1] = new Human("박지원", "여자", 20, 46);
		humanList[2]= new Human("정지원", "남자", 23, 75);
		
		String name,gender;
		int age;
		float weight;
		
		System.out.print("이름을 입력하세요 : ");	
		name = sc.next();
		System.out.print("성별을 입력하세요 : ");	
		gender = sc.next();
		System.out.print("나이를 입력하세요 : ");	
		age = sc.nextInt();
		System.out.print("몸무게를 입력하세요 : ");		
		weight = sc.nextFloat();
		
		
		// 전체 출력
		System.out.println("이름\t성별\t 나이\t 몸무게");
		for(int i = 0; i< humanList.length; i++) {
			if(humanList[i] == null) {
				break;
			}
			System.out.println(humanList[i].toString());
		}
		
		
		//맨 뒤에 있는 객체 삭제
		for(int i = 0; i< humanList.length; i++) {
		
			if(humanList[0] == null) {
				System.out.println("삭제할 데이터가 없습니다.");
				break;
			} else if (humanList[i] == null) {
				humanList[i - 1] = null;
				break;
			}
			
		}
		
		
		
		
	}
}
