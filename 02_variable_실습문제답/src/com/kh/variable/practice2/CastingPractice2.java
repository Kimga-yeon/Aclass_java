package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice2 {
	// 실습문제 2
	// 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균을 출력하세요.
	// 이 때 총정점과 평균은 정수형으로 처리하세요.
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		double mat = sc.nextDouble();
		
		int sum = (int)(kor + eng + mat);
		int avg = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
