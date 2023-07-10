package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {
	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			// 파일 생성 경로
			writer = new FileWriter("src/com/kh/day11/iostream/writing2.txt");
			char [] cbuf = "I/O Stream Good".toCharArray(); // 문자 -> 문자열 데이터 변경
			writer.write(cbuf);
			// 버퍼 비우기, 스트림에 있는 데이터들을 비워냄
			// flush 와 finally 중 원칙은 flush이다.
			// flush는 버퍼를 비우기 위한 목적, finally는 자원을 해제하기 위한 목적을 가졌다.
			writer.flush(); 
			System.out.println("write(char[]) 동작 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close(); // 버퍼를 비우지 않아도 스트림을 종료하게 되면 버퍼가 비워짐
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
