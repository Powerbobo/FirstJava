package com.kh.day08.oop.homework.q5;

//public class Cafe {
//	
//	// 상호명
//	String name;
//	
//	public Cafe() {}
//	
//	public Cafe(String name) {
//		this.name = name;
//	}
//	
//	// 커피를 만들어줌
//	public void makeCoffee(int money) {
//		if(money == 4000) {
//			System.out.println("주문하신 아이스 아메리카노 한잔 나왔습니다.");
//		} else if(money == 4500) {
//			System.out.println("주문하신 아이스 라떼 한잔 나왔습니다.");
//		}
//	}
//}

// 추상 클래스
public abstract class Cafe {
	
	// 상호명
	String name;
	
	public Cafe() {}
	
	public Cafe(String name) {
		this.name = name;
	}
	
	// 커피를 만들어줌
	abstract public void makeCoffee(int money);
}