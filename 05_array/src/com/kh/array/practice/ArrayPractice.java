package com.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
	public void practice10() {
		
		
			// 1. 사용자에게 주민등록번호 문자열 입력받기 
			Scanner sc = new Scanner(System.in);
			
			System.out.print("주민등록번호(-포함) : ");
			String str = sc.nextLine();
			
			// 2. 반복문을 이용하여 char[]에 옮겨 담기
			char[] origin = new char[str.length()];
			
			for(int i=0; i<origin.length; i++) {
				origin[i] = str.charAt(i);
			}
			
			// 3. 복사본 char[]에 성별자리 이후부터 *로 값이 들어가게끔 깊은 복사 후 바로 출력
			char[] copyArr = new char[origin.length];
			
			for(int i=0; i<copyArr.length; i++) {
				
				if(i <= 7) { // 7번 인덱스 이하까지는
					copyArr[i] = origin[i]; // 기존의 주민번호들 복사
				}else { // 그 이후부터는 *값 들어가도록
					copyArr[i] = '*';
				}
				
				// 바로 출력
				System.out.print(copyArr[i]);
			}
			
			
		}
		
		
	}

