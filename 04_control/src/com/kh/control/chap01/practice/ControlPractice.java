package com.kh.control.chap01.practice;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. �Է� ");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");

		int menu = 0;
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu1 = sc.nextInt();
		sc.nextLine();

		switch (menu1) {
		case 1:
			System.out.print("�Է�");
			break;
		case 2:
			System.out.print("����");
			break;
		case 3:
			System.out.print("��ȸ");
			break;
		case 4:
			System.out.print("����");
			break;

		default:
			System.out.print("���α׷��� ����˴ϴ�.");
			return;

		}
		System.out.print(" �޴��Դϴ�.");

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int da = sc.nextInt();
		sc.nextLine();

		// ����̸鼭 ¦��->¦����
		// ¦���� �ƴϸ� ->Ȧ����
		// ����� �ƴϸ� ->����� �Է����ּ���

		String result;

		if (da >= 0) {
			if (da % 2 == 0) {
				result = "¦����";
			}
			else {
				result = "Ȧ����";
			}
			
			System.out.println(result);
		}else {
			System.out.print("����� �Է����ּ���");
		}

	}

	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		int guk = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�������� : ");
		int young = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�������� : ");
		int su = sc.nextInt();
		sc.nextLine();
		
		//if(guk >=40 ) 
			//elas if 
		
		
	}
	
	
	
	
	public void practice4() {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int aa = sc.nextInt();
		sc.nextLine();
		
		String kk;
		switch(aa) {
			case 12: case 1: case 2:
			System.out.println(kk= "�ܿ�"); break;
			
	
			case 3: case 4: case 5:
			System.out.println(kk= "��"); break;
			
			case 6: case 7: case 8:
			System.out.println(kk= "����"); break;
			
			case 9: case 10: case 11:
			System.out.println(kk= "����"); break;
			
			default :System.out.println("�߸� �Էµ� ���Դϴ�.");
		
	 }
	   //System.out.printf(%d���� %d �Դϴ�,aa,kk);
		

		
	}
	
	
	
	
	
	
	
	
	
	public void practice5() {
		/*
		 * �ǽ����� 5 ���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���. �α��� ���� �� ���α��� ������, ���̵� Ʋ���� �� �����̵�
		 * Ʋ�Ƚ��ϴ�.��, ��й�ȣ�� Ʋ���� �� ����й�ȣ�� Ʋ�Ƚ��ϴ�.���� ����ϼ���.
		 */

		Scanner sc = new Scanner(System.in);

		String id = "myId";
		String password = "myPassword12";

		System.out.print("���̵� : ");
		String inputId = sc.nextLine();

		System.out.print("��й�ȣ : ");
		String inputPassword = sc.nextLine();

		// * Ŭ������ �ڷ��� -> �׷��� String �� �ڷ���
		// String.equals()
		// String �ڷ����� ������ �ִ� ��¥ ������ �������� ���ϴ� �޼ҵ�
		// ����� true �Ǵ� false ��ȯ

		if (id.equals(inputId)) {

			if (password.equals(inputPassword)) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
		}
		System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
