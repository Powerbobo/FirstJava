package com.kh.day16.network.exam3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {

	public static void main(String[] args) {
		String address = "127.0.0.1";	// server ip 주소 변수 저장
		int port = 7777;				// server 포트 주소 변수 저장
		
		OutputStream os = null;				// InputStream 선언(데이터 보내기위해서)
		InputStream is = null;				// InputStream 선언(데이터 받기위해서)
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("연결 요청중...");
			Socket socket = new Socket(address, port);	// 소켓 생성 -> 서버 ip, 포트 번호 입력
			System.out.println("연결 성공!");
			// 1. 데이터 보내기
			os = socket.getOutputStream();
			System.out.print("클라이언트(나) : ");	// 가이드 메세지
			String message = sc.nextLine();			// 보낼 메세지
			byte [] bytes = message.getBytes();		// byte 타입으로 메세지 보내기
			os.write(bytes);	// OutputStream 에 메세지 넣기
			os.flush();			// 메세지 내보내기
			System.out.println("데이터 전송 완료!");
			//====================== 보내기 완료 ======================
			// 4. 데이터 받기
			is = socket.getInputStream();
			bytes = new byte[1024];
			int readByteNo = is.read(bytes);
			message = new String(bytes, 0, readByteNo);
			System.out.printf("서버(상대) : %s\n", message);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}