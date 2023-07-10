package com.kh.day11.iostream.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {
	public static void main(String[] args) {
		InputStream is = null;

		try {
			// 파일 경로(넣고 싶은 파일 경로 직접 입력하면 추가할 수 있음)
			is = new FileInputStream("src/com/kh/day11/iostream/reading.txt");
			int readByteCount;
			byte [] readBytes = new byte[3];
			// reseult 변수 선언 및 초기화
			String result = "";
			while((readByteCount = is.read(readBytes)) != -1) {
//				readByteCount = is.read(readBytes); // 조건문에 추가해서 코드 줄이기
//				if(readByteCount == -1) break; // while문 조건문에 조건 추가
				// 읽은갯수까지 String 으로 변환해서 result 변수에 누적
				result += new String(readBytes, 0, readByteCount);
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 자원 해제! / 스트림 종료 시 필수 선언해야 함.
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
