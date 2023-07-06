package com.kh.day08.oop.interfacepkg.zoo;

public class Bear extends Animal implements FoodInterface {
	
	public String animalFood() {
		return "salmon";
	}

	@Override
	public String animalSound() {
		// TODO Auto-generated method stub
		return null;
	}
}
