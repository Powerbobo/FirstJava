package com.kh.day17.network.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {

	public static void main(String[] args) {
		// 서버에 연결중입니다.
		// 채팅서버에 접속하였습니다.
		// 서버와의 채팅을 시작합니다.
		// 서버(상대) : 하이
		// 클라이언트(나) : 네네
		
		String address = "127.0.0.1";	// server IP주소
		int port = 8888;				// server 포트 번호 변수
		InputStream is = null;			// InputStream 선언 및 초기화
		OutputStream os = null;			// OutputStream 선언 및 초기화
		DataInputStream dis = null;		// 보조스트림, 기본 데이터타입, 입출력 도와줌
		DataOutputStream dos = null;	// 보조스트림, 기본 데이터타입, 입출력 도와줌
		Scanner sc = new Scanner(System.in);	// System.in -> 표준 입력 스트림
		
		try {
			//=========================== 서버 연결 ===========================
			System.out.println("서버에 연결중입니다.");
			Socket socket = new Socket(address, port);	// Socket 객체 생성
			System.out.println("채팅서버에 접속하였습니다.");
			
			//=========================== 채팅 준비 ===========================
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);	// 객체 생성(전달값은 주 스트림(is))
			dos = new DataOutputStream(os);	// 객체 생성(전달값은 주 스트림(os))
			System.out.println("서버와의 채팅을 시작합니다.");
			
			// 무한 반복
			while(true) {
				//========================== 데이터 받기 ==========================
				// readUTF() -> server 에서 보낸 데이터를 바로 읽는다.(UTF로 보냈기 때문에 UTF로 받음)
				String recMsg = dis.readUTF();	// 데이터 받기
				System.out.printf("서버(상대) : %s\n", recMsg);
				
				//========================= 데이터 보내기 =========================
				System.out.print("클라이언트(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);	// 보조스트림의 메소드 사용해서 데이터 바로 보내기
				dos.flush();			// 버퍼 비우기
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}