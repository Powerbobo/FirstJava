package com.kh.day08.oop.abstractptpkg;

class Line extends Shape {
	// 4. The type Line must implement the inherited abstract method Shape.draw() -> 추상메소드를 오버라이딩 해야함!, 하지 않을거면 class 앞에 abstract 붙여야함.
	@Override
	public void draw() {
		
	}
}

public abstract class Shape {
	
	public Shape() {}
	
	public void paint() {}
	abstract public void draw();
	// 오류메세지 정리
	// 1. Abstract methods do not specify a body -> 추상클래스는 바디(몸체)가 존재해선 안된다. => {} 없애고 ; 작성.
	// 2. The abstract method draw in type Shape can only be defined by an abstract class -> 추상메소드가 있으면 클래스도 추상클래스여야 함!
	// 3. The type Shape must be an abstract class to define abstract methods -> 추상메소드를 정의하려면 추상클래스여야 함! => class 앞에 abstract를 붙여야 함!
}
