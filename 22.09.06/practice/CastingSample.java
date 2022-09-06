package com.sh.cast.practice;

import java.util.Scanner;

public class CastingSample {

	public static void main(String[] args) {
		CastingSample cs = new CastingSample();
		//cs.printUniCode();
		cs.calculatorScore();
	}
	
	public void printUniCode() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		char a = sc.next().charAt(0);
		
		System.out.println(a + " is unicode : " + (int)a);
	}
	
	public void calculatorScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double ma = sc.nextDouble();
		
		System.out.println("총점 : " + (int)(kor + eng + ma));
		System.out.println("평균 : " + (kor + eng + ma) / 3);
	}

}
