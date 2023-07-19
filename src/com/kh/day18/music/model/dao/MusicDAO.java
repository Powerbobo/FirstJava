package com.kh.day18.music.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.kh.day18.music.model.vo.Music;

public class MusicDAO {
	
	private List<Music> musicList;
	
	public MusicDAO() {
		musicList = new ArrayList<Music>();
	}
	/**
	 * 음악 등록하기
	 * @param music
	 */
	public void addMusic(Music music) {
		musicList.add(music);
	}
	public List<Music> allMusicInfo() {
		return musicList;
	}
	/**
	 * 가수명으로 음악 찾기
	 * @param singer
	 * @return
	 */
	public List<Music> findListBySinger(String singer) {
		List<Music> findList = new ArrayList<Music>();
		for(Music music : musicList) {
			if(music.getSinger().equals(singer)) {
				findList.add(music);
			}
		}
		return findList;
	}
	/**
	 * 가수명으로 인덱스 찾기
	 * @param singer
	 * @return
	 */
	public int findIndexBySinger(String singer) {
		int count = 0;
		for(Music music : musicList) {
			if(music.getSinger().equals(singer)) {
				return count;
			}
			count += 1;
		}
		return -1;
//		for(int i = 0; i< musicList.size(); i++) {
//			if(musicList.get(i).getSinger().equals(singer)) {
//				return i;
//			}
//		}
//		return -1;
	}
	/**
	 * 음악 정보 삭제
	 * @param index
	 */
	public void deleteMusic(int index) {
		musicList.remove(index);
	}
	/**
	 * 가수명으로 회원 정보 찾기
	 * @param singer String으로 입력받은 값
	 * @return Music 객체 리턴, 없으면 null 리턴
	 */
	public Music findMusicBySinger(String singer) {
		for(Music music : musicList) {
			if(music.getSinger().equals(singer)) {
				return music;
			}
		}
		return null;	// 의도한 널
	}
	/**
	 * 데이터 수정하기
	 * @param index
	 * @param music
	 */
	public void updateMusic(int index, Music music) {
		musicList.set(index, music);
	}

}
