package com.kh.test.model.service;

import java.util.Scanner;

public class TestServiceImpl implements TestService{

	@Override
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		if(input <= 100 && input>=1) {
			if(input%2==0) {
				System.out.println("2의 배수 입니다.");
				
			}else {
				System.out.println("2의 배수가 아닙니다.");
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
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

	@Override
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt()	;	
		sc.nextLine();
		
		System.out.print("연산자(+, -, *, /, %):");
		char num3 = sc.nextLine().charAt(0);
		
		if(num3 == '/') {
			if(num2 != 0 ) {
			System.out.println(num1 + "/" + num2 +"="+ num1/num2 );
			}else {
			System.out.println("0으로 나눌수 없습니다.");
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

	
	
//	키보드로 2개의 정수형 데이터를 입력 받아, 
//	두 수가 모두 1부터 9까지의 수일 때만 두 수의 곱이 한 자리 수인지 두 자리 수 인지를 출력한다. 
//	입력된 값 중 1~9 사이 수가 아닌 수가 포함된 경우
//	"입력된 값 중 1 ~ 9 사이가 아닌 수가 포함되어 있습니다."를 출력한다.
	
	@Override
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt()	;	
		
		int gob = num1*num2;
		
		
		System.out.println("");
		if(num1>=1 && num1<10) {
			if(num2>=1 && num2<10) {
				if( 10 > gob ) {
				System.out.println("한자리 수 입니다.");
				}
				else if(10 <= gob) {
				System.out.println("두자리 수 입니다.");
				}
			}
		}else {
			System.out.println("입력된 값 중 1~9사이가 아닌 수가 포함되어 있습니다.");
		}
}
	
	
	/** 문제6.
	키보드로 1개의 정수형(int) 데이터를 입력 받아 1부터 5까지일 때만 해당 숫자에 해당하는 결과를 출력 한다.
	단, switch문을 이용한다.  
	
	1부터 5까지의 숫자와 그 이외의 숫자가 입력되었을 때 아래와 같이 출력된다. 
	1 : ** 입력이 정상적으로 되었습니다! ** 
	2 : ** 조회가 시작 되었습니다! ** 
	3 : ** 수정이 정상적으로 되었습니다! ** 
	4 : ** 삭제가 정상적으로 되었습니다! ** 
	5 : ** 정상적으로 종료 되었습니다! ** 

	1~5가 아닌 값이 입력 된 경우 : ** 다시 입력해 주세요! **  
	
	[실행 결과]
	입력 : 3
	** 수정이 정상적으로 되었습니다! ***/
	
	@Override
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~5까지 정수 : ");
		int input = sc.nextInt();
		
		if(input == 1) {
			System.out.println("** 입력이 정상적으로 되었습니다! **");
		} else if (input == 2) {
			System.out.println(" ** 조회가 시작 되었습니다! **");
		} else if (input == 3) {
			System.out.println("** 수정이 정상적으로 되었습니다! ** ");
		} else if (input == 4) {
			System.out.println("** 삭제가 정상적으로 되었습니다! **");
		} else if (input == 5) {
			System.out.println("** 정상적으로 종료 되었습니다! **");
		}
		
		else {
			System.out.println(" ** 다시 입력해 주세요! **");
		}
	}

	
	/** 문제7.
	배열에 들어있는 데이터 중 홀수의 값들을 출력하고 합을 구한다. 
	단, continue를 이용하여 작성한다. 
	int [] array = {7,4,10,23,14,6,18,9,19};  
	
	[실행결과]
	7
	23
	9
	19
	합계 : 58.0
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
