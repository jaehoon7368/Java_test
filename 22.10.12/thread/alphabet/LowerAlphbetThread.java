package com.thread.alphabet;

public class LowerAlphbetThread implements Runnable{

	
	@Override
	public void run() {
		for(int i = 'a';i <= 'z';i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			System.out.println("["+ Thread.currentThread().getName() + "]" + (char)i);
		}
		System.out.println(Thread.currentThread().getName() + "End!");
	}

	
}
