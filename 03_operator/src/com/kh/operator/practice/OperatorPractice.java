package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		String result;
		
		if(number > 0) { 
			result= "�����";
		} else {
			result= "����� �ƴϴ�";
		}
		System.out.println(result);
	
	}
	
	
	/*public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		String result;
		if(number > 0) { 
			result="�����";
		}else if(number < 0) {
			result="������";
		} else {
			result = "0�̴�";
		}
				
		System.out.println(result);
			
		
		
	}
	*/
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		String result = (input > 0) ? "�����." : ((input < 0) ? "������." : "0�̴�.");
			
			System.out.println(input + "��/�� " + result);
		
		
       }
	
		
	
	
	
	
	
	
	
	
	
	
}