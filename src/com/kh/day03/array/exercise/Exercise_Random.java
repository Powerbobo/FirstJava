package com.kh.day03.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random {
	public void exRand1() {
		
		// 가위바위보 게임
		// - 가위 바위 보 중 하나를 선택, 승패을 결정하는 게임
		
		// ===== 가위 바위 보 게임 =====
		// 숫자를 선택하세요(1.가위 / 2.바위 / 3.보) : 1
		// ========== 결과 ==========
		// 당신은 가위를 냈습니다.
		// 컴퓨터가 보를 냈습니다.
		// ==========================
		// 당신이 이겼습니다 ^^*
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("===== 가위 바위 보 게임 =====");
		System.out.print("숫자를 선택하세요(1.가위 / 2.바위 / 3.보) : ");
		
		// 당신
		int inputNum = sc.nextInt();
		if(inputNum == 1) {
			System.out.println("당신은 가위를 냈습니다.");
		} else if(inputNum == 2) {
			System.out.println("당신은 바위를 냈습니다.");
		} else if(inputNum == 3) {
			System.out.println("당신은 보를 냈습니다.");
		} else {
			System.out.println("1 ~ 3 중에 입력해주세요.");
		}
		
		// 컴퓨터
		int computer = rand.nextInt(3)+1;
		if(computer == 1) {
			System.out.println("컴퓨터가 가위를 냈습니다.");
		} else if(computer == 2) {
			System.out.println("컴퓨터가 바위를 냈습니다.");
		} else{
			System.out.println("컴퓨터가 보를 냈습니다.");
		}
		System.out.println("==========================");
		
		// 결과
		if(inputNum > 0 && inputNum < 4) {
			if(inputNum == 1) {
				if(computer == 1) {
					System.out.println("비겼습니다.");
				} else if(computer == 2) {
					System.out.println("당신이 졌습니다.");
				} else {
					System.out.println("당신이 이겼습니다.");
				}
			} else if (inputNum == 2) {
				if(computer == 1) {
					System.out.println("당신이 이겼습니다.");
				} else if(computer == 2) {
					System.out.println("비겼습니다.");
				} else {
					System.out.println("당신이 졌습니다.");
				}
			} else if(inputNum == 3) {
				if(computer == 1) {
					System.out.println("당신이 졌습니다.");
				} else if(computer == 2) {
					System.out.println("당신이 이겼습니다.");
				} else {
					System.out.println("비겼습니다.");
				}
			}
		} else {
			System.out.println("1 ~ 3 사이의 숫자를 입력해주세요");
		}

	}
}
