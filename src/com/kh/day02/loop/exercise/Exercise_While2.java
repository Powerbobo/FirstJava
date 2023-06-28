package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String [] args)
	{
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		
		int i = 1;
		int sum = 0;
		
		// if문 사용
		while(i < 100) {
			if(i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);
		
		while (i < 100) {
			sum += i;
			i+= 2; // i를 2씩 증가하게끔 하는 방법
		}
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);
	}
}
