package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice1 {
	// �ǽ����� 1
	// �̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		sc.nextLine(); // ���๮�� ����
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		sc.nextLine(); // ���๮�� ����
		
		System.out.println("Ű " + height +  "cm�� " + age + "�� " + gender + "�� " + name + "�� �ݰ����ϴ�^^");
	}
	
}
