package com.kh.control.chap02.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		//1개 값을 입력받아 1부터 숫자까지 숫자들 모두 출력
		//1보다 크거나 같아야 한다
		//1미만일시 1이상의 숫자를 입력해주세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
	
		
		if(input>=1) {
			for(int i=1; i<=input; i++) {
				System.out.print(i);
			}
		}else
		{  
		System.out.println("1이상 입력하세요");
	}
}
	
	/*public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		
		if(input>=1) {
			for(int i=input; i>=1; i-- ) {
				System.out.print(i);
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}
	*/
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();
		sc.nextLine();
		
		if (user >= 1) {
			for (int i = user; i >= 1; i--) {
				System.out.println(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num= sc.nextInt();
		sc.nextLine();
		int sum= 0;
		
		for(int i=1; i<=num; i++) {
			sum += i;
			
          if(i != num) {
        	  System.out.print(i + "+");
			}else {
				System.out.println(i + "="+sum);
			}
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("========%d단======\n",dan);
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n",dan,i,(dan*i));
		}
	}
	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		sc.nextLine();
		
		
		for(int i=dan; i<=9; i++) {
			System.out.printf("========%d단======\n",i);
		for(int j=1; j<=9; j++) {
			System.out.printf("%d * %d = %d\n",i,j,(i*j));
		}
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<input; i++) {
			
			//앞쪽 공백 출력 for문
			for(int k=0; k< input-1-i; k++ ) {
				System.out.print("  ");
			}
			for(int j=0; j<=1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}