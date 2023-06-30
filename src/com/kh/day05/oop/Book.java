package com.kh.day05.oop;

public class Book {
	// 제목과 주제를 나타내는 필드를 가진 Book클래스를 작성하고
	// 생성자를 작성하여 필드릴 촐기화 하여라!
	// 클래스 바로 밑에 선언하는 변수 = 필드 = 멤버변수
	
	// =============================> 필드(멤버변수)
	public String title;
	public String author;	
	// =============================> 생성자
	public Book() {
		// 초기화
		title = "";
		author = "";
	}
	
	// 매개변수 생성자 1
	public Book(String title) {
		this.title =  title;
	}
	// 매개변수 생성자 2
	public Book(String title, String author) {
		this.title =  title;
		this.author = author;
	}
	// =============================> 메소드
	
	
}
