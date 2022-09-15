package com.sh.test.multi.dimentional.array.test;

import java.util.Random;


public class Sample {

	public static void main(String[] args) {
		Sample s = new Sample();
//		s.exercise1();
		s.exercise2();
	}
	
	/**
	 * [문제 2]
 	- 메소드명 : public void exercise2()
 	- 구현내용 : 
    	1. 3행4열 2차원배열 선언 및 생성
    	2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
    	3. 아래의 내용처럼 처리함
        0열    1열    2열    3열    
    0행    값    값    값     0행 값들의 합계
    1행    값    값    값    1행 값들의 합계
    2행    값    값    값    2행 값들의 합계
	 */
	public void exercise2() {
		Random rnd = new Random();
		int[][] arr = {
				{0, 0, 0},	
				{0, 0, 0},	
				{0, 0, 0},	
		};
		int sum = 0;
		
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0; j < arr[i].length;j++) {
				arr[i][j] = rnd.nextInt(100)+1;
				sum += arr[i][j];
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.printf("%d",sum);
			System.out.println();
		}
	}
	

	/**
	 * [문제 1]
 	- 메소드명 : public void exercise1()
 	- 구현내용 : 
    	1. 3행 5열 2차원배열 선언 및 생성
    	2. 1~100사이의 임의의 정수를 모든 방에 기록함
    	3. 열의 값이 5의 배수인 경우만 값(행,열) 출력함
	 */
	public void exercise1() {
		Random rnd = new Random();
		int[][] arr = new int[3][5];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5;j++) {
				arr[i][j] = rnd.nextInt(100)+1;
				if(arr[i][j] % 5 == 0) {
					System.out.print(arr[i][j] + " ");
				}
				else {
					System.out.print(" X ");
				}
			}
			System.out.println();
		}
		
	}
}
