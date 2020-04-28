package com.kh.chap01.practice.model.vo;

public class ComicBook extends Book {
	private int accessAge;
	
	public ComicBook() {
		super();  // ���ۼ��� ��� JVM�� ���ؼ� ������ ���� ��ܿ� ������ �� �ڵ� �߰���, �θ�κ� �����ϱ� ���� ������
	}
	
	public ComicBook(String title,String author,String publisher, int accessAge) {
		//�Ű����� ������ = �ʵ� �ʱ�ȭ, �θ�κе� �ʵ��ʱ�ȭ 
		super(title, author, publisher);
		this.accessAge = accessAge;
		
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	
	@Override
	public String toString() {
		return "ComicBook ["+ super.toString() +", accessAge=" + accessAge + "]";
	}
	
	
	
}
