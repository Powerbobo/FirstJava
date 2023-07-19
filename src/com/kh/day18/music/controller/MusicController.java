package com.kh.day18.music.controller;

import java.util.List;

import com.kh.day18.music.model.dao.MusicDAO;
import com.kh.day18.music.model.vo.Music;

public class MusicController {
	
	private MusicDAO musicDao;
	
	public MusicController() {
		musicDao =  new MusicDAO();
	}
	/**
	 * 곡 정보 등록
	 * @param music 입력받은 곡명, 가수명
	 */
	public void addMusic(Music music) {
		// musicDao cannot be resolved
		// => 임포트
		musicDao.addMusic(music);
	}
	/**
	 * 전체 정보 출력
	 * @return List 전체 정보인 List 출력
	 */
	public List<Music> allMuiscInfo() {
		List<Music> mList = musicDao.allMusicInfo();
		return mList;
	}
	/**
	 * 가수명으로 정보 출력
	 * @param singer
	 * @return
	 */
	public List<Music> findListBySinger(String singer) {
		List<Music> mList = musicDao.findListBySinger(singer);
		return mList;
	}
	/**
	 * 가수명으로 인덱스 찾기
	 * @return
	 */
	public int findIndexBySinger(String singer) {
		int index = musicDao.findIndexBySinger(singer);
		return index;
	}
	/**
	 * 음악 정보 삭제
	 * @param index
	 */
	public void deleteMusic(int index) {
		musicDao.deleteMusic(index);
	}
	/**
	 * 가수명로 음악 찾기
	 * @param singer
	 * @return
	 */
	public Music findMusicBySinger(String singer) {
		Music msuic = musicDao.findMusicBySinger(singer);
		return msuic;	// return 은 null로 두지 않는다!
	}
	/**
	 * 데이터 수정하기
	 * @param index
	 * @param music
	 */
	public void modifyMusic(int index, Music music) {
		musicDao.updateMusic(index, music);
	}
	
	
	

}
