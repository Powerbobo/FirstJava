package com.kh.day10.collection.music;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicRun {
//	static List<MusicFunction> mFunc = new ArrayList<MusicFunction>();
	public static void main(String[] args) {
		MusicFunction mFunc = new MusicFunction();
		end :
		while(true) {
			int value = mFunc.mainMenu();
			switch(value) {
				case 1 : 
					mFunc.inputMusicInfo();
					break;
				case 2 : 
					mFunc.inputMusicAtFirst();
					break;
				case 3 : 
					mFunc.printAllMusics();
					break;
				case 4 : 
					mFunc.printOneByTitle();
					break;
				case 5 : 
					mFunc.removeMusic();
					break;
				case 6 : 
					mFunc.modifyMusicInfo();
					break;
				case 7 : 
					mFunc.ascendingSortTitle();
					break;
				case 8 : 
					mFunc.descendingSortTitle();
					break;
				case 9 : 
					mFunc.ascendingSortSinger();
					break;
				case 10 : 
					mFunc.descendingSortSinger();
					break;
				case 0 : 
					mFunc.over();
					break end;
				default : 
					mFunc.defaultValue();
					break;
			}
		}
	}
}
