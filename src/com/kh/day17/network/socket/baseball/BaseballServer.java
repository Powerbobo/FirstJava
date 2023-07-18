package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class BaseballServer {

		public static void main(String[] args) {
//			서버소켓을 생성하였습니다.
//			2023-07-18 12:04:56:15
//			클라이언트의 접속을 기다립니다.
//			클라이언트가 접속했습니다.
//			서버 숫자 -> 7 3 8
//			서버 준비 완료
//			받기 : 4 2 1
//			0스트라이크 0볼
//			받기 : 1 2 3
//			0스트라이크 1볼
//			받기 : 2 3 4
//			1스트라이크 0볼
//			받기 : 5 3 8
//			2스트라이크 0볼
//			받기 : 5 3 7
//			1스트라이크 1볼
//			받기 : 7 3 8
//			3스트라이크 0볼
//			아웃! 게임종료
			
			int port = 8888;
			
			ServerSocket serverSocket = null;
			Date date = new Date();
			Scanner sc = new Scanner(System.in);
			InputStream is = null;
			OutputStream os = null;
			DataInputStream dis = null;
			DataOutputStream dos = null;
			int [] numbers = new int[3];	// 중복 제거를 위한 배열
			
			try {
				// =================== 서버 구동 ===================
				serverSocket = new ServerSocket(port);
				System.out.println("서버소켓을 생성하였습니다.");
				Thread.sleep(1500);
				System.out.println("클라이언트의 접속을 기다립니다.");
				Socket socket = serverSocket.accept();
				System.out.println("클라이언트가 접속했습니다.");
				System.out.print("서버 숫자 -> ");
				
				// 랜덤 숫자 부여
				// (int) Math.random() * (최댓값 - 최솟값 + 1) + 최소값
				for(int i = 0; i < 3; i++) {
					// 중복없이 난수 추출하기
					numbers[i] = (int)(Math.random()*9+1);
					for(int j = 0; j < i; j++) {
						// #1 skip
						// 		   j			 i
						// #2
						// numbers[0] == numbers[1]
						// #3
						// numbers[0] == numbers[2]
						// numbers[1] == numbers[2]
						// -> 중복 비교 순서
						if(numbers[j] == numbers[i]) {
							i--;
							break;	// 난수 구하는 for문 끝내기
						}
					}
				}
				System.out.printf("%d %d %d\n", numbers[0], numbers[1], numbers[2]);
				System.out.println("서버 준비 완료");
				
				// =============== 데이터 송수신 준비 ==============
				is = socket.getInputStream();
				os = socket.getOutputStream();
				dis = new DataInputStream(is);
				dos = new DataOutputStream(os);
				
				// 무한 반복
				while(true) {
					// ================== 데이터 받기 ==================
					String recvMsg = dis.readUTF();
					System.out.printf("받기 : %s\n", recvMsg);
					
					// ================= 데이터 보내기 =================
					// numbers배열과 입력한 값으로 만든 배열과 비교
					String [] inputNums = recvMsg.split(" ");
					int strike = 0;
					int ball = 0;
					for(int i = 0; i < 3; i++) {
						for(int j = 0; j < 3; j++) {
							// 값 비교
							if(numbers[i] == Integer.parseInt(inputNums[j])) {
								// 인덱스 비교
								if(i == j) {	// 값이 같은 상태에서 인덱스가 같으면 스트라이크
									strike++;
								} else { // 값이 같은 상태에서 인덱스가 다르면 볼
									ball++;
								}
							}
						}
					}
					// *** 위 for문 비교 참조! ***
					// numbers[0] == Integer.parseInt(inputNums[0]);
					// 스트라이크 +1
					// numbers[0] == Integer.parseInt(inputNums[1]);
					// numbers[0] == Integer.parseInt(inputNums[2]);
					
					// numbers[1] == Integer.parseInt(inputNums[0];
					// 볼 +1
					// numbers[1] == Integer.parseInt(inputNums[1];
					// numbers[1] == Integer.parseInt(inputNums[2];
					
					// numbers[2] == Integer.parseInt(inputNums[0];
					// numbers[2] == Integer.parseInt(inputNums[1];
					// numbers[2] == Integer.parseInt(inputNums[2];
					
					
					// 정답과 비교해서 스트라이크, 볼 알려주기
					String result = strike + "스트라이크" + ball + "볼";
					dos.writeUTF(result);
					dos.flush();
					
					// 게임종료 -> 무한반복 종료
					if(strike == 3) {
						System.out.println("아웃! 게임 종료");
						break;
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}