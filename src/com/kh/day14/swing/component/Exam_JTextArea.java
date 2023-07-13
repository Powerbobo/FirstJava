package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exam_JTextArea extends JFrame{
	
	private JLabel textLable;	// 필드에 private 로 라벨 객체 선언
	private JTextField fieldLabel;
	private JTextArea areaLabel;
	private JScrollPane scrollPane;	// 스크롤팬 필드 추가
	
	public Exam_JTextArea() {
		
		// JTextArea -> 여러줄을 쓰는데 사용된다.
		
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c =  getContentPane();
		c.setLayout(new FlowLayout());
		
		textLable = new JLabel("입력 후 <Enter> 키를 입력하세요."); // 라벨 객체 초기화
		fieldLabel = new JTextField(20);
		areaLabel = new JTextArea(7, 20);
		scrollPane = new JScrollPane(areaLabel);	// 텍스트 영역 객체 전달하면서
													// 스크롤팬 객체 생성
		c.add(textLable);
		c.add(fieldLabel);
		c.add(scrollPane);
		
		fieldLabel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField jt = (JTextField)e.getSource();	// 입력한 값 가져와서
				areaLabel.append(jt.getText() + "\n");		// 입력한 값 원하는 곳에 추가하고
				jt.setText("");								// 입력한 값 지우기
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Exam_JTextArea();
	}
}