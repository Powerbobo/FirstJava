package com.kh.day07.oop.member;

import java.util.Scanner;

public class MemberRun {
	static int index = 0;
	public static void main(String [] args) {
		// MemberRun 에 있던 메소드들을 MemberFunction에 전부 옮겨서
		// 옮긴 메소드를 호출해서 사용하기 위해 MemberFunction 배열을
		// 선언해서 사용
		MemberFunction mFunc = new MemberFunction();
		finish :
		while(true) {
			int choice = mFunc.printMenu();
			switch(choice) {
			case 1 : 
				mFunc.intputInfo();
				break;
			case 2 : 
				mFunc.printInfo();
				break;
			case 3 : 
				System.out.println("프로그램이 종료되었습니다.");
				break finish;
			default : 
				System.out.println("해당 메뉴는 존재하지 않습니다.");
				break;
			}
		}
	}
}
// 소스파일이 길어지면 구조파악이 힘들고, 유지보수가 힘들어짐
// 그래서 파일일 나눠 놓으면 관리가 쉬워짐!
// 파일은 기능별로 나눔
// Member -> 저장용, MemberFunction -> 기능 저장용, MemberRun -> 실행용