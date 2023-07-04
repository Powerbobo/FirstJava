package com.kh.day06.oop.member;

public class Member {
	// 멤버 변수 - 멤버 변수 접근제어자 private으로 설정! (정보 접근이 제한됨)
	// 멤버 변수 -> 이름, 1차 점수, 2차 점수
	private String name;
	private int firstScore;
	private int secondScore;
	
	// 기본 생성자 -> 클래스명과 동일하게 만들어야 한다!
	public Member() {}
	
	// 매개변수 생성자
	public Member(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	// 메소드
	public double getAvg() {
		double avg = (double)(this.firstScore + this.secondScore)/2;
		return avg;
	}
	
	// getter 메소드
	public String getName() {
		return this.name;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	public int getSecondScore() {
		return this.secondScore;
	}
	
	//setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
}