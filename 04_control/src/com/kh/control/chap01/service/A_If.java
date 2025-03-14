package com.kh.control.chap01.service;

import java.util.Scanner;

public class A_If {
	
	/* 프로그램의 진행은 위에서 아래, 좌에서 우로 순차적으로 진행된다.
	 * 
	 * 이 순차적인 흐름을 바꿀 때 사용하는 것이 제어문.
	 * 
	 * - 선택적으로 원하는 코드를 수행 --> 조건문
	 * - 반복적으로 원하는 코드를 반복 수행 --> 반복문
	 * - 반복문에서 특정 조건에 따라 반복 행위를 제어하는 것 --> 분기문 
	 *
	 * 
	 * <조건문>
	 * 조건식이 참이냐 거짓이냐를 판단해서 그에 만족하는 코드를 실행하는 구문
	 * 
	 * 조건문은 대표적으로 if, switch문 존재
	 * 
	 * */
	
	public void example1() {
		// 단독 if 문
		
		// if문의 조건식이 true이면 중괄호({},블록) 내의 코드 수행.
		// false이면 해당 코드를 무시하고 건너 뜀.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		if(input > 0) {
			System.out.println("양수이다.");
		}
		
		if(input <= 0) {
			System.out.println("양수가 아니다.");
		}
	
	}
	
	public void example2() {
		// if-else문 
		/* - 조건식이 참인 경우 if문의 코드를,
		 *        거짓인 경우 else문의 코드를 수행.
		 * [표현식]
		 * if(조건식){
		 *      참인 경우 실행코드...
		 *  } else {
		 *      거짓인 경우 실행코드...
		 *  }
		 *      
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		String result; // 결과 저장 변수 선언
		if(input % 2 == 0) { //입력된 값이 짝수인 경우
			result = "짝수";
		} else {
			result = "홀수";
		}
		
		System.out.println(input + "은/는 " + result + "이다.");
		
	}
	
	public void example3() {
		// 나이를 입력받아 일반, 청소년, 초등학생 ,유아 구분 후 요금 받기.
		// 일반 :   1250원   // 20세
		// 청소년 :  720원    // 14~19세
		// 초등학생 : 450원  //  8~13세
		// 유아 : 0원      // 0~7세
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		int fee = 0; // 요금을 저장할 변수 선언 및 0으로 초기화
		
		if(age >= 20) { //20세 이상인 경우 (일반)
			fee = 1250;
		} else if(age >=14 && age <=19) { //14~19세 인 경우(청소년)
			fee = 720;
		} else if(age >=8 && age <=13) { //8~13세 인 경우(초등학생)
			fee = 450;
		} else if(age >=0 && age <=7){ //0~7세 인 경우(유아)
			// fee = 0;
		} else {
			fee = -1; // 0 미만 (오류)
		}
		
		System.out.println("요금 : " + fee + "원");
	}
	
	
	public void example4() {
		// 나이를 입력받아 일반, 청소년, 초등학생 ,유아 구분 후 요금 받기.
		// 일반 :   1250원   // 20세
		// 청소년 :  720원    // 14~19세
		// 초등학생 : 450원  //  8~13세
		// 유아 : 0원      // 0~7세
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		String division; // 구분 내용을 저장 할 변수 선언
		int fee = 0; // 요금을 저장할 변수 선언 및 0으로 초기화
		
		if(age >= 20) { //20세 이상인 경우 (일반)
			
			if(age >= 65) { //65세 이상 (우대권)
				division = "우대권";
			} else {
				division = "일반";
				fee = 1250;
				}
		} else if(age >= 14) { //14세 이상인 경우(청소년)
			division = "청소년";
			fee = 720;
		} else if(age >=8 ) { //8세 이상인 경우(초등학생)
			division = "초등학생";
			fee = 450;
		} else if(age >=0 ){ //0세 이상인 경우(유아)
			division = "유아";
			// fee = 0;
		} else {
			division = "ERROR";
			fee = -1; // 0 미만 (오류)
		}
		System.out.println("구분 : " + division);
		
		System.out.print("요금 : ");
		
		if(fee == -1) { // ERROR 인 경우
			System.out.println("ERR_04");
		}else {
			System.out.println(fee + "원");
		}
		
	
		
		
	}
	
	public void example5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if(score >= 0 && score <=100) {
			String grade;
			
			if(score >= 90) {
				grade = "A";
				if(score >= 95) {
					grade += "+";
				}}
			else if (score >= 80) {
				grade = "A";
				if(score >= 85) {
					grade += "+";
				}
			
			}
			else if (score >= 70) {
				grade = "C";
				if(score >= 75) {
					grade += "+";
				}
			}
			
			else if (score >= 60) {
				grade = "D";
				if(score >= 65) {
					grade += "+";
				}
			}
			else {
				grade = "F";
			}
				System.out.println(score + "점, " + grade + "입니다.");
		}
	
	}

	
	
	
	
	}
