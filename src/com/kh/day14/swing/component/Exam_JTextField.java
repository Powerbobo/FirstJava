package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exam_JTextField extends JFrame{
	
	public Exam_JTextField() {
		setTitle("텍스트 필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c =  getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField text = new JTextField(20); // JTextField 객체 생성
		text.setEditable(true); 	// false -> 입력변경 불가 / true -> 변경 가능
		text.setText("Hello");		// 텍스트 입력
		text.setFont(new Font("궁서체", Font.ITALIC, 20));	// 폰트 변경
		c.add(new JLabel("이름"));	// 이름 라벨 생성
		c.add(new JTextField(20));	// 텍스트 필드 생성
		c.add(new JLabel("학과"));	// 학과 라벨 생성
		c.add(new JTextField("컴퓨터 공학과", 20)); // 텍스트 필드 생성
		c.add(new JLabel("주소")); // 주소 라벨 생성
		c.add(new JTextField("서울시 ...", 20)); // 텍스트 필드 생성
		
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Exam_JTextField();
	}
}