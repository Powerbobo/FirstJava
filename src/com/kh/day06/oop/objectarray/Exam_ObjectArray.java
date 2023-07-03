package com.kh.day06.oop.objectarray;

public class Exam_ObjectArray {
	public static void main(String [] args) {
//		Circle c = new Circle();
//		c.radius = 0;
//		double result = c.getArea();
//		System.out.println(result);
		
		Circle [] cArray;
		cArray = new Circle[5];
		// cArray[0]; 아직 공간만 만들어놓은 상태이고, 아직은 객체가 아님! 
//		Circle c = cArray[0];
		System.out.println(cArray[0]);
//		cArray[0].radius = 10;
		
		// 객체로 만듦!
		cArray[0] = new Circle();
		System.out.println(cArray[0]);
		cArray[0].radius = 10;
		
		// for문을 통해서 객체로 만들었기 때문에, 아래 객체들이 생성되어 실행 됨.
		// 위쪽에 cArray[0]만 객체로 만들었기 때문에, for문이 없다면 cArray[1] 부터
		// 오류 메세지가 뜸, 오류 메세지 : java.lang.NullPointerException
		for(int i = 0; i < cArray.length; i++) {
			cArray[i] = new Circle();	// 이때 화살표가 생기는 것임.
		}
		cArray[0].radius = 1;
		cArray[1].radius = 2;
		cArray[2].radius = 3;
		cArray[3].radius = 4;
		cArray[4].radius = 5;
		
		System.out.println(cArray[0].getArea());
		System.out.println(cArray[1].getArea());
		System.out.println(cArray[2].getArea());
		System.out.println(cArray[3].getArea());
		System.out.println(cArray[4].getArea());
		
		
		
		
		
		
	}
}
