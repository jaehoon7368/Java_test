package com.sh.api.time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalcDday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜 입력");
		System.out.print("년 : ");
		int y = sc.nextInt();
		System.out.print("월 : ");
		int m = sc.nextInt();
		System.out.print("일 : ");
		int d = sc.nextInt();
		
		LocalDate now = LocalDate.now();
		LocalDate date = LocalDate.of(y, m, d);
		long day = ChronoUnit.DAYS.between(now,date);
		
		if(day > 0)
			System.out.println(day + "일 남았습니다.");
		else if (day < 0)
			System.out.println(-day + "일 지났습니다.");
		else
			System.out.println("D-Day입니다.");
		
	}

}
