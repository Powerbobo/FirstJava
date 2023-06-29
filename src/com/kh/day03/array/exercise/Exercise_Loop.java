package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_Loop {
	public void exercise1() {
	    //1번
	    //사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	    //단, 입력한 수는 1보다 크거나 같아야 합니다.
	    //만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			if(input >= 1) {
					System.out.print(i + " ");
			}else {
				System.out.print("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
		
	public void exercise2() {
		//2번
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		
		for(int i = input; i > 0; i--) {
			if(input > 0) {
				System.out.print(i + " ");
			}else {
				System.out.print("1 이상의 숫자를 입력해주세요.");
			}
		}
		
	}

	public void exercise3() {
		
		//3번
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.    
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= input; i++) {
			if(input > 0) {
				sum += i;
			}else {
				System.out.print("1 이상의 숫자를 입력해주세요.");
			}
		}
		System.out.print(sum);
	}
		
	public void exercise4() {
		//4번  
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input1 = sc.nextInt();
		System.out.print("정수 하나 더 입력 : ");
		int input2 = sc.nextInt();
		
		if(input1 <= 0 || input2 <= 0) {
			System.out.print("1 이상의 숫자를 입력해주세요");
		} else if(input1 > input2) {
			for(int i = input2; i < input1-1; i++) {		
				System.out.print(i+1 + " ");
			}
		} else {
			for(int j = input1; j < input2-1; j++) {
				System.out.print(j+1 + " ");
			}
		}
		
	}
	
	public void exercise5() {
   
		//5번
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		int input = sc.nextInt();
		
		System.out.println(input + "단");
		for(int i = 1; i < 10; i++) {
			System.out.println(input + " * " + i + " = " + input*i);
		}
	}
		
	public void exercise6() {
		
		Scanner sc = new Scanner(System.in);
		//6번  
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		
		System.out.print("단을 입력해주세요. : ");
		int input = sc.nextInt();
		
		if(input <= 9) {
			for(int i = input; i < 10; i++) {
				System.out.println(i+"단");
				for(int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
			}
		}else {
			System.out.print("9 이하의 숫자만 입력해주세요");
		}	
	}
}
