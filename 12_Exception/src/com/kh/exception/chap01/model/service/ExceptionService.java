package com.kh.exception.chap01.model.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionService {
	public void example1() {
		// Unchecked Exception
		// ������ ���� ó���� ���� �ʾƵ� �Ǵ� ����(Exception)
		// �ַ� ���α׷����� �����Ƿ� ���� ������ ��찡 ���� ������
		// ���� ó�� �ڵ� ���� if�� ���� �̿��Ͽ� �ڵ带 �����ϴ� ��찡 ����
		
		// �� ���ڸ� �Է¹޾� ������ �ϴ� ���α׷�

		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� 1 : ");
		int num1 = sc.nextInt();
		System.out.print("�Է� 2 : ");
		int num2 = sc.nextInt();
	
		
		if(num2 == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}else {
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
		}
		
		
		
		// java.lang.ArithmeticException: / by zero
		// ��� ���� �� 0���� ������ ���� ��Ȳ�� �߻�
		// �� ������ if������ ó�� ������.
	}
	
	public void example2() {
		String[] arr = {"��������","����",null,"������"};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != null) { // NullPointException ����
				System.out.println(arr[i].length());
			}
		}
		
			
			
		// java.lang.NullPointerException
		// nall : �ƹ��͵� �����ϰ� ���� �ʴ�.
		// ����� ���� null�� ���� ������ �̿��Ͽ� ��ü ��� ���� �õ� �� �߻��ϴ� ����	
			
		
		// java.lang.ArrayIndexOutOfBoundsException: 4
		// �迭�� �ε��� ������ �Ѿ�� ������ �� �߻��ϴ� ����
		}
	
	
	public void example3() {
		// Checked Exception
		// �ݵ�� ���� ó���� �ؾ��ϴ� ����(Exemption)
		// �ַ� IO(�����) ��Ȳ���� ���� �߻���.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner (jdk 1.5 )������ ���Ǵ� Ű���� �Է� ���
		
//		System.out.println("�Է� : ");
//		String str = br.readLine();
		// Unhandled exception type IOException
		// == IOException ����ó���� �ȵǾ� �ִ�.
		
		
		
		
		
	}
}
	
	

