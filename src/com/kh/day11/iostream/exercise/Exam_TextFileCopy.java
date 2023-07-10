package com.kh.day11.iostream.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {

	public static void main(String[] args) {
		
		// 문자 스트림 FileReader와 FileWriter를 이용하여
		// c:\windows\system.ini를 c:\Temp\system.txt 파일로 복사하는 프로그램을 작성하라.
		
		Reader reader = null;
		Writer writer = null;
		File src = new File("C:\\Windows\\system.ini"); // 원본 파일 경로명
		File dest = new File("c:\\Temp\\system.txt"); 	// 복사 파일 경로명
		
		
		try {
			reader = new FileReader(src);
			
			// 파일 입출력을 위한 폴더 만들기
			if(!dest.exists()) {
				dest.mkdir();
			}
			
			File folderMake = new File("C:\\Temp");
			if(!folderMake.exists()) {
				folderMake.mkdir();
			}
			
			// 파일 만들기
			writer = new FileWriter(dest);
			// 뭉탱이로 읽는 방법
//			int readCharCount;
//			char [] cBuf = new char[1024];
//			String result = "";
//			while(true) {
//				readCharCount = reader.read(cBuf);
//				if(readCharCount == -1) break;
//				result += new String(cBuf, 0, readCharCount);
//			}
//			System.out.println(result);
			// 한글자씩 읽는 방법
			int readChar;
			while(true) {
				readChar = reader.read();
				if(readChar == -1) break;
				// write 메소드 자리. 왜냐하면 읽은 값을 써서 파일에 저장해야하기 때문.
				writer.write((char)readChar);
			}
			System.out.println("복사 완료!");
			reader.close(); // 버프 종료
			writer.close(); // 버프 종료
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
