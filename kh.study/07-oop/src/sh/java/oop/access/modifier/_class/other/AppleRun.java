package sh.java.oop.access.modifier._class.other;

import sh.java.oop.access.modifier._class.Apple;

public class AppleRun {

	public static void main(String[] args) {
		Apple apple = new Apple(); //public class
		//다른 패키지라서 아예 사용불가
//		PineApple pineapple = new PineApple(); //default class
//		Tomato tomato = new Tomato(); //default class
	}

}
