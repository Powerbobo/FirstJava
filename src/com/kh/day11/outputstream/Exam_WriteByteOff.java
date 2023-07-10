package com.kh.day11.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {

	public static void main(String[] args) {
		// 추상클래스 객체 생성 불가
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/com/kh/day11/iostream/outputting3.txt");
			byte [] data = "리얼 입출력".getBytes(); // byte 배열로 변환
			// 시작과 끝 지점 커스텀
			os.write(data, 0, 5);
			os.flush(); // 버퍼 지우기
			System.out.println("쓰기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				os.close(); // 자원 해제
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}

}
