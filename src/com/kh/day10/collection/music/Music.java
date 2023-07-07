package com.kh.day10.collection.music;

public class Music {
	// 필드
	private String singer;
	private String title;
	
	// 생성자
	public Music() {}
	public Music(String singer, String title) {
		this.singer = singer;
		this.title = title;
	}
	
	// getter 메소드
	public String getSinger() {
		return this.singer;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	// setter 메소드
	public void setSigner() {
		this.singer = singer;
	}
	
	public void setTitle() {
		this.title = title;
	}
	
	@Override
	public String toString() {
		
		return "Music [title = " + title + ", singer = " + singer + "]";
	}
	
}
