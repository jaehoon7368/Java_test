package com.sh.oop.run;

import java.util.Scanner;


import com.sh.oop.model.Employee;

public class EmpTest {

	// 여러메소드에서 사용할 수 있도록 멤버변수로 선언
		Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
			EmpTest t = new EmpTest();
			t.mainMenu();

		}

		public void mainMenu() {
			Employee e = null; // 참조형변수 기본값
			
			String menu = "******* 사원 정보 관리 프로그램 **********\n" 
						+ "1. 새 사원 정보 입력\n" 
						+ "2. 사원 정보 수정\n" 
						+ "3. 사원 정보 삭제\n" 
						+ "4. 사원정보 출력\n"
						+ "9. 끝내기\n" 
						+ "*************************************\n" 
						+ "선택하세요 =>";

			int selected = 0;
			while (true) {
				System.out.print(menu);
				selected = sc.nextInt();
				switch (selected) {
				case 1:
					e = new Employee();
					e.empInput();
					break;
				case 2:
					modifyMenu(e);
					break;
				case 3:
					// 사원정보삭제는 참조주소값을 삭제한다.
					// 실제 heap영역의 객체 삭제는 garbage collector가 담당.
					e = null;
					break;
				case 4:
					// 사원정보 미입력시 출력하지 않도록함.
					// NullPointerException 유발
					if (e == null) 
						System.out.println(">>먼저 사원정보를 입력하세요.");
					else 					
						e.empOutput();
					break;
				}
				if (selected == 9)
					break;
			}

		}
		
		/**
		 * 리턴하면 mainMenu의 modifyMenu호출부로 돌아간다.
		 * 
		 * @param e
		 */
		public void modifyMenu(Employee e) {
			String menu = "********** 사원 정보 수정 메뉴 **********\r\n"
						+ "1. 이름 변경\r\n"
						+ "2. 급여 변경\r\n"
						+ "3. 부서 변경\r\n"
						+ "4. 직급 변경\r\n"
						+ "5. 이전 메뉴로 이동\n"
						+ "*************************************\n" 
						+ "선택하세요 =>";
			
			while(true) {
				System.out.print(menu);
				int num = 0;
				num = sc.nextInt();
				
				switch(num) {
				case 1 : System.out.print("이름변경 => ");
						String n1 = sc.next();
						e.setEmpName(n1); break;
				case 2 : System.out.print("급여변경 => ");
						int n2 = sc.nextInt();
						e.setSalary(n2); break;
				case 3 : System.out.print("부서변경 => ");
						String n3 = sc.next();
						e.setDept(n3); break;
				case 4 : System.out.print("직급변경 => ");
						String n4 = sc.next();
						e.setJob(n4); break;
				case 5 : return;
				}
				
			}
		}

}
