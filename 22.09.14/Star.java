package com.sh.test.star;

public class Star {

	public static void main(String[] args) {
		Star s = new Star();
//		s.test1();
//		s.test2();
//		s.test3();
		s.test4();
	}
	
	/**
	 * @실습문제1

	 *****
	 ****
	 ***
	 **
	 *
	 
	 */
	public void test1() {
		for(int i = 5; i > 0;i--) {
			for(int j = 0; j < i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/**
	 
	 * 
	 **
	 ***
	 ****
	 *****
	 
	 */
	public void test2() {
		
		for(int i = 0; i <= 5;i++) {
			for(int j = i;j > 0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
		*
	   **
	  ***
	 **** 
	*****
	
	 */
	public void test3() {
		for(int i = 5; i >0;i--) {
			for(int j = 0; j < i;j++) {
				System.out.print(" ");
			}
			for(int j = 5;j >= i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 
	 	*     
	   ***    
	  *****   
	 *******  
	********* 
	
	 */
	public void test4() {
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5-i; j > 0 ;j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
