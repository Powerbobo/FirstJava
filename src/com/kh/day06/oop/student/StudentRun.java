package com.kh.day06.oop.student;

import java.util.Scanner;

public class StudentRun {
	public static void main(String [] args) {
		Student [] stdArr = new Student[2];
		finish :
		while(true) {
			int chioce = printMenu();
			switch (chioce) {
			case 1 : 
				inputScore(stdArr);
				break;
			case 2 : 
				printScore(stdArr);
				break;
			case 3 : 
				checkPass(stdArr);
				break;
			case 4 : 
				showGoodBye();
				break finish;
			default : printException();
			}
		}
	}
	
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("학생 성적 확인 프로그램");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int chioce = sc.nextInt();
		// 메소드 오버로딩 
		System.out.println(1);
		System.out.println('A');
		System.out.println("Hello Java");
		System.out.println(true);
		return chioce;
	}
	
	public static void inputScore(Student [] stdArr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < stdArr.length; i++) {
			System.out.println();
			System.out.println("====== 학생 성적 입력 ======");
			System.out.println((i+1)+"번째 학생 정보 입력");
			System.out.print("학생 이름 입력 : ");
			stdArr[i] = new Student();
			String name = sc.next();
			System.out.print("1차 점수 입력 : ");
			int firstScore = sc.nextInt();
			System.out.print("2차 점수 입력 : ");
			int secondScore = sc.nextInt();
			stdArr[i] = new Student();
			stdArr[i].setName(name);
			stdArr[i].setFirstScore(firstScore);
			stdArr[i].setSecondScore(secondScore);
		}
	}
	
	public static void printScore(Student [] stdArr) {
		for(int i = 0; i < stdArr.length; i++ ) {
			System.out.println((i+1)+"번째 학생 성적 정보 출력");
			System.out.println(stdArr[i].getName() + "학생의 점수는 1차 점수 : " + stdArr[i].getFirstScore() + "점, 2차 점수 : " + stdArr[i].getSecondScore() + "점 입니다.");
		}
	}
	
	public static void checkPass(Student [] stdArr) {
		// 
		System.out.println("====== 재평가 여부 확인 ======");
		for(int i = 0; i < stdArr.length; i++) {
			double avg = stdArr[i].getAvg();
			int num1 = stdArr[i].getFirstScore();
			int num2 = stdArr[i].getSecondScore();
			System.out.println((i+1) + "번째, " + stdArr[i].getName() + "학생 확인 결과");
			if(avg >= 60) {
				if(num1 < 40) {
					System.out.println("1차 시험 재시험 대상자입니다.");
				} else if (num2 < 40) {
					System.out.println("2차 시험 재시험 대상자입니다.");
				} else {
					System.out.println("통과했습니다.");
				}
			}else {
				if(num1 < 60) {
					System.out.println("1차 시험 재시험 대상자입니다.");
				}
				if(num2 < 60) {
					System.out.println("2차 시험 재시험 대상자입니다.");
				}
			}
		// 내 코드
//		for(int i = 0; i < stdArr.length; i++) {
//			System.out.println((i+1)+"번째" + stdArr[i].name + "학생의 확인결과");
//			if(stdArr[i].firstscore < 40) {
//				System.out.println("1차시험 재시험 대상자입니다.");
//			} else if(stdArr[i].secondscore < 40) {
//				System.out.println("2차시험 재시험 대상자입니다.");
//			} else if (stdArr[i].getAvg() > 60 && stdArr[i].firstscore > 40 && stdArr[i].secondscore > 40) {
//				System.out.println("통과했습니다.");
//			} else if(stdArr[i].getAvg() < 60 && stdArr[i].firstscore < 40) {
//				System.out.println("1차시험 재시험 대상자입니다.");
//			} else if(stdArr[i].getAvg() < 60 && stdArr[i].secondscore < 40) {
//				System.out.println("2차시험 재시험 대상자입니다.");
//			}
//		} 
		}
	}
	
	public static void showGoodBye() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요.");
	}
	
	
}
