package com.kh.poly.chap02.ex2.model.service;

import com.kh.poly.chap02.ex2.model.vo.AllinOnePrinter;
import com.kh.poly.chap02.ex2.model.vo.KoreaElectronics;
import com.kh.poly.chap02.ex2.model.vo.LgAP;
import com.kh.poly.chap02.ex2.model.vo.SamsungAP;
import com.kh.poly.chap02.ex2.model.vo.SmartPhone;

public class Example2Service {
	public void example1() {
		
		// 복합기 객체배열 선언
		AllinOnePrinter[] ap = new AllinOnePrinter[2]; 
		
		// 부모타입 참조변수 ap 로 자식객체 ap[0](참조변수) 참조
		ap[0] = new SamsungAP("삼성","삼성1호");
		ap[1] = new LgAP("dd","ss");
		
		for(int i=0; i<ap.length; i++) {
			System.out.println(ap[i].getBrand());
			
		}
	
	// 복합기 + 스마트폰을 한번에 관리하기
	KoreaElectronics[] ke = new KoreaElectronics[3];
	
	ke[0] = new SmartPhone();
	ke[1] = new SamsungAP();
	ke[2] = new LgAP();
	
	for(int i=0; i<ke.length; i++) {
		ke[i].powerOn();
	}
	
	 
	}
}
