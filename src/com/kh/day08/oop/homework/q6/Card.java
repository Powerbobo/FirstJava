package com.kh.day08.oop.homework.q6;

public class Card {
	// 소유자 이름
	// 카드번호
	// 유효기간
	// cvc
	// 비밀번호 등이 있는데, 카드번호와 시리얼 번호만 사용!
	int cardNumber;
	// static 으로 전역변수로 만들어 줌.
	// 전역변수가 아니라면, 카드번호가 증가시키고나서 저장이 되지 않기때문에
	// 계속 초기화 되어서 카드번호를 계속 부여해도 10001로 고정되어 출력 됨.
	static int serialNum = 10000;
	
	public Card() {
		// serialNum 을 10000부터 증가하게 만들고, cardNumber에 대입해
		// cardNumber 가 증가하게끔 만듦.
		cardNumber = serialNum;
		serialNum++;
	}
	
	public void printCardInfo() {
		System.out.println(this.cardNumber + "입니다.");
	}
}
