package com.kh.bankmvc.model.vo;

public class Bank {
	// ===========================> 멤버변수
	// 
	private String name;
	private String company;
	private String position;
	private String phone;
	private String address;
	private long money;
	
	// 기본 생성자	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 매개변수 생성자
	public Bank(String name, String company, String position, String phone, String address, long money) {
		super();
		this.name = name;
		this.company = company;
		this.position = position;
		this.phone = phone;
		this.address = address;
		this.money = money;
	}
	
	// getter / setter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}
}
