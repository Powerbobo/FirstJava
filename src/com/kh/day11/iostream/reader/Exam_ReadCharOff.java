package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Exam_ReadCharOff {
	public static void main(String[] args) {
		Reader reader = null;
		
		try {
			// 파일 경로
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			// 3글자씩 cBuf 에 담는다. (읽는 크기는 내가 정할 수 있다.)
			char [] cBuf = new char[3];
			int readCharCount;
			String result = "";
			while(true) {
				readCharCount = reader.read(cBuf, 0, 3);
				if(readCharCount == -1) break;
				result += new String(cBuf, 0, readCharCount);
			}
			System.out.println(result);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
		}
	}
}
