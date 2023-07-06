package com.kh.BankGiftProgram;

import java.util.Scanner;

public class MemberFunction {
	
	// 객체 배열 선언
	private Member [] memArrs;
	
	// 인덱스 변수 선언
	static int index;
	
	// 생성자
	public MemberFunction() {
		
		// 멤버 변수 초기화
		memArrs = new Member[5];
		
		// index 변수 초기화
		index = 0;
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========================================================");
		System.out.println("          [KH은행] 새해 선물 등급 관리 프로그램          ");
		System.out.println("=========================================================");
		System.out.println("1. 회원 정보 입력");
		System.out.println("2. 회원 정보 조회");
		System.out.println("3. 회원 선물 확인");
		System.out.println("4. 회원 정보 삭제");
		System.out.println("5. 종료");
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		System.out.println();
		return choice;
	}
	
	public void  inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========================================================");
		System.out.println("                      회원정보 입력                      ");
		System.out.println("=========================================================");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("회사 : ");
		String company = sc.next();
		System.out.print("직급 : ");
		String position = sc.next();
		System.out.print("연락처 : ");
		String phone = sc.next();
		System.out.print("주소 : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.print("예금 금액 : ");
		int money = sc.nextInt();
		System.out.println();
		memArrs[index] = new Member(name, company, position, phone, address, money);
		index++;
	}
	
	public int inquiryInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========================================================");
		System.out.println("                        회원 목록                        ");
		System.out.println("=========================================================");
		for(int i = 0; i < index; i++) {
			System.out.printf((i+1) + ". %s\n", memArrs[i].getName());
		}
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			System.out.println("=========================================================");
			System.out.println("                      회원정보 조회                      ");
			System.out.println("=========================================================");
			int j = choice-1;
			System.out.printf("이름 : %s\n회사 : %s\n직급 : %s\n연락처 : %s\n주소 : %s\n예금 금액 : %d\n"
					, memArrs[j].getName()
					, memArrs[j].getCompany()
					, memArrs[j].getPosition()
					, memArrs[j].getPhone()
					, memArrs[j].getAddress()
					, memArrs[j].getMoney());
	
		return choice;
	}
	public void CheckGift() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========================================================");
		System.out.println("                        회원 목록                        ");
		System.out.println("=========================================================");
		for(int i = 0; i < index; i++) {
			System.out.printf((i+1) + ". %s\n", memArrs[i].getName());
		System.out.print("선택 : ");
		int select = sc.nextInt();
		System.out.println("=========================================================");
		System.out.println("                      회원선물 확인                      ");
		System.out.println("=========================================================");
//		if()
		
		
		
		}
		
		
	}
	
	public void DeleteInfo() {
		
	}
	
	public void ShowEnd() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public void WorngChoice() {
		System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택해주세요.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
