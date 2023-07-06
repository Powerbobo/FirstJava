package com.kh.day08.oop.interfacepkg.muisc;

public class Stage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Musition musition = new Musition();
		musition.play(new Drum());
		musition.play(new Guitar());
		musition.play(new Piano());
	}

}
