package com.kh.control.chap02.practice;

import java.util.Scanner;

public class LoopPractice {
	
	// �ݺ���_�ǽ����� 

	// �ǽ����� 1
	//����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
	//��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�. 
	//���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int user = sc.nextInt();

		if (user >= 1) {
			for (int i = 1; i <= user; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}

	
	// �ǽ����� 2
	//����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
	//��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�. 
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int user = sc.nextInt();

		if (user >= 1) {
			for (int i = user; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}


	// �ǽ����� 3
	//1���� ����ڿ��� �Է� ���� �������� �������� ���� for���� �̿��Ͽ� ����ϼ���.
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1 ; i <= num ; i++) {
			sum += i;
			
			if(i != num) {
				System.out.print(i + " + ");
			} else {
				System.out.println(i + " = " + sum);
			}
		}
		
	}
	
	// �ǽ����� 4
	//����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
	//���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			int max = 0;
			int min = 0;
			
			if(num1 > num2) {
				max = num1;
				min = num2;
			} else {
				max = num2;
				min = num1;
			}
			
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}			
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}
	
	// �ǽ����� 5
	// ����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.printf("===== %d�� =====\n", num);
		for(int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d%n", num, i, (num * i));
		}
	}
	
	
	// �ǽ����� 6
	//����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
	//��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num <= 9) {
			for(int i = num; i < 10; i++) {			
				System.out.printf("===== %d�� =====\n", i);
				for(int j = 1; j <= 9; j++) {				
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
				System.out.println();
			}			
		} else {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		}
	}
	
	
	// �ǽ�����7
	/*
	������ ���� ���� ������ �����ϼ���.

	ex.
	���� �Է� : 4
	*
	**
	***
	****
	*/
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	// �ǽ����� 8
	/*
	������ ���� ���� ������ �����ϼ���.

	ex.
	���� �Է� : 4
	****
	***
	**
	*
	*/
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = num; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
