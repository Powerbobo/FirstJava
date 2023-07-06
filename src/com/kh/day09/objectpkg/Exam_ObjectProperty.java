package com.kh.day09.objectpkg;


public class Exam_ObjectProperty {
	
	public static void print(Object obj) {
		System.out.println("클래스 이름 : " + obj.getClass().getName());
		System.out.println("해시 코드 값 : " + obj.hashCode());
		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
		System.out.println("객체 출력 : " + obj);
	}
	
	public static void main(String[] args) {
//		Point p = new Point(2,3);
//		Point p2 = new Point(4,5);
//		print(p);
//		print(p2);
		
		// Object 클래스의 equals() 메소드 : 내용비교
		String javaStr = "Java";
		String javaStr2 = "Java";
		// 배열을 새로 선언하면서 주소가 새로 생성 됨.
		String javaStr3 = new String("Java");
		String [] strArrs = new String[10];
		strArrs[0] = "Java";
		strArrs[1] = "Java";
//		if(javaStr == "Java"); {
//		if(javaStr == javaStr2) {
		// javaStr3 는 배열을 선언하면서 새로운 주소가 생김 그래서 똑같이 Java 를 넣었지만
		// 다릅니다. 가 출력 됨 => 지금까지 == 으로 주소비교(String)를 하고있었던것!
//		if(javaStr == javaStr3) {
//		if(strArrs[0] == strArrs[1]) {
		// equals() 메소드를 사용하면 주소비교가 아닌 내용비교를 하기때문에 같습니다. 가 출력됨.
		if(javaStr.equals(javaStr3) ) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
	}
}
