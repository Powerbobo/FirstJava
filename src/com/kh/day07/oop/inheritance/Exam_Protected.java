package com.kh.day07.oop.inheritance;

import com.kh.day07.oop.point.Point;

// 클래스 파일 내에 클래스 만들기
// 부모 클래스
class Parent {
	// ====================> 필드(멤버 변수)
	public int pub;
	int def;
	protected int pro;
	private int pri;
	// =====================> 생성자
	public Parent() {}
}

//자식 클래스
class Child extends Parent {
	// ====================> 필드(멤버 변수)
	private int childMoney;
	// =====================> 생성자
	// 기본 생성자
	public Child() {}
	// 멤버변수 생성자
	void set() {
		super.pub = 1;
		super.def = 2;
		super.pro = 3;
		// 오류 메세지The field Parent.pri is not visible
		// private 으로 만들었기 때문에 부모클래스에 있는 변수 사용 불가!
		// super.pri = 4; 
	}
	
}
// 다른 패키지에 있는 클래스 파일 상속
// com.kh.day07.oop.point 패키지에 있는 point 클래스를 상속받음!
// Point에 Ctrl + space 또는 Ctrl + Shift + o 로 import 해줘야 사용 가능
class ShapePoint extends Point {
	private String shape;
	public ShapePoint() {}
	void set() {
		super.pub = 1;
		 // default 접근지정자는 다른 패키지의 변수 사용 불가능함
		 // super.def = 2; // The field Point.def is not visible
		super.pro = 3; // protected 는 다른 패키지에 있어도 상속관계라면 접근이 가능하다.
		// private 접근지정자를 사용했기 때문에 사용 불가능
		// super.pri = 4; // The field Point.def is not visible
	}
}

public class Exam_Protected {
	public static void main(String [] args) {
		
	}
}
