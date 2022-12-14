package com.sh.collection.list.music.controller;

import java.util.*;
import com.sh.collection.list.music.model.vo.Music;

public class MusicManager {
	private List<Music> musicList = new ArrayList<Music>();
	{
		musicList.add(new Music("바다가자","로지"));
		musicList.add(new Music("내가 아니라도","주호"));
		musicList.add(new Music("팡파레","다비치"));
		musicList.add(new Music("파도","폴킴"));
		musicList.add(new Music("깊은 밤을 날아서","규현"));
	}
	
	//음악리스트 리턴
	public List<Music> selectList(){
		return musicList;
	}
	
	//마지막에 음악 추가 : 사용자로부터 곡명과 가수를 입력받아 리스트에 저장하는 메소드
	public void addList(Music music) {
		musicList.add(music);
	}
	
	//맨처음에 음악 추가 : 리스트 최상위(0번지)에 음악을 추가하는 메소드
	public void addAtZero(Music music) {
		musicList.add(0, music);
	}
	
	//특정곡을 삭제하는 메소드(제목을 전달받아 검색후, 최초로 검색된 음악을 삭제)
	public boolean removeMusic(String str) { 
		for(int i = 0; i < musicList.size();i++) {
			if(str.equals(musicList.get(i).getTitle())) {
				musicList.remove(i);
				System.out.println("삭제완료");
				return true; 
			}
		}
		return false;
	}
	
	//특정곡을 바꾸는 메소드(이전 음악객체, 새 음악객체를 전달해서 교체) / 교체 성공여부를 리턴
	public boolean replaceMusic(Music oldMusic, Music newMusic) {
		for(int i = 0; i < musicList.size();i++) {
			if(oldMusic.getTitle().equals(musicList.get(i).getTitle()) &&
					oldMusic.getSinger().equals(musicList.get(i).getSinger())) {
			musicList.set(i, newMusic);
			System.out.println("교체 성공");
			return true;
			}
		}
		return false;
	}
	
	//특정곡이 있는지 검사하는 메소드 : 복수개의 결과가 나올수 있음.
	//(곡명일부로 검색해서 해당곡이 있다면, 곡정보(제목/가수)를 출력하고, 없다면, "검색결과가 없습니다"출력)
	public List<Music> searchMusicByTitle(String title){
		List<Music> mus = new ArrayList<Music>();
		for(Music music : musicList) {
			if(title.equals(music.getTitle())) {
				mus.add(music); 
				System.out.println("검색완료");
			}
		}
		return mus;
	}
	//가수명으로 검색 메소드 : 복수개의 결과가 나올수 있음.
	public List<Music> searchMusicBySinger(String singer){
		List<Music> mus = new ArrayList<Music>();
		for(Music music : musicList) {
			if(singer.equals(music.getSinger())) {
				mus.add(music);
				System.out.println("검색완료");
			}
		}
		return mus;
	}

	//서브메뉴 - 각 정렬 메소드 : Comparable/Comparator 인터페이스를 적절히 활용할 것
	//	+ orderBy(Comparator<Music> c) : List<Musice>
	public List<Music> orderBy(Comparator<Music> c){
		musicList.sort(c);
		return musicList;
	}
}

