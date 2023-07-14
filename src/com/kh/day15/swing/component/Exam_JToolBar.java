package com.kh.day15.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Exam_JToolBar extends JFrame{
	
	private Container contentPane;	// 컨텐츠팬 생성
	
	public Exam_JToolBar() {			// 생성자
		setTitle("툴바 만들기 예제");	//	Frame 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Frame 종료
		
		contentPane = getContentPane();
		createToolBar();
		
		setSize(400,200);	// Frame 사이즈
		setVisible(true);	// Frame 실행
	}
	// 툴바 메소드
	public void createToolBar() {
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.LIGHT_GRAY);	// 툴바 배경색 바꾸기
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("파일을 생성합니다.");
		toolBar.add(newBtn);
		JButton openBtn = new JButton(new ImageIcon("images/open.jpg"));
		openBtn.setToolTipText("파일을 엽니다.");
		toolBar.add(openBtn);
		toolBar.addSeparator();	// 공간 만들기
		JButton saveBtn = new JButton(new ImageIcon("images/save.jpg"));
		toolBar.add(saveBtn);
		saveBtn.setToolTipText("파일을 저장합니다.");
		
		contentPane.add(toolBar, BorderLayout.NORTH);	// BorderLayout으로 위쪽으로 위치 고정시키기
	}
	
	public static void main(String[] args) {
		new Exam_JToolBar();	// 객체 생성
	}
}
