package com.kh.day11.iostream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 입력(확장자 제외) : ");
		// next() 와 nextLine 을 함께 쓰면 sc.next(); 을 선언해줘야하지만 전부 nextLine 으로 쓰면 굳이 안써줘도 괜찮다.
		String fileName = sc.nextLine();
		
		// 경로 입력 및 파일명으로 파일 생성
		// Writer 는 추상클래스이기 때문에 객체 생성 불가능함.
		Writer writer = null;
		
		// writer = new FileWriter 는 try-catch문 으로 둘러줘야함.
		try {
			// 원하는 경로 + 파일명 + 확장자명
			writer = new FileWriter("src/com/kh/day11/iostream/" + fileName + ".txt");
			// 무한반복하여 입력받는데 exit를 입력하면 무한반복 빠져나오는 코드
			System.out.println("종료는 exit");
			// 무한 반복문 사용.
			for(int i = 1;;i++){
				System.out.print(i + " : ");
				String input = sc.nextLine();
				writer.write(input + "\n"); // 개행
				// exit을 입력하면 무한반복 빠져나오기
				if(input.equals("exit")) break;			
			}
			writer.flush(); // 버퍼 나우기
			System.out.println("파일 저장이 완료되었습니다. F5를 눌러서 확인해보세요~");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
