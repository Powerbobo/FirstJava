package com.kh.day08.oop.homework.q5;

public class Person {
	// 이름
	String name;
	//돈
	int money;
	
	public Person() {}
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 커피구매
	public void buyCoffee(Cafe cafe, int money) {
		// 돈을 가지고 커피가 나오야 함.
		// this.money = this.money - money 을 복합대행 연산자로 변경하면
		this.money -= money;
		cafe.makeCoffee(money);
	}
	public void printInfo() {
		System.out.println(this.name + "님의 잔액은 " + this.money + "원 입니다.");
	}
}
