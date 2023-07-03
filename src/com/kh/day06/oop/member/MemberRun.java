package com.kh.day06.oop.member;

public class MemberRun {
	public static void main(String [] args) {
		Member [] memArrs = new Member[2];
		finish :
		while(true) {
			int chioce = printMenu();
			switch (chioce) {
			case 1 : 
				inputScore(memArrs);
				break;
			case 2 : 
				printScore(memArrs);
				break;
			case 3 : 
				checkPass(memArrs);
				break;
			case 4 : 
				showGoodBye();
				break finish;
			default : printException();
			}
		}
	}

	private static int printMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void printException() {
		// TODO Auto-generated method stub
		
	}
	
	private static void showGoodBye() {
		// TODO Auto-generated method stub
		
	}

	private static void checkPass(Member[] memArrs) {
		// TODO Auto-generated method stub
		
	}

	private static void printScore(Member[] memArrs) {
		// TODO Auto-generated method stub
		
	}

	private static void inputScore(Member[] memArrs) {
		// TODO Auto-generated method stub
		
	}

	private static void printException(Member [] memArrs) {
		// TODO Auto-generated method stub
		
	}
	
	private static int printMenu(Member [] memArrs) {
		// TODO Auto-generated method stub
		return 0;
	}



}
