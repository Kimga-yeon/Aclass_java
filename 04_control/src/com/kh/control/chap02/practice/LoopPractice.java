package com.kh.control.chap02.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		//1�� ���� �Է¹޾� 1���� ���ڱ��� ���ڵ� ��� ���
		//1���� ũ�ų� ���ƾ� �Ѵ�
		//1�̸��Ͻ� 1�̻��� ���ڸ� �Է����ּ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int input = sc.nextInt();
	
		
		if(input>=1) {
			for(int i=1; i<=input; i++) {
				System.out.print(i);
			}
		}else
		{  
		System.out.println("1�̻� �Է��ϼ���");
	}
}
	
	/*public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		
		if(input>=1) {
			for(int i=input; i>=1; i-- ) {
				System.out.print(i);
			}
		}else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		}
	}
	*/
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int user = sc.nextInt();
		sc.nextLine();
		
		if (user >= 1) {
			for (int i = user; i >= 1; i--) {
				System.out.println(i + " ");
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
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
		System.out.print("���� : ");
		int dan = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("========%d��======\n",dan);
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n",dan,i,(dan*i));
		}
	}
	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		sc.nextLine();
		
		
		for(int i=dan; i<=9; i++) {
			System.out.printf("========%d��======\n",i);
		for(int j=1; j<=9; j++) {
			System.out.printf("%d * %d = %d\n",i,j,(i*j));
		}
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<input; i++) {
			
			//���� ���� ��� for��
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