package com.kh.poly.chap02.ex1.model.vo;

public interface Animal {
	
	// 인터페이스의 필드는 무조건 public static final 이다
	//public static final int SOUL = 1;  // 상수 final 은 대문자로
	
	// 인터페이스의 필드는 묵시적으로 public static final이라 생략 가능
	int SOUL =  1;
	
	
	// 인터페이스의 메소드는 무조건 public abstract
	public abstract String breath();
	
	// 인터페이스의 메소드는 묵시적으로 public abstract
	String eat();
	
	// 인터페이스를 상속하는 키워드
	/* 
	 * 인터페이스를 (일반)클래스가 상속 : implements (구현하다)
	 * 
	 * 인터페이스를 추상 클래스가 상속 : implements
	 * 
	 * --> 클래스로 인터페이스 상속 시 무조건 implements 
	 * 
	 * 인터페이스를 인터페이스가 상속 : extends
case 1 : case 2 :case 3 : 
				System.out.println(service.selectOne(input));
				break;	 * 
	 * */
}
