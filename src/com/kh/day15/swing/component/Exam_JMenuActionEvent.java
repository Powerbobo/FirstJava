package com.kh.day15.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam_JMenuActionEvent extends JFrame{
	
	private JLabel imgLabel;	// 이미지 들어갈 라벨 생성
	
	public Exam_JMenuActionEvent() {	// 생성자
		setTitle("메뉴에 리스너 만들기 예제"); //	Frame 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Frame 종료
		createMenu();		// 메뉴 메소드 호출
		Container c = getContentPane();	// 컨텐츠팬
		imgLabel = new JLabel(); 		// 이미지 들어갈 라벨 초기화
		c.setLayout(new BorderLayout());	// BorderLayout 사용, (Top, BOTTOM, LEFT, RIGHT, CENTER)
		c.add(imgLabel, BorderLayout.CENTER);	// 컨텐츠팬에 이미지 들어갈 자리 만들기
		setSize(250,220);	// Frame 사이즈
		setVisible(true);	// Frame 실행
	}
	// 메뉴 만드는 메소드
	private void createMenu() {
		JMenuBar bar = new JMenuBar();	// 메뉴바 (최상위)
		JMenu screenMenu = new JMenu("screen");
		
		String [] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
		for(int i = 0; i < 4; i++) {
			JMenuItem menuItem = new JMenuItem(itemTitle[i]);	// 아이템(메뉴 밑에 들어감)
			// 익명클래스 구현으로 이벤트 핸들러 동작 만들기
			menuItem.addActionListener(new ActionListener() {	// 아이템이 선택되었을 때
				@Override
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand(); // item 이 눌렸을 때 text 를 가져오는 메소드
					switch(cmd) {	// else if 보다 빠른 switch case
						case "Load" :
							if(imgLabel.getIcon() != null) return; // 이미 로딩시 리턴
							imgLabel.setIcon(new ImageIcon("images/img.jpg"));	// setIcon() -> 이미지 추가하는 메소드
							break;
						case "Hide" :
//							imgLabel.setIcon(null);	// setIcon 값을 아예 없애버림
							imgLabel.setVisible(false);
							break;
						case "ReShow" :
							imgLabel.setVisible(true);
							break;
						case "Exit" :
							System.exit(0);	// 프로그램 종료하기
							break;
					}
					
					// if문은 느리기때문에 swtich case 문으로 만들었음
//					if(cmd.equals("Load")) {
//						// 이미지를 로드하면 됨
//					} else if(cmd.equals("Hied")) {
//						// 이미지 숨기고
//					} else if(cmd.equals("Reshow")) {
//						// 이미지 다시 보여주고
//					} else if(cmd.equals("Exit")) {
//						// 프로그램 종료
//					}
				}
			});
			screenMenu.add(menuItem);
		}
		
		bar.add(screenMenu);
		setJMenuBar(bar); // Frame에 추가
	}
	
	public static void main(String[] args) {
		new Exam_JMenuActionEvent();	// 객체 생성
	}
}
