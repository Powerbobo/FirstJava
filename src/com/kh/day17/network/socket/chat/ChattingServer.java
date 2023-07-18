package com.kh.day17.network.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {
		// 채팅서버를 구동 중입니다...
		// 채팅서버를 구동하였습니다..
		// 클라이언트의 접속을 기다리고 있습니다.
		// 클라이언트가 접속하였습니다.
		// 채팅이 시작되었습니다.
		// 서버(나) : 하이
		// 클라이언트(상대) : 네네
		
		ServerSocket serverSocket = null;	// ServerSocket 클래스 선언
		int port = 8888;					// 포트 번호 변수선언
		InputStream is = null;				// InputStream 선언 및 초기화
		OutputStream os = null;				// OutputStream 선언 및 초기화
		DataInputStream dis = null;			// 보조스트림, 기본 데이터타입, 입출력 도와줌
		DataOutputStream dos = null;		// 보조스트림, 기본 데이터타입, 입출력 도와줌
		Scanner sc = new Scanner(System.in);	// System.in -> 표준 입력 스트림
		
		try {
			//=========================== 서버 구동 ===========================
			System.out.println("채팅 서버를 구동중입니다..");
			serverSocket = new ServerSocket(port);
			System.out.println("채팅 서버를 구동하였습니다.");
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			Socket socket = serverSocket.accept();	// accept() -> 소켓 객체를 리턴
			System.out.println("클라이언트가 접속하였습니다.");
			
			//=========================== 채팅 준비 ===========================
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);	// 객체 생성(전달값은 주 스트림(is))
			dos = new DataOutputStream(os);	// 객체 생성(전달값은 주 스트림(os))
			System.out.println("채팅이 시작되었습니다.");
			
			// 무한 반복
			while(true) {
				//========================= 데이터 보내기 =========================
				System.out.print("서버(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);	// 보조스트림의 메소드 사용해서 데이터 바로 보내기
				dos.flush();			// 버퍼 비우기
				
				//========================== 데이터 받기 ==========================
				// readUTF() -> server 에서 보낸 데이터를 바로 읽는다.(UTF로 보냈기 때문에 UTF로 받음)
				String recMsg = dis.readUTF();	// 데이터 받기
				System.out.printf("클라이언트(상대) : %s\n", recMsg);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}