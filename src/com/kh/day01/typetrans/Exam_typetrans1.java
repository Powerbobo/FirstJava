package com.kh.day01.typetrans;

public class Exam_typetrans1 {
	public static void main(String [] args)
	{
		// int * int = int, double + double = double
		// int * double -> 자동 형변환
		int iNum = 10;
		double dNum = 3.14;
		// iNum의 10 -> 10.0 으로 자동 형 변환이 진행됨.
		double result = dNum * iNum; 
		System.out.println("result : " + result);
		System.out.println("강제 형 변환 : " + (int)result);
		// 아스키 코드
		System.out.println("강제 형 변환2 : " + (char)65);
	}
}
