package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class Exam_JSlider extends JFrame{
	
	public Exam_JSlider() {
		// 드래그해서 값을 움직이게 하기
		setTitle("JSlider 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c =  getContentPane();
		c.setLayout(new FlowLayout());
		
		// 0 에서 200까지 움직이는데, 시작값은 100
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true);	// 숫자
		slider.setPaintTicks(true);		// 눈금
		slider.setMajorTickSpacing(50);	// 눈금 중간값
		slider.setMinorTickSpacing(10);	// 눈금 최소값
		slider.setPaintTrack(true);		// 기본값이 true이고, false 면 드래그핸들러가 생성안됨
		c.add(slider);
		
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Exam_JSlider();
	}
}
