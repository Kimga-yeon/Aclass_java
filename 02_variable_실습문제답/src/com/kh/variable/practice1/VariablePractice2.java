package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice2 {
	// �ǽ�����2
	// Ű����� ���� �ΰ��� �Է� �޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���.
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (num1 + num2));
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("������ ��� : " + (num1 / num2));
	}
}
