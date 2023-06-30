package com.kh.day05.run;

import java.util.Scanner;

import com.kh.day05.oop.Book;
import com.kh.day05.oop.Circle;
import com.kh.day05.oop.exercise.Rectangle;

public class Run {
	public static void main(String [] args) 
	{
		// 객체 초기화
//		Book littlePrint = new Book();
//		littlePrince.title = "어린왕자";
//		littlePrince.author = "생택쥐페리";
		
		// 매개변수에 있는 생성자 사용
		Book littlePrince = new Book("어린왕자", "생택쥐페리");
		Book loveStory = new Book("춘향뎐");
		// Book 클래스파일에서 클래스를 public이 아닌 default로 선언했을때 다른 패키지의
		// 클래스에서 사용 불가능!
		// The field Book.title is not visible
		// The field Book.author is not visible
		System.out.println(littlePrince.title + ", " + littlePrince.author);
		System.out.println(loveStory.title + ", " + loveStory.author);
		
//		Rectangle rect = new Rectangle();
//		Scanner sc = new Scanner(System.in);
//		System.out.print("넓이를 입력해주세요");
//		rect.width = sc.nextInt();
//		System.out.print("높으를 입력해주세요");
//		rect.height = sc.nextInt();
//		
//		int result = rect.getArea();
//		System.out.println("해당 사각형의 넓이는 " + result + "입니다.");
		
		
		Circle pizza;
//		pizza = new Circle();
//		pizza.radius = 10;
//		pizza.name = "청년피자";
		
		pizza = new Circle(10, "청년피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		// 선언과 초기화 동시에
//		Circle donut = new Circle();
//		donut.radius = 2;
//		donut.name = "청년도넛";
		Circle donut = new Circle(2, "청년도넛");
		area = donut.getArea();
		System.out.printf("%s의 면적은 %.2f", donut.name, area);
		
		
//		// 전부 다른 객체!
//		Circle circle = new Circle();
//		Circle circle2 = new Circle();
//		Circle circle3 = new Circle();
//		Circle circle4 = new Circle();
//		
//		circle.radius = 1;
//		circle2.radius = 2;
//		circle3.radius = 3;
//		
//		// 전부 다른 객체이기때문에 값이 다르다.
//		System.out.println(circle.getArea());
//		System.out.println(circle2.getArea());
//		System.out.println(circle3.getArea());
	}
}
