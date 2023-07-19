package com.kh.day18.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day18.member.controller.MemberController;
import com.kh.day18.member.controller.MemberController_prev;
import com.kh.day18.member.model.vo.Member;

public class MemberView {
	
	private MemberController Controller;
	
	public MemberView() {
		Controller = new MemberController();
	}
	
	public void startMemberProgram() {
		Member mOne = null;
		String name = "";
		int index = 0;
		finish :
		while(true) {
			// ===================== 메인 메뉴 =====================
			int choice = this.printMenu();
			switch(choice) {
				case 1 : 
					// ===================== 회원 정보 등록 =====================
					mOne = this.inputMember();
					Controller.addMember(mOne);
					break;
				case 2 : 
					// ===================== 회원 정보 수정 =====================
					name = this.inputMemberName();				// 수정할 데이터의 이름을 입력 받음.
					index = Controller.findIndexByName(name);	// 인덱스값을 찾음
					// 수정하지 않은 부분은 기존 데이터 유지되도록 정보를 불러옴
					mOne = Controller.findOneByName(name);
					if(index != -1) {
						mOne = this.modifyMember(mOne);	// 데이터가 있을 때 수정할 정보 입력 받음
					}
					Controller.modifyMember(index, mOne);		// 데이터 수정하기
					break;
				case 3 : 
					// ===================== 회원 정보 삭제 =====================
					name = this.inputMemberName();				// 삭제할 데이터의 이름을 입력 받음.
					index = Controller.findIndexByName(name);	// 인덱스값을 찾음
					Controller.subMember(index); 				// 삭제하기
					break;
				case 4 : 
					// ================== 회원 정보 출력(이름) ==================
					name = this.inputMemberName();				// 아이디값으로 찾으면 중복 걸러낼 수 있음
					Member member = Controller.findOneByName(name);
					this.printOneMember(member);
					break;
				case 5 : 
					// =================== 회원 전체 정보 출력 ===================
					this.printAllMembers(Controller.allMemberList());
					break;
				case 6 : break finish;
			}
		}
	}

	public int printMenu() {	// 메인 메뉴 
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원 관리 프로그램 ======");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 회원 정보 수정");
		System.out.println("3. 회원 정보 삭제");
		System.out.println("4. 회원 정보 출력(이름)");
		System.out.println("5. 회원 전체 정보 출력");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택 : ");
		int input = sc.nextInt();
		return input;
	}

	public Member inputMember() {	// 회원 정보 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 회원 정보 등록 ====");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		Member member = new Member(memberId, memberPw, memberName, memberEmail, memberPhone);
		return member;
//		member.setMemberId(memberId);
//		member.setMemberPw(memberPw);
//		member.setMemberName(memberName);
//		member.setMemberEmail(memberEmail);
//		member.setMemberPhone(memberPhone);
	}

	public String inputMemberName() { // 이름 입력받는 메소드
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String memberName = sc.next();
		return memberName;
	}

	public Member modifyMember(Member member) {	// 수정할 정보 입력받는 메소드
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
//		Member member = new Member(memberPw, memberName, memberPhone);
		member.setMemberPw(memberPw);
		member.setMemberName(memberName);
		member.setMemberPhone(memberPhone);
		return member;
	}

	public void printOneMember(Member member) {
		System.out.println("====== 회원 전체 출력(이름) ======");
		System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 번호 : %s\n", member.getMemberId(), member.getMemberName(),
				member.getMemberEmail(), member.getMemberPhone());
	}

	public void printAllMembers(List<Member> mList) { // 회원 정보 출력하는 메소드
		System.out.println("====== 회원 전체 정보 출력 ======");
		for (Member member : mList) {	// mList 에 있는 멤버 객체 하나씩 꺼내서 member 변수에 넣음
			System.out.printf("아이디 : %s, 이름 : %s, 이메일 : %s, 번호 : %s\n", member.getMemberId(), member.getMemberName(),
					member.getMemberEmail(), member.getMemberPhone());
		}
	}

}
