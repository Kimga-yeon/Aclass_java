package com.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
	public void practice10() {
		
		
			// 1. ����ڿ��� �ֹε�Ϲ�ȣ ���ڿ� �Է¹ޱ� 
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
			String str = sc.nextLine();
			
			// 2. �ݺ����� �̿��Ͽ� char[]�� �Ű� ���
			char[] origin = new char[str.length()];
			
			for(int i=0; i<origin.length; i++) {
				origin[i] = str.charAt(i);
			}
			
			// 3. ���纻 char[]�� �����ڸ� ���ĺ��� *�� ���� ���Բ� ���� ���� �� �ٷ� ���
			char[] copyArr = new char[origin.length];
			
			for(int i=0; i<copyArr.length; i++) {
				
				if(i <= 7) { // 7�� �ε��� ���ϱ�����
					copyArr[i] = origin[i]; // ������ �ֹι�ȣ�� ����
				}else { // �� ���ĺ��ʹ� *�� ������
					copyArr[i] = '*';
				}
				
				// �ٷ� ���
				System.out.print(copyArr[i]);
			}
			
			
		}
		
		
	}

