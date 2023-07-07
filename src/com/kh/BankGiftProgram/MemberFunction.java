package com.kh.BankGiftProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberFunction {
	
	List<Member> memList;
	
	public MemberFunction() {
		memList = new ArrayList<Member>();
	}
	
	// 객체 배열 선언
//	private Member [] memArrs;
	
	// 인덱스 변수 선언
//	static int index;
	
	// 메인 메뉴
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====================================================================================");
		System.out.println("                        [KH은행] 새해 선물 등급 관리 프로그램                        ");
		System.out.println("=====================================================================================");
		System.out.println("1. 고객 정보 입력");
		System.out.println("2. 고객 정보 이름 검색");
		System.out.println("3. 고객 정보 조회");
		System.out.println("4. 고객 선물 확인");
		System.out.println("5. 회원 정보 삭제");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		System.out.println();
		return choice;
	}
	// 고객 정보 입력
	public void  inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====================================================================================");
		System.out.println("                                   고객 정보 입력                                    ");
		System.out.println("=====================================================================================");
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
		Member member = new Member(name, company, position, phone, address, money);
		memList.add(member);
		System.out.println();
		System.out.println("[서비스 성공] : 입력 성공!");
		System.out.println();
//		memArrs[index] = new Member(name, company, position, phone, address, money);
//		index++;
	}
	// 이름으로 고객 정보 조회
	public void searchInfoByName() {
		System.out.println("=====================================================================================");
		System.out.println("                               고객 정보 이름으로 검색                               ");
		System.out.println("=====================================================================================");
		Scanner sc = new Scanner(System.in);
		System.out.println("고객 정보 이름 검색");
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		for(Member mem : memList) {
			if(mem.getName().equals(searchName)) {
				System.out.printf("이름 : %s\n회사 : %s\n직급 : %s\n연락처 : %s\n주소 : %s \n예금 금액 : %s\n"
						, mem.getName(), mem.getCompany(), mem.getPosition(), mem.getPhone(), mem.getAddress(), mem.getMoney());
			}
		}
		System.out.println();
		System.out.println("[서비스 성공] : 조회 성공!");
		System.out.println();
	}
	// 고객 전체 정보 출력
	public void printInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====================================================================================");
		System.out.println("                                    고객 정보 조회                                   ");
		System.out.println("=====================================================================================");
		for(int i = 0; i < memList.size(); i++) {
			Member mem = memList.get(i);
			System.out.printf((i+1) + "번째 고객 \n이름 : %s\n회사 : %s\n직급 : %s\n연락처 : %s\n주소 : %s \n예금 금액 : %s\n"
					, mem.getName(), mem.getCompany(), mem.getPosition(), mem.getPhone(), mem.getAddress(), mem.getMoney());
			System.out.println();
		}

		System.out.println();
		System.out.println("[서비스 성공] : 조회 성공!");
		System.out.println();
	}
	public void CheckGift() {
//		Scanner sc = new Scanner(System.in);
//		int select = 0;
////		int list = 0;
//		end :
//		System.out.println("=========================================================");
//		System.out.println("                        회원 목록                        ");
//		System.out.println("=========================================================");
//		for(int i = 0; i < index; i++) {
//			System.out.printf((i+1) + ". %s\n", memArrs[i].getName());
//			System.out.print("선택 : ");
//			select = sc.nextInt();
////			int list = i;
//			System.out.println("=========================================================");
//			System.out.println("                      회원선물 확인                      ");
//			System.out.println("=========================================================");
//			switch (select) {
//				case 1 : 
//					if(memArrs[i].getMoney() < 10000000) {
//						System.out.print(memArrs[i].getName() + "님의 2024년 새해 선물은 참치 선물세트입니다.");
//					} else if(memArrs[i].getMoney() >= 10000000 && memArrs[i].getMoney() < 100000000) {
//						System.out.print(memArrs[i].getName() + "님의 2024년 새해 선물은 표고버섯 선물세트입니다.");
//					} else if(memArrs[i].getMoney() >= 100000000 && memArrs[i].getMoney() < 1000000000) {
//						System.out.print(memArrs[i].getName() + "님의 2024년 새해 선물은 홍산 선물세트입니다.");
//					} else {
//						System.out.print(memArrs[i].getName() + "님의 2024년 새해 선물은 1++ 한우 선물세트입니다.");
//					}
//					break;
//				case 2 : 
//			}
//		}
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
