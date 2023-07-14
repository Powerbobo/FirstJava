package com.kh.day15.swing.component;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam_JMenuBar extends JFrame{
	
	public Exam_JMenuBar() {	// 생성자
		setTitle("메뉴 만들기 예시"); //	Frame 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Frame 종료
		
		createMenu();
		
		setSize(250,200);	// Frame 사이즈
		setVisible(true);	// Frame 실행
	}
	
	private void createMenu() {
		JMenuBar bar = new JMenuBar();			// 메뉴바 객체 생성
		JMenu screenMenu = new JMenu("screnn");	// 메뉴 (screen) 생성
		
		screenMenu.add(new JMenuItem("Load"));	// 메뉴 아이템
		screenMenu.add(new JMenuItem("Hid"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.add(new JMenuItem("Exit"));
		
		bar.add(screenMenu);
		bar.add(new JMenu("Edit"));		// 메뉴 (Edit) 생성
		bar.add(new JMenu("Source"));	// 메뉴 (Source) 생성
		bar.add(new JMenu("Project"));	// 메뉴 (Project) 생성
		bar.add(new JMenu("Run"));		// 메뉴 (Run) 생성
		
		setJMenuBar(bar);	// Frame에 추가
	}
	
	public static void main(String[] args) {
		new Exam_JMenuBar();
	}
}