package com.kh.day11.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Wirte {
	public static void main(String[] args) {
		// OutputStream -> 추상클래스 객체생성불가
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/com/kh/day11/iostream/outputting.txt");
			// 바이트 기반 스트림이기 때문에 byte 배열 만들어야 함!
			byte [] data = "Hello I/O".getBytes(); // btye 로 데이터 변환
			for(int i = 0; i < data.length; i++) {
				os.write(data[i]);
			}
			os.flush(); // 버퍼 비우기
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 자원 해제시키기, flush() 메소드와 역할이 다름
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
