package com.kh.day13.swing.basic;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_NullLayout extends JFrame{
	
	public Exam_NullLayout() {
		setTitle("NullLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		// * 사이즈를 꼭 설정해줘야 보인다.
		
		JLabel la = new JLabel("Hello Press Button!");
		la.setLocation(130, 50); // 레이블 위치 설정
		la.setSize(200,20); // 레이블 사이즈 설정
		c.add(la);
		
		// for문으로 버튼 여러개 만들기
		for(int i = 1; i < 9; i++) {
			// 버튼 객체 생성 후 btn 변수에 넣기 
			// String.valueOf(i) -> 버튼 text를 i 로 값으로 만들기
			// String으로 넣어야하기 때문데 valurOf() 를 사용.
			JButton btn = new JButton(String.valueOf(i)); 
			btn.setLocation(i*15,i*15); // 버튼 위치
			btn.setSize(50,20); // 버튼 크기
			c.add(btn); // 버튼 생성
		}
		
		// 버튼 1개만 생성할 때
//		JButton btn = new JButton("1"); // 버튼 객체 생성 후 btn 변수에 넣기
//		btn.setLocation(15,15); // 버튼 위치
//		btn.setSize(50,20); // 버튼 크기
//		c.add(btn); // 버튼 생성
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		//객체생성
		new Exam_NullLayout();
	}
}