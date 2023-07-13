package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class Exam_JButton extends JFrame{

	public Exam_JButton() {
		setTitle("JButton 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
//		setHorizontalAlignment, setVerticalAlignment 메소드 사용 시 해당 메소드 사용불가
//		c.setLayout(new FlowLayout()); 
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		JButton btn = new JButton("Call", normalIcon);
		btn.setPressedIcon(pressedIcon); // setPressedIcon -> 아이콘 눌렀을 때
		btn.setRolloverIcon(rolloverIcon); // setRolloverIcon - > 아이콘ㅇ
		// 버튼 안에 텍스트 및 이미지의 수평, 수직 위치 조정 메소드
		// Layout 메소드와 함께 사용할 수 없다.
		btn.setHorizontalAlignment(SwingConstants.RIGHT);
		btn.setVerticalAlignment(SwingConstants.TOP);
		c.add(btn);
		
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Exam_JButton();
	}
}
