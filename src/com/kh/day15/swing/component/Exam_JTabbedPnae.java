package com.kh.day15.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class Exam_JTabbedPnae extends JFrame{
	
	public Exam_JTabbedPnae() {	// 생성자
		setTitle("탭팬 만들기 예시"); //	Frame 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Frame 종료
		
		Container c = getContentPane();	// 컨텐츠팬 생성
		JTabbedPane pane = createTabbedPane();
		c.add(pane, BorderLayout.CENTER);
		
		setSize(400,400);	// Frame 사이즈
		setVisible(true);	// Frame 실행
	}
	
	public JTabbedPane createTabbedPane() {
		JTabbedPane	pane = new JTabbedPane();
		pane.add("superman", new JLabel(new ImageIcon("images/superman.jpg")));
		pane.add("wonderwoman", new JLabel(new ImageIcon("images/wonderwoman.jpg")));
		pane.add("spiderman", new JLabel(new ImageIcon("images/spiderman.jpg")));
		return pane;
	}
	
	public static void main(String[] args) {
		new Exam_JTabbedPnae();	// 객체 생성
	}
}