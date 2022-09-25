package member.controller;

import member.model.vo.*;

import java.util.Scanner;

public class MemberManager {
	Scanner sc = new Scanner(System.in);
	private static final int MAX_PERSON = 10;
	
	private Silver[] silvers = new Silver[MAX_PERSON];
	private Gold[] golds = new Gold[MAX_PERSON];
	private Vip[] vips = new Vip[MAX_PERSON];
	private Vvip[] vvips = new Vvip[MAX_PERSON];
	
	private int sindex;
	private int gindex;
	private int vindex;
	private int vvindex;
	
	
	public void silverInsert(Silver silver) {
		silvers[sindex++] = silver;
	}
	public void goldInsert(Gold gold) {
		golds[gindex++] = gold;
	}
	public void vipInsert(Vip vip) {
		vips[vindex++] = vip;
	}
	public void vvipInsert(Vvip vvip) {
		vvips[vvindex++] = vvip;
	}
	
	public void printData() {
		System.out.println("---------------------------<<회원정보>>---------------------------");
		System.out.println("이름              등급              포인트             이자포인트      ");
		System.out.println("-----------------------------------------------------------------");
		for(int i = 0; i < sindex;i++) {
			System.out.println(silvers[i].silverInfo());
		}
		for(int i = 0; i < gindex;i++) {
			System.out.println(golds[i].goldInfo());
		}
		for(int i = 0; i < vindex; i++) {
			System.out.println(vips[i].vipInfo());
		}
		for(int i = 0; i < vvindex;i++) {
			System.out.println(vvips[i].vvipInfo());
		}
	}
}
