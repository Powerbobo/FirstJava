package com.kh.day13.swing.basic;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// JFrame 상속 임포트
public class Exam_GridLayout extends JFrame {
	
	public Exam_GridLayout() {
		setTitle("GirdLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		// 4행 2열, 수평 마진 -> 0, 수직 마진 -> 5
		// c.setLayout(new GridLayout(4, 2, 0, 5));
		
		// c.setLayout(new GridLayout(4, 2, 0, 5)); - > 대신 사용할 수 있는 방법
		GridLayout grid = new GridLayout(5, 2);
		grid.setVgap(5);
		// grid 변수 안에 4행 2열 세팅하고 setLayout() 메소드에 참조변수로 넣어 만들기
		c.setLayout(grid);
		
		// JLabel() -> 레이블 생성 메소드
		c.add(new JLabel(" 이름"));
		// JTextField() -> 텍스트 입력 메소드
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("과목"));
		c.add(new JTextField(""));
		c.add(new JButton("입력"));
		c.add(new JButton("취소"));
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		// 객체 생성
		new Exam_GridLayout();
	}
}