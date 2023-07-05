package com.kh.day08.oop.abstractptpkg.exercise;

public class CalcRun {
	public static void main(String[] args) {
		// Calculator calc = new Calculator();
		// 추상클래스는 객체 생성이 불가능.
		// 오류메세지 : Cannot instantiate the type Calculator
		Calculator calc = new GoodCalc(); // 업캐스팅
		int [] a = {1,2,3,4,5};
		System.out.printf("합 : %d\n", calc.add(1, 2));
		System.out.printf("차 : %d\n", calc.substract(20, 10));
		System.out.printf("평균 : %.2f", calc.average(a));
	}
}
