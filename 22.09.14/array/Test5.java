package com.sh.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 t5 = new Test5();
		t5.test();
	}
	
	/**
	 * [문제5]
		- 클래스 : sh.java.test.array.Test5.java
		- 메소드명 : public void test()
    	주민등록번호 성별자리 이후부터 *로 가리기.  
    	단, 원본 배열값은 변경 없이 배열 복사본으로 
    	변경하세요
     
        힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - Arrays.copyOf() 매소드 이용
       - clone() 매소드 이용

	 */
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(번호만 입력) : ");
		String number = sc.nextLine(); 
		char[] ch =  new char[number.length()]; 
		
		for(int i = 0; i < number.length();i++) {
			ch[i] = number.charAt(i);
		}
		System.out.println(ch);
		
//		char[] arr1 = {'0','0','0','0','0','0','0','*','*','*','*','*','*'};
//		System.arraycopy(ch, 0, arr1, 0, 7);
//		System.out.println(arr1);
		
//		char[] arr2 = Arrays.copyOf(ch, number.length());
//		for(int i = 7; i < 13;i++) {
//			arr2[i] = '*';
//		}
//		System.out.println(arr2);
		
		char[] arr3 = ch.clone();
		for(int i = 7; i < 13;i++) {
			arr3[i] = '*';
		}
		System.out.println(arr3);
	}
}
