package com.kh.day06.oop.exercise;

public class Student {
	// 객체 초기화를 여기서 할 수 도 있지만, 원칙적으로는 생성자에서 초기화하고,
	// 여기선 변수 선언만 해준다.
	String name = "";
	int kor, eng, math;
	
	public Student() {
		name = "";
		kor = 0;
		eng = 0;
		math = 0;
	}
	
	// 매개변수 생성자는 정해져있지 않고, 내가 원하는대로 만들어서 사용할 수 있음!
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student(String name, int kor, int enh, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 리턴 값이 숫자기이 때문에 void가 아닌 int 사용!
	// 합계 메소드
	public int getTotal() {
		int total = this.kor + this.eng + this.math;
		return total;
	}
	
	// 평균 메소드
	public double getAvg() {
		double avg = (double)this.getTotal() / 3;
		return avg;
	}
}
