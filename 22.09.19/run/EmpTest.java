package com.sh.oop.run;

import java.util.Scanner;


import com.sh.oop.model.Employee;

public class EmpTest {

	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		
		abc:
		for(;;) {
		System.out.println("******* 사원 정보 관리 프로그램 ************");
		System.out.println("1. 새 사원 정보 입력");
		System.out.println("2. 사원 정보 삭제");
		System.out.println("3. 사원정보 출력");
		System.out.println("9. 끝내기");
		System.out.println("***************************************");
		System.out.print("메뉴 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: e.empInput(); break;
		case 2: //e = new Employee(); e.empOutput(); break;
				e.setEmpNo(0);
				e.setEmpName(null);
				e.setDept(null);
				e.setJob(null);
				e.setAge(0);
				e.setGender(' ');
				e.setSalary(0);
				e.setBounsPoint(0);
				e.setPhone(null);
				e.setAddress(null);
				System.out.println("회원정보가 삭제되었습니다.");
				break;
		case 3: e.empOutput(); break;
		case 9: break abc;
		default :
			System.out.println("잘못입력하였습니다.");
			break;
			}
		}
		
	}

}
