package com.kh.day07.oop.polymorphism.overriding;

public class Shape {
	// 필드
	private String name;
	// 기본 생성자
	public Shape() {
		name = null;
	}
	public void draw() {
		System.out.println("Shape");
	}
}
