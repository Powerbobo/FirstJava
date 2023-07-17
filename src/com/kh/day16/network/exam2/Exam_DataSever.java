package com.kh.day16.network.exam2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam_DataSever {

	public static void main(String[] args) {
		ServerSocket serverSocket = null; // 서버 소켓 변수 만들기
		InputStream is = null;
		OutputStream os = null;
		
		try {
			serverSocket = new ServerSocket(4885);	// 서버 소켓 포트 번호 지정
			System.out.println("서버 소켓 생성 완료");
			System.out.println("클라이언트 연결 대기중...");
			Socket socket = serverSocket.accept();	// 클라이언트에서 연결 요청할때까지 기다렸다가 연결 수락
			System.out.println("연결 수락됨!");
			//================================= 데이터 받기 =================================
			is = socket.getInputStream();
			byte [] bytes = new byte[1024];	// InputStream 이 byte 기반 스트림이기때문에 바이트 배열 만듬
			int readByteNo = is.read(bytes);
			String message = new String(bytes, 0, readByteNo);
			System.out.printf("데이터 받기 성공 : %s\n", message);
			//================================================================================
			//================================= 데이터 보내기 =================================
			os = socket.getOutputStream();
			message = "Hello client";
			byte [] buf = message.getBytes();
			
			os.write(buf);
			os.flush();
			System.out.println("데이터 전송 완료");
			//================================================================================
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}