package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice4 {
	// �ǽ�����4
	// ���� ���ڿ� ���� Ű����� �Է¹޾� ���ڿ��� �տ��� �� ���� ����ϼ���.
	
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		System.out.println("ù ��° ���� : " + str.charAt(0));
		System.out.println("�� ��° ���� : " + str.charAt(1));
		System.out.println("�� ��° ���� : " + str.charAt(2));
	}
}
