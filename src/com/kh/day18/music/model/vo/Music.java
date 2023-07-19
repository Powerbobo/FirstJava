package com.kh.day18.music.model.vo;

public class Music {
	// 멤버 변수
	private String title;
	private String singer;
	
	// 생성자는 먼저 만들지 않음. 기본 생성자는 안보이지만 default 상태
	// 매개변수 생성자가 필요할때 기본 생성자와 함께 만들면 됨	
	
	//생성자
	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}


	// getter / setter 메소드
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	// 데이터 확인 용도
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
}
