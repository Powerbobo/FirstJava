package com.kh.day18.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day18.music.controller.MusicController;
import com.kh.day18.music.model.vo.Music;


public class MusicView {
	private MusicController mController;
	
	public MusicView() {
		mController = new MusicController();
	}
	
	public void startProgram() {
		
		Music music = null;
		List<Music> mList = null;
		String singer = null;
		int index = -1;
		
		end :
		while(true) {
			int choice = printMenu();
			switch(choice) {
				case 1 : 
					music = inputMusic();
					mController.addMusic(music);
					break;
				case 2 : 
					singer = inputSinger();
					index = mController.findIndexBySinger(singer);
					if(index != -1) {
						music = mController.findMusicBySinger(singer);
						music = modifyMusic(music);
						mController.modifyMusic(index, music);
					}
					break;
				case 3 : 
					singer = inputSinger();
					index = mController.findIndexBySinger(singer);
					if(index != -1) {
						mController.deleteMusic(index);
					}
					break;
				case 4 : 
					singer = inputSinger();
					mList = mController.findListBySinger(singer);
					printAllMusics(mList);
					// findListBySinger
					// printAllMusics
					break;
				case 5 : 
					mList = mController.allMuiscInfo();
					printAllMusics(mList);
					break;
				case 6 : break end;
			}
		}
		
	}
	
	// 수정할 정보 입력
	private Music modifyMusic(Music music) {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		music.setTitle(title);
		music.setSinger(singer);
		return music;
	}

	private String inputSinger() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가수명 : ");
		String singer = sc.next();
		return singer;
	}

	private void printAllMusics(List<Music> mList) {
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			System.out.printf("%d번째 곡 -> 가수명 : %s\t곡명 : %s\n"
					, (i+1)
					, music.getSinger()
					, music.getTitle());
		}
	}

	private Music inputMusic() {
		Scanner sc = new Scanner(System.in);
			System.out.println("===== 음악 정보 등록 =====");
			System.out.print("곡명 : ");
			String title = sc.nextLine();
			System.out.print("가수명 : ");
			String singer = sc.nextLine();
			Music music = new Music(title, singer);
			return music;
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 음악 관리 프로그램 ====");
		System.out.println("1. 음악 정보 등록");
		System.out.println("2. 음악 정보 수정");
		System.out.println("3. 음악 정보 삭제");
		System.out.println("4. 음악 정보 출력(가수명)");
		System.out.println("5. 음악 정보 전체 출력)");
		System.out.println("6. 프로그램 정보");
		System.out.print("선택 : ");
		int number = sc.nextInt();
		return number;
	}
	
	
	
	
	
}
