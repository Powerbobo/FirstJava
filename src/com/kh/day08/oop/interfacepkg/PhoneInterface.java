package com.kh.day08.oop.interfacepkg;

public interface PhoneInterface {
	// 1. Illegal modifier for the interface field PhoneInterface.NAME; 
	// only public, static & final are permitted -> private 사용불가 => public 사용!
	// 2. The blank final field NAME may not have been initialized -> 초기화해야 사용 가능함.
	// static final -> 생략 가능
	public static final String NAME = "";
	public static final int TIME_OUT = 10000;
	
	public abstract void receiveCall();
	// 3. Abstract methods do not specify a body -> 몸체 사용불가 => {} 삭제하고, ; 작성
	void sendCall();
	abstract void printLogo();
	public default void showLogo() {
		// 디폴트 메소드
		// 하위 호환성을 위해서 작성함
		// 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
	}
	
}
