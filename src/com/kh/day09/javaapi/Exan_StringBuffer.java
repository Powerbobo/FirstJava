package com.kh.day09.javaapi;

public class Exan_StringBuffer {
	public static void main(String[] args) {
		// StringBuffer : 문자열을 연결해주는 클래스
		// 문자열을 연결해주는 메소드 concat과 같은 역할을 함.
		String data1 = "Hello";
		String data2 = " ";
		String data3 = "JAVA";
//		data1 = data1.concat(data2).concat(data3); // 메소드체이닝
		System.out.println("concat 연결 : " + data1);
		
		// + 나 concat을 사용하면 새로운 주소가 계속 부여되어서 메모리가 낭비됨.
		String result = data1 + data2 + data3;
		System.out.println("+ 연결 : " + result);
		
		// StringBuffer 를 사용하면 메모리 낭비가 최소화된다.
		// 입출력할때 많이 사용 됨.
		StringBuffer stb = new StringBuffer();
		stb.append(data1).append(data2).append(data3); // 메소드체이닝
		System.out.println("연결된 문자열 : " + stb.toString());
	}
}
