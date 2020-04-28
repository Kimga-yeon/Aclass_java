package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class B_Arraycopy {
	
	// ���� ����(�ּҺ���) : �����ϴ� �迭�� ���� �ּҸ��� ����
	
	// ���� ����(�迭 ����) : �����ϰ��� �ϴ� �迭�� ������ �ڷ���, ũ�⸦ ������ 
	//		       �迭�� ����� ���� �����͸� �Ȱ��� �ۼ��ϴ� ��.	
	
	
	public void example1() {
		// ���� ���� �� ���������� ���� ���� Ȯ��
		
		int origin[] = {10,20,30,40,50};
		
		// ���� ���� ����
		int copyArr[] = origin;
		// �迭 ������ ������ ����� �ּҰ��� �����ؿ�.
	
		// ������ ���� �� ����
		System.out.println(Arrays.toString(origin));
		// Arrays Ŭ���� : �迭�� ���ϰ� ��� �Ǵ� �߰����� ����� �����ϴ� Ŭ����
		// Arrays.toString(�迭��)
		// : �迭 ���� �����͸� �ѹ��� ���
		
		// ������ ���� �� ���纻
		System.out.println(Arrays.toString(copyArr));
		
		// ���纻�� �����͸� ����
		copyArr[2] = 10000;
		
		System.out.println("���纻 �� ���� ��");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		
		// �迭�� �ؽ��ڵ� ���
		// �ؽ��ڵ��? �ּҰ��� �ؽ��Լ���°� �̿��Ͽ� ���� �� ����
		// �ؽ��Լ���? Ư�� ���ڿ��� ������ ������ ���·� ����
		
		// ���� �ּҰ��� ���� ��� �ؽ��ڵ嵵 ���� ���̴�.
		System.out.println("origin�� hashCode() : " + origin.hashCode());
		System.out.println("copyArr�� hashCode() : " + copyArr.hashCode());
		
	}

	public void example2() {
		// for���� �̿��� ���� ���� + ���� ������ ���� Ȯ��
		int[] origin  = {1,2,3,4,5};
		
		// ���� ���縦 �Ϸ��� ���� �ڷ���, ���� ũ�� �̻��� �迭�� 
		// ���� �� �Ҵ��ؾߵ�.
		int[] copyArr = new int[origin.length];
		
		for(int i=0; i<copyArr.length; i++) {
			copyArr[i] = origin[i];
		}
		System.out.println("���� ��");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// ���纻 ������ ����
		copyArr[2] = 9999;
		
		System.out.println("���� ��");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// �� �迭�� �ؽ��ڵ� ���(�ٸ��� Ȯ��) ������ ��������
		System.out.println("origin�� hashCode() : "+origin.hashCode());
		System.out.println("copyArr�� hashCode() : "+copyArr.hashCode());
		
		
		
	}
	
	public void example3() {
		// System.arraycopy()�� �̿��� ���� ���� + ���� ������ ���� Ȯ��
		int[] origin  = {1,2,3,4,5};
		int[] copyArr = new int[origin.length];
		
		// System.arraycopy(�����迭��, ������� �ε��� ����, ���纻 �迭��, 
		//                     ���纻���� ����� �ε��� ����, �������)
		
		System.arraycopy(origin, 0, copyArr, 0, origin.length);
		
		System.out.println("���� ��");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// ���纻 ������ ����
		copyArr[2] = 9999;
		 
		System.out.println("���� ��");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// �� �迭�� �ؽ��ڵ� ���(�ٸ��� Ȯ��) ������ ��������
		System.out.println("origin�� hashCode() : "+origin.hashCode());
		System.out.println("copyArr�� hashCode() : "+copyArr.hashCode());
		
	}
	
	public void example4() {
		// ó���� �迭 ũ�⸦ �Է��ϰ�
		// �ش� ũ�⸸ŭ�� �Է��� �����Ͽ� �� �ε����� ���� �ʱ�ȭ��.
		
		// �Է� �Ϸ� �� �߰������� �� �Է��� ������ �ִ��� ����� 
		// ���� ���, �߰��� �ʿ��� �迭 ũ�⸦ �Է� �޾�
		// �ٽ� �þ� �� �迭 ũ�⸸ŭ �Է��� ����.
		
		// �߰������� �Է��� ������ ���ٸ�
		// �迭�� ����� ��� ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 ũ�� �Է� : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[size];
		
		int i = 0; //�ʱ��
		while(true) {
			System.out.print(i + "��° �ε��� �Է� : ");
			arr[i] = sc.nextInt();
			sc.nextLine();
			
			i++;
			
			// ������ i���� ���� �迭 ���̿� ���ٸ�
			if(i == arr.length) {
				System.out.print("�߰��� �Է� �Ͻðڽ��ϴ�?(�ƹ��ų�/n) : ");
				char ch = sc.nextLine().charAt(0);
				
				if(ch == 'n') {
					break;// 'n' �Է� �� �ݺ��� ����
				}else { 
					System.out.print("�߰��� �迭 ���� : ");
					size += sc.nextInt();
					sc.nextLine();
					
					// ���� ����� �迭 ���� �� �Ҵ�.
					int[] copyArr = new int[size];
							
					// ���� ���� ����
					System.arraycopy(arr,0,copyArr,0,arr.length);	
					
					// arr������ ���� ����� �迭 �ּҸ� ����
					arr = copyArr;
					
				}
			}
			
		}
		
		// arr�� ����� ���� ��� ���
		for(int j=0; j<arr.length; j++) {
			System.out.println("arr[" + j + "]" + arr[j]);
		}
		
	}
	
	
	
	
	
	
	
	
	
}
