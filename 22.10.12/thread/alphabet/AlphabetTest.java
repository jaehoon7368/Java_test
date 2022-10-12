package com.thread.alphabet;

import java.util.Scanner;

public class AlphabetTest {

	public static void main(String[] args) {
		
		Thread th1 = new Thread(new UpperAlphbetThread(),"대문자쓰레드");
		Thread th2 = new Thread(new LowerAlphbetThread(),"소문자쓰레드");
		
//		th1.setDaemon(true);
//		th2.setDaemon(true);
		
		th1.start();
		th2.start();
		
		System.out.println("엔터를 누르면 종료됩니다...");
		new Scanner(System.in).nextLine();
		th1.interrupt();
		th2.interrupt();
		
		
		
	}
	

}
