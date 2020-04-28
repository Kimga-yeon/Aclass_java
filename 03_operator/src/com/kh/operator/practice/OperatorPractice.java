package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		String result;
		
		if(number > 0) { 
			result= "양수다";
		} else {
			result= "양수가 아니다";
		}
		System.out.println(result);
	
	}
	
	
	/*public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		String result;
		if(number > 0) { 
			result="양수다";
		}else if(number < 0) {
			result="음수다";
		} else {
			result = "0이다";
		}
				
		System.out.println(result);
			
		
		
	}
	*/
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		String result = (input > 0) ? "양수다." : ((input < 0) ? "음수다." : "0이다.");
			
			System.out.println(input + "은/는 " + result);
		
		
       }
	
		
	
	
	
	
	
	
	
	
	
	
}