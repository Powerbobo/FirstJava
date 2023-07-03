package com.kh.day06.oop.objectarray;

public class Circle {
	// 접근지정자(public, private 등을 쓰지 않으면 default 값 = public)
	int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area = 3.14*radius*radius;
		// 반환. return 코드를 작성하지 않으면, void를 작성해야 함.
		return area;
	}
}

