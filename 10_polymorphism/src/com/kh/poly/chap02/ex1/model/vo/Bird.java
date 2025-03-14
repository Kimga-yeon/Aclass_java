package com.kh.poly.chap02.ex1.model.vo;

public abstract class Bird implements Animal{
	
	public static final int BIRD_LEG = 2;
	private String wingType;
	
	// 기본 생성자
	public Bird() {}
	// 생성자를 가질 수 있으나 해당 생성자로 직접 객체생성은 하지 못함
	// 자식이 super() 생성자를 사용해야 되므로
	
	
	// 날 수 있거나, 없거나 , 날으는 모양이 다르거나 할 수 있다
	//--> 구체적이지 않고 불확실함--> 추상 메소드로 표현
	public abstract String fly();

	
	
	public String flappingWing() {
		return "날개를 파닥거림";
	}
	
	
	
	// get/setter
	
	public String getWingType() {
		return wingType;
	}


	public void setWingType(String wingType) {
		this.wingType = wingType;
	} 
	
	
	
}
