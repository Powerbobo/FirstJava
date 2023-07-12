package com.kh.day13.swing.basic;

import javax.swing.JFrame;

// JFrame -> 자바 GUI에 있는 패키지
public class Exam_MyFrame extends JFrame {
	public Exam_MyFrame() {
		setTitle("300x300 스윙프레임 만들기"); // 프레임 타이틀 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 누르면 진짜 종료시키는 코드 / 그 전엔 실제로 종료 안됨
		setSize(300,300); // 프레임 크기
		setVisible(true); // 프레임 실행시키는 코드?
	}
	public static void main(String[] args) {
		
		// 메인메소드 에서 프레임 실행시키는걸 권장한다.
		// 객체를 생성하지 않으면 실행되지 않는다. -> new Exam_MyFrame(); 을 작성해야 실행되는 것.
		Exam_MyFrame exFrame = new Exam_MyFrame();
	}
}
