package com.kh.inherit.practice.model.vo;

public class Point {
	
	//필드 
	private int x;
	private int y;
	
	//생성자(메소드)
	//기본생성자
	public Point() {}
	//매개변수 생성자
	public Point(int x,int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	// get /set
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return x + "," + y;
	}
	
	
	
	
}
