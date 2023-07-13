package com.kh.day14.swing.component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_JComponent extends JFrame {

	// 생성자
	public Exam_JComponent() {
//		setTitle("JComponent의 공통 메소드 예제");
		super("JComponent의 공통 메소드 예제"); // setTitle 의 역할과 동일함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame 종료
		
		Container c = getContentPane(); // 컨테이너 생성
		c.setLayout(new FlowLayout());  // 레이아웃 생성
		JButton btn1 = new JButton("Magenta/Yellow Button"); // 버튼 생성
		JButton btn2 = new JButton("Disabled Button");
		JButton btn3 = new JButton("getX(), getY()");
		
		btn1.setBackground(Color.YELLOW);	// 배경색 성정
		btn1.setForeground(Color.MAGENTA);	// 글씨색 설정
		btn1.setFont(new Font("Arial", Font.ITALIC, 20)); // 폰트 설정
		btn2.setEnabled(false); // 버튼 사용 불가능(버튼이 안눌림!) -> true 로 변경하면 사용 가능
		// btn3 버튼에 ActionListener 적용 -> 바로 인터페이스 생성
		btn3.addActionListener(new ActionListener() {
			// ActionListener 메소드 오버라이드
			@Override
			public void actionPerformed(ActionEvent e) {
				// JButton 으로 형변환
				// getSource -> 이벤트가 발생한 요소를 가져오는 메소드
				// 여기선 이벤트 발생 영역이 JButton!
				JButton jb = (JButton)e. getSource(); // 이벤트가 발생한 Component(요소)를 나타냄
				// // getTopLevelAncestor() -> 버튼이 가지고 있는 제일 최상위 조상을 가지고 오게끔 하는 메소드
				Exam_JComponent frame = (Exam_JComponent)jb.getTopLevelAncestor();
				frame.setTitle(jb.getX() + ", " + jb.getY());
			}
		});
		
		c.add(btn1); // btn1 버튼 실행
		c.add(btn2); // btn2 버튼 실행
		c.add(btn3); // btn3 버튼 실행 -> 버튼 클릭 시 Title 에 좌표 출력되는 이벤트 발생
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_JComponent(); // 객체 생성
	}
}