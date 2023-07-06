package com.kh.day09.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {
	public static void main(String[] args) {
		String query = "name=kit&addr=seoul&age=21";
//		String [] word = query.split("&");
		// index 신경쓰지 않고 내가 원하는곳까지 자르기
		// & -> 기준으로 잘랐음.
		StringTokenizer st = new StringTokenizer(query, "&");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
}
