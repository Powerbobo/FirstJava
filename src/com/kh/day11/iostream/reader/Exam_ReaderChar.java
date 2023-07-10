package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReaderChar {
	public static void main(String[] args) {
		Reader reader = null;
		
		try {
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			int readCharCount;
			char [] cBuf = new char[3]; // 3글자씩 cBuf 에 담는다. (읽는 크기는 내가 정할 수 있다.)
			
//			int i = 0;
			String result = "";
			while(true) {
				readCharCount = reader.read(cBuf); // cBuf => 읽은 값!
//				System.out.print(readCharCount); // readCharCount => 읽은 갯수!
				if(readCharCount == -1) break; // 읽을게 없으면 (-1이 되면) 멈추기.
				result += new String(cBuf, 0, readCharCount); // 읽은것까지만 String 으로 데이터 변환
//				for(char c : cBuf) {
//					System.out.print(c);
//				}
//				System.out.println();
//				i++;
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close(); // 읽는게 끝나면 종료
			} catch (IOException e) {
				// TODO: handle exception
			}
		}
	}
}
