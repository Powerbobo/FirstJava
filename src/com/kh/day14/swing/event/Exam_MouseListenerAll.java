package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

// JFrame -> javax.swing 에 임포트
public class Exam_MouseListenerAll extends JFrame{
	private JLabel la; // JLabel 필드에서 선언할 수도 있음
	
	// 생성자
	public Exam_MouseListenerAll() {
		setTitle("MouseListener와 MouseMotionListener 예제"); // Frame 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame 종료
		
		la = new JLabel("No Mouse Event"); // JLabel 초기화
		Container c = getContentPane(); // 컨테이너 생성
		c.setLayout(new FlowLayout());  // FlowLayout 선언
		c.add(la);						// FlowLayout 생성
		
		MyMouseListener listener = new MyMouseListener(); // MyMouseListener 객체 생성
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener); // MouseListener 이벤트 실행
		
		setSize(300, 200); // Frame 사이즈
		setVisible(true);  // Frame 실행
	}
	
	// 내부 클래스로 생성 -> 위치: 메인메소드 바로 위쪽, 외부에서 사용하지 못하게 private 으로 사용해야 함!
	// MouseListener, MouseMotionListener 인터페이스 다중 상속
	// 인터페이스는 추상클래스여서 MouseListener, MouseMotionListener 에서 사용하는 모든 메소드 오버라이딩 해야함.
	private class MyMouseListener implements MouseListener, MouseMotionListener {
		// MouseListener 메소드 오버라이드
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			// 마우스가 영역에 들어가면 이벤트 발생
			Component c =(Component)e.getSource();
			c.setBackground(Color.GRAY); // 이벤트 -> Container 배경 색 변경 이벤트
		}
	
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			// 마우스가 영역 밖으로 나가면 이벤트 발생
			Component c =(Component)e.getSource();
			c.setBackground(Color.RED); // 이벤트 -> Container 배경 색 변경 이벤트
		}
		
		// MouseMotionListener 메소드 오버라이드
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			// 마우스 드래그할 때 이벤트 발생
			la.setText("MouseMoved(" + e.getX() + ", " + e.getY() + ")"); // 이벤트 -> 마우스 좌표 텍스트 출력
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			// 마우스가 움직일 때 이벤트 발생!
			la.setText("MouseMoved(" + e.getX() + ", " + e.getY() + ")"); // 이벤트 -> 마우스 좌표 텍스트 출력
		}
	}
	public static void main(String[] args) {
		
		// 객체 생성
		new Exam_MouseListenerAll();
	}
}
