package com.kh.day09.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
// Date -> java.util 패키지에 에 포함되어있음!!
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {
	public static void main(String[] args) {
		// Date() 메소드 : 현재 날짜와 시간을 찍는 메소드
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // 연, 월, 일, 시, 분, 초
		SimpleDateFormat trans2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS"); // 연, 월, 일, 시, 분, 초, 밀리초
		String transDate1 = trans.format(date);
		String transDate2 = trans2.format(date);
		System.out.println("형식 변환1 : " + transDate1); // yyyy/MM/dd HH:mm:ss
		System.out.println("형식 변환1 : " + transDate2); // yyyy/MM/dd HH:mm:ss:SS
		// ======================= 권장사항 =======================
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTime());
		String changed = trans.format(calendar.getTime());
		System.out.println("그레고리안 달력 날짜 확인 : " + changed);
	}
}
