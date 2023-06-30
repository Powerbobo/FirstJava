package com.kh.day05.oop;

class StaticSample {
	public int num;
	
	public static int input;
	
	public void sampleMethod() {
		
	}
	
	public void goodMethod() {
		
	}
	
	public static void originMethod() {
		input = 1225;
	}
}

public class Exam_Static {
	public static void main(String [] args)
	{
		// static을 사용하면
		// 객체 생성하지 않아도 바로 사용할 수 있음
		StaticSample.input = 10;
		StaticSample.originMethod();
		System.out.println(StaticSample.input);
		StaticSample sample = new StaticSample();
		sample.num = 26;
//		return;
	}
}
