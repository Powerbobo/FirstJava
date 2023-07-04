package com.kh.day07.oop.point;


public class ColorPoint extends Point {
	// 필드(멤버변수)
	private String color;
	
	// 기본 생성자
	public ColorPoint() {
		super(); // 기본적으로 생략되어있음, 부모 클래스를 먼저 호출해서 실행시키는 메소드
	}
	
	// 매개변수 생성자
	public ColorPoint(int x, int y, String color) {
		// private 이기 때문에 접근 불가능
//		super.x = x; // 부모클래스에서 상속받은 값이기 때문에 super를 사용
//		super.y = y; // 그러나 private 이기때문에 사용 불가능함
		
		// x와 y의 값을 초기화해야하는데, private 이기때문에 Point 클래스 파일에서
		// 매개변수 생성자가 초기화 해놨으니 해당 매개변수를 받아서 초기화 함!
		
		// Point 클래스의 매개변수 생성자
		// public Point (int x, int y) {
		// this.x = x;
		// this.y = y;
		//	}
		
		super(x,y);
		this.color = color;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		// super. -> 부모가 가지고 있는 클래스 허용된 선에서 사용 가능함(생략 가능)
		super.showPoint(); // 부모클래스가 가지고 있는 메소드
	}
}
