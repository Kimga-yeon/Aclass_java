package com.kh.object.practice.model.service;

import com.kh.object.practice.model.vo.Book;

public class BookService {
	public void prctice() {
		// 1) �⺻�����ڸ� �̿��Ͽ� ù ��° Book ��ü ����
		Book b1 = new Book();
		
		// 2) �Ű����� �����ڸ� �̿��Ͽ� �� ��° Book ��ü ���� (��� ������ ����)
		Book b2 = new Book("�ڹ��� ����",30000,0.2,"���ü�");
		
		// 3) ��ü�� ���� �ʵ� �� ��� Ȯ��
		System.out.println(b1.selectBook());
		System.out.println(b2.selectBook());
		
		System.out.println("===============");
		System.out.println("������ ��� Ȯ��");
		
		// 4) ù ��° ��ü�� ���� ���� setter�� �̿��Ͽ� ����
		b1.setTitle("C���");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("ȫ�浿");
		
		// 5) ������ ���� ��� Ȯ��
		System.out.println(b1.selectBook());
		
		System.out.println("===============");
		
		
		// 6) �� ��ü�� �������� ������ å ������ ����ؼ� ���
		// 7) ���ε� ���� = ���� - (���� * ������)
		System.out.println("������ = "+ b1.getTitle() );
		System.out.println("���ε� ���� = "+(int)( b1.getPrice() -(b1.getPrice()*b1.getDiscountRate()))+"��");
		System.out.println("������ = " + b2.getTitle());
		System.out.println("���ε� ���� = " +(int)( b2.getPrice()  - (b2.getPrice()* b2.getDiscountRate()))+"��");
		
		 
		
		
		
	}
}
