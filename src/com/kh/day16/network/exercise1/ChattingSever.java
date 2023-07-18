package com.kh.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingSever {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		OutputStream os = null;
		InputStream is = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			// 포트번호 설정 후 연결 대기
			serverSocket = new ServerSocket(7777);
			System.out.println("클라이언트 연결 대기중...");
			Socket socket = serverSocket.accept();
			// 연결 된 후에는 소켓 객체 생성
			System.out.println("클라이언트 접속 완료");
			
			is = socket.getInputStream();	// 한번만 생성되면 됨. 반복 필요 없음
			os = socket.getOutputStream();	// 한번만 생성되면 됨. 반복 필요 없음
			
			while(true) {
				
				
				// 2. 데이터 받기
				// 프로그램 기준 들어오니까 InputStream
				byte [] bytes = new byte[1024];
				// 읽은 때에는 read() 메소드 사용
				int readByteNo = is.read(bytes);
				// bytes에는 읽은 데이터, readByteNo 는 읽은 갯수
				// byte로 출력할 수 없어서 문자열로 만들어줌.
				String message = new String(bytes, 0, readByteNo);
				System.out.printf("클라이언트(상대) : %s\n", message);
				
				// 3. 데이터 보내기
				// 프로그램 기준 나가니까 OutputStream
				System.out.print("서버(나) : ");
				message = sc.nextLine();
				bytes = message.getBytes();
				os.write(bytes);
				os.flush();
				// ============== 보내기 완료 ==============
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
