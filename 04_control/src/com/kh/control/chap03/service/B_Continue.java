package com.kh.control.chap03.service;

public class B_Continue {
	
	// continue
	// - �ݺ��� �������� ��� ������ �����
	// - �ڵ� ���� �� continue�� ������ �Ǹ�
	// ���� ������ �������� �ʰ� �ݺ��� ó������ ���ư�.
	// - ó������ ���ư� �� �������� ������ �̸� ������.
	
	public void example1() {
		// 1 ~ 100������ ���� �� 4�� ����� �����ϰ�
		// ������ ������ �� ���Ͽ��� (continue)
		
		int sum = 0;
		for(int i=1 ; i<=100 ; i++) {
			
			if(i % 4 == 0) { //4�� ��� ����
				continue;
			}
			sum += i;
			
		}
		System.out.println("sum : "+sum);
	}
	
	public void example2() {
		
		//2~9 ������ ���
		//��, 3��,6��,9���� ������� ����.
		
		
		for(int dan=2; dan<=9; dan++) {
			
			for (int su =1; su<=9; su++) {
				
				if(dan % 3 == 0) {
					continue;
				}
				
				System.out.printf ("%2d * %2d = %2d  ",dan,su,dan*su);
				
			}
			System.out.println();
			
			}
			
		}
	
		
		
		
		
	}


