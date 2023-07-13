package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Exam_DblclickChangeColor extends JFrame {
	
	// 생성자
	public Exam_DblclickChangeColor() {
		setTitle("Click and Dbl Click Change BackgroundColor"); // Frame 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			// Frame 종료
		
		Container c = getContentPane(); // Container 생성
//		c.setBackground(Color.black);	// Container 배경색 지정
		
//		MyMouseListener listener = new MyMouseListener(); // 객체 생성
//		c.addMouseListener(listener); // MouseListener 이벤트 실행
		
		// 위 코드와 동일하게 동작함!
		c.addMouseListener(new MyMouseListener()); // MyMouseListener 객체를 만들어서 마우스 이벤트 실행
		
		setSize(300, 200);
		setVisible(true);
	}
	
	// 내부클래스로 MouseAdapter 클래스 연결 - 원하는 메소드만 오버라이딩 가능
//	private class MyMouseListner implements MouserListener{
		private class MyMouseListener extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			// 마우스 클릭 시 이벤트 발생
			// 더블 클릭 구현, 클릭 카운트 수가 2면 더블 클릭!
			if(e.getClickCount() == 2) { 
				// (int) Math.random() * (최댓값 - 최솟값 + 1) => 원하는 범위의 랜덤한 수 구하는 방법
				// 0 ~ 255 사이의 랜덤한 숫자 출력 (소숫점값이 나오기 때문에 강제형변환)
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				
				// getSource -> 이벤트가 발생한 요소를 가져오는 메소드
				// 여기선 이벤트 발생 영역은 최상위 요소인 ContentPane!
				Component c =(Component)e.getSource(); 
//				c.setBackground(Color.black); // 색상 지정
//				c.setBackground(new Color(0,0,0)); // RGB로 색 넣기 / 색 다 끄기 -> 0, 다 키기 -> 255
				c.setBackground(new Color(red,green,blue)); // 색 랜덤으로 변경
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_DblclickChangeColor(); // 객체 생성
	}

}
