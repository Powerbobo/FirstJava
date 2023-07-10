package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {
	public static void main(String[] args) {
		// Writer => 추상 클래스
		Writer writer = null;
		
		// Unhandled exception type IOException
		// => try - catch문 사용해야함.
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/writing.txt");
			char [] data = "Java/Oracle/JDBC".toCharArray(); // toCharArray() => 문자를 문자열로 바꿔주는 메소드
			for(int i = 0; i < data.length; i++) {
				writer.write(data[i]); // write() 메소드
			}
			writer.flush(); // writer 종료시키기, finally 대신 사용!
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
