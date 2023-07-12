package com.kh.day13.swing.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_KeyListener extends JFrame{

	public Exam_KeyListener() {
		setTitle("KeyListener 예제"); // 프레임 제목 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 실제로 창 닫히게 하는 코드
		
		// 반복문 사용하기 위해서 배열 선언
		JLabel [] laArrs = new JLabel[3];
		
		laArrs[0] = new JLabel("getKeyCode()");
		laArrs[1] = new JLabel("getKeyChar");
		laArrs[2] = new JLabel("getKeyText"); // 컴포넌트 Label 초기값 설정
//		JLabel la1 = new JLabel("getKeyCode()"); 
//		JLabel la2 = new JLabel("getKeyChar");
//		JLabel la3 = new JLabel("getKeyText");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		// Container 에 KeyListener 연결
		// 인터페이스로 연결한게 아니라 Adapter로 연결해서
		// 원하는 메소드만 오버라이딩 해서 사용할 수 있음.
		c.addKeyListener(new KeyAdapter() {			// Adapter 클래스 사용
			// 사용하고싶은 keyPressed 메소드만 오버라이딩
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();		// 유니코드 키 값
				int keyCode = e.getKeyCode();		// 가상키 값
				laArrs[0].setText(Integer.toString(keyCode));
				laArrs[1].setText(Character.toString(keyChar)); // F5,F10등 매핑 안되어있는건 안나옴
				laArrs[2].setText(e.getKeyText(keyCode));
//				la1.setText(Integer.toString(keyCode));
//				la2.setText(Character.toString(keyChar));
//				la3.setText(e.getKeyText(keyCode));
			}
		});
		
		// for - each 문 사용
		for(JLabel la : laArrs) {
			la.setOpaque(true);				// 바탕색 보이게 하기 위해서 컴포넌트를 불투명하게 함.
			la.setBackground(Color.YELLOW);	// 라벨 배경 색상 지정
			c.add(la);						// 컴포넌트 컨테이너에 추가
		}
		
//		la1.setOpaque(true); // 바탕색 보이게 하기 위해서 컴포넌트를 불투명하게 함.
//		la2.setOpaque(true); // 바탕색 보이게 하기 위해서 컴포넌트를 불투명하게 함.
//		la3.setOpaque(true); // 바탕색 보이게 하기 위해서 컴포넌트를 불투명하게 함.
		
//		la1.setBackground(Color.YELLOW); // 라벨 배경 색상 지정
//		la2.setBackground(Color.YELLOW); // 라벨 배경 색상 지정
//		la3.setBackground(Color.YELLOW); // 라벨 배경 색상 지정
		
//		la1.setSize(50, 20); // 라벨 크기 지정
//		c.add(la1); // 라벨 생성
//		
//		la2.setSize(50, 20); // 라벨 크기 지정
//		c.add(la2); // 라벨 생성
//		
//		la3.setSize(50, 30); // 라벨 크기 지정
//		c.add(la3); // 라벨 생성
		
		setSize(300,150); // 프레임 사이즈 지정
		setVisible(true); // 프레임 실행
		
		// 스윙 프레임이 만들어질 포커스를 주고자 하는 경우 setVisible 이후에
		// 포커스를 주어야 함.
		// 키 입력을 받을 수 있도록 포커스를 주는 것임
		c.setFocusable(true); // -> component가 포커스를 받을 수 있도록 설정
		c.requestFocus(); 	  // -> component에 포커스 강제 지정
	}

	public static void main(String[] args) {
		new Exam_KeyListener();
	}
}