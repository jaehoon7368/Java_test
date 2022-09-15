package com.sh.test.array.sort;

import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t.test();
	}

	public void test() {
		Random rnd = new Random();
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
            int num = rnd.nextInt(100) + 1;
            arr[i] = num;
        }
		
		for(int i = 0; i < arr.length -1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
	
	
	public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
