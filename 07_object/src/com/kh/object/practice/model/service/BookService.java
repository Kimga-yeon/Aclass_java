package com.kh.object.practice.model.service;

import com.kh.object.practice.model.vo.Book;

public class BookService {
	public void prctice() {
		// 1) 기본생성자를 이용하여 첫 번째 Book 객체 생성
		Book b1 = new Book();
		
		// 2) 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
		Book b2 = new Book("자바의 정석",30000,0.2,"남궁성");
		
		// 3) 객체가 가진 필드 값 출력 확인
		System.out.println(b1.selectBook());
		System.out.println(b2.selectBook());
		
		System.out.println("===============");
		System.out.println("수정된 결과 확인");
		
		// 4) 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		b1.setTitle("C언어");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("홍길동");
		
		// 5) 수정된 내용 출력 확인
		System.out.println(b1.selectBook());
		
		System.out.println("===============");
		
		
		// 6) 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		// 7) 할인된 가격 = 가격 - (가격 * 할인율)
		System.out.println("도서명 = "+ b1.getTitle() );
		System.out.println("할인된 가격 = "+(int)( b1.getPrice() -(b1.getPrice()*b1.getDiscountRate()))+"원");
		System.out.println("도서명 = " + b2.getTitle());
		System.out.println("할인된 가격 = " +(int)( b2.getPrice()  - (b2.getPrice()* b2.getDiscountRate()))+"원");
		
		 
		
		
		
	}
}
