package com.kh.day13.swing.basic;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// JFrame 상속
public class Exam_FlowLayout extends JFrame {
	
	// 생성자
	public Exam_FlowLayout() {
		setTitle("FlowLayout Sample"); // 프레임 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x 눌렀을때 실제로 종료시키는 코드
		
		// Container 클래스 임포트
		Container c = getContentPane();
		// 수평간격(hGap)이 30, 수직간격(vGap)이 40픽셀로하고 LEFT로 정렬배치
		// 내가 정한 규칙대로 변화하게 하는 방법
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		// FlowLayout() 임포트 -> 레이아웃 만들기
		// FlowLatout 은 창 크기를 줄이면 버튼들이 모이고, 늘리면 퍼진다(변화한다)
//		c.setLayout(new FlowLayout());
		// new JButton() -> 버튼 생성하는 메소드
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("multi"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculates"));
		
		setSize(300,200); // 프레임 사이즈
		setVisible(true);
	}

	public static void main(String[] args) {
		
		// 프레임 -> JFrame 상속받고, 객체 생성하고, 생성자에서 setVisible(true); 를 작성해야 프레임이 실행된다.
		// 객체 생성
		new Exam_FlowLayout();
	}
}
