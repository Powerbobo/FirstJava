package com.kh.day14.swing.component.exercise;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_ComboActionEvent extends JFrame{
	
	private String [] fruits = {"apple", "banana", "kiwi", "mango"};
	private ImageIcon [] images = {
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/kiwi.jpg"),
			new ImageIcon("images/mango.jpg")
	};
	private JLabel imgLabel;
	private JComboBox<String> strCombo;
	
	public Exercise_ComboActionEvent() {
		setTitle("JComboBox 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c =  getContentPane();
		c.setLayout(new FlowLayout());
		
		imgLabel = new JLabel(images[0]);			// 첫 이미지 세팅
		strCombo = new JComboBox<String>(fruits);	// 문자열 배열 콤보박스 세팅
		c.add(strCombo);	// 콘텐트팬에 추가
		c.add(imgLabel);	// 콘텐트팬에 추가
		strCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> strCb = (JComboBox<String>)e.getSource();	// e.getSource()는 이벤트가 발생한 콤포넌트를 가져옴(this 와 비슷)
				int index = strCb.getSelectedIndex(); // 선택된 아이템의 index값을 구해오는 메소드인데, DOM에도 있음
				imgLabel.setIcon(images[index]);
			}
		});
		
		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Exercise_ComboActionEvent();
	}
}
