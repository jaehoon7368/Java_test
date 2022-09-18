package test.controller;

import java.util.Arrays;

public class Test10 {

	public static void main(String[] args) {
		Test10 t10 = new Test10();
		
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		int[] copyAr = new int[16];
		int a = 0;
		
		
		for(int i = 0; i < array.length;i++) {
			for(int j = 0; j < array.length;j++) {
				if(array[i][j] % 3 == 0)
				copyAr[a] = array[i][j];
				a++;
				}
			}
		
		abc:
		for(int i = 0;i < copyAr.length -1;i++) {
			for(int j = i + 1; j < copyAr.length;j++) {
				if(copyAr[i] == copyAr[j])
					continue abc;
			}
			if(copyAr[i] != 0)
				System.out.print(copyAr[i] + " ");
		}
	}
}
