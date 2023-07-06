package com.kh.day09.wrapperpkg;

public class Exam_Wrapper {

	public static void main(String[] args) {
		int num = 0;
		Integer su = Integer.valueOf(0);
		// The constructor Integer(int) has been deprecated since version 9 maked for removal
//		su = new Inteager(0);
		// Integer 를 사용하면 null 체크 가능
//		su = null;
		
		// 박싱과 언박싱
		su = Integer.valueOf(1026);
		su = 1026; // 오토-박싱
		
		int suNum = su.intValue();
		suNum = su; // 오토-언박싱
		
		String openDay = "20230515";
		// 문자열을 숫자로 변환!
		int openDate = Integer.parseInt(openDay);
		
		// 소문자로 형변환
		System.out.println(Character.toLowerCase('A'));
		// 대문자로 형변환
		System.out.println(Character.toUpperCase('A'));
		
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "은 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 영문자");
		}
	}

}
