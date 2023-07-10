package com.kh.day11.iostream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;

// 성능 향상 보조스트림, BufferedStream
public class Exam_BufferedStream {

	public static void main(String[] args) {
		// 버퍼 크기를 5로 하고 표준 출력 스트림(System.out)과 연결한
		// 버퍼 출력 스트림을 생성하라!
		
		FileReader fir = null;
		int readCharCount;
		// (System.out) -> 연결
		BufferedOutputStream bout = new BufferedOutputStream(System.out, 5);
		// 아래와 같이 출력하는것도 가능하지만, BufferedStream 을 활용하는게 
		// 성능 향상이 된다.
		// Scanner sc = new Scanner(System.in);
		// System.out.println("전달값");
		// bout.write(null); -> try-catch문으로 둘러줘야함
		try {
			fir = new FileReader("src/com/kh/day11/iostream/javascript_cookie.txt");
			while((readCharCount = fir.read()) != -1) {
				bout.write(readCharCount);
			}
			bout.flush(); // 버퍼 나가기
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { // 자원 종료
				bout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
