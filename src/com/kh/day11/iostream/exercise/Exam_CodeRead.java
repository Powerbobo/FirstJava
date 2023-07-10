package com.kh.day11.iostream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_CodeRead {

	public static void main(String[] args) {
		// Exam_FileCopy.java 파일을 읽어서 콘솔에 출력해보세요~!
		
		InputStream is = null;
		
		try {
			// 읽어야 하는 파일 경로
			is = new FileInputStream("src/com/kh/day11/iostream/exercise/Exam_FileCopy.java");
			// 많은 문자열을 한번에 출력하기 위해서 byte 배열 사용
			byte [] readBytes = new byte[1024]; // 1KB
			// 글자 수 변수
			int readByteCount;
			// 읽어 올 문자열을 담을 문자열 변수
			String result = "";
			// readBytes 를 readByteCount 변수에 넣고, -1 이 되기전까지 실행
			while((readByteCount = is.read(readBytes)) != -1) {
				// readBytes를 0부터 시작해서 readByteCount 숫자까지 누적
				result += new String(readBytes, 0, readByteCount);
			}
			//result 출력
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
