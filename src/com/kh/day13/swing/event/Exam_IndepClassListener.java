package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_IndepClassListener extends JFrame{
	
	public Exam_IndepClassListener() {
		setTitle("Action 이벤트 리스터 예제"); // 프레임 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 실제 종료시키는 코드
		
		// Container 클래스 임포트
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		// 버튼 생성
		JButton btn = new JButton("Action");
		// addActionListener -> 이벤트 명령어
		// addActionListener(null) -> null 위치에동작할 코드를 담은 클래스를 넣어줘야 함.
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150); // 프레임 사이즈 설정
		setVisible(true); // 프레임 실행
	}
	// 메인 메소드
	public static void main(String[] args) {
		
		// 객체 생성
		new Exam_IndepClassListener();
	}
}
// 외부 클래스
// 메인클래스 안에, main 메소드 위에 class 를 생성하면 이너클래스(내부클래스)로 클래스를 만들 수 있다.
// private 으로 설정해서 아예 안보이게 만들 수 있다.
// 인터페이스 -> 기본적으로 추상메소드로만 이루어져있고, 
// 상속을 했을 때 해당 메소드를 오버라이딩 해야함.
// implements -> 인터페이스 상속하는 메소드
class MyActionListener implements ActionListener{
	// actionPerformed -> 오버라이드 (재정의)
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// JButton 으로 형변환
		// e는 this. 와 같은 역할을 함
		// 버튼이 Action 일때 버튼이 눌리면 액션으로 변경되고, 
		// Action 이 아닐 경우 Action 으로 변경하는 이벤트를 생성함
		// => 버튼을 누를때마다 Action 과 액션 이 번갈아가면서 변경됨.
		JButton btn = (JButton)e.getSource();
		if(btn.getText().equals("Action")) {
			btn.setText("액션");
		} else {
			btn.setText("Action");
		}
	}
}