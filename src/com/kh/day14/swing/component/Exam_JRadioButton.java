package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Exam_JRadioButton extends JFrame{
	
	public Exam_JRadioButton() {
		setTitle("JRadioButton 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c =  getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherry = new ImageIcon("images/selectedCherry.jpg");
		
		JRadioButton apple = new JRadioButton("사과", true); // , true -> 선택이 되어있는 상태로 만들어짐
		JRadioButton pear = new JRadioButton("배");
		JRadioButton cherry = new JRadioButton("체리", cherryIcon); // 체리의 라디오 버튼을 이미지로 변경
		cherry.setBorderPainted(true); // 음각/양각 적용
		cherry.setSelectedIcon(selectedCherry); // 체리 선택되면 selectedCherry 이미지로 변경
		
		// 라디오 버튼은 그룹으로 묶어주지 않으면 1개만 선택되지 않음.
		// 라디오 버튼이 1가지만 선택되도록 해주는 버튼 그룹,
		// input[type = radio] 태그의 name을 맞춰주는것과 같음.
		ButtonGroup g = new ButtonGroup(); // 그룹 만들기
		g.add(apple);
		g.add(pear);
		g.add(cherry); // -> 1개만 선택 됨.
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Exam_JRadioButton();
	}
}
