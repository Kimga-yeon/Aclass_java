package com.kh.object.chap04_field.model.vo;

public class Field {
	
	/* 필드(Field, 멤버 변수)
	 * -클래스 영역에 작성하는 변수로 
	 *  같은 클래스 내 어디서든 사용(접근)가능
	 * */

	private int num; // 클래스 영역에 선언된 int형 변수 == 필드
	
	
	public void example1() {
		// 지역 변수(Local Variable)
		// - 메소드, 생성자, 제어문(for,while,if,else,switch,case) 
		//   특정한 구역 { } 내에 생성되는 변수로 
		//	  지역변수는 해당 지역에서만 사용 가능.
		
		int num2 = 10; // 지역변수에 10을 초기화
		num = 1; // 필드는 클래스 내부 어디서든지 접근 가능
	}
	
	public void example2() {
		num = 100;
		// num2 = 300; //num2의 지역을 벗어났기 때문에 접근 불가
	}
	
	
	// 필드 세분화
	
	// 1) 멤버 변수 (인스턴스 변수)
	private char ch;
	private double db;
	/* 생성 : new를 통해 Heap 영역에 객체(인스턴스) 생성 시
	 * 		메모리에 할당 됨.
	 * 
	 * 소멸 : 객체가 소멸 시 소멸
	 * 		--> 객체는 언제 소멸?
	 * 			객체가 어떤 참조형 변수에도 참조되지 않을 때 
	 * 			GC(쓰레기콜렉터)에 의해서 소멸됨 
	 * */
	
	
	// 2) 클래스 변수(static 변수)
	// - static 예약어가 붙은 필드 
	public static int number;
	// 생성 : 프로그램 실행 시 static 메모리 영역에 할당됨
	// 소멸 : 프로그램 종료 시 소멸
	
	public char getCh() {
		return ch;
	}
	
	public void setCh(char ch) {
		this.ch = ch;
	}
	
	// final : 상수 키워드
	// private final double PI = 3.14;
	
	//final static
	//static final (순서 노상관)
	
	// 프로그램 내에서 공유되는 상수
	public static final double PI = 3.141592;
	// 왜 public??
	// 이러한 값들은 어디서든 접근 가능하도록 접근제한자를 
	// public으로 두는 것이 "규약"으로 정해져 있음.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
