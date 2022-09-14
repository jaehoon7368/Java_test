package com.sh.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 t4 = new Test4();
//		t4.test1();
		t4.test2();
	}
	
	/**
	 * [문제4]
		- 클래스 : sh.java.test.array.Test4.java
		- 메소드명 : public void test1()
    	사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
    	단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
     
        힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - Arrays.copyOf() 매소드 이용
       - clone() 매소드 이용
	 */
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호(번호만 입력) : ");
		String number = sc.nextLine(); //번호 입력
		char[] ch =  new char[number.length()]; 
		
		for(int i = 0; i < number.length();i++) { //1:1대입
			ch[i] = number.charAt(i);
		}
		System.out.println(ch);
		
//		char[] arr1 = {'0','0','0','*','*','*','*','0','0','0','0'} ; //가운데 4자리 *로 가리기
//		System.arraycopy(ch, 0, arr1, 0, 3); //ch 앞 3자리만 copy
//		System.arraycopy(ch, 7, arr1, 7, 4); //ch 뒤 4자리만 copy
//		System.out.println(arr1);
		
//		char[] arr2 = Arrays.copyOf(ch, number.length());
//		for(int i = 3; i < 7; i++) // 가운데 4자리만 *로 바꿔주기
//			arr2[i] = '*';
//		System.out.println(arr2);
		
		char[] arr3 = ch.clone();
		for(int i = 3; i < 7; i++) // 가운데 4자리만 *로 바꿔주기
			arr3[i] = '*';
		System.out.println(arr3);
		
	}
	
	/**
	 * [문제5]
		소드명 : public void test2()
    	위문제를 배열복사없이 문자열차원에 가운데 4자리를 교체해보자.
	 	* java.lang.String.substring(beginIndex, endIndex) 메소드 찾아볼것!
	 	* 문자열은 직접 수정이 불가하므로, 특정자리의 문자열을 가져와 처리해야한다.
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호(번호만 입력) : ");
		String number = sc.next();
		
		System.out.print(number.substring(0,3));
		System.out.print("****");
		System.out.print(number.substring(7, 11));
	}
}
