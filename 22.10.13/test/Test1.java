package net.network.test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *  키보드로 호스트명 또는 도메인명을 입력받는다.
    입력받은 호스트명을 가지고, ip 주소를 조회해서 출력한다.
    출력시 호스트명과 ip 주소를 분리해서, ip 주소만 출력되게 함
    조회한 ip 갯수가 1개 이상이면 루프문으로 모두 출력함
    예외처리는 try~catch로 직접 처리함
 *
 */
public class Test1 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("호스트명 or 도메인명 입력 : ");
		String addr = sc.nextLine();
		
		try {
			InetAddress[] hostaddr = InetAddress.getAllByName(addr);
			for(InetAddress n : hostaddr) {
				System.out.println(n.getHostAddress());
			}
		} catch (UnknownHostException e) {
			System.out.println("잘못입력되었습니다.");
			e.printStackTrace();
		}

		
	}

}
