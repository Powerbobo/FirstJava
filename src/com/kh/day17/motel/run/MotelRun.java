package com.kh.day17.motel.run;

import java.util.Scanner;

import com.kh.day17.motel.controller.MotelController;
import com.kh.day17.motel.view.MotelView;

public class MotelRun {

	public static void main(String[] args) throws Exception {
		MotelView view = new MotelView();
		MotelController controller = new MotelController();
		Scanner sc = new Scanner(System.in);
		boolean [] rooms = new boolean[10];	// boolean or int 데이터 타입으로 배열 만들기
		end :
		while (true) {
			int choice = view.printMenu();
			int chosenRoom = 0;
			switch (choice) {
			case 1:
				// ======================= 입실 =======================
				chosenRoom = view.inputRoomNumber("입실");
				controller.checkIn(chosenRoom);
				Thread.sleep(500);
				break;
			case 2:
				// ======================= 퇴실 =======================
				chosenRoom = view.inputRoomNumber("퇴실");
				controller.checkOut(chosenRoom);
				Thread.sleep(500);
				break;
			case 3:
				// ====================== 방보기 ======================
				controller.printAllRooms();
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
