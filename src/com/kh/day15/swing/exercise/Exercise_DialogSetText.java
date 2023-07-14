package com.kh.day15.swing.exercise;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 다이얼로그 띄울 메소드
class MyModalDialog extends JDialog {
	
	// 필드에 전역변수 선언
	private JTextField field;
	private JButton btn;
	
	// 생성자
	public MyModalDialog() {}
	public MyModalDialog(JFrame frame, String title, JButton jBtn) {
		super(frame, title);
		setLayout(new FlowLayout());
		field = new JTextField(10);
		add(field);
//		JButton btn = new JButton("OK");
		btn = new JButton("OK");
		btn.addActionListener(new ActionListener() {	// OK 버튼 눌렀을 때
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);						// OK 버튼 누르면 사라짐
				if(field.getText().length() == 0) return;	// 아무것도 입력하지 않았으면 입력하지 변경x
				else jBtn.setText(field.getText());			// jBtn 이 실행되면 텍스트 필드의 텍스트 변경
				field.setText("");	// 다이얼로그 호출될 대 필드를 비워줌
			}
		});
		add(btn);
		setSize(200, 100);
	}
	
	// new JTextField(10) 에 있는 값을 가져오기 위한 메소드
	public String getInput() {
		// 여기서 field 를 사용하기 위해서 JTextField field 를 전역변수로 선언
		if(field.getText().length() == 0) return null;
		else return field.getText();
	}
}

public class Exercise_DialogSetText extends JFrame{
	
	private MyModalDialog dialog;	// 다이얼로그 클래스 사용하기 위해서 선언
	
	// 다이얼로그 메소드
	public Exercise_DialogSetText() {
		super("다이얼로그 텍스트 셋팅 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Modal Dialog");
		btn.setSize(200, 50);
		btn.setLocation(20, 50);
		dialog = new MyModalDialog(this, "Show Modal Dialog", btn);
		
//		dialog.setVisible(true);	// 실행하자마자 다이얼로그가 뜸
		btn.addActionListener(new ActionListener() {	// 버튼 누르면 다이얼로그 실행
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
				String text = dialog.getInput();
				if(text == null) return;
				JButton btn = (JButton)e.getSource();
				btn.setText(text);	// 다이얼로그에 입력한 값을 버튼에 세팅
			}
		});
		
		Container c = getContentPane();
//		c.add(btn, BorderLayout.NORTH);
		c.setLayout(null);
		c.add(btn);
		
		setSize(250, 200);
		setVisible(true);
	}

	
	
	
	public static void main(String[] args) {
		new Exercise_DialogSetText();
	}

}
