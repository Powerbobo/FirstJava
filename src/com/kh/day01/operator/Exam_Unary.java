package com.kh.day01.operator;

public class Exam_Unary {
	public static void main(String [] args)
	{
		// 단항 연산자
		int a1 = 1;
		// a++, ++a -> a = a + 1;
		// ++ 를 앞에 쓰냐, 뒤에 쓰냐에 따라서 결과값이 달라진다.
		System.out.println(a1++); // 후위 연산
		// a가 2인 상태임.
		System.out.println(++a1); // 전위 연산
		// a가 2인 상태에서 전위 연사이기때문에 먼저 더해져 결과값이 3이 됨.
		System.out.println(a1);
		
		// 문제 1
		int a = 10;
		int b = 20;
		int c = 30;
		
		a++;
		// a : 11, b : 20, c: 30;
		b = (--a) + b;
		// a : 10, b : 30, c : 30;
		c = (a++) + (--b);
		// a : 11, c : 39, b : 29;
		
		System.out.print("a : " + a + ", b : " + b + ", c : " + c);
		
		int x = 100;
		int y = 33;
		int z = 0;
		
		x--;
		// x : 99, y : 33, z : 0;
		z = x-- + --y ; // 99 + 32+ 131
		// x : 98, y : 32, z : 131;
		x = 99 + x++ + x; // 99 + 98+ 99
		// x : 296, y : 32;, z : 131
		y = y-- + y + ++y; // 32+31+32
		// x : 296, y : 95, z : 131
		System.out.println("x : " + x + ", y :" + y  + ", z  : " + z);
	}
}
