package com.kh.day16.network.exam1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam_Server {

	public static void main(String[] args) {
		System.out.println("Server");
		ServerSocket server = null;	
		
		try {	// checked Exception
			System.out.println("연결 기다림");
			server = new ServerSocket(4885);	// 포트 번호 생성
			// 무한 반복문으로 만들기
			while(true) {
				Socket serverSocket = server.accept();	// 연결 기다리다가 연결 요청이 오면 소켓 생성
				System.out.println("클라이언트 접속 완료");
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
