package com.kh.objectarray.practice.model.service;

import java.util.Scanner;

import com.kh.objectarray.practice.model.vo.Student;

public class PracticeService {
	public void start() {
		
		
		// while문을 사용하여 학생들의 정보를 계속 입력 받고 
		// 한 명씩 추가 될 때마다 카운트함
		// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
		
		// 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
		// 현재 기록된 학생들의 각각의 점수 평균을 구함
		// 학생들의 정보를 모두 출력 (평균 포함)

		Scanner sc = new Scanner(System.in);
		
		// 1) 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
		Student students[] = new Student[10];
		
		int count = 0;
		
		
		// 2) while문을 사용하여 학생들의 정보를 계속 입력 받고 
		// 한 명씩 추가 될 때마다 카운트함
		// 계속 추가할 것인지 물어보고, ‘y’이면 계속 객체 추가
		while(true) {
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			students[count] = new Student(grade, classroom, name, kor, eng, math);
			
			count++;
			
			
			boolean flag = false;
			while(true) {
				System.out.print("계속 추가할 겁니까 ? (y/n) : ");
				char ch = sc.nextLine().charAt(0);
				
				if(ch == 'n' || count == students.length) {
					// 3) 10명을 입력한 경우 모두 입력하거나, 계속 추가할 것인지 물어볼 때 ‘n’을 입력한 경우
					// 학생 정보 입력을 멈춤
					flag = true;
					break;
				} else if(ch == 'y') {
					// 계속 추가할 것인지 물어보고, ‘y’이면 계속 객체 추가
					break;
					
				} else {
					// 4) 'y' 또는 'n'을 입력하지 않은 경우 
					// "잘못 입력하셨습니다. 다시 입력해 주세요" 출력 후
					// 다시 계속 추가할지 여부를 물어봄.
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");
				}
				
			}
			
			if(flag) {
				break;
			}
			
			System.out.println();
		}
		
		
		// 5) 입력된 모든 학생들의 정보 + 평균 점수를 출력
		for(int i=0 ; i<students.length ; i++) {
			
			if(students[i] == null) {
				break;
			}
			
			int sum = students[i].getKor() + students[i].getEng() + students[i].getMath();
			
			System.out.println(students[i].selectStudent() + ", 평균 : " + sum/3);
		}
		
	}
}
