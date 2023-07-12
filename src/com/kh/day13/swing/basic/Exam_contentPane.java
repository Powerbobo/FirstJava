package com.kh.day13.swing.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_contentPane extends JFrame{
	
	public Exam_contentPane() {
		setTitle("ContentPane과 JFrame"); // 프레임 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 실제로 종료하게 하는 코드
														// 이 코드 작성 전에는 안보이게만 했음.
		
		// Container 임포트해줘야함.
		// getContentPane() -> JFrame이 가지고 있는 메소드
		Container contentPane = getContentPane();
		
		// setBackground() -> 색깔 설정
		contentPane.setBackground(Color.PINK);
		
		// setLayout() -> 계층구조 만들어주는 메소드
		contentPane.setLayout(new FlowLayout());
		
		// JButton("text") 메소드 사용함 -> 작성한 텍스트가 들어간 버튼
		// new JButton() -> 버튼 객체 생성
		// 마지막에 들어간 버튼 덮어씌워져서 전에 작성한 버튼은 보이지 않는다.
		// 버튼을 전부 보이게끔 하려면 레이아웃을 만드는 메소드를 사용해서 계층구조로 나줘워야 한다.
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150); // 프레임 사이즈
		setVisible(true); // 프레임 실행 코드
	}
	public static void main(String[] args) {
		// 객체 생성, 객체가 생성되지 않으면 프레임은 만들어지지않는다.
		new Exam_contentPane();
	}
}