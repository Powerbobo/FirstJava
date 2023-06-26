package com.kh.day01;

public class Hello {
	
	// int 메소드 생성
	public static int sum(int num1, int num2) {
		// return 작성 안했을 경우
		// This method must return a result of type int
		return num1+num2;
	}
	
	public static void main(String [] args)
	{
		int i = 20;
		int s;
		char a;
		
		a = '?';
		// 변수 저장 
		s = sum(i, 10);
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
}
