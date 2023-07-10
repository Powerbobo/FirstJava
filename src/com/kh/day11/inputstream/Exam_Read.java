package com.kh.day11.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		// InputStream => 추상 클래스
		InputStream is = null;

		// Unhandled exception type FileNotFoundException
		// => checked Exception / try-catch 자동완성

		try {
			// Unhandled exception type IOException
			// => read 메소드를 사용하려면, IOException 에 해대 준비해야한다.
			// => 이런 것들을 Checked Exception이라고함.
			is = new FileInputStream("src/com/kh/day11/iostream/reading.txt");
			int readByte;
			while(true) {
				readByte = is.read();
				if(readByte == -1) break;
				System.out.print((char) readByte);
			}
			// do ~ while문, 먼저 읽고, 조건 따지기
			do {
				readByte = is.read();
			} while (readByte != -1);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
