package com.kh.day10.collection.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFunction {
	
	List<Student> stdList;
	
	public StudentFunction() {
		stdList = new ArrayList<Student>();
	}
	
	public int printMenu() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 성적관리 프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색");
		System.out.println("3. 학생 정보 전체 출력");
		System.out.println("4. 재평가 대상 확인");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("2차 점수 : ");
		int score2 = sc. nextInt();
		Student std = new Student(name, score1, score2);
		stdList.add(std);
	}
	
	public void searchInfoByName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 이름 검색");
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		for(Student std : stdList) {
			if(std.getName().equals(searchName)) {
				System.out.println(std.toString());
				break;
			}
		}
	}
	
	public void printInfo() {
		System.out.println("학생 정보 전체 출력");
			for(Student student : stdList) {
				System.out.println(student.toString());
			}
	}
	public void checkPass() {
		System.out.println("====== 재평가 여부 확인 ======");
		for(Student student : stdList) {
			int score1 = student.getSocre1();
			int score2 = student.getScore2();
			double avg = (double)(score1 + score2)/2;
			System.out.println(); // 결과출력 학생 이름
			if(avg >= 60) {
				if(score1 < 40) {
					System.out.println("1차 시험 재시험 대상자입니다.");
				} else if(score2 < 40) {
					System.out.println("2차 시험 재시험 대상자입니다.");
				} else {
					System.out.println("통과했습니다.");
				}
			} else {
				if(score1 < 60) {
					System.out.println("1차 시험 재시험 대상자입니다.");
				}
				if(score2 < 60) {
					System.out.println("2차 시험 재시험 대상자입니다.");
				}
			}
		}
	}


	
	
	
	
	
	
	
	
	
	
}
