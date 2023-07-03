package com.kh.day06.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	// 정보 입력/출력에 전부 사용해야하기 때문에 전역변수 선언
	static int index = 0;
	public static void main(String [] args)
	{
		// main 메소드에서 Student 클래스의 참조변수를 사용해야하기 때문에,
		// 객체 생성을 main 메소드 안에 선언해야 한다.
		// 1명의 정보를 입력받을 때!
//		Student stdOne = new Student();
		// 여러명의 정보를 입력받기 위해서 객체 배열 만듦.
		Student [] stds = new Student[3];
//		====== 메인 메뉴 ======
//		1. 성적입력
//		2. 성적출력
//		3. 종료
//		선택 : 1
		// static 으로 변수를 선언하지 않았다면 이렇게 객체 생성해야함!
//		Exercise_ScoreProgram score = new Exercise_ScoreProgram();
//		score.kor = 0;
		finish :
		while(true) {
			Scanner sc = new Scanner(System.in);
			printMenu();
			int choice = sc.nextInt();
			switch(choice) {
				case 1 : 
					inputScore(stds);
					break;
				case 2 : 
					printScore(stds);
					break;
				case 3 : 
					showGoodBye();
					break finish;
				default : printException();
			}
		}
	}
	
	public static void printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}
	
	public static void inputScore(Student [] stds) {
//		====== 성적 입력 =======
//		국어 : 100
//		영어 : 90
//		수학 : 80
		Scanner sc = new Scanner(System.in);
		
		// for문(반복문)으로 이름/성적 입력
//		for(int i = 0; i < stds.length; i++) {
			stds[index] = new Student();
			System.out.println("====== 이름 입력 ======");
			System.out.print("이름 : ");
			// 문자열 입력받는 메소드 next() nextLine()
			// next() : 공백없는 문자열 ex. 이름, ...
			// nextLine() : 공백있는 문자열 ex. 주소, ...
			stds[index].name = sc.next();
//			stds[0] = new Student();
//			stds[0].name = sc.next();
			System.out.println("====== 성적 입력 ======");
			System.out.print("국어 : ");
			stds[index].kor = sc.nextInt();
			System.out.print("영어 : ");
			stds[index].eng = sc.nextInt();
			System.out.print("수학 : ");
			stds[index].math = sc.nextInt();
			sc.nextLine();	// 개행 입력 받아줌
			if(index < stds.length) index++;
//		}
		
//		System.out.println("====== 이름 입력 ======");
//		// 오류 메세지 : NullPointerException
//		// 공간만 할당받고, 배열이 만들어지지 않아 발생한 오류 메세지로,
//		// 객체을 만들어서 문제 해결.
//		stds[0] = new Student();
//		stds[0].name = sc.next();
//		System.out.println("====== 성적 입력 ======");
//		System.out.print("국어 : ");
//		stds[0].kor = sc.nextInt();
//		System.out.print("영어 : ");
//		stds[0].eng = sc.nextInt();
//		System.out.print("수학 : ");
//		stds[0].math = sc.nextInt();
//		
//		System.out.println("====== 이름 입력 ======");
//		// 오류 메세지 : NullPointerException
//		// 공간만 할당받고, 배열이 만들어지지 않아 발생한 오류 메세지로,
//		// 객체을 만들어서 문제 해결.
//		stds[1] = new Student();
//		stds[1].name = sc.next();
//		System.out.println("====== 성적 입력 ======");
//		System.out.print("국어 : ");
//		stds[1].kor = sc.nextInt();
//		System.out.print("영어 : ");
//		stds[1].eng = sc.nextInt();
//		System.out.print("수학 : ");
//		stds[1].math = sc.nextInt();
//		
//		System.out.println("====== 이름 입력 ======");
//		// 오류 메세지 : NullPointerException
//		// 공간만 할당받고, 배열이 만들어지지 않아 발생한 오류 메세지로,
//		// 객체을 만들어서 문제 해결.
//		stds[2] = new Student();
//		stds[2].name = sc.next();
//		System.out.println("====== 성적 입력 ======");
//		System.out.print("국어 : ");
//		stds[2].kor = sc.nextInt();
//		System.out.print("영어 : ");
//		stds[2].eng = sc.nextInt();
//		System.out.print("수학 : ");
//		stds[2].math = sc.nextInt();
	}
	
	public static void printScore(Student [] stds) {
//		====== 성적 출력 ======
//		국어 : 100
//		영어 : 90
//		수학 : 80
//		총점 : 270
//		평균 : 90.00

		// for문(반복문)으로 성적 출력
		for(int i = 0; i < index; i++) {
			System.out.println("====== 성적 출력 =======");
			System.out.printf("이름 : %s\n", stds[i].name);
			System.out.printf("국어 : %d\n", stds[i].kor);
			System.out.printf("영어 : %d\n", stds[i].eng);
			System.out.printf("수학 : %d\n", stds[i].math);
			System.out.printf("총점 : %d\n", stds[i].getTotal());
			System.out.printf("평균 : %.2f\n", stds[i].getAvg());
		}
		
//		System.out.println("====== 성적 출력 =======");
//		System.out.printf("이름 : %s\n", stds[0].name);
//		System.out.printf("국어 : %d\n",stds[0].kor);
//		System.out.printf("영어 : %d\n",stds[0].eng);
//		System.out.printf("수학 : %d\n",stds[0].math);
//		System.out.printf("총점 : %d\n",stds[0].kor+stds[0].eng+stds[0].math);
//		System.out.printf("평균 : %.2f\n",(double)(stds[0].kor+stds[0].eng+stds[0].math)/3);
//		
//		System.out.println("====== 성적 출력 =======");
//		System.out.printf("이름 : %s\n", stds[1].name);
//		System.out.printf("국어 : %d\n",stds[1].kor);
//		System.out.printf("영어 : %d\n",stds[1].eng);
//		System.out.printf("수학 : %d\n",stds[1].math);
//		System.out.printf("총점 : %d\n",stds[1].kor+stds[1].eng+stds[1].math);
//		System.out.printf("평균 : %.2f\n",(double)(stds[1].kor+stds[1].eng+stds[1].math)/3);
//		
//		System.out.println("====== 성적 출력 =======");
//		System.out.printf("이름 : %s\n", stds[2].name);
//		System.out.printf("국어 : %d\n",stds[2].kor);
//		System.out.printf("영어 : %d\n",stds[2].eng);
//		System.out.printf("수학 : %d\n",stds[2].math);
//		System.out.printf("총점 : %d\n",stds[2].kor+stds[2].eng+stds[2].math);
//		System.out.printf("평균 : %.2f\n",(double)(stds[2].kor+stds[2].eng+stds[2].math)/3);
	}
	
	public static void showGoodBye() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요.");
	}
}
