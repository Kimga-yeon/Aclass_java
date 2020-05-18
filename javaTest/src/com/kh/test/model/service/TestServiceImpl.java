package com.kh.test.model.service;

import java.util.Scanner;

public class TestServiceImpl implements TestService{

	@Override
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		int input = sc.nextInt();
		sc.nextLine();
		if(input <= 100 && input>=1) {
			if(input%2==0) {
				System.out.println("2�� ��� �Դϴ�.");
				
			}else {
				System.out.println("2�� ����� �ƴմϴ�.");
			}
		}
		
	}

	@Override
	public void practice2() {
		for(int i=2; i<6; i++) {
			for(int j=1; j<=9; j++) {
				if(i %2 == 1 && j %2 ==1) {
					System.out.println(i + "*" + j + "=" + i*j);
				}
			}
			System.out.println( );
		}
		
		
		
		
	}

	
	
	
	@Override
	public void practice3() {
		int sum = 0;
		int i=0;
		double avg = 0;
		while(i<=100) {
			sum += i;
			i++;
		
			
		}
		avg = sum/100.0;
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		
	}

	@Override
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� 2 : ");
		int num2 = sc.nextInt()	;	
		sc.nextLine();
		
		System.out.print("������(+, -, *, /, %):");
		char num3 = sc.nextLine().charAt(0);
		
		if(num3 == '/') {
			if(num2 != 0 ) {
			System.out.println(num1 + "/" + num2 +"="+ num1/num2 );
			}else {
			System.out.println("0���� ������ �����ϴ�.");
		}
		}
		else if(num3=='+') {
			System.out.println(num1 + "+" + num2 +"="+ (num1+num2) );
		}
		else if(num3=='-') {
			System.out.println(num1 + "-" + num2 +"="+ (num1-num2) );
		}
		else if(num3=='*') {
			System.out.println(num1 + "*" + num2 +"="+ (num1*num2) );
		}
		else if(num3=='%') {
			System.out.println(num1 + "%" + num2 +"="+ (num1%num2) );
		}
		
				
		
	
	}

	
	
//	Ű����� 2���� ������ �����͸� �Է� �޾�, 
//	�� ���� ��� 1���� 9������ ���� ���� �� ���� ���� �� �ڸ� ������ �� �ڸ� �� ������ ����Ѵ�. 
//	�Էµ� �� �� 1~9 ���� ���� �ƴ� ���� ���Ե� ���
//	"�Էµ� �� �� 1 ~ 9 ���̰� �ƴ� ���� ���ԵǾ� �ֽ��ϴ�."�� ����Ѵ�.
	
	@Override
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� 1 : ");
		int num1 = sc.nextInt();
		System.out.print("�Է� 2 : ");
		int num2 = sc.nextInt()	;	
		
		int gob = num1*num2;
		
		
		System.out.println("");
		if(num1>=1 && num1<10) {
			if(num2>=1 && num2<10) {
				if( 10 > gob ) {
				System.out.println("���ڸ� �� �Դϴ�.");
				}
				else if(10 <= gob) {
				System.out.println("���ڸ� �� �Դϴ�.");
				}
			}
		}else {
			System.out.println("�Էµ� �� �� 1~9���̰� �ƴ� ���� ���ԵǾ� �ֽ��ϴ�.");
		}
}
	
	
	/** ����6.
	Ű����� 1���� ������(int) �����͸� �Է� �޾� 1���� 5������ ���� �ش� ���ڿ� �ش��ϴ� ����� ��� �Ѵ�.
	��, switch���� �̿��Ѵ�.  
	
	1���� 5������ ���ڿ� �� �̿��� ���ڰ� �ԷµǾ��� �� �Ʒ��� ���� ��µȴ�. 
	1 : ** �Է��� ���������� �Ǿ����ϴ�! ** 
	2 : ** ��ȸ�� ���� �Ǿ����ϴ�! ** 
	3 : ** ������ ���������� �Ǿ����ϴ�! ** 
	4 : ** ������ ���������� �Ǿ����ϴ�! ** 
	5 : ** ���������� ���� �Ǿ����ϴ�! ** 

	1~5�� �ƴ� ���� �Է� �� ��� : ** �ٽ� �Է��� �ּ���! **  
	
	[���� ���]
	�Է� : 3
	** ������ ���������� �Ǿ����ϴ�! ***/
	
	@Override
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~5���� ���� : ");
		int input = sc.nextInt();
		
		if(input == 1) {
			System.out.println("** �Է��� ���������� �Ǿ����ϴ�! **");
		} else if (input == 2) {
			System.out.println(" ** ��ȸ�� ���� �Ǿ����ϴ�! **");
		} else if (input == 3) {
			System.out.println("** ������ ���������� �Ǿ����ϴ�! ** ");
		} else if (input == 4) {
			System.out.println("** ������ ���������� �Ǿ����ϴ�! **");
		} else if (input == 5) {
			System.out.println("** ���������� ���� �Ǿ����ϴ�! **");
		}
		
		else {
			System.out.println(" ** �ٽ� �Է��� �ּ���! **");
		}
	}

	
	/** ����7.
	�迭�� ����ִ� ������ �� Ȧ���� ������ ����ϰ� ���� ���Ѵ�. 
	��, continue�� �̿��Ͽ� �ۼ��Ѵ�. 
	int [] array = {7,4,10,23,14,6,18,9,19};  
	
	[������]
	7
	23
	9
	19
	�հ� : 58.0
	*/
	
	
	@Override
	public void practice7() {
		int [] array = {7,4,10,23,14,6,18,9,19};
		
		double sum = 0.0;
		
		
	}

	@Override
	public void practice8() {
		
	}

	@Override
	public void practice9() {
		
	}

	@Override
	public void practice10() {
		
	}


}
