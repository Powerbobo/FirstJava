package com.kh.day18.member.run;

import com.kh.day18.member.view.MemberView;

public class MemberRun {

	public static void main(String[] args) {

		// 실행구조 : run -> view -> controller -> DAO 

		MemberView view = new MemberView();
		view.startMemberProgram();
	}

}