package com.kh.ObjectArrProgramming;

public class StudentMenu {
	 private StudentController ssm ;
	 
	 public StudentMenu() {
		 ssm = new StudentController();
		 
		 printStudentList();
		 printStudentScore();
		 printStudentResult();
	 }
	 
	 public void printStudentList() {
		 System.out.println("========학생 정보 출력=======");
		 for(Student student : ssm.printStudent()) {
			 System.out.println( 
			"이름 : " + student.getName() + " / 과목 : " + student.getSubject() + " / 점수 : " + student.getScore());
		 }
	 }
	 
	 public void printStudentScore() {
		 System.out.println("========학생 성적 출력=======");
		 int sum = ssm.sumScore();
		 double avg = ssm.avgScore();
		 System.out.println("학생 점수 합계 : " + sum);
		 System.out.println("학생 점수 평균 : " + avg);
		 
	 }
	 
	 public void printStudentResult() {
		 System.out.println("========성적 결과 출력=======");
		 for(Student student : ssm.printStudent()) {
			 String result = (student.getScore() >= StudentController.CUT_LINE) ? "통과입니다." : "재시험 대상입니다.";
			 System.out.println(student.getName() + "학생은 " + result);
		 }
		 
	 }
	 
	 
	 
}
