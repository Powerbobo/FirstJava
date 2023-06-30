package com.kh.day05.oop;

public class Exam_ThisConstructor {
	
	public static void main(String[] args) {
		// 생성자 호출
		Book2 book = new Book2();
		Book2 loveStory = new Book2("춘향뎐");
		System.out.println(loveStory.title + ", " + loveStory.author);
//		Circle2 circle = new Circle2();
//		circle.radius = 10;
//		System.out.println("원의 넓이는 " + circle.getArea());
	}
}

// 클래스 안에 클래스 생성 가능!
// The type Circle is already defined -> 같은 패키지에 동일한 클래스명이 있을 때 오류메세지
class Book2 {
	// ===================> 멤버변수
	public String title;
	public String author;
	// ===================> 생성자
	public Book2() {
		System.out.println("Book2 생성자 호출됨");
	}
	// 매개변수 생성자
	// 매개변수 생성자 1개 만들기
	public Book2(String title) {
//		this.title = title;
		this(title, "작자미상");
	}
	// 매개변수 생성자 여러개 만들기
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	// ===================> 메소드
		// 없음.
	}
}


class Circle2 {
	// ===================> 멤버변수
	public int radius;
	public String name;
	// ===================> 생성자
	public Circle2() {
		
	}
	// ===================> 메소드
	public double getArea() {
		return 3.14*radius* radius;
	}
}