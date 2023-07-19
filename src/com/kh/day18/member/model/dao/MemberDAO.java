package com.kh.day18.member.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.kh.day18.member.model.vo.Member;

public class MemberDAO {
	
	// 멤버변수
	private List<Member> mList;

	// 매개변수
	public MemberDAO() {
		mList = new ArrayList<Member>();
	}
	
	/**
	 * 이름으로 인덱스 찾기
	 * 
	 * @param name String 으로 입력받은 값
	 * @return int값 없으면 -1
	 */
	public int findIndexByName(String name) {
		for (int i = 0; i < mList.size(); i++) {
			if (mList.get(i).getMemberName().equals(name)) {
				return i;
			}
		}
		return -1; // 못찾았을 때의 리턴 값 (-1 : 아무것도 없다)
	}

	/**
	 * 이름으로 회원 정보 찾기
	 * 
	 * @param name String으로 입력받은 값
	 * @return Member 객체 리턴, 없으면 null 리턴
	 */
	public Member findOneByName(String name) {
		for (int i = 0; i < mList.size(); i++) {
			if (mList.get(i).getMemberName().equals(name)) {
				return mList.get(i);
			}
		}
		return null;
	}

	/**
	 * 회원 전체 정보 조회
	 * 
	 * @return
	 */
	public List<Member> allMemberList() { // Member 클래스의 멤버변수 전체를 리턴하는 메소드
		return mList;
	}

	/**
	 * 회원 정보 등록
	 * 
	 * @param member
	 */
	public void addMember(Member member) {
		mList.add(member);
	}

	/**
	 * 데이터 수정하기
	 * 
	 * @param index
	 * @param mOne
	 */
	public void modifyMember(int index, Member mOne) {
		mList.set(index, mOne);
	}

	/**
	 * 회원 정보 삭제
	 * 
	 * @param index
	 */
	public void subMember(int index) {
		mList.remove(index);
	}
}