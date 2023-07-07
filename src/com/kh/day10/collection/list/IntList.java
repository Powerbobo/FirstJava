package com.kh.day10.collection.list;

public class IntList {
	// 필드(멤버 변수)
	int [] nums;
	int size;
	
	// 생성자
	public IntList() {
		nums = new int[3];
		size = 0;
	}

	public void add(int num) {
		// 배열의 인덱스를 신경쓰지 않고 저장?
		nums[size] = num;
		size++;
	}

	public int get(int index) {
		return nums[index];
	}

	public int size() {
		return size;
	}

	public void clear() {
		nums = new int[3];
		size = 0;
	}
}
