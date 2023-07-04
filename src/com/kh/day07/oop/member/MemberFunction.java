package com.kh.day07.oop.member;

import java.util.Scanner;

public class MemberFunction {
	// 캡슐화를 위해 접근지정자 private로 지정
	// 객체 배열 선언
	private Member [] memArrs = new Member[3];
	// index 변수 선언
	private int index;
	
	// 생성자
	public MemberFunction() {
		// 멤버변수 초기화
		memArrs = new Member[3];
		// index 변수 초기화
		index = 0;
	}
	
	// 함수
	// 외부에서 사용해야하기 때문에 public or default 사요하고, static 삭제
	public int printMenu() {
		// 회원관리 프로그램
		// 1. 회원정보 입력
		// 2. 회원정보 출력
		// 3. 프로그램 종료
		// 메뉴 입력 : 
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원관리프로그램 ======");
		System.out.println("1. 회원정보입력");
		System.out.println("2. 회원정보출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		System.out.println();
		return choice;
	}
	// 전역변수로 선언되어있기 때문에, 전달받아서 쓸 필요가 없다.
	// 메소드가 있는 클래스에 memArrs 가 있기때문에.
	public void intputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원정보입력 ======");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		System.out.print("주소 : ");
		sc.nextLine(); // 개행 제거
		String address = sc.nextLine();
		System.out.println();
//		memArrs[0] = new Member();
//		memArrs[0].setMemberId(memberId);
//		memArrs[0].setMemberPw(memberPw);
//		memArrs[0].setMemberEmail(email);
//		memArrs[0].setMemberAddress(address);
		// 계속 사용하고, 전역변수로 활용하기 위해서 index 변수 사용
		memArrs[index] = new Member(memberId, memberPw, email, address);
		index++;
	}
	
	public void printInfo() {
		System.out.println("====== 회원정보출력 ======");
		for(int i = 0; i < index; i++) {
			System.out.printf("%s님의 비밀번호는 %s이고, 이메일은 %s이며, 주소는 %s입니다.\n\n"
					, memArrs[i].getMemberId()
					, memArrs[i].getMemberPw()
					, memArrs[i].getMemberEmail()
					, memArrs[i].getMemberAddress());
		}
	}
}
