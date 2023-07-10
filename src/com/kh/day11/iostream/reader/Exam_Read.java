package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		Reader reader = null;
		// Cannot instantiate the type Reader
		// => Reader 는 추상클래스여서 객체 생성 불가!

		// reader = new FileReader("");
		// Unhandled exception type FileNotFoundException
		// FileReader 를 사용하려면 try-catch로 감싸야한다!
		try {
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt"); // 파일 경로

			while(true) {
				// Unhandled exception type IOException
				// => read 메소드를 사용하려면, IOException 에 해대 준비해야한다.
				// => 이런 것들을 Checked Exception이라고함.
				int readData = reader.read();
				if(readData == -1) break; // 프로그램을 다 읽고 무한반복을 멈추기 위해서 readData가 -1 이 되면 종료
				System.out.print((char) readData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		} finally { // 프로그램이 끝나면 종료처리!
			try {
				reader.close();
			} catch (IOException e) {
				// TODO: handle exception
			}
		}
	}
}
