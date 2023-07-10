package com.kh.day11.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByte {

	public static void main(String[] args) {
		// 추상클래스 객체 생성 불가
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/com/kh/day11/iostream/outputting2.txt");
			byte [] data = "Real I/O".getBytes(); // byte 배열로 변환
			os.write(data);
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
