package com.kh.day07.oop.polymorphism.instnceof;

public class Exam_InstanceOf {
	
	// 전부 Person 을 상속받기 때문에 Person 을 매개변수로 받을 수 있다.
	// person new Person();
	// person = new Student();
	// person = new Researcher();
	// person = new StudentWorker();
	// person = new Professor();
	static void print(Person person) {
		if(person instanceof Student) {
			System.out.println("Student입니다!");
		}
		if(person instanceof Researcher) {
			System.out.println("Researcher입니다!");
		}
		if(person instanceof StudentWorker) {
			System.out.println("StudentWorker입니다!");
		}
		if(person instanceof Professor) {
			System.out.println("Professor입니다!");
		}
		
	}
	// main에서 메소드를 바로 쓰려면 static이 필요하다.
//	static void print(Student student) {
//		System.out.println("Student입니다!");
//	}
//	static void print(Researcher resesarcher) {
//		System.out.println("Researcher입니다.");
//	}
//	static void print(StudentWorker studentWorker) {
//		System.out.println("StudentWorker입니다.");
//	}
//	static void print(Professor professor) {
//		System.out.println("Professor입니다.");
//	}
	
	public static void main(String[] args) {
		Student student = new Student();
		print(student);
		Researcher researcher = new Researcher();
		print(researcher);
		// StudentWorker는  Student에 상속받고있기때문에 Student도 함께 출력됨
		StudentWorker studentWorker = new StudentWorker();
		print(studentWorker);
		// Professor는 Researcher에 상속받고있기때문에 Researcher도 함께 출력됨
		Professor professor = new Professor();
		print(professor);
	}
}
