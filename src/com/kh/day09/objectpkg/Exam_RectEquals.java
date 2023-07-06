package com.kh.day09.objectpkg;

class Rect{
	int width, height;
	public Rect() {}
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean eqauls(Object obj) {
		// 다운캐스팅
		Rect r = (Rect)obj;
		if(width*height == r.width*r.height) {
			return true;
		} else {
			return false;
		}
	}
}

public class Exam_RectEquals {
	public static void main(String[] args) {
		Rect rect1 = new Rect(2, 3);
		Rect rect2 = new Rect(2, 3);
		// 주소가 다르기 때문에 a is not equal to b 가 출력
//		if(rect1 == rect2) {
		// equals 를 그냥 사용하면 1개만 비교 가능하기때문에 a is not equal to b 가 출력
		// eqauls() 메소드를 boolean 을 이용해 새로 만들어서 if문으로 비교함
		if(rect1.eqauls(rect2)) {
			System.out.println("a is equal to b");
		} else {
			System.out.println("a is not equal to b");
		}
		

	}
}
