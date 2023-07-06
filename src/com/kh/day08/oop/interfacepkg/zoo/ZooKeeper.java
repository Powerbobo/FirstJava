package com.kh.day08.oop.interfacepkg.zoo;

public class ZooKeeper {
	
	// feed는 오버로딩 되어있음.	
	public void feed(FoodInterface predator) {
		// 하나의 메소드로 모든 객체 대응이 가능함!
		// animalFood가 오버라이딩되어있어서 동적바인드에 의해 메소드가 실행됨.
		System.out.println("feed" + predator.animalFood());
	}
	
	// feed는 오버로딩 되어있어서 interface 만들어 메소드 만들어서
	// 메소드를 각각 만들지 않아도 됨!
//	public void feed(Bear bear) {
//		System.out.println("feed" + bear.animalFood());
//	}
//	
//	public void feed(Tiger tiger) {
//		System.out.println("feed" + tiger.animalFood());
//	}
//	
//	public void feed(Lion lion) {
//		System.out.println("feed" + lion.animalFood());
//	}
	
	public static void main(String [] args) {
		ZooKeeper zk = new ZooKeeper();
		zk.feed(new Bear());	
		zk.feed(new Tiger());
		zk.feed(new Lion());
	}
}

