package com.kh.day11.iostream.fileio;

import java.io.File;
import java.io.IOException;

public class Exam_File {
	public static void main(String[] args) {
		
			// 출력할 파일 주소
			File file = new File("D:\\webworkspace\\오늘 뭐 먹지\\resources\\images\\banner1.png");
			// File 객체화.
			// getName() -> 파일명 메소드, getPath() -> 파일 경로 메소드, getParent() 부모 경로 메소드
			String fileName = file.getName();
			String path		= file.getPath();
			String parent	= file.getParent();
			System.out.printf("파일 이름 : %s \n파일 경로 : %s \n부모 폴더 : %s \n"
					, fileName
					, path
					, parent);
			
			System.out.printf("파일이 존재하는가? : %b\n파일이 맞는가? : %b\n폴더가 맞는가? : %b"
					, file.exists()
					, file.isFile()
					, file.isDirectory());
	
	}
	// 폴더 생성
	public void foloderMake() {
		File folderMake = new File("src/com/kh/day11/iostream/fileio/newfolder");
		folderMake.mkdir(); // mkdirs() 메소든느 폴더를 만드는 메소드인데, 계층형 폴더를 한번에 만들어주는 메소드임.
		System.out.println("폴더가 만들어졌습니다.");
	}
	// 파일 생성
	public void fileMake() {
		// createNewFile() -> 파일 경로 생성하는 메소드
		// checked Exception 으로, try-catch문으로 둘러줘야 함.
		try {
			File fileMake = new File("src/com/kh/day11/iostream/fileio/file.txt");
			fileMake.createNewFile();
			System.out.println("파일이 만들어졌습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
