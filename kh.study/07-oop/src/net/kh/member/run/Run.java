package net.kh.member.run;

import net.kh.member.model.*;

public class Run {

	public static void main(String[] args) {
		Member m = new Member();
		m.setMemberId("abc");
		m.setMemberPwd("1234");
		m.setMemberName("홍길동");
		m.setAge(27);
		m.setGender('남');
		m.setPhone("01012341234");
		m.setEmail("abc@naver.com");
		
		System.out.println(m.getMemberId());
		System.out.println(m.getMemberPwd());
		System.out.println(m.getMemberName());
		System.out.println(m.getAge());
		System.out.println(m.getGender());
		System.out.println(m.getPhone());
		System.out.println(m.getEmail());
	}

}
