package com.thread.sleep;

public class SleepTest {

	public static void main(String[] args) {
		SleepTest test = new SleepTest();
		test.sendAphorism();
	}

	public void sendAphorism() {
		Thread th = new Thread(new SleepThread());
		th.start();
	}
	
	class SleepThread implements Runnable{

		private String[] str = {"새발의 피","우물 안 개구리","등잔 밑이 어둡다","사공이 많으면 배가 산으로 간다","꿩 대신 닭",
				"새 까먹는 소리","가는 날이 장날이라","가는 말이 고아야 오는 말이 곱다","가재는 게 편이다","같은 값이면 다홍치마"};

		@Override
		public void run() {
			for(int i = 0; i < 10;i++) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(str[(int)(Math.random()*10)]);
			}
		}
		
	}
}
