package com.kh.day18.member.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.day18.member.model.vo.Member;
import com.kh.day18.member.view.MemberView;

public class MemberController_prev {
	
	// 멤버변수
	private List<Member> mList;
	private MemberView view;
	
	// 생성자
	public MemberController_prev() {
		view = new MemberView();	// controller 와 view 가 관계를 맺게 됨.
		mList = new ArrayList<Member>();
	}
	
	public void startMemberProgram() {
		Member mOne = null;
		String name = "";
		int index = 0;
		finish :
		while(true) {
			// ===================== 메인 메뉴 =====================
			int choice = view.printMenu();
			switch(choice) {
				case 1 : 
					mOne = view.inputMember();
					addMember(mOne);
					break;
				case 2 : 
					name = view.inputMemberName();	// 수정할 데이터의 이름을 입력 받음.
					index = findIndexByName(name);	// 인덱스값을 찾음
					// 수정하지 않은 부분은 기존 데이터 유지되도록 정보를 불러옴
					mOne = findOneByName(name);
					if(index != -1) {
						mOne = view.modifyMember(mOne);	// 데이터가 있을 때 수정할 정보 입력 받음
					}
					modifyMember(index, mOne);			// 데이터 수정하기
					break;
				case 3 : 
					name = view.inputMemberName();	// 삭제할 데이터의 이름을 입력 받음.
					index = findIndexByName(name);	// 
					subMember(index); 				// 삭제하기
					break;
				case 4 : 
					name = view.inputMemberName();	// 아이디값으로 찾으면 중복 걸러낼 수 있음
					Member member = findOneByName(name);
					view.printOneMember(member);
					break;
				case 5 : 
					view.printAllMembers(allMemberList());
					break;
				case 6 : break finish;
			}
		}
	}
	/**
	 * 이름으로 인덱스 찾기
	 * @param name
	 * @return
	 */
	public int findIndexByName(String name) {
		for(int i = 0; i < mList.size(); i++) {
			if(mList.get(i).getMemberName().equals(name)) {
				return i;
			}
		}
		return -1;	// 못찾았을 때의 리턴 값 (-1 : 아무것도 없다)
	}
	/**
	 * 이름으로 회원 정보 찾기
	 * @param name
	 * @return
	 */
	public Member findOneByName(String name) {
		for(int i = 0; i < mList.size(); i++) {
			if(mList.get(i).getMemberName().equals(name)) {
				return mList.get(i);
			}
		}
		return null;	// 못찾았을 때의 리턴 값
	}
	/**
	 * 회원 전체 정보 조회
	 * @return
	 */
	public List<Member> allMemberList() {	// Member 클래스의 멤버변수 전체를 리턴하는 메소드
		return mList;
	}
	/**
	 * 회원 정보 등록
	 * @param member
	 */
	public void addMember(Member member) {
		mList.add(member);
	}
	/**
	 * 데이터 수정하기
	 * @param index 
	 * @param mOne
	 */
	private void modifyMember(int index, Member mOne) {
		mList.set(index, mOne);
	}

	/**
	 * 회원 정보 삭제
	 * @param index
	 */
	public void subMember (int index) {
		mList.remove(index);
	}
	
}
