package com.kh.day08.oop.interfacepkg.muisc;

public class Musition {
	
	public void play(Instrument instrument) {
		instrument.playInstrument();
	}
	
//  뮤지션이 악기 소리를 내기 위해서 아래 메소드를 전부 입력해야 하나, 
//  인터페이스를 사용하면 코드를 줄일 수 있다.
//	public void play(Drum drum) {
//		drum.playInstrument();
//	}
//	
//	public void play(Guitar guitar) {
//		guitar.playInstrument();
//	}
//	
//	public void play(Piano piano) {
//		piano.playInstrument();
//	}
}
