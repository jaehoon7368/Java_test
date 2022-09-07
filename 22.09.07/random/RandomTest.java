package com.sh.test.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		RandomTest rt = new RandomTest();
//		rt.test1();
		rt.test2();
		
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		Random rnd = new Random();
		int i = rnd.nextInt(10);
		int j = rnd.nextInt(10) + 1;
		int k = rnd.nextInt(16) + 21;
		boolean bool = rnd.nextBoolean();
		
		System.out.println("0 ~ 9까지의 랜덤 수 : "+ i);
		System.out.println("1 ~ 10까지의 랜덤 수 : "+ j);
		System.out.println("20 ~ 35까지의 랜덤 수 : "+ k);
		System.out.printf("0 또는 1 : %d", bool ? 0 : 1);
	}
	public void test1() {
	Scanner sc = new Scanner(System.in);
	
	int com = (int)(Math.random()) * 3 + 1;
	
	
	System.out.print("숫자를 선택하세요(1.가위/ 2.바위/ 3.보) : ");
	int number = sc.nextInt();
	
	System.out.println("=========결과=========");
	
	
	if(number == 1) {
		System.out.println("당신은 가위를 냈습니다.");
	}
	else if(number == 2) {
		System.out.println("당신은 바위를 냈습니다.");
	}
	else {
		System.out.println("당신은 보를 냈습니다.");
	}

	
	
	if(com == 1) {
		System.out.println("컴퓨터는 가위를 냈습니다.");
	}
	else if(com == 2) {
		System.out.print("컴퓨터는 바위를 냈습니다.");
	}
	else {
		System.out.print("컴퓨터는 보를 냈습니다.");
	}

	
	System.out.println("=========결과=========");
	
	if(com == number) {
		System.out.println("비겼습니다.");
	}
	else if((com == 1 && number == 2)||(com == 2 && number ==3)||(com == 3 && number == 1)) {
		System.out.println("당신이 이겼습니다.ㅠㅠ");
	}
	else {
		System.out.println("당신이 졌습니다.ㅠㅠ");
	}

	}


}


