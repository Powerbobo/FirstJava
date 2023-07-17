package com.kh.day16.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_Audio extends JFrame {

	String[] names = { "play", "stop", "play again" }; // 배열 생성
	private Clip clip; // 오디오 재생하기 위해서 Clip 인터페이스 생성

	public Exam_Audio() { // 생성자

		setTitle("오디오 제어 예제"); // Frame 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame 종료
		Container c = getContentPane(); // 컨테이너 생성
		c.setLayout(new FlowLayout()); // 컨테이너 레이아웃 생성

		for (int i = 0; i < names.length; i++) {
			JButton btn = new JButton(names[i]);
			btn.addActionListener(new MyActionListener());	// btn 내부클래스에 걸려있는 이벤트 실행
			c.add(btn);
		}

		setSize(300, 200); // Frame 사이즈
		setVisible(true); // Frame 실행
		loadAudio("audio/애국가1절.wav"); // 실행시킬 audio 파일 위치
	}
	
	// JButton 이벤트 내부클래스로 만들기
	private class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch(cmd) {
				case "play" : 
					clip.start();	// 오디오 실행, 중지 이후 누르면 중지했던 시점부터 실행
					break;
				case "stop" : 
					clip.stop();	// 오디오 중지
					break;
				case "play again" : 
					clip.setFramePosition(0);	// setFramePosition(0) -> 처음부터(재시작)
					clip.start();				// 오디오 실행
					break;
			}
		}
	}

	private void loadAudio(String audioPath) {
		try {
			// 클립은 도구, 도구가 Stream 사용
			clip = AudioSystem.getClip(); // getClip() -> checked Exception
			File audioFile = new File(audioPath);
			// getAudioInputStream() 메소드를 통해서 AudioInputStream 생성
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			clip.open(audioStream);
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} // 비어있는 오디오 클립 생성, try-catch 문 사용해야함!
		catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Exam_Audio(); // 객체 생성
	}
}