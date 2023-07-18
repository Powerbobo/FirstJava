package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {

	public static void main(String[] args) {
//		클라이언트 소켓을 생성하였습니다.
//		/127.0.0.1
//		게임 준비 완료
//		--> 4 2 1
//		0스트라이크 0볼
//		--> 1 2 3
//		0스트라이크 1볼
//		--> 2 3 4
//		1스트라이크 0볼
//		--> 5 3 8
//		2스트라이크 0볼
//		--> 5 3 7
//		1스트라이크 1볼
//		--> 7 3 8
//		3스트라이크 0볼
//		축하합니다. 아웃입니다!
		
		String address = "127.0.0.1";
		int port = 8888;
		
		Scanner sc = new Scanner(System.in);
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			// =================== 서버 연결 ===================
			Socket socket = new Socket(address, port);
			System.out.println("소켓을 생성하였습니다.");
			System.out.println("게임 준비 완료");
			
			// =============== 데이터 송수신 준비 ==============
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			while(true) {
				// ================= 데이터 보내기 =================
				System.out.print("--> ");
				String input = sc.nextLine();
				dos.writeUTF(input);
				os.flush();
				
				// ================== 데이터 받기 ==================
				String recvMsg = dis.readUTF();
				System.out.println(recvMsg);
				
				// if(recvMsg.equalsIgnoreCase("3스트라이크0볼")) {
				if(recvMsg.startsWith("3")) {	// 숫자가 3으로 시작할 경우
					System.out.println("축하합니다. 맞췄습니다.");
					break;
				}
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}