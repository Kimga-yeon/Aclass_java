package com.kh.inherit.practice.model.service;

import com.kh.inherit.practice.model.vo.Rectangle;

public class RectangleService {
	private Rectangle  r = new Rectangle();
	
	public String calcArea(int x, int y, int height,int width) {
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
	
	double area = height * width;
	
	return "≥–¿Ã : " + r + area ;
	}
	
	
	public String calcCircum(int x, int y, int height,int width) {
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
	
	double dul = (height*2) + (width*2);
	
	return "µ—∑π : " + r + dul ;
	}
}