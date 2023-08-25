package com.kh.io;

import java.util.*;
import java.io.*;


public class Run {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("대상 파일: ");
		   String src = sc.nextLine();   
		   System.out.print("사본 이름: ");
		   String dst = sc.nextLine();

		
		   try(InputStream in = new FileInputStream(src) ;
			          OutputStream out = new FileOutputStream(dst)) {
			      int data;
			      while(true) {
			         data = in.read(); // 파일로부터 1 바이트를 읽는다.
			         if(data == -1) // 더 이상 읽어 들일 데이터가 없다면,
			            break;
			         out.write(data); // 파일에 1바이트를 쓴다.
			      }
			   }
			   catch(IOException e) {
			      e.printStackTrace();
			   }
		
//		String filePath = "myFile.txt";
//		
//		try {
//			File file = new File(filePath);
//			boolean isFileCreated = file.createNewFile();
//			
//			if(isFileCreated) {
//				System.out.println("파일 생성 완료 : " + filePath);
//			} else {
//				System.out.println("파일 생성 실패");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//		try {
//			OutputStream out = new FileOutputStream(filePath);
//			out.write(12);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		
	}
}
