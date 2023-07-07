package com.kh.day10.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListRun {
	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		
		for(int i = 0; i < sList.size(); i++) {
			//toString() 오버라이딩하면 Student 가 담고있는 정보 출력 가능함.
			System.out.println(sList.get(i).toString());
		}
	}

	public void sListExample() {
		
			// 두 코드가 동일한 내용이지만, 보통 프로젝트할 때 List를 받아서 사용하기때문에
			// 첫 번째 코드를 사용
			List<String> strList = new ArrayList<String>(); // 업캐스팅
//			ArrayList<String> aList = new ArrayList<String>();
			
			strList.add("딸기");
			strList.add("복숭아");
			strList.add("바나나");
			strList.add("포도");
			
			System.out.println("첫번째 : " + strList.get(0));
			for(int i = 0; i < strList.size(); i++) {
				System.out.println((i+1) + "번째 값 : " + strList.get(i));
			}
			
			System.out.println("===========================");
			strList.add(2, "체리");
			for(int i = 0; i < strList.size(); i++) {
				System.out.println((i+1) + "번째 값 : " + strList.get(i));
			}
			
			System.out.println("===========================");
			strList.add(2, "파인애플");
			for(int i = 0; i < strList.size(); i++) {
				System.out.println((i+1) + "번째 값 : " + strList.get(i));
			}
			
			strList.remove(2);
			System.out.println("===========================");
			for(int i = 0; i < strList.size(); i++) {
				System.out.println((i+1) + "번째 값 : " + strList.get(i));
			}
	}

	public void genericExample() {
		RList<Integer> list = new RList<Integer>();
		list.add(10);
		list.add(26);
		list.add(923);
		
		int num = list.get(0);
		
		System.out.println("num : " + num);
	}
	
	public void objectExample() {
		ObjectList objList = new ObjectList();
		objList.add(10);
		objList.add("월");
		objList.add('A');
		
		// Object 자리에 int, String, Char 등으로 고정시켜버리면 해당 데이터타입밖에 못 받기때문에
		// Object 사용함!
		// Object = 어떤 데이터타입이든 전부 받을 수 있는 객체
		Object obj = objList.get(0); // 업캐스팅
		
//		int num = obj;
		// Type mismatch: cannot convert from Object to int
		// => 부모의 데이터타입은 Object인데, 자식의 데이터타입은 int 라서 오류 발생
		// => 다운캐스팅으로 강제 형변환을 진행해준다.
		
		int num = (int)obj;
		
		Object obj2 = objList.get(1);
//		String str = obj2;
		// Type mismatch: cannot convert from Object to int
		// => 부모의 데이터타입은 Object인데, 자식의 데이터타입은 String 라서 오류 발생
		// => 다운캐스팅으로 강제 형변환을 진행해준다.
		
		String str = (String)obj2;
		
//		char cOne = objList.get(2);
		// Type mismatch: cannot convert from Object to char
		// => 부모의 데이터타입은 Object인데, 자식의 데이터타입은 char 라서 오류 발생
		// => 다운캐스팅으로 강제 형변환을 진행해준다.
		
		char cOne = (char)objList.get(2);
		
		// Object 객체는 모든 데이터타입을 받을 수 있지만, 테이터 타입 미스매치로 강제 형변환을
		// 해서 사용해야 하는 경우가 많다!
	}

	public void intExample() {
//		int [] nums = new int[3];
		IntList nums = new IntList();
//		nums[0] = 1;
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		// 메소드를 Run 파일에서 추가하고, IntList에서 저장!
//		int result1 = nums[0];
		int result1 = nums.get(0);
		System.out.println("result1 : " + result1);
		
//		int size = nums.lenght;
		int size = nums.size();
		System.out.println("size : " + size);
		
		// 기존에 배열을 선언한는 방식
//		nums = {}; nums = new int[3];
		// clear() 메소드를 만들고, IntList 클래스에서 해당 메소드를
		// 만들어준다.
		nums.clear();
	}
	
}
