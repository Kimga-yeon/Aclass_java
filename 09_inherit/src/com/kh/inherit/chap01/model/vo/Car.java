package com.kh.inherit.chap01.model.vo;

public class Car extends Product{
	private String engine;
	private String color;
	private String carType;
	
	// �⺻ ������
	public Car() {}
	
	// �Ű����� �ִ� ������
	public Car(String engine, String color, String carType,String pName, int price) {
		//super(); // �θ� �⺻ ������
		super(pName, price); // �θ��� �Ű����� �ִ� ������
		
		this.engine = engine;
		this.color = color;
		this.carType = carType;
		
	}

	
	// get / setter
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	// ��� �ʵ� ���� ��ȯ
	public String selectField() {
		return engine +" / "+ color +" / "+ carType + "/ " + super.selectField(); 
														//--> pName + "/ " + Price
	// super ���� ����
	// - �ڽ� ��ü ���� �θ� ���� �κ��� �����ϴ� ����
	// - �θ��� �ʵ�� �޼ҵ忡 �����ؾ� �� �� ���.
	
	}
	
	
}
