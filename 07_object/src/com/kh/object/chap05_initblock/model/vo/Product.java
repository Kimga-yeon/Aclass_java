package com.kh.object.chap05_initblock.model.vo;

public class Product {
	
	private String pName;  // ��ǰ��
						// ����� �ʱ�ȭ		
							
	private int price;    // ����
	
	
	
	
	{ // �ν��Ͻ� �ʱ�ȭ ���
		// �ν��Ͻ� ���� (�������)�� 
		// ��ü ���� �� ���� �� ���� �ʱ�ȭ �ϴ� �뵵
		pName = "������Z�ø�";
		price = 1200000;
		
		
	}
	
	
	public String selectProduct() {
		return pName + "/ " + price;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// getter /setter
}
