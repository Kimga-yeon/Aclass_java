package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice1 {
	// �ǽ����� 1
	// Ű����� ���� �ϳ��� �Է¹޾� �� ������ �����ڵ带 ����ϼ���.
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		int unicode = ch;

		//System.out.println(ch + " unicode : " + (int)ch);
		System.out.println(ch + " unicode : " + unicode);
	}
}
