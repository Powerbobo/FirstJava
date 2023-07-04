package com.kh.day07.oop.member;

public class Member {
	// 멤버 변수 - 멤버 변수 접근제어자 private으로 설정! (정보 접근이 제한됨)
	// 멤버 변수 -> 이름, 1차 점수, 2차 점수
	private String memberId;
	private String memberPw;
	private String memberEmail;
	private String memberAddress;
	
	// 생성자, 클래스의 이름과 생성자의 이름이 동일하다 = 오버로딩 
	// 이름은 동일하나, 객체의 개수, 데이터타입이 다르다!(동일해선 안됨)
	public Member() {}
	
	public Member(String memberId, String memberPw, String memberEmail, String memberAddress) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
	}
	
	// getter 메소드
	public String getMemberId() {
		return this.memberId;
	}
	public String getMemberPw() {
		return this.memberPw;
	}
	public String getMemberEmail() {
		return this.memberEmail;
	}
	public String getMemberAddress() {
		return this.memberAddress;
	}
	// setter 메소드
	// 매개변수의 역할 : 값을 받아서 사용할 수 있도록 하는 것!
	// ex. String memberId 값을 memberId 변수에 받아서 this.member(필드 값)에 넣어 사용한다.
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
}