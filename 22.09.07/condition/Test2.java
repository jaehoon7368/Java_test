package com.sh.test.condition;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
	}
	
	public void test() {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("국어 점수 : ");
		  int kor = sc.nextInt();
		  System.out.print("영어 점수 : ");
		  int eng = sc.nextInt();
		  System.out.print("수학 점수 : ");
		  int ma = sc.nextInt();
		  
		  double total = (kor + eng + ma) / 3;
		  System.out.println("평균 : " + total);
		  
		  if(kor >= 40 && eng >= 40 && ma >= 40 && total >= 60) {
			  System.out.println("합격입니다.");
		  }
		  else {
			  System.out.println("불합격입니다.");
		  }
	}
}
