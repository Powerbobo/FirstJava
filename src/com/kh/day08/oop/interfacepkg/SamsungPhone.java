package com.kh.day08.oop.interfacepkg;

// 1. The type SamsungPhone must implement the inherited abstract method PhoneInterface.
// receiveCall() -> interface 상송받을때는 extends가 아닌 implements 사용!
public class SamsungPhone implements PhoneInterface {
	// 2. The type SamsungPhone must implement the inherited abstract method PhoneInterface.
	// receiveCall() -> 인터페이스에 있는 메소드 전부 오버라이딩(구현)해야 함!

	@Override
	public void receiveCall() {
		System.out.println("여보세요");
	}

	@Override
	public void sendCall() {
		System.out.println("뚜루루루루루루");
	}
	
	@Override
	public void printLogo() {
		System.out.println("===== SAMSUNG =====");
	}

}
