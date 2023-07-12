package com.kh.day13.swing.event.exercise;

import java.awt.Container;
import java.awt.Label;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Exercise_MovingText extends JFrame{
	// 상, 하, 좌, 우 키로 텍스트 움직이기
	// 한 방향에 10픽셀씩 움직이기 위해 상수로 설정
	private final int MOVING_UNIT = 10;
	public Exercise_MovingText() {
		
		setTitle("상, 하, 좌, 우 키로 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Label la = new Label("HELLO");
		Container c = getContentPane();
		la.setLocation(50, 50);
		la.setSize(100, 20);
		c.add(la);
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				
				switch (keyCode) {
				case KeyEvent.VK_UP : 
					// 라벨 위치가 50 으로 설정되어있기때문에 올라가기 위해선 - 가 되어야 함.
					la.setLocation(la.getX(), la.getY() - MOVING_UNIT);
					break;
				case KeyEvent.VK_DOWN : 
					la.setLocation(la.getX(), la.getY() + MOVING_UNIT);
					break;
				case KeyEvent.VK_LEFT : 
					la.setLocation(la.getX() - MOVING_UNIT, la.getY());
					break;
				case KeyEvent.VK_RIGHT : 
					la.setLocation(la.getX() + MOVING_UNIT, la.getY());
					break;
				}
				
//				if(keyCode == KeyEvent.VK_UP) {
//					
//				} else if(keyCode == KeyEvent.VK_DOWN) {
//					
//				} else if(keyCode == KeyEvent.VK_LEFT) {
//					
//				} else if(keyCode == KeyEvent.VK_RIGHT) {
//					
//				}
			}
		});
		
		setSize(300,300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		
		new Exercise_MovingText();
	}
}
