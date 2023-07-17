package com.kh.day16.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Exam_JColorChooser extends JFrame{
	
	private JLabel label;
	
	public Exam_JColorChooser() {	// 생성자
		
		label = new JLabel("Hello");	// 레이블 초기화
		setTitle("JColorChoose 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie", Font.ITALIC, 30));	// 라벨 폰트 설정
		c.add(label, BorderLayout.CENTER);	// 컨테이너에 라벨 추가 및 레이아웃 설정
		createMenu();
		
		setSize(250, 200);
		setVisible(true);
		
	}
	
	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Text");				// Text
		JMenuItem item = new JMenuItem("Color");	// ㄴ Color
		
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// JColorChooser 에서 사용해야하는 타입이 Color
				Color chosenColor = 	// 선택된 색깔은 Color Type 으로 리턴됨
				// 첫번째 -> 부모/자식 관계 있는지, 두번째 -> 타이틀, 세번째 -> 컬러 설정 
				JColorChooser.showDialog(null, "ColorPicker", Color.YELLOW);
				if(chosenColor != null) {
					label.setForeground(chosenColor);	// 선택한 색으로 글씨색 설정
				}
			}
		});	// item(Color) 선택 시 발생하는 이벤트
		
		menu.add(item);			// 메뉴아이템을 메뉴에 추가
		menuBar.add(menu);		// 메뉴바에 메뉴 추가
		setJMenuBar(menuBar);	// 메뉴바 컨테이너에 추가
	}
	
	public static void main(String[] args) {
		new Exam_JColorChooser();	// 객체 생성
	}
}