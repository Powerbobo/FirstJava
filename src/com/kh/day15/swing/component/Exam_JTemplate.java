package com.kh.day15.swing.component;

import java.awt.Container;

import javax.swing.JFrame;

public class Exam_JTemplate extends JFrame{
	
	public Exam_JTemplate() {	// 생성자
		setTitle("메뉴 만들기 예시"); //	Frame 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Frame 종료
		
		setSize(250,200);	// Frame 사이즈
		setVisible(true);	// Frame 실행
	}
	
	public static void main(String[] args) {
		new Exam_JTemplate();	// 객체 생성
	}
}
