package com.kh.chap01.practice.model.vo;

public class ComicBook extends Book {
	private int accessAge;
	
	public ComicBook() {
		super();  // 미작성된 경우 JVM에 의해서 생성자 제일 상단에 컴파일 시 자동 추가됨, 부모부분 생성하기 위해 생성됨
	}
	
	public ComicBook(String title,String author,String publisher, int accessAge) {
		//매개변수 생성자 = 필드 초기화, 부모부분도 필드초기화 
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
