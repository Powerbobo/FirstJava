package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalCulatorServer {

	public static void main(String[] args) {
		// 서버 구동중입니다.
		// 클라이언트 연결을 기다리고 있습니다...
		// 클라이언트와 연결되었습니다.
		// 받은 메세지 : 23
		// 받은 메세지 : 24 + 42
		// 클라이언트가 종료하였습니다.
		
		ServerSocket serverSocket = null;	// ServerSocket 초기화
		int port = 8888;					// 포트 번호 변수선언
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		// 한번에 import -> Ctrl + Shift + o
		
		
		try {
//			System.out.println(".");
//			Thread.sleep(1000);
//			System.out.println(".");
//			Thread.sleep(1000);
//			System.out.println(".");
//			Thread.sleep(1000);
			
			// ==================== 서버 구동 ====================
			System.out.println("서버 구동중입니다.");
			for(int i = 1; i <= 50; i++) {
				System.out.print("=");
				// 텍스트 지연 주기, 1000 -> 1초
				Thread.sleep(10); // 로딩 올라가는 효과 줄 수 있음
			}
			System.out.print("100%");
			System.err.println();
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트 연결을 기다리고 있습니다...");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			
			// ================ 데이터 송수신 준비  ================
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			// 무한 반복
			while(true) {
				// =================== 데이터 받기  ===================
				// 클라이언트에서 보낸 종료메세지 받기
				
				String recvMsg = dis.readUTF();
				// 클라이언트에서 종료메세지 보냈을 경우
				if(recvMsg.equalsIgnoreCase("exit")) {
					System.out.println("클라이언트가 종료하였습니다.");
					break;
				}
				System.out.printf("받은 메세지 : %s\n", recvMsg);
				// 24 + 42 -> 띄어쓰기 기준으로 문자열 배열을 만듬 
				// int num1, num2;
				// 공백 기준으로 문자열 나누기
				String [] msgArrs = recvMsg.split(" ");
				
				// 띄어쓰기 안해서 배열의 길이가 3이 아닐 경우
				// Client에 데이터 보내기
				if (msgArrs.length != 3) {
					String errMsg = "end";
					dos.writeUTF(errMsg);
					continue;	// 반복문이 다시 동작해야하기 때문에 continue 사용
				}
				// 24 / + / 42
				// 문자열 -> 정수, 데이터 타입 변환
				int num1 = Integer.parseInt(msgArrs[0]);
				int num2 = Integer.parseInt(msgArrs[2]);
				String operator = msgArrs[1];
				String result = "";	// writeUTF() 의 반환값이 String 이기 때문에.
				
				switch(operator) {
					case "+" : 
						result = String.valueOf(num1 + num2);	// 문자열로 변환
						
						break;
					case "-" : 
						result = String.valueOf(num1 - num2);
						break;
					case "*" : 
						result = num1 * num2 + ""; // 계산한 결과값에 문자열만나면 문자열로 변환 됨.
						break;
					case "/" : 
						result = num1 / num2 + "";
						break;
					case "%" : 
						result = num1 % num2 + "";
						break;
				}
				
				// =================== 데이터 보내기  ===================
				// The method writeUTF(String) in the type DataOutputStream is 
				// not applicable for the arguments (int)
				// => writeUTF() 의 반환값은 String 이어야 함.
				dos.writeUTF(result);
				dos.flush();	// 버퍼 비우기
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}