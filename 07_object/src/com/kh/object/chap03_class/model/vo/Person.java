package com.kh.object.chap03_class.model.vo;

public class Person {
	
	
	// ---- �ʵ�(�������) ----
	private String name;
	private int age;
	private char gender;
	private String address;
	private double height;
	
	
	// ---- �޼ҵ�(��� �޼ҵ�) ----
	
	// getter / setter 
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getage() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	
	public void walk() {
		System.out.println(name + "�� ���������� ��.");
	}
	
	//��ü�� ������ �ִ� ��� �ʵ��� ������ ��ȯ�ϴ� �޼ҵ�
	public String selectinformation() {
		String str = name + "/" + age + "/" + gender + "/" + address + "/" + height;
		
			return str;
	}
	
	
	
	
	
	
	
	
}
