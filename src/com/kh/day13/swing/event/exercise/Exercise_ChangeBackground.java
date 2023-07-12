package com.kh.day13.swing.event.exercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_ChangeBackground extends JFrame {
	// <F1> 키를 입력받으면 컨텐트팬의 배경을 초록색으로, 
	// % 키를 입력받으면 노란색으로 변경
	// Title : Key Code 예제, F1키 : 초록색, %키 : 노란색
	// size : 300, 150
	// 눌린 키 출력하는 JLabel을 이용하여 컨텐트팬에 출력하기
	// ex. F1키가 눌렸습니다., 5키가 눌렸습니다.
	
	public Exercise_ChangeBackground() {
		
		setTitle("Title : Key Code 예제, F1키 : 초록색, %키 : 노란색"); // Frame 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame 닫기
		
		
		Container c = getContentPane();
		JLabel la = new JLabel("F1키가 눌렸습니다."); 
		c.setLayout(null);
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				la.setText(e.getKeyText(e.getKeyCode()) + "키가 눌렸습니다.");
				int keyCode = e.getKeyCode();
				char keyChar = e.getKeyChar();
				
				if(keyChar == '%') {
					c.setBackground(Color.GREEN);
				// keyEvent.VK_F1
				// => 유니코드에 매핑되어있지 않는데, 가상 코드로 정의되어있는 값.
				// F1, F5, F10 등이 유니코드에 매핑되어있지 않음.
				} else if(keyCode == KeyEvent.VK_F1) {
					c.setBackground(Color.YELLOW);
				} else {
					c.setBackground(Color.LIGHT_GRAY);
				}
			}
		});
		la.setSize(200, 20); // 라벨 사이즈
		la.setLocation(0, 50); // 라벨 위치
		c.add(la); // 컨텐트팬에서 라벨 실행
		
		setSize(300,150); // Frame 사이즈
		setVisible(true); // Frame 실행
		
		// 키 입력받기 위해 포커스 줌
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new Exercise_ChangeBackground();
	}
}
