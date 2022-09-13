package com.sh.test.array;

public class Test1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test();
	}

	public void test() {
		int[] arr = new int[100];
		
		for(int i = 0; i < arr.length;i++) {
			System.out.printf("arr[%d] = %d\n",i,(i + 1));
		}
	}
}
