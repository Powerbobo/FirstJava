package com.kh.day16.network.exam3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {
		ServerSocket serverSorket = null;	// ServerSocket 초기화
		
		InputStream is = null;				// InputStream 선언(데이터 받기위해서)
		OutputStream os = null;				// InputStream 선언(데이터 보내기위해서)
		Scanner sc = new Scanner(System.in);
		
		try {
			serverSorket = new ServerSocket(7777);	// 포트번호 생성
			System.out.println("클라이언트 접속 대기중...");
			Socket socket = serverSorket.accept();	// 클라이언트 접속 대기 후 연결되면 바로 연결
			System.out.println("클라이언트 접속 완료");
			// 2. 데이터 받기
			is = socket.getInputStream();
			byte [] bytes = new byte[1024];		// 바이트로 받아야함
			int readByteNo = is.read(bytes);	// 바이트로 읽은 메세지 변수에 저장
			String message = new String(bytes, 0, readByteNo);	// 저장한 변수 메시지 읽기
			System.out.printf("클라이언트(상대) : %s\n", message);
			//====================== 받기 완료 ======================
			// 3. 데이터 보내기
			os = socket.getOutputStream();
			System.out.print("서버(나) : ");
			message = sc.nextLine();
			bytes = message.getBytes();
			os.write(bytes);
			os.flush();
			System.out.println("데이터 전송 성공!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}