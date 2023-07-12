package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseAdapter extends JFrame{
	
	public Exam_MouseAdapter() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel la = new JLabel("Hello");
		la.setSize(50,20); // 레이블 사이즈 설정
		la.setLocation(30, 30); // 레이블 위치 설정
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(la);
		// MouseListener 클래스 -> 익명클래스로 생성
		// 추상클래스는 이렇게 사용되기 도 함.
		// 인터페이스로 구현하면 모든 추상메소드를 오버라이딩해야하지만
		// 추상클래스로 만들면 원하는 추상메소드만 오버라이딩해도 됨.
		// 추상클래스 추상메소드 말고도 다른 메소드를 가질 수 있기 때문임.
		c.addMouseListener(new MouseAdapter() {
			// mousePressed() 메소드만 오버라이드 함.
			@Override
			public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
			}
		});
		
		setSize(250,250); // 프레임 사이즈 설정
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		// 객체 생성
		new Exam_MouseAdapter();
	}
}