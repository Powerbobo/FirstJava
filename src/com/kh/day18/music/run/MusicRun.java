package com.kh.day18.music.run;

import com.kh.day18.music.view.MusicView;

public class MusicRun {
	
	public static void main(String[] args) {
		// MusicView 에 실행 메소드를 몰아넣었기 때문에
		// MusicView 프로그램하고만 연결하면 됨! 
		MusicView view = new MusicView();
		view.startProgram();
	}
}
