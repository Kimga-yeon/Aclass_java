package com.kh.api.chap01.model.service;

import java.util.Scanner;

public class StringService {
	// String 클래스 
	// - immutable(불변) 객체로 한번 지정된 문자열은 수정 불가능 
	// --> 수정 시 새로운 문자열 객체가 생성되고 해당 주소를 반환함.
	
	public void example1() {
		// 1) String 값 수정 시 주소가 바뀌는지 확인
		
		String s1 = "ABC";
		// System.out.println(s1.hashCode());
		// String 의 hasCode()는 문자열을 이용하여 동일 비교하는 것이기 때문에 
		// 주소가 같은지 확인하는데는 부적절
		// --> System.identityHasCode() 사용
		//  --> 객체의 실제 저장 주소를 이용하여 hashCode를 만드는 메소드
		
		System.out.println("변경 전 s1 : " + System.identityHashCode(s1));
		
		s1 = "ABCD";  // s1 수정
		
		System.out.println("변경 후 s1 : " + System.identityHashCode(s1));
		

		
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		System.out.println("str1.equals(str2) : " + str1.equals(str2)); // true
		System.out.println("str1 == str2 : " + (str1 == str2)); // true
		
		
		// String Literal (리터럴)로 String 값 지정 시 
		// 같은 문자열일 경우 같은 주소를 반환한다.
		// (+String Pool)
		
		String str3 = new String("Hello");
		System.out.println("str3 : " + str3);
		
		System.out.println("str1 == str3 : " + (str1 == str3)); //false
		
		Scanner sc = new Scanner(System.in);
		System.out.print("str4 입력 : ");
		String str4 = sc.nextLine();
		
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str4));
		System.out.println("str1 == str4 : " + (str1 == str4));
		
		
		System.out.println("String 동등비교가 필요하면 equals() 사용 할 것!");
		System.out.println("String은 불변이다.");
		
		System.out.println(str1.equals(str4));
		
		
		
	}
	
	
	public void example2() {
		// stringBuffer
		// - 문자열 수정이 가능한 mutable(가변) 객체
		
		StringBuffer sb = new StringBuffer();
		// StringBuffer 객체를 기본 생성자로 생성 시
		// 기본 버퍼크기 16을 할당함.
		
		// capasity() : 용량 확인
		System.out.println("sb.capasity() : " + sb.capacity());
		
		System.out.println("sb.hashCode() : " + sb.hashCode());
		// StringBuffer 클래스는 hashCode()를 오버라이딩 하지 않음
		// Object.hashCode() : 객체 주소를 이용하여 해시코드 생성
		
		
		// append() :  기존 문자열 뒤에 추가
		sb.append("java api"); 
		System.out.println("추가 후 sb.capasity() : " + sb.capacity());
		System.out.println("추가 후 sb.hashCode() : " + sb.hashCode());
		
		
		sb.append("1234567890"); // 기존 용량인 16을 초과(현재 18)
		System.out.println("추가 후2 sb.hashCode() : " + sb.capacity());
		System.out.println("추가 후2 sb.hashCode() : " + sb.hashCode());
		
		
		System.out.println("sb : "+ sb);
		
		//String str = sb;
		// StringBuffer 를 String 으로 반환하는 방법
		String str = sb.toString();
		
		
	}
	
	public void example3() {
		// String. split 구분자;
		// --> 문자열을 해당 구분자를 기준으로 쪼개어 String{}  형태 형태로 반환
		
		String str = "사과, 포도, 참외, 오렌지, 수박, 멜론, 숭아, 자두";
		
		// ,(공백)을 구분자로 하여 분해
		String[] arr= str.split(",");
		
		for(int i= 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
