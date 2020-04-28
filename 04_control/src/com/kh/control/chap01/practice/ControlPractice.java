package com.kh.control.chap01.practice;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력 ");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");

		int menu = 0;
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu1 = sc.nextInt();
		sc.nextLine();

		switch (menu1) {
		case 1:
			System.out.print("입력");
			break;
		case 2:
			System.out.print("수정");
			break;
		case 3:
			System.out.print("조회");
			break;
		case 4:
			System.out.print("삭제");
			break;

		default:
			System.out.print("프로그램이 종료됩니다.");
			return;

		}
		System.out.print(" 메뉴입니다.");

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int da = sc.nextInt();
		sc.nextLine();

		// 양수이면서 짝수->짝수다
		// 짝수가 아니면 ->홀수다
		// 양수가 아니면 ->양수만 입력해주세요

		String result;

		if (da >= 0) {
			if (da % 2 == 0) {
				result = "짝수다";
			}
			else {
				result = "홀수다";
			}
			
			System.out.println(result);
		}else {
			System.out.print("양수만 입력해주세요");
		}

	}

	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int guk = sc.nextInt();
		sc.nextLine();
		
		System.out.print("영어점수 : ");
		int young = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수학점수 : ");
		int su = sc.nextInt();
		sc.nextLine();
		
		//if(guk >=40 ) 
			//elas if 
		
		
	}
	
	
	
	
	public void practice4() {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int aa = sc.nextInt();
		sc.nextLine();
		
		String kk;
		switch(aa) {
			case 12: case 1: case 2:
			System.out.println(kk= "겨울"); break;
			
	
			case 3: case 4: case 5:
			System.out.println(kk= "봄"); break;
			
			case 6: case 7: case 8:
			System.out.println(kk= "여름"); break;
			
			case 9: case 10: case 11:
			System.out.println(kk= "가을"); break;
			
			default :System.out.println("잘못 입력된 달입니다.");
		
	 }
	   //System.out.printf(%d월은 %d 입니다,aa,kk);
		

		
	}
	
	
	
	
	
	
	
	
	
	public void practice5() {
		/*
		 * 실습문제 5 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요. 로그인 성공 시 “로그인 성공”, 아이디가 틀렸을 시 “아이디가
		 * 틀렸습니다.“, 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		 */

		Scanner sc = new Scanner(System.in);

		String id = "myId";
		String password = "myPassword12";

		System.out.print("아이디 : ");
		String inputId = sc.nextLine();

		System.out.print("비밀번호 : ");
		String inputPassword = sc.nextLine();

		// * 클래스도 자료형 -> 그래서 String 도 자료형
		// String.equals()
		// String 자료형이 가지고 있는 진짜 값들이 같은지를 비교하는 메소드
		// 결과로 true 또는 false 반환

		if (id.equals(inputId)) {

			if (password.equals(inputPassword)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
		}
		System.out.println("아이디가 틀렸습니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
