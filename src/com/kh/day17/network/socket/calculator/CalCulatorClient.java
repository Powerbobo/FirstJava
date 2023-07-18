package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalCulatorClient {

	public static void main(String[] args) {
		// 서버와 연결되었습니다.
		// 계산식(빈칸으로 띄어 입력, 예 24 + 42) >> 23
		// 잘못 입력하셨습니다. 형식에 맞게 입력해주세요.
		// 계산식(빈칸으로 띄어 입력, 예 24 + 42) >> 24 + 42
		// 계산결과 : 66
		// 계산식(빈칸으로 띄어 입력, 예 24 + 42) >> exit
		
		String address = "127.0.0.1";
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			// ==================== 서버 연결  ====================
			Socket socket = new Socket(address, port);
			System.out.println("서버와 연결되었습니다.");
			
			// ================ 데이터 송수신 준비  ================
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			// ================== 데이터 보내기  ==================
			// 무한 반복
			for(;;) {
				System.out.print("계산식(빈칸으로 띄어 입력, 예 24 + 42) >> ");
				String sendMsg = sc.nextLine();
				
				// Null pointer access: The variable dos can only be null at this location
				// => dos 객체 생성 안했을 경우 뜨는 오류메세지
				dos.writeUTF(sendMsg);
				
				// 클라이언트에서 서버에 종료 메세지 보냈을 경우
				if(sendMsg.equalsIgnoreCase("exit")) {
					System.out.println("종료하였습니다.");
					break;
				}
				
				dos.flush();	// 버퍼 비우기
				
				// ================== 데이터 받기  ==================
				String recvMsg = dis.readUTF();
				
				// 잘못 입력했을 경우
				if(recvMsg.equalsIgnoreCase("end")) {
					System.out.println("잘못 입력하셨습니다. 형식에 맞게 입력해주세요.");
					continue;
				}
				
				System.out.printf("계산 결과 : %s\n", recvMsg);
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}