package com.kh.day10.collection.list;

public class ObjectList {
	
//	int [] nums;
	Object [] objects;
	int size;
	
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}

	// 다양한 값을 넣기 위해서 Object 객체 사용
	public void add(Object input) {
		objects[size] = input;
		size++;
	}

	public Object get(int index) {
		return objects[index];
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}
