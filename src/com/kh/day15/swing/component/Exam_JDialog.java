package com.kh.day15.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 외부클래스 -> 다이얼로그 클래스 따로 만들기
// 메인 클래스에서 실행하면 다이얼로그 띄우기
class MyDialog extends JDialog {
	
	private JButton btn;	// 버튼에 액션 걸기 위해서 필드에 선언함.
	
	// 기본 생성자
	public MyDialog() {}
	// 매개변수 생성자
	public MyDialog(JFrame frame, String title) {
		super(frame, title);
		setLayout(new FlowLayout());	// 다이얼로그 레이아웃 생성
		add(new JTextField(10));		// 텍스트 필드 추가
		btn = new JButton("OK");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);	// OK버튼 누르면 닫히게 함
			}
		});
		add(btn);						// 버튼 추가
		setSize(200, 100);				// 다이얼로그 크기 셋팅 => 완료
		
	}
}

public class Exam_JDialog extends JFrame{
	
	private MyDialog dialog;	// 생성한 다이얼로그 클래스 사용
	
	public Exam_JDialog() {	// 생성자
//		super("다이얼로그 만들기 예제"); //	Frame 제목
		setTitle("다이얼로그 만들기 예제"); //	Frame 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Frame 종료
		
		JButton btn = new JButton("show Dialog");	// 버튼 생성(누르면 다이얼로그 보임)
		dialog = new MyDialog(this, "Test Dialog");	// 다이얼로그 생성(this -> JFrame 자체, "" -> 타이틀)
		
		btn.addActionListener(new ActionListener() {	// 익명 클래스
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true); // 이미 생성된 다이얼로그 보이게 해줌
			}
		});
		
		Container c = getContentPane();				// 컨텐츠팬 생성
		c.add(btn);									// 컨텐츠팬에 버튼 추가
		
		setSize(250,200);	// Frame 사이즈
		setVisible(true);	// Frame 실행
	}
	
	public static void main(String[] args) {
		new Exam_JDialog();	// 객체 생성
	}
}
