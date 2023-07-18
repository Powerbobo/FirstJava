package com.kh.day17.motel.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day17.motel.domain.vo.Room;

public class MotelController {
	
//	List<Room> rList;		// 멤버 변수가 많을 때 사용하는게 좋다
	List<Boolean> rList;	// 단순 비교가 필요할 때 boolean 사용하는게 편하다.
	
	public MotelController() {
//		rList = new ArrayList<Room>();
		rList = new ArrayList<Boolean>();
		for(int i = 0; i < 10; i++) {
//			rList.add(new Room());
			rList.add(false);
		}	// 방 객체 생성
	}
	
	public void printAllRooms() {
		for (int i = 0; i < rList.size(); i++) {
			if(!rList.get(i))	// false 일 경우 
				System.out.println((i + 1) + "번 방이 현재 비어있습니다.");
			 else 
				System.out.println((i+1) + "번 방에는 현재 손님이 있습니다.");
		}
	}
	
	public void checkIn(int roomNo) {
		if(roomNo > 0 && roomNo <= 10) {
//			Room room = rList.get(roomNo-1);
			Boolean room = rList.get(roomNo-1);
//			if(!room.isAvailable()) {
			if(!room) {
//				room.setAvailable(true);
				rList.set(roomNo-1, true);
				System.out.println(roomNo + "번 방에 입실하셨습니다.");
			} else {
				System.out.println(roomNo + "번 방은 현재 손님이 있습니다.");
			}
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("1번 방부터 10번방까지 준비되어 있습니다.");
		}
	}
	
	public void checkOut(int chosenRoom) {
		if(chosenRoom > 0 && chosenRoom <= 10) {
			Boolean room = rList.get(chosenRoom-1);
			if(room) {
				rList.set(chosenRoom-1, false);
				System.out.print(chosenRoom + "번 방에서 퇴실하셨습니다.");
				
			} else {
				System.out.println(chosenRoom + "번 방은 현재 빈 방입니다.");
			}
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
