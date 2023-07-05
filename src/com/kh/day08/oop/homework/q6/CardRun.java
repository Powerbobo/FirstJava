package com.kh.day08.oop.homework.q6;

public class CardRun {
	public static void main(String[] args) {
		// new Card -> stack 영역에 생성(새로 만들때마다 계속 새로 생성됨)
		Card myCard = new Card();
		myCard.printCardInfo();
		Card myCard2 = new Card();
		myCard2.printCardInfo();
		Card myCard3 = new Card();
		myCard3.printCardInfo();
	}
}
