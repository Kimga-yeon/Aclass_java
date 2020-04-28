package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice1 {
	// 실습문제 1
	// 키보드로 문자 하나를 입력받아 그 문자의 유니코드를 출력하세요.
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int unicode = ch;

		//System.out.println(ch + " unicode : " + (int)ch);
		System.out.println(ch + " unicode : " + unicode);
	}
}
