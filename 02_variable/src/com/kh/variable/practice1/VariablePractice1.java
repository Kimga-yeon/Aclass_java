package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice1 {

	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.printf("%.1fcm인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);
		
		
	}
	
}
