package com.kh.day10.collection.music;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MusicFunction {
	
	// 필드 - List 선언
	List<Music> mList;
	
	// 생성자 - List 초기화
	public MusicFunction() {
		mList =  new ArrayList<Music>();
	}
	
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >> ");
		int value = sc.nextInt();
		return value;
	}
	// 마지막 위치에 곡 추가
	public void inputMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 마지막 위치에 곡 추가 ======");
		System.out.print("곡명 : ");
		String title = sc.next();
		System.out.print("가수명 : ");
		String singer = sc.next();
		Music music = new Music(title, singer); // music 변수에 곡명, 가수명 저장
		mList.add(music); // mList 에 music 데이터 추가
		System.out.println("[서비스 성공] : 추가 성공!");
	}
	// 첫 위치에 곡 추가
	public void inputMusicAtFirst() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 첫번째 위치에 곡 추가 ======");
		System.out.print("곡명 : ");
		String title = sc.next();
		System.out.print("가수명 : ");
		String singer = sc.next();
		Music music = new Music(title, singer); // music 변수에 곡명, 가수명 저장
		mList.add(0, music); // mList 에 music 데이터 추가
		// add(0, music) -> 첫번째 위치에 입력한 music 데이터 값 추가!
		System.out.println("[서비스 성공] : 추가 성공!");
	}
	// 음약 전체 출력
	public void printAllMusics() {
		System.out.println("====== 전체 곡 목록 ======");
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			System.out.printf("%d번째 노래 -> 곡명 : %s, 가수명 : %s\n"
					, (i+1)
					, music.getTitle()
					, music.getSinger());
		}
		System.out.println("[서비스 성공] : 조회 성공!");
	}
	// 곡명으로 음악 검색
	public void printOneByTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 곡 입력 : ");
		String title = sc.nextLine();
		// for each문
		for(Music music : mList) {
			if(music.getTitle().equals(title)) {
				System.out.printf("검색 결과 >> 곡명 : %s, 가수명 : %s\n"
						, music.getTitle()
						, music.getSinger());
				break; // 찾았으면 for문 탈출
			}
		}
		System.out.println("[서비스 성공] : 조회 성공!");
	}
	// 곡명으로 음악 삭제
	public void removeMusic() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 곡 입력 : ");
		String title = sc.nextLine();
		// index 값을 삭제해야하는데, for each문은 index값 컨트롤이 불가능해서
		// for문 사용
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				// mList에서 삭제
				mList.remove(i);
				break; // 찾았으면 for문 탈출
			}
		}
		System.out.println("[서비스 성공] : 삭제 성공!");
	}
	// 곡명으로 수정
	public void modifyMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 곡 입력 : ");
		String title = sc.nextLine();
		System.out.print("수정할 정보 입력(곡명) : ");
		String modTitle = sc.nextLine();
		System.out.print("수정할 정보 입력(가수명) : ");
		String modSinger = sc.nextLine();
		// 수정할 곡명, 가수명 저장
		Music modMusic = new Music(modTitle, modSinger);
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				// mList에서 수정
				// 수정해야하는 index 찾으면 저장해놓은 modMusic 변수로 바꿔 줌.
				mList.set(i, modMusic);
				break; // 찾았으면 for문 탈출
			}
		}
		System.out.println("[서비스 성공] : 수정 성공!");
	}
	
	public void ascendingSortTitle() {
		// TODO Auto-generated method stub

	}
	
	public void descendingSortTitle() {
		// TODO Auto-generated method stub

	}
	
	public void ascendingSortSinger() {
		// TODO Auto-generated method stub

	}
	
	public void descendingSortSinger() {
		// TODO Auto-generated method stub

	}
	
	public void over() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public void defaultValue() {
		System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택해주세요.");
	}
	
}
