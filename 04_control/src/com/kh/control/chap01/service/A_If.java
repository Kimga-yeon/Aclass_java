package com.kh.control.chap01.service;

import java.util.Scanner;

public class A_If {
	
	/* ���α׷��� ������ ������ �Ʒ�, �¿��� ��� ���������� ����ȴ�.
	 * 
	 * �� �������� �帧�� �ٲ� �� ����ϴ� ���� ���.
	 * 
	 * - ���������� ���ϴ� �ڵ带 ���� --> ���ǹ�
	 * - �ݺ������� ���ϴ� �ڵ带 �ݺ� ���� --> �ݺ���
	 * - �ݺ������� Ư�� ���ǿ� ���� �ݺ� ������ �����ϴ� �� --> �б⹮ 
	 *
	 * 
	 * <���ǹ�>
	 * ���ǽ��� ���̳� �����̳ĸ� �Ǵ��ؼ� �׿� �����ϴ� �ڵ带 �����ϴ� ����
	 * 
	 * ���ǹ��� ��ǥ������ if, switch�� ����
	 * 
	 * */
	
	public void example1() {
		// �ܵ� if ��
		
		// if���� ���ǽ��� true�̸� �߰�ȣ({},���) ���� �ڵ� ����.
		// false�̸� �ش� �ڵ带 �����ϰ� �ǳ� ��.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		if(input > 0) {
			System.out.println("����̴�.");
		}
		
		if(input <= 0) {
			System.out.println("����� �ƴϴ�.");
		}
	
	}
	
	public void example2() {
		// if-else�� 
		/* - ���ǽ��� ���� ��� if���� �ڵ带,
		 *        ������ ��� else���� �ڵ带 ����.
		 * [ǥ����]
		 * if(���ǽ�){
		 *      ���� ��� �����ڵ�...
		 *  } else {
		 *      ������ ��� �����ڵ�...
		 *  }
		 *      
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		String result; // ��� ���� ���� ����
		if(input % 2 == 0) { //�Էµ� ���� ¦���� ���
			result = "¦��";
		} else {
			result = "Ȧ��";
		}
		
		System.out.println(input + "��/�� " + result + "�̴�.");
		
	}
	
	public void example3() {
		// ���̸� �Է¹޾� �Ϲ�, û�ҳ�, �ʵ��л� ,���� ���� �� ��� �ޱ�.
		// �Ϲ� :   1250��   // 20��
		// û�ҳ� :  720��    // 14~19��
		// �ʵ��л� : 450��  //  8~13��
		// ���� : 0��      // 0~7��
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		int fee = 0; // ����� ������ ���� ���� �� 0���� �ʱ�ȭ
		
		if(age >= 20) { //20�� �̻��� ��� (�Ϲ�)
			fee = 1250;
		} else if(age >=14 && age <=19) { //14~19�� �� ���(û�ҳ�)
			fee = 720;
		} else if(age >=8 && age <=13) { //8~13�� �� ���(�ʵ��л�)
			fee = 450;
		} else if(age >=0 && age <=7){ //0~7�� �� ���(����)
			// fee = 0;
		} else {
			fee = -1; // 0 �̸� (����)
		}
		
		System.out.println("��� : " + fee + "��");
	}
	
	
	public void example4() {
		// ���̸� �Է¹޾� �Ϲ�, û�ҳ�, �ʵ��л� ,���� ���� �� ��� �ޱ�.
		// �Ϲ� :   1250��   // 20��
		// û�ҳ� :  720��    // 14~19��
		// �ʵ��л� : 450��  //  8~13��
		// ���� : 0��      // 0~7��
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		String division; // ���� ������ ���� �� ���� ����
		int fee = 0; // ����� ������ ���� ���� �� 0���� �ʱ�ȭ
		
		if(age >= 20) { //20�� �̻��� ��� (�Ϲ�)
			
			if(age >= 65) { //65�� �̻� (����)
				division = "����";
			} else {
				division = "�Ϲ�";
				fee = 1250;
				}
		} else if(age >= 14) { //14�� �̻��� ���(û�ҳ�)
			division = "û�ҳ�";
			fee = 720;
		} else if(age >=8 ) { //8�� �̻��� ���(�ʵ��л�)
			division = "�ʵ��л�";
			fee = 450;
		} else if(age >=0 ){ //0�� �̻��� ���(����)
			division = "����";
			// fee = 0;
		} else {
			division = "ERROR";
			fee = -1; // 0 �̸� (����)
		}
		System.out.println("���� : " + division);
		
		System.out.print("��� : ");
		
		if(fee == -1) { // ERROR �� ���
			System.out.println("ERR_04");
		}else {
			System.out.println(fee + "��");
		}
		
	
		
		
	}
	
	public void example5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int score = sc.nextInt();
		
		if(score >= 0 && score <=100) {
			String grade;
			
			if(score >= 90) {
				grade = "A";
				if(score >= 95) {
					grade += "+";
				}}
			else if (score >= 80) {
				grade = "A";
				if(score >= 85) {
					grade += "+";
				}
			
			}
			else if (score >= 70) {
				grade = "C";
				if(score >= 75) {
					grade += "+";
				}
			}
			
			else if (score >= 60) {
				grade = "D";
				if(score >= 65) {
					grade += "+";
				}
			}
			else {
				grade = "F";
			}
				System.out.println(score + "��, " + grade + "�Դϴ�.");
		}
	
	}

	
	
	
	
	}
