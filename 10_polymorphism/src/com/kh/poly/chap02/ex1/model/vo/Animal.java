package com.kh.poly.chap02.ex1.model.vo;

public interface Animal {
	
	// �������̽��� �ʵ�� ������ public static final �̴�
	//public static final int SOUL = 1;  // ��� final �� �빮�ڷ�
	
	// �������̽��� �ʵ�� ���������� public static final�̶� ���� ����
	int SOUL =  1;
	
	
	// �������̽��� �޼ҵ�� ������ public abstract
	public abstract String breath();
	
	// �������̽��� �޼ҵ�� ���������� public abstract
	String eat();
	
	// �������̽��� ����ϴ� Ű����
	/* 
	 * �������̽��� (�Ϲ�)Ŭ������ ��� : implements (�����ϴ�)
	 * 
	 * �������̽��� �߻� Ŭ������ ��� : implements
	 * 
	 * --> Ŭ������ �������̽� ��� �� ������ implements 
	 * 
	 * �������̽��� �������̽��� ��� : extends
case 1 : case 2 :case 3 : 
				System.out.println(service.selectOne(input));
				break;	 * 
	 * */
}
