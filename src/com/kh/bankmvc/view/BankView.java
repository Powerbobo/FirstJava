package com.kh.bankmvc.view;

import java.util.Scanner;

import com.kh.bankmvc.model.vo.Bank;

public class BankView {
	// 메인 메뉴
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====================================================================================");
		System.out.println("                        [KH은행] 새해 선물 등급 관리 프로그램                        ");
		System.out.println("=====================================================================================");
		System.out.println("1. 고객 정보 입력");
		System.out.println("2. 고객 정보 이름 조회");
		System.out.println("3. 고객 정보 출력");
		System.out.println("4. 고객 정보 수정");
		System.out.println("5. 고객 선물 조회");
		System.out.println("6.고객 정보 삭제");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		System.out.println();
		return choice;
	}
	
	// 고객 정보 입력
	public Bank inputMemberInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====================================================================================");
		System.out.println("                                   고객 정보 입력                                    ");
		System.out.println("=====================================================================================");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("회사 : ");
		sc.nextLine();
		String company = sc.nextLine();
		System.out.print("직급 : ");
		String position = sc.next();
		System.out.print("연락처 : ");
		String phone = sc.next();
		System.out.print("주소 : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.print("예금 금액 : ");
		int money = sc.nextInt();
		Bank bank = new Bank(name, company, position, phone, address, money);
		return bank;
	}

	// 메세지 출력
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	// 성공 메세지 출력
	public void displaySuccess() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
