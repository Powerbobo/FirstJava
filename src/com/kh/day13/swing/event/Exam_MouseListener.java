package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseListener extends JFrame{
	
	public Exam_MouseListener() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel la = new JLabel("Hello");
		la.setSize(50,20); // 레이블 사이즈 설정
		la.setLocation(30, 30); // 레이블 위치 설정
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(la);
		// MouseListener 인터페이스를 익명클래스로 생성해서
		// 자동으로 오버라이딩 됨.
		c.addMouseListener(new MouseListener() {
			// 눌러진 마우스를 놓을때 발생
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			// 마우스 버튼을 누를때 발생
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX(); // x 좌표
				int y = e.getY(); //y 좌표
				la.setLocation(x, y); // 로케이션 메소드로 좌표 변경
				// => 마우스를 누를때마다 Hello 가 따라옴!
			}
			// 마우스가 해당 컴포넌트 영역 밖으로 나갈때 발생
			@Override
			public void mouseExited(MouseEvent e) {
			}
			// 마우스가 해당 컴포넌트 영역 안으로 들어올때 발생
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			// 마우스가 해당 컴포넌트를 클릭했을때 발생
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		setSize(250,250); // 프레임 사이즈 설정
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		// 객체 생성
		new Exam_MouseListener();
	}
}
