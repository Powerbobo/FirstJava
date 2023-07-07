package com.kh.day10.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.day10.collection.student.Student;


public class Exam_SetCollection {
	public static void main(String[] args) {
		// Collection의 List, Set, Map -> 저장소의 역할
		// 자료구조의 특성에 따라서 List, Set, Map 선택하여 사용해야 함.
		Set<Student> stdSet = new HashSet<Student>();
		
		stdSet.add(new Student("강동원", 35, 100));
		stdSet.add(new Student("소지섭", 35, 90));
		stdSet.add(new Student("정우성", 35, 70));
		printSize(stdSet);
		stdSet.add(new Student("강동원", 35, 100));
		// Set은 중복을 제거하기때문에 데이터 크기가 그대로 3이어야하는데, 4로 늘어남.
		// 강동원의 데이터가 중복인지 구별할 수가 없어서,
		// 정확히 비교하려면 equals를 오버라이딩해서 비교해줘야 함.
		printSize(stdSet);
		
		Iterator<Student> it = stdSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	
	public static void printSize(Set<Student> set) {
		System.out.println("데이터 크기 : " + set.size());
	}
	
	public void strSetExample() {
		Set<String> strSet = new HashSet<String>();
		
		strSet.add("복숭아");
		strSet.add("딸기");
		strSet.add("체리");
		strSet.add("참외");
		strSet.add("딸기");
		strSet.add("체리");
		
		// stdList.get(0) 0 -> 값 출력 (ArratList는 순서를 가지고 출력)
		Iterator<String> it = strSet.iterator();
		while(it.hasNext()) {
			// 중복 삭제되고 출력됨.
			System.out.println(it.next().toString());
		}
	}
	
}
