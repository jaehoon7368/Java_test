package member.controller;

import member.model.vo.*;

import java.util.Scanner;

public class MemberManager {
	private static final int MAX_PERSON = 40;
	
	Member[] member = new Member[MAX_PERSON];
	
	private int index;
	
	public void insertMember(Member m) {
			member[index++] = m;
	}
	
	public void printData() {
		System.out.println("---------------------------<<회원정보>>---------------------------");
		System.out.println("이름              등급              포인트             이자포인트      ");
		System.out.println("-----------------------------------------------------------------");
		for(int i = 0; i < index;i++) {
			System.out.println(member[i].memberInfo());
		}
		
	}
}
