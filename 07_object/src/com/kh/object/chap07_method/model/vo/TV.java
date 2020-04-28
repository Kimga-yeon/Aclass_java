package com.kh.object.chap07_method.model.vo;

public class TV {
	private String screen;
	private boolean power;
	public static int voltage;
	// static 붙이면 같은 값 모두적용
	
	// 기본 생성자
	public TV() {}
	
	// 매개변수 있는 생성자
	public TV(String screen, boolean power , int voltage) {
		this.screen = screen;
		this.power = power;
		this.voltage = voltage;
	}

	// getter / setter
	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	
	public static void test() {
		System.out.println("test() 메소드는 static메소드 입니다. ");
	}
	
	
	
	
	
	
}
