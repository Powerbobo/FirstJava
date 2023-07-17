package com.kh.day16.swing.component;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Exam_JFileChooser extends JFrame{
	private JLabel imgLabel;		// 멤버 변수
	
	public Exam_JFileChooser() {	// 생성자
		imgLabel = new JLabel();
		setTitle("메뉴와 파일Chooser 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(imgLabel);	// 이미지를 표시하는 JLabel 추가
		createMenu();
		
		setSize(350, 200);
		setVisible(true);
		
	}
	
	// 내부 클래스(이너 클래스) - JFileChooser
	private void createMenu() {
		JMenuBar bar = new JMenuBar();		// 메뉴바 객체 생성
		JMenu menu = new JMenu("File");			// 메뉴 객체 생성
		JMenuItem item = new JMenuItem("OPen");	// 메뉴 아이템 객체 생성
		
		// File
		// -> OPen
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();	// JFileChooser 객체 생성
				int chosen = 
				chooser.showOpenDialog(null);	// 파일 선택창을 띄움
				// FilseChooser 동작시 비정상적인 선택
				if(chosen != JFileChooser.APPROVE_OPTION) {
					// 메세지 출력, 파일 선택 안했는데요?
					JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다."
							, "경고", JOptionPane.WARNING_MESSAGE);
					return;	// 밑에 있는 코드를 실행하면 NullPointerException 발생하기 때문에 종료해줌.
				}
				
				String filePath = chooser.getSelectedFile().getPath();	// 경로에 해당하는 파일 표시
				imgLabel.setIcon(new ImageIcon(filePath));	// JLabel에 Image 표시하기
			}
		});	// Open이 클릭되었을 때 동작
		menu.add(item);
		bar.add(menu);
		setJMenuBar(bar);	// 메뉴바 생성
	}
	
	public static void main(String[] args) {
		new Exam_JFileChooser();	// 객체 생성
	}
}