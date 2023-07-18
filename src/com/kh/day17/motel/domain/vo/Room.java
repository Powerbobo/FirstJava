package com.kh.day17.motel.domain.vo;

public class Room {
	private boolean isAvailable;	// 방이 비어있는지 확인
	
	public Room() {
		// TODO Auto-generated constructor stub
	}

	public Room(boolean isAvailable) {
		super();
		this.isAvailable = isAvailable;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Room [isAvailable=" + isAvailable + "]";
	}
}
