package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice2 {
	// �ǽ����� 2
	// �Ǽ������� ����, ����, ���� �� ������ ������ �Է¹޾� ������ ����� ����ϼ���.
	// �� �� �������� ����� ���������� ó���ϼ���.
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double kor = sc.nextDouble();
		
		System.out.print("���� : ");
		double eng = sc.nextDouble();
		
		System.out.print("���� : ");
		double mat = sc.nextDouble();
		
		int sum = (int)(kor + eng + mat);
		int avg = sum / 3;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}
}
