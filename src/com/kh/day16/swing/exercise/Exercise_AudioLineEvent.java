package com.kh.day16.swing.exercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_AudioLineEvent extends JFrame {

	private Clip clip; // 오디오 재생하기 위해서 Clip 인터페이스 생성
	private JLabel label;

	public Exercise_AudioLineEvent() { // 생성자
		
		label = new JLabel("애국가 1절");			// 라벨 초기화
		setTitle("오디오 제어 예제");	// Frame 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame 종료
		Container c = getContentPane(); // 컨테이너 생성
		c.setLayout(new FlowLayout()); // 컨테이너 레이아웃 생성
		c.setBackground(Color.YELLOW);
		c.add(label);

		setSize(300, 200); // Frame 사이즈
		setVisible(true); // Frame 실행
		loadAudio("audio/애국가1절.wav"); // loadAudio() -> 오디오 실행 메소드, 실행시킬 audio 파일 위치
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
			AudioInputStream audioStream
			= AudioSystem.getAudioInputStream(audioFile);	// 오디오 스트림 생성
			clip.open(audioStream);		// 오디오 스트림을 이용하여 오디오 클립
			clip.addLineListener(new LineListener() {		// 오디오 끝났을 때 이벤트
				@Override
				public void update(LineEvent event) {
					if(event.getType() == LineEvent.Type.STOP) {	// 노래가 멈추면
						getContentPane().setBackground(Color.ORANGE);	// 배경색 변경
						label.setText("연주 끝");						// 텍스트 변경
					}
					try {
						audioStream.close();	// 스트림 닫기, 자원해제
					} catch (IOException e) {
						e.printStackTrace();
					}	
				}
			});	// 노래가 끝날 때 동작
			clip.start();	// 프로그램 시작하자마자 노래 시작
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
		new Exercise_AudioLineEvent(); // 객체 생성
	}
}