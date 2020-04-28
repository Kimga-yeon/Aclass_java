package com.kh.poly.chap02.ex2.model.service;

import com.kh.poly.chap02.ex2.model.vo.AllinOnePrinter;
import com.kh.poly.chap02.ex2.model.vo.KoreaElectronics;
import com.kh.poly.chap02.ex2.model.vo.LgAP;
import com.kh.poly.chap02.ex2.model.vo.SamsungAP;
import com.kh.poly.chap02.ex2.model.vo.SmartPhone;

public class Example2Service {
	public void example1() {
		
		// ���ձ� ��ü�迭 ����
		AllinOnePrinter[] ap = new AllinOnePrinter[2]; 
		
		// �θ�Ÿ�� �������� ap �� �ڽİ�ü ap[0](��������) ����
		ap[0] = new SamsungAP("�Ｚ","�Ｚ1ȣ");
		ap[1] = new LgAP("dd","ss");
		
		for(int i=0; i<ap.length; i++) {
			System.out.println(ap[i].getBrand());
			
		}
	
	// ���ձ� + ����Ʈ���� �ѹ��� �����ϱ�
	KoreaElectronics[] ke = new KoreaElectronics[3];
	
	ke[0] = new SmartPhone();
	ke[1] = new SamsungAP();
	ke[2] = new LgAP();
	
	for(int i=0; i<ke.length; i++) {
		ke[i].powerOn();
	}
	
	 
	}
}
