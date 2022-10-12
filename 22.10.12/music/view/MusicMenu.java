package com.sh.collection.list.music.view;

import java.util.*;

import com.sh.collection.list.music.controller.MusicManager;
import com.sh.collection.list.music.model.vo.Music;


public class MusicMenu {

	Scanner sc = new Scanner(System.in);
	MusicManager manager = new MusicManager();
	
	
	
	public void MusicMenu() {
		String menu = "----- Music Playlist Menu -----\r\n" + 
				"1.목록보기\r\n" + 
				"2.마지막에 음악추가\r\n" + 
				"3.매처음에 음악추가\r\n" + 
				"4.곡삭제\r\n" + 
				"5.곡변경\r\n" + 
				"6.곡명검색\r\n" + 
				"7.가수검색\r\n" + 
				"8.목록정렬(곡명오름차순)\r\n" + 
				"0.종료\r\n" + 
				"--------------------------------\r\n" + 
				">> 메뉴선택 : ";	
		
		while(true) {
			List<Music> result = new ArrayList<>();
			System.out.print(menu);
			
			String choice = sc.next();
			
			switch(choice) {
			case "1" : System.out.println(manager.selectList());  break;
			case "2" : manager.addList(inputMusic()); break;
			case "3" : manager.addAtZero(inputMusic()); break;
			case "4" : manager.removeMusic(inputTitle()); break;
			case "5" : manager.replaceMusic(inputMusic(), inputMusic()); break;
			case "6" : result = manager.searchMusicByTitle(inputTitle());
						if(!result.isEmpty()) {
							System.out.println(result);
						}else
							System.out.println("검색결과가 없습니다.");
								break;
			case "7" : result = manager.searchMusicBySinger(inputSinger());
						if(!result.isEmpty()) {
							System.out.println(result);
						}else
							System.out.println("검색결과가 없습니다.");
								break;
			case "8" : orderMenu(); break;
			case "0" : return;
			}
		}
	}
	
	public void orderMenu() {
		String orderMenu = "================== 정렬 메뉴 ===================\r\n" + 
				"1. 가수명 오름차순\r\n" + 
				"2. 가수명 내림차순\r\n" + 
				"3. 곡명 오름차순\r\n" + 
				"4. 곡명 내림차순\r\n" + 
				"5. 메인메뉴 돌아가기\r\n" + 
				"================================================\r\n" + 
				" >> 메뉴 선택 : ";
		while(true) {
			System.out.print(orderMenu);
			String choice = sc.next();
			
			Comparator<Music> singerComp = new singerCompartor();
			switch(choice) {
			case "1" : System.out.println(manager.orderBy(singerComp));  break;
			case "2" : System.out.println(manager.orderBy(Collections.reverseOrder(singerComp)));  break;
			case "3" : System.out.println(manager.orderBy(null));  break;
			case "4" : Comparator<Music> title = Collections.reverseOrder(); 
						System.out.println(manager.orderBy(title));  break;
			case "5" : return;
			}
		}
	}
	
	public void printList(List<Music> music) {
		for(Music mus : music) {
			System.out.println(mus);
		}
	}
	
	public String inputTitle() {
		sc.nextLine();
		System.out.print("title : ");
		String title = sc.nextLine();
		return title;
	}
	
	public String inputSinger() {
		sc.nextLine();
		System.out.print("singer : ");
		String singer = sc.nextLine();
		return singer;
	}
	
	public Music inputMusic() {
		sc.nextLine();
		System.out.print("title : ");
		String title = sc.nextLine();
		System.out.print("singer : ");
		String singer = sc.nextLine();
		
		return new Music(title,singer);
	}
	
}
