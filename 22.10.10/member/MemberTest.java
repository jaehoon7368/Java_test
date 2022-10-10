package com.sh.collection.map.member;

import java.util.*;

public class MemberTest {
	Map<String,Member> map = new HashMap<String,Member>();

	public static void main(String[] args) {
		MemberTest mt = new MemberTest();
		mt.test1();
		System.out.println();
		mt.test2();
		System.out.println();
		mt.test3();
		System.out.println();
		mt.test4();
	}

	//sinsa 아이디 회원을 삭제하세요.
	private void test4() {
		map.remove("sinsa");
		Set<String> keySet =  map.keySet();
		for(String key : keySet) {
			Member value = map.get(key);
			System.out.println(value.getUserId() + "\t" + value.getUserPwd() + "\t" + value.getUserName()
			+ "\t" + value.getAge() + "\t" + value.getPhoneNumber());
			}
	}

	//yooon 아이디 조회후 해당객체를 다음과 같이 수정하세요.
	//비밀번호 : 5678	
	//이름 : 윤동주
	//나이 : 27
	//전화번호 : 01034563456
	private void test3() {
		
		map.put("yooon", new Member("yooon", "5678", "윤동주", 27,"01034563456"));
		Set<String> keySet =  map.keySet();
		for(String key : keySet) {
			Member value = map.get(key);
			System.out.println(value.getUserId() + "\t" + value.getUserPwd() + "\t" + value.getUserName()
			+ "\t" + value.getAge() + "\t" + value.getPhoneNumber());
			}
		}
	

	
	private void test2() {
		System.out.println("jangbg : " + isUserExist("jangbg"));
		System.out.println("sejong : " + isUserExist("sejong"));
		
	}
	//다음 회원 정보를 Map<String, Member>에 저장후, 출력하세요.
	private void test1() {
		map.put("honggd", new Member("honggd", "1234", "홍길동", 35,"01012341234"));
		map.put("sinsa", new Member("sinsa", "1234", "신사임당", 50,"01012341234"));
		map.put("leess", new Member("leess", "1234", "이순신", 43,"01012341234"));
		map.put("yooon", new Member("yooon", "1234", "윤봉길", 37,"01012341234"));
		map.put("jangbg", new Member("jangbg", "1234", "장보고", 29,"01012341234"));
		
		System.out.println("==================================================");
		System.out.println("아이디\t 비밀번호\t 이름\t 나이\t 전화번호");
		System.out.println("--------------------------------------------------");
		
		Set<String> keySet =  map.keySet();
		for(String key : keySet) {
			Member value = map.get(key);
			System.out.println(value.getUserId() + "\t" + value.getUserPwd() + "\t" + value.getUserName()
								+ "\t" + value.getAge() + "\t" + value.getPhoneNumber());
		}
		System.out.println("--------------------------------------------------");
	}
	
	////Map에 저장된 회원중 인자로 전달한 아이디가 존재하는 여부를 검사하는 메소드를 생성하세요.
	public boolean isUserExist(String userId) {
		if(map.get(userId) == null)
			return false;
		return true;
	}
	
}
