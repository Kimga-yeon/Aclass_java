package com.kh.poly.chap02.ex1.model.vo;

public class Chicken extends Bird{

	// Bird�κ��� ��ӹ��� �޼ҵ�
	@Override
	public String fly() {
		return "���� ���µ� ���� ����";
	}

	// Animal �������̽��� ���� ��ӹ��� �޼ҵ�
	@Override
	public String breath() {
		return "�췷�� �������� ���� ����ȣ���� �Ѵ�.";
	}

	@Override
	public String eat() {
		return "���̸� �θ��� �ɾ� �Դ´�.";
	}

}
