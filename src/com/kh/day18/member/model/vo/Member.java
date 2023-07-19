package com.kh.day18.member.model.vo;

public class Member {

	// 멤버 변수
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberEmail;
	private String memberPhone;

	// 기본 생성자
	public Member() {
	}

	// 멤버변수 생성자(필요에 의해서 만드는 생성자로,
	// 처음부터 전부 만들필요 없이 필요할때마다 추가하면 됨.
	public Member(String memberId, String memberPw) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
	}

	public Member(String memberPw, String memberName, String memberPhone) {
		super();
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
	}

	public Member(String memberId, String memberPw, String memberName, String memberEmail, String memberPhone) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
	}

	// getter / setter 메소드

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	@Override
	public String toString() {
		return "회원 [아이디 =" + memberId + ", 비밀번호 =" + memberPw + ", 이름 =" + memberName + ", 이메일 =" + memberEmail
				+ ", 전화번호 =" + memberPhone + "]";
	}

}
