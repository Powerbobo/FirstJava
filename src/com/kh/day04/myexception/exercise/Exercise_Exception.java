package com.kh.day04.myexception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void exercise1() {
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고
		// 다시 입력받는 프로그램을 작성하여라
		
		// 정수를 나눌 때 에러가 나기 때문에 나머지 코드는 try문 밖에 작성해도
		// 상관없다.
		Scanner sc = new Scanner(System.in);
		// 무한 반복처리
		// if(;;) 도 사용 가능함
		while(true) {
			// 변수 선언을 안해서 나는 오류메세지
			// 1. num1 cannot be resolved to a variable
			// 초기화를 하지 않아서 나는 오류메세지
			// 2. The local variable num1 may not have been initialized
			// int num1, num2;
			// num1 = 0;
			// num2 = 0;
			try {
				System.out.print("정수 하나 입력 : ");
				int num1 = sc.nextInt();
				System.out.print("정수 하나 더 입력 : ");
				int num2 = sc.nextInt();
				int result = num1 / num2;
				System.out.printf("%d를 %d로 나누면 몫은 %d입니다.\n",num1,num2,result);
			} catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다!");
			} catch(InputMismatchException e) {
				System.out.println("문를 입력하셨어요? 정수를 입력해주세요.");
				// 무한 반복하지 않도록 작성함.
				sc.next();
			}
		}
	}
	
	public void exercise2() {
		// 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라.
		// 사용자가 정수가 아닌 문자를 입력할 때 발생하는 InputMismatchException 예외를
		// 처리하여 다시 입력받도록 하여라.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 하나 더 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("정수 하나 더 입력 : ");
		int num3 = sc.nextInt();
		int result = num1 + num2 + num3;
		
		System.out.printf("3개의 정수의 합은 %d",result);
	}
	
	
	
	
}








