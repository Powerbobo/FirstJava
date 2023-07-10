package com.kh.day11.iostream.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {

	public static void main(String[] args) {
		// 바이트 스트림을 이용하여 바이너리 파일을 복사하는 프로그램을 작성하라.
		// c:\Windows\Web\Wallpaper\Theme1\img1.jpg를 c:\Temp\copyimg.jpg로 복사하였습니다.
		
		// InputStream, outputStream 선언 (추상 클래스이기 때문에 객체 생성 불가)
		InputStream is = null;
		OutputStream os = null;
		File src = new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File dest = new File("c:\\Temp\\copyimg.jpg");
		
		int readByte;
		// 조금 더 빠르게 파일을 읽을 수 있는 방법 -> 객체로 만들기
		byte [] readBytes = new byte[1024*10];
		try {
			// 폴더 없을 경우 폴더 생성!
			File folder = new File("c:\\Temp");
			if(!folder.exists()) {
				folder.mkdir();
			}
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			
			// 1글자씩 읽는 방법
//			while(true) {
//				readByte = is.read();
//				if(readByte == -1) break;
//				os.write((char)readByte);
//			}
			// 객체로 한번에 읽는 방법
			while(true) {
				readByte = is.read(readBytes);
				if(readByte == -1) break;
				os.write(readBytes, 0, readByte);  // 고속복사하는 코드, 10KB를 읽어서 복사함!
				// readByte의 크기가 readBytes의 길이보다 작다면 무한반복문 탈출
				if(readByte < readBytes.length) break; // 읽은 갯수가 현저히 적어지면 무한반복 탈출
			}
			is.close();
			os.close();
			System.out.printf("%s를 %s로 복사하였습니다.", src.getPath(), dest.getPath());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
