package ncs.test2;

import java.text.DecimalFormat;

public class StringTest {

	public static void main(String[] args) {

		 String str = "1.22,4.12,5.93,8.71,9.34";
	        double data[]= new double[5];
	        double sum = 0;
	        
	        // str에서 데이터를 분리한다. 
	        
	        String[] st = str.split(",");
	        
	        int i = 0;
	        int j = 0;
	        //for~each 문 사용한다. // 배열에 실수 데이터를 넣는다.
	        //배열 데이터의 합을 구한다. }
	        for(String s: st){
	        	data[i++] = Double.parseDouble(s);
	        	sum += data[j++];
	        }
//	        System.out.printf("합계 : %.3f", sum);
//	        System.out.println();
//	        System.out.printf("평균 : %.3f",sum/data.length);
	        	// 결과 값을 출력 한다.
	        
	        DecimalFormat df = new DecimalFormat("0.000");
	        System.out.println("합계 : " + df.format(sum));
	        System.out.println("평균 : " + (df.format(sum / data.length)));
	}

}
