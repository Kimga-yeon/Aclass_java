package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice4 {
	// 실습문제4
	// 영어 문자열 값을 키보드로 입력받아 문자에서 앞에서 세 개를 출력하세요.
	
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
	}
}
