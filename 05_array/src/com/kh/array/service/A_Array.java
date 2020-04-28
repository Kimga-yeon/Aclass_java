package com.kh.array.service;

import java.util.Scanner;

public class A_Array {
	// �迭
	// - ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��.
	// - ����� ������ �ε����� ������.(�ε��� ������ 0)
	
	public void example1() {
		
		//�迭�� �ʿ伺�� �ľ��غ���!
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		
		// ���� �ڷ����� ������ ������ �ʿ��� ���
		// ���� ���� ������δ� �Ѱ谡 ����.
		
		// �迭 �̿��Ͽ� ����, �Ҵ�, �ʱ�ȭ ����
		
		// 1. �迭 ����([] == �迭�� ��Ÿ���� ��ȣ)
		// �ڷ���[] �迭��(==������); 
		// �ڷ��� �迭��[]; 
		int[] arr;
		//int arr[]; // int�� �迭 �������� ����
		// **�迭�� ������ ������ �������̴�!!
		
		// 2. �迭 �Ҵ� (�Ҵ� : �޸𸮻� ������ ���� ������ Ȯ���ϴ� ��)
		// �迭�� = new �ڷ���[�迭ũ��];
		//                (== �迭 ĭ ��)
		// *** new ������ 
		// - "Heap ������ ���ο� ������ �Ҵ��Ѵ�" ��� �ǹ�
		
		arr = new int[4];
		// �޸� ���� �׸� ����
		
		// 3. �迭 �ʱ�ȭ
		// �迭��[�ε���] = ��;
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		//arr[4] = 50; //���� �߻�
		// �Ҵ�� �迭�� ũ�⸦ ���.
		
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		System.out.println("arr[3] : " + arr[3]);
		
		// int�迭 ���� �� 4ĭ�Ҵ�
		int arr2[] = new int[4];
		
		// �迭��.length : �迭�� ���̸� ��ȯ
		for(int i=0; i<arr2.length; i++) {
			//   0    ~    4�̸� ����     1�� ����
			arr2[i] = (i+1) * 5;
			// i == 0 --> arr[0] = 5
			// i == 1 --> arr[0] = 10
			// i == 2 --> arr[0] = 15
			
		}
		
		// for������ �迭 �� ��� ���
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr[" + i + "] = " + arr2[i]);
		}
	
	}
	
	
	public void example2() {
		
		// double�� �迭 dArr ���� �� 5ĭ�� �Ҵ��ϰ�
		// �� index�� 1.0���� 1�� �����ϴ� ���� �����ϰ� ���
		
		double dArr[] = new double[5];
		for(int i=0; i<dArr.length; i++) {
			dArr[i] = 1.0 + i;
			System.out.println(dArr[i]);
		}
	
	}
	
	
	public void example3() {
		// int�� �迭 iArr ���� �� �迭�� ĭ ���� ����ڷ� ���� �Է¹޾� �迭 �Ҵ�.
		// �� �ε����� ����� ���� ���� �Է¹޾� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		int iArr[]; //�迭 ����
		
		System.out.print("�迭 ĭ �� : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		// �Էµ� ũ�⸸ŭ�� �迭 �Ҵ�
		iArr = new int[size];
		
		// ������ �ε����� �Է��� ���� ����
		for(int i=0; i<iArr.length; i++) {
			System.out.print("iArr[" + i + "] = ");
			iArr[i] = sc.nextInt();
			sc.nextLine();
		}
		for(int i=0; i<iArr.length; i++) {
			System.out.println("iArr[" + i + "]�� ����� �� : " + iArr[i]);
		}
		
	}
	
	
	public void example4() {
		// �迭 ����, �Ҵ�, �ʱ�ȭ �ѹ��� �ϱ�
		
		//int�� �迭arr ���� �� 5ĭ �Ҵ� �� 
		//1, 2, 3, 4, 5�� ������ �ε����� �����ϱ�.
		int arr[] = {1,2,3,4,5}; 
		// �迭 ����        //�迭 �Ҵ� �� �ʱ�ȭ
		
		//�迭 �Ҵ� Ȯ��
		System.out.println("arr �迭�� ���� : " + arr.length);
		
		//�迭 �ʱ�ȭ Ȯ��
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void example5() {
		// 5���� Ű ������ �Է¹޾� �迭�� �����ϰ�
		// 5���� Ű ��հ��� ���.
		
		Scanner sc = new Scanner(System.in);
		
		double heights[] = new double[5];
		// double �迭 heights ���� �� �Ҵ�
		
		// 5�� �Է� -> �ݺ���(for)
		// ��� == �հ�/�ο� ��
		// �հ� --> sum�� �̿��� ����
		
		// �Է� �޴� for��
		for(int i=0; i<heights.length; i++) {
			System.out.print(i+1 + "��° �Է� : ");
			heights[i] = sc.nextDouble();
			sc.nextLine();
		}
	
		// �հ� ���ϱ�
		double sum = 0; //0.0
		for(int i=0; i<heights.length; i++) {
			sum += heights[i]; 
		}
		System.out.print("��� : " + sum/heights.length);
	}
	
	public void example6() {
		// �迭�� ����
		// 1) �� ���� �ڷ����� ������ �� �ִ�.
		// 2) �ѹ� ������� �迭�� ũ�� ������ �Ұ��� �ϴ�.
		
		// �Է¹��� ũ�� ��ŭ�� �迭 �Ҵ��ϱ�
		
		// �迭 �Ҵ� �� int�� �⺻������ �ʱ�ȭ ���ִ��� Ȯ��
		Scanner sc = new Scanner(System.in);
		System.out.print("ũ�� �Է� : ");
		int size = sc.nextInt();
		
		// �Է¹��� �� ��ŭ�� ũ�⸦ ������ �迭 ���� �� �Ҵ�
		int arr[] = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// ������ ũ�⸦ �Ѿ ��ġ (���ؽ�)�� ���� �� ��� �Ǵ��� Ȯ��
		// arr[size] = 3; //���� �߻�
		// ArrayIndexOutOfBoundsException
		// �迭�� �ε��� ������ �Ѿ�� ���� �߻�
		
		// ���� �迭���� 2�� ū �迭�� ���Ӱ� �Ҵ��Ͽ�
		// arr������ ���� �� �� �ְ� �ڵ� �ۼ�
		arr = new int[size*2];
		System.out.println("�þ �迭 ���� : " + arr.length);
		System.out.println("arr[size] : " + arr[size]);
	}
	
	public void example7() {
		// �Է¹��� ���ڿ��� char�� �迭�� �� ���ھ� �����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String input= sc.nextLine();
		
	// String(���ڿ�)�� ���� ��ŭ�� char �迭 ���� �� �Ҵ�
		char cArr[] = new char[input.length()];
		// �迭�� ���� : �迭��.length
		// ���ڿ��� ���� : ������.length()
		
		for(int i=0; i<cArr.length; i++) {
			cArr[i] = input.charAt(i);
			
			System.out.println("cArr " + i +" �ε��� �� : " + cArr[i]);
		}
		// �迭 ������ ���ϴ� ���ڰ� �����ϴ� �ε��� ��� ����ϱ�
		System.out.print("�O������ ���� : ");
		char ch = sc.nextLine().charAt(0);
		
		for(int i=0; i<cArr.length; i++) {
			if(cArr[i] == ch) {
				System.out.println(i);
			}
		}
			
		}
	public void example8() {
		// String �迭�� �޸� ����
		
		// String �迭 ����, �Ҵ�, �ʱ�ȭ
		
		String sArr[] = {"���","¥���","�������","���ö�"};
		
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
	}

	public void example9() {
		// �޴��� �ԷµǾ� �ִ� string �迭 ���� �� �ʱ�ȭ ��
		// ������ �߻����� �޴��� �ϳ� ���� �غ���
		
		String menu[] = {"���","�Ե�����","����Ƽ","Į����","���"};
	
		// ����? ������ ��
		
		// ������ �߻� ��Ű�� ���
		// Math.random()
		// Math Ŭ���� : �ڹٿ��� �����ϴ� ���а��� ����� ����ִ� Ŭ����

		// Math.random() �� �߻���Ű�� ������ ����
		// 0 <= x < 1 (double��)
		
		double ran = Math.random();
		// 0 <= x < 1   //�� ������
		// 0 <= x < 5   //�� ������ ���� �� �� �ְ� ���� �߰�
		// + int������ ����ȯ(index�� ����ϱ� ���ؼ�)
		
		int r = (int)(ran * menu.length);
		System.out.println("������ ���� �޴� : "+ menu[r]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
