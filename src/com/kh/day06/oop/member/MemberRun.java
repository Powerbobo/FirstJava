package com.kh.day06.oop.member;

import java.util.Scanner;

public class MemberRun {
	public static void main(String [] args) {
		Member [] memArrs = new Member[2];
		finish :
		while(true) {
			int chioce = printMenu();
			switch(chioce) {
			case 1 : 
				intputScore(memArrs);
				break;
			case 2 : 
				printScore(memArrs);
				break;
			case 3 : 
				checkPass(memArrs);
				break;
			case 4 : 
				showGoodBye();
				break finish;
			default : 
				printException();
				break;
			}
		}
	}
	
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 학생 성적 확인 프로그램 ===");
		System.out.println("1. 학생 성적 입력 : ");
		System.out.println("2. 학생 성적 출력 : ");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int chioce = sc.nextInt();
		return chioce;
	}
	public static void intputScore(Member [] memArrs) {
		for(int i = 0; i < memArrs.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("====== 학생 성적 입력 ======");
			System.out.println((i+1) + "번째 학생 정보 입력");
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			System.out.print("1차 점수 입력 : ");
			int firstScore = sc.nextInt();
			System.out.print("2차 점수 입력 : ");
			int secondScore = sc.nextInt();
			memArrs[i] = new Member();
			memArrs[i].setName(name);
			memArrs[i].setFirstScore(firstScore);
			memArrs[i].setSecondScore(secondScore);
		}
	}
	public static void printScore(Member [] memArrs) {
		for(int i = 0; i < memArrs.length; i++) {
			// 이 부분 출력이 안됨!
			System.out.println((i+1) + "번째 학생 정보 출력");
			System.out.println(memArrs[i].getName() + " 학생의  점수는 1차점수 : " + memArrs[i].getFirstScore() + 
					"점 , 2차 점수 : " + memArrs[i].getSecondScore() + "점 입니다.");
		}
	}
	public static void checkPass(Member [] memArrs) {
		for(int i = 0; i < memArrs.length; i++) {
			double avg = memArrs[i].getAvg();
			int num1 = memArrs[i].getFirstScore();
			int num2 = memArrs[i].getSecondScore();
			System.out.println((i+1) + "번째, " + memArrs[i].getName() + "학생 확인 결과");
			if(avg >= 60) {
				if(num1 < 40) {
					System.out.println("1차 시험 재시험 대상자입니다.");
				} else if(num2 < 40) {
					System.out.println("2차 시험 재시험 대상자입니다.");
				} else {
					System.out.println("통과하셨습니다.");
				}
			} else {
				if(num1 < 60) {
					System.out.println("1차 시험 재시험 대상자입니다.");
				}
				if(num2 < 60) {
					System.out.println("2차 시험 재시험 대상자입니다.");
				}
			}
		}
	}
	public static void showGoodBye() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	public static void printException() {
		System.out.println("잘못 선택하셨습니다. 메뉴를 선택해주세요.");
	}
	
	
	
	
	
}





