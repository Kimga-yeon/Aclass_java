package com.kh.object.chap07_method.model.service;

import com.kh.object.chap07_method.model.vo.TV;

public class MethodService {
	public void example() {
		
		// TV 객체 두개 생성
		TV t1 = new TV("LCD", false, 220); 
		TV t2 = new TV("OLED", true, 220); 
		
		t1.voltage = 400;
		
		System.out.println(t1.voltage); //400 
		System.out.println(t2.voltage); //400
		
		// static 변수 또는 메소드는
		// static 영역에 할당 될 때 
		// 클래스명.변수명(or 메소드명)으로 할당됨.
		System.out.println(TV.voltage); //400
		TV.voltage = 220;
		
		System.out.println(TV.voltage); //200
	
		TV.test();
	}
}
