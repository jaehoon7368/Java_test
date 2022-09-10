package com.sh.test.condition;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Test10 t10 = new Test10();
		t10.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
		String abc = "";
		
		if(score >= 90) {
			abc = "수";
		}
		else if(score >= 80) {
			abc = "우";
		}
		else if(score >= 70) {
			abc = "미";
		}
		else if(score >= 60) {
			abc = "양";
		}
		else {
			abc = "가";
		}
		System.out.printf("%d점은 %s입니다.",score,abc);
	}
}
