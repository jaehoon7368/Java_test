package ncs.test3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DataTest {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		LocalDate brith = LocalDate.of(1987, 5, 27);
		Period period = brith.until(now);
		
		System.out.println("생일 : " + brith.format(DateTimeFormatter.ofPattern("yyyy년 M월 dd일 E요일 ")));
		System.out.println("현재 : " + now.format(DateTimeFormatter.ofPattern("yyyy년 M월 dd일")));
		System.out.println("나이 : " + period.getYears() + "세");
		
	}

}
