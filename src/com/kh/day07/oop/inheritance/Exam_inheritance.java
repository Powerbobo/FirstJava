package com.kh.day07.oop.inheritance;

import com.kh.day07.oop.point.ColorPoint;
import com.kh.day07.oop.point.Point;

public class Exam_inheritance {
	public static void main(String [] args) {
		// (x,y)의 한 점을 표현하는 Point 클래스와 이를 상속받아 색을 가진 점을 표현하는
		// ColorPoint 클래스를 만들고 활용해보자!
		Point p = new Point(1, 2);
//		p.set(1,2);
		p.showPoint(); // 실행 메소드
		ColorPoint cp = new ColorPoint(3, 4, "red ");
		// ColorPoint 클래스에 아무것도 작성하지 않았지만, 부모클래스에게 상속받았기 때문에
		// 사용할 수 있는 메소드가 있다.
//		cp.set(3, 4);
//		cp.setColor("red ");
		cp.showColorPoint();
		ColorPoint cp2 = new ColorPoint(5,6, "blue ");
		cp2.showColorPoint();
	}
}

