package com.kh.variable.controller;

import java.util.Scanner;

public class F_Scanner {
	
	// Ű����� �̸��� �Է¹޾� "000 �� ȯ���մϴ�." ��� ���ڿ� ���·� ����ϱ�
	public void scannerEx1() {
		Scanner sc = new Scanner(System.in);
		// Scanner�� java ���� �Է��� ���� �� �� �ֵ��� ���� ���ִ� class�� 
		// java.util ��Ű���� ���� �Ǿ��ִ�.
		
		System.out.print("����� �̸��� �����Դϱ�?  ");
		
		String name = sc.nextLine();
		
		System.out.println(name + "�� ȯ���մϴ�.");
		
	}

	// �̸�, ����, ������ �Է¹޾� "000���� 00��, 0��, Ű 000.0 cm �Դϴ�." ���·� ����ϱ�
	public void scannerEx2() {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// -> import ������ �ۼ����� �ʰ� �ٸ� Ŭ������ ������ ���
	
	System.out.print("�̸� : ");
	String name = sc.nextLine();
	// sc.nextLine() : Ű����� �Էµ� �� ���� ���ڿ��� (�Է¹��ۿ���) �о��.
	// �ٹٲ�(\n)���� �����ؼ� �о��.
	
	System.out.print("���� : ");
	int age = sc.nextInt();
	// sc.nextInt() : Ű����� �Էµ� ���� ���� �о��.
	// �Է¹��ۿ��� ����, ����, �ٹٲ� ���� ������ �о��.
	
	sc.nextLine(); // �Է� ���ۿ� �ִ� �ٹٲ� ����(\n) ���� �뵵
	
	
	System.out.print("����(��/��) : ");
	char gender = sc.nextLine().charAt(0);
	// charAt(index) : ���ڿ����� index��° ���� �ϳ��� ����.
	// index�� 0���� ����.
	
	
	System.out.print("Ű (cm) : ");
	double height = sc.nextDouble();
	sc.nextLine(); //�Է� ���ۿ��� �ٹٲ� ���� ���� 
	
	System.out.printf("%s���� %d��, %c�� %.1fcm �Դϴ�.\n", name, age, gender, height);
	
	//@@sc.nextLine �ܿ� �� �翬���ϰ� nextLine �ٿ��ֱ� 
	
	}
	
	
	
}





