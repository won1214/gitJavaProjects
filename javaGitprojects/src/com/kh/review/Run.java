package com.kh.review;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Human[] arr = new Human[10];
		ArrayList<Human> list = new ArrayList<>();
		
		arr[0] = new Human("choi", 21, "981214-2222222", 'm');
		arr[1] = new Human("kim", 23, "981214-2222222", 'm');
		arr[2] = new Human("jin", 25, "981214-2222222", 'm');
		
		
		arr[1] = null;
		arr[1] = arr[2]; //arr[2]의 값을 넣는게 아니고 주소값을 넣어줌
		arr[2] = null;
		
		System.out.println();
		
		list.add(new Human("choi", 21, "981214-2222222", 'm'));
		list.add(new Human("kim", 23, "981214-2222222", 'm'));
		list.add(new Human("jin", 25, "981214-2222222", 'm'));
		
		list.remove(1); //삭제하는거
		
		list.get(0); //꺼내는거
 		
		System.out.println(list.get(1));
		
		
		
	}
}
