package com.sh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		SwitchTest1 st = new SwitchTest1();
		st.test();
	}

		public void test() {
			Scanner sc = new Scanner(System.in);
			String a = "----------menu----------\n"
						+ "1. 가정용 (50원/liter)\n"
						+ "2. 상업용 (45원/liter)\n"
						+ "3. 공업용 (30원/liter)\n"
						+ "-------------------------\n"
						+ "메뉴번호를 선택하세요 ==>";
			System.out.print(a);
			String menu = sc.next();
			System.out.print("물 사용량을 입력하세요 ==> ");
			int waterValue = sc.nextInt();
			
			int price = 0;
			
			System.out.println("----------<<수도세>>-----------");
			
			switch(menu) {
			case"1":
				System.out.println("가정용을 선택하셨습니다.");
				price = 50; break;
			case"2":
				System.out.println("상업용을 선택하셨습니다."); 
				price = 45; break;
			case"3":
				System.out.println("공업용을 선택하셨습니다."); 
				price = 30; break;
			default :
				System.out.println("메뉴번호는 1,2,3만 가능합니다."); return;
			}
			
			int n1 = waterValue * price;
			int n2 = (n1 * 5)/100;
			
			System.out.println("사용요금 : " + n1);
			System.out.println("수도세 : " + n2);
			System.out.println("총수도요금 : " + (n1 + n2) + "원");
		}
}
