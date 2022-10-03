package com.sh.api.time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalcYourDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생일입력");
		System.out.print("년 : ");
		int num1 = sc.nextInt();
		System.out.print("월 : ");
		int num2 = sc.nextInt();
		System.out.print("일 : ");
		int num3 = sc.nextInt();
		
		LocalDate start = LocalDate.of(num1, num2, num3);
		LocalDate end = LocalDate.now();
		
		long day = ChronoUnit.DAYS.between(start, end);
		System.out.println("태어난지 " + day + "일 되었습니다.");
	}

}
