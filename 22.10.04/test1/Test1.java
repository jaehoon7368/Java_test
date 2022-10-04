package com.sh.io.test1;

import java.io.*;


public class Test1 {

	public static void main(String[] args) {
		Test1 test = new Test1();
//		test.fileSave();
		test.fileRead();
	}
	
	// + fileRead() : void
	public void fileRead() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileReader fr = null;
		
	    //키보드로 읽을 대상파일명을 입력받음
	    //파일 읽기용 스트림 객체 생성함 : FileReader 사용
		System.out.print("입력받을 파일명 : ");
		try{
			fr = new FileReader(br.readLine());
			
			//파일 안의 내용을 읽어서, StringBuilder 에 보관함
			StringBuilder sb = new StringBuilder();
			int data = 0;
			while((data = fr.read()) != -1) {
				sb.append((char)data);
			}
			//다 읽은 다음, StringBuilder 에 보관된 값을 String으로 바꾸어 화면에 출력함
			System.out.println(sb.toString());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void fileSave() {
		String filename = null;
		FileWriter fw = null;
		//키보드로 사용할 파일명을 입력받음
		//BufferedReader의 readLine() 사용함
		System.out.print("입력받을 파일명 : ");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				){
		filename = br.readLine();
		
		//파일출력용 스트림 객체 생성함
		//FileWriter 사용함
		 fw = new FileWriter(filename);
		
		//화면에 "파일에 저장할 내용을 입력하시오." 출력
        //입력값을 읽어들여서 바로 파일에 기록 저장처리
        //반복실행함
		System.out.println("파일에 저장할 내용을 입력하시오.");
		String fileContent = null;
		
		while(!"exit".equals(fileContent = br.readLine())) {
			fw.write(fileContent);
			fw.write("\n");
		}
		System.out.println("파일이 저장되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
