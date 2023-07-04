package com.kh.day07.oop.polymorphism.overriding;

public class Exam_Overriding {
	// 오버라이딩을 사용해서 각각의 메소드를 다르게 출력하게 한 다음에, 부모타입의 메소드를 선언하면
	// 생성된 객체 기준으로 이미 오버라이딩이 되어있어서, 오버라이딩 된 메소드를 기준으로 출력됨(동적 바인딩)
	// 1. 오버라이딩은 상속관계에서 사용 가능
	// 2. 오버라이딩은 다 똑같고 실행문만 다르게 작성
	// 3. 오버라이딩이 되면 동적바인딩이 되어 다형성을 이용할 수 있음.
	static void paint(Shape shape) {
		shape.draw(); // 업캐스팅에 의해 슈퍼 클래스 래퍼런스로 오버라이딩 된 메소드 호출
					  // 동적바인딩이라고 함(오버로딩 + 오버라이딩)
	}
	// paint 메소드는 오버로딩 되어있다! Line, Circle, Rect 의 공통점은 전부 Shape를 상속
	// 받았다.
	static void paint(Line line) {
		line.draw();
	}
	static void paint(Circle circle) {
		circle.draw();
	}
	static void paint(Rect rect) {
		rect.draw();
	}
	public static void main(String[] args) {
		//매개변수에 Line 메소드 입력해서 Line 출력
		paint(new Line());
		paint(new Circle());
		paint(new Rect());
		
		// 기존 슈퍼 클래스인 Shape 의 draw 값이 Shape 였으나,
		// Line 클래스에서 draw를 overriding(재정의) 해서 Line 으로 변경함.
//		Line line = new Line();
//		line.draw();
//		Circle circle = new Circle();
//		circle.draw();
//		Rect rect = new Rect();
//		rect.draw();
	}
	
class SuperClass {
	// 실행 3번
	void paint() {
		// 실행 4번 (오버라이딩 되어있음)(동적바인딩이 적용되어 subClass가 실행됨)
		draw();
	}
	// 실행 7번
	void draw() {
		// 실행 8번
		System.out.println("Super Object");
	}
}

class SubClass extends SuperClass {
	// 실행 1번
	void paint() {
		// 실행 2번
		super.paint();
		// 실행 6번
		super.draw();
	}
	void draw() {
		// 실행 5번
		System.out.println("Sub Object");
	}
//public class Exercise_Overriding {
//	public static void main(String [] args) {
//		SuperClass ex = new SuperClass();
//		ex.paint();
//	}
//}
}
















}
