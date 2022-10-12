package com.sh.collection.list.music.view;

import java.util.Comparator;

import com.sh.collection.list.music.model.vo.Music;

public class singerCompartor implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		
		return o1.getSinger().compareTo(o2.getSinger());
	}

}
