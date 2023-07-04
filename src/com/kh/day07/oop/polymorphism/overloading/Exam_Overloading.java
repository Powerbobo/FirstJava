package com.kh.day07.oop.polymorphism.overloading;

class Weapon {
	// 이름이 같지만, 매개변수의 갯수와 타입이 다르기때문에 오버로딩이 된다.
	public Weapon() {}
	public Weapon(int value) {
		System.out.println(value);
	}
	public Weapon(int value, String name) {
		System.out.println(value + " : " + name);
	}
}

public class Exam_Overloading {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('A');
		System.out.println("Hello Java");
		System.out.println(true);
	}
}