package com.kh.day16.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exam_OptionPane extends JFrame{
	public Exam_OptionPane() {	// 생성자
		
		setTitle("옵션 팬 예제");	// Frame 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Frame 종료
		Container c = getContentPane();	// Container 생성
		c.setLayout(new FlowLayout());	// Layout 생성
		c.add(new MyPane(), BorderLayout.NORTH);	// MyPane 클래스에서 생성한 컨테이너 붙이기
		
		setSize(500,200);	// Frame 사이즈
		setVisible(true);	// Frame 실행
	}
	
	// 내부 클래스(이너 클래스)
	private class MyPane extends Panel { // panel 클래스 상속 (ContentPane 안에 ContentPane 을 만들 수 있음)
		// 멤버 변수(필드)
		private JButton inputBtn;
		private JButton confirmBtn;
		private JButton msgBtn;
		private JTextField tf;
		// 생성자
		public MyPane() {
			setBackground(Color.LIGHT_GRAY);		// 배경색 설정
			inputBtn = new JButton("input Name");	// 버튼 생성
			confirmBtn = new JButton("Confirm");	// 버튼 생성
			msgBtn = new JButton("Message");		// 버튼 생성
			tf = new JTextField(10);				// 텍스트 필드 생성
			
			// 익명 클래스
			inputBtn.addActionListener(new ActionListener() {	// JS prompt와 동일
				@Override
				public void actionPerformed(ActionEvent e) {
					String name =	// 입력한 값 저장하는 변수
					JOptionPane.showInputDialog("이름을 입력하세요");	// Alert 창 띄우는 메소드
					if(name != null) {	
						tf.setText(name);	// 텍스트 필드에 입력값 추가
					}
				}
			});	// inputBtn 버튼 누르면 동작하는 이벤트
			
			confirmBtn.addActionListener(new ActionListener() {	// JS prompt와 동일
				@Override
				public void actionPerformed(ActionEvent e) {
					int choice =	// Yes/NO 중 누른 값 변수에 저장
					// 첫번째 -> 부모관계있는지?, 두번째 -> Alert 창 메세지, 
					// 세번째 -> Alert 창 타이틀, 네번째 -> Alert 창 종류
					JOptionPane.showConfirmDialog(null, "계속할 것입니까?", "confirm", JOptionPane.YES_NO_OPTION);
//					if(choice == JOptionPane.CLOSED_OPTION) // X 표시 누를 경우
					if(choice == JOptionPane.YES_OPTION) {			// 어떤 옵션 눌렀는지
						tf.setText("YES");
					} else if(choice == JOptionPane.NO_OPTION) {	// 어떤 옵션 눌렀는지
						tf.setText("NO");
					}
				}
			});	// confirmBtn 버튼 누르면 동작하는 이벤트
			
			msgBtn.addActionListener(new ActionListener() {	// JS prompt와 동일
				@Override
				public void actionPerformed(ActionEvent e) {
					// 첫번째 -> 부모관계있는지?, 두번째 -> Alert 창 메세지, 
					// 세번째 -> Alert 창 타이틀, 네번째 -> Alert 창 종류
					JOptionPane.showMessageDialog(null, "조심하세요", "message", JOptionPane.ERROR_MESSAGE);
				}
			});	// msgBtn 버튼 누르면 동작하는 이벤트
			
			add(inputBtn);		// 버튼 실행
			add(confirmBtn);	// 버튼 실행
			add(msgBtn);		// 버튼 실행
			add(tf);			// 텍스트 필드 실행
		}
	}
	
	public static void main(String[] args) {
		new Exam_OptionPane(); // 객체 생성
	}
}