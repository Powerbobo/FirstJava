package com.kh.day17.exercise;

import java.util.Scanner;

public class Motel {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean [] rooms = new boolean[10];	// boolean or int 데이터 타입으로 배열 만들기
		end :
		while (true) {
			System.out.println("모텔 관리 프로그램 v1.0");
			System.out.println("1.입실 2. 퇴실 3.방보기 4.종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			int chosenRoom = 0;
			switch (choice) {
			case 1:
				// ======================= 입실 =======================
				System.out.print("몇 번방에 입실하시겠습니까? ");
				chosenRoom = sc.nextInt();
				if(chosenRoom > 0 && chosenRoom <= 10) {
					if(!rooms[chosenRoom-1]) {
						rooms[chosenRoom-1] = true;
						System.out.println(chosenRoom + "번 방에 입실하셨습니다.");
					} else {
						System.out.println(chosenRoom + "번 방은 현재 손님이 있습니다.");
					}
					Thread.sleep(250);
				} else {
					System.out.println("1번 방부터 10번방까지 준비되어 있습니다.");
				}
				Thread.sleep(2000);
				break;
			case 2:
				// ======================= 퇴실 =======================
				System.out.print("몇 번방에서 퇴실하시겠습니까? ");
				chosenRoom = sc.nextInt();
				if(chosenRoom > 0 && chosenRoom <= 10) {
					if(rooms[chosenRoom-1]) {
						rooms[chosenRoom-1] = false;
						System.out.print(chosenRoom + "번 방에서 퇴실하셨습니다.");
						
					} else {
						System.out.println(chosenRoom + "번 방은 현재 빈 방입니다.");
					}
					Thread.sleep(250);
				}
				break;
			case 3:
				// ====================== 방보기 ======================
				for (int i = 0; i < rooms.length; i++) {
					if(!rooms[i])	// false 일 경우 
						System.out.println((i + 1) + "번 방이 현재 비어있습니다.");
					 else 
						System.out.println((i+1) + "번 방에는 현재 손님이 있습니다.");
				}
				Thread.sleep(2000); // throws Exception -> 예외처리 알아서 처리하게끔 던지기
				break;
			case 4:
				// ======================= 종료 =======================
				System.out.println("프로그램을 종료합니다.");
				break end;
			}
		}
	}
}
