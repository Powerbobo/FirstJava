package com.kh.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args)
	{
		// 2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 되도록 작성하시오.
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + j*i + "\t");
			}
			System.out.println();
		}
	}
}
