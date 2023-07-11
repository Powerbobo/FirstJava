package com.kh.bankmvc.run;

import java.util.Scanner;

import com.kh.bankmvc.controller.BankController;
import com.kh.bankmvc.model.vo.Bank;
import com.kh.bankmvc.view.BankView;

public class BankRun {
	public static void main(String[] args) {
		// 클래스 객체 생성
		BankView view = new BankView();
		BankController bController = new BankController();
		
		// 전역 변수 선언
		Bank bank = null;
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			choice = view.printMenu();
			switch(choice) {
			case 1 : 
				view.inputMemberInfo();
				view.displaySuccess();
				break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 6 : break;
			case 0 : 
				view.printMessage("프로그램이 종료되었습니다.");
				break;
			default : 
				view.printMessage("잘못 입력하셨습니다. 메뉴를 다시 선택해주세요.");
				break;
			}
		}while(choice != 0);
	}
}
