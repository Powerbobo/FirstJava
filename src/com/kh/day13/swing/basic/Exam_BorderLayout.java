package com.kh.day13.swing.basic;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

// JFrame 상속받아서 사용
public class Exam_BorderLayout extends JFrame{
	
	// 생성자
	Exam_BorderLayout() {
		setTitle("BorderLayout Sample"); // 프레임 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료
		
		// Container 만드는 클래스
		Container c = getContentPane();
		// 수평간격(hGap) 30, 수직간격(vGAP) 20 픽셀로 하는 BorderLayout
		// (30, 20) -> 버튼 사이 마진주기
		c.setLayout(new BorderLayout(30, 20));
		c.add(new JButton("Calculate"), BorderLayout.CENTER); // 중앙 위치
		c.add(new JButton("add"), BorderLayout.NORTH); // 북쪽 위치
		c.add(new JButton("sub"), BorderLayout.SOUTH); // 남쪽 위치
		c.add(new JButton("multi"), BorderLayout.EAST); // 동쪽 위치
		c.add(new JButton("div"), BorderLayout.WEST); // 서쪽 위치
		
		setSize(300,200); // 프레임 크기
		setVisible(true); // 프레임 실행명령어
		
	}
	
	public static void main(String[] args) {
		
		// 객체 생성
		new Exam_BorderLayout();
	}
}