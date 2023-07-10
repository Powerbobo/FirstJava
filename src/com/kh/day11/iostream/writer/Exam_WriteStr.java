package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class Exam_WriteStr {
	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			// 파일 경로 작성
			writer = new FileWriter("src/com/kh/day11/iostream/writing3.txt");
			char [] cbuf = "JDBC/JSP/Servlet".toCharArray();
			writer.write("JDBC/JSP/Servlet"); // 문자열 바로 넘기기!
			writer.flush(); // 버퍼 비우기
			System.out.println("쓰기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 자원 종료
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
