package com.kh.darray.service;

import java.util.Arrays;
import java.util.Scanner;

public class DArrayPractice {
	
	public void practice1() {
		String[][] arr = new String[3][3];
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				arr[i][j] = "(" + i + "," + j + ")";
			}
		}		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
	public void practice2() {
		int[][] arr = new int[4][4];
		
		int value = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				arr[i][j] = value++;
				
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
			
		}
	}
	
	public void practice3() {
		int[][] arr = new int[4][4];
		
		int value = 16;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]= value--;
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int input = sc.nextInt();
		
		System.out.print("열 크기 : ");
		int input1 = sc.nextInt();
		
		char[][] arr = new char[input][input1];
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (char)((int)(Math.random() * 26 + 65 ));
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
			 System.out.print(arr[i][j] + " ");
				}
			System.out.println();
			}
		
	}	
		
	
	public void practice6() {
		String[][] strArr = {{"이", "까", "왔", "앞", "힘"}, 
							{"차", "지", "습", "으", "냅"}, 
							{"원","열", "니", "로", "시"}, 
							{"배", "심", "다", "좀", "다"}, 
							{"열", "히", "! ", "더", "!! "}
							};
											
			
			
			for(int i=0; i<strArr.length; i++) {
				for(int j=0; j<strArr[i].length; j++) {
					System.out.print(strArr[j][i]+" ");
				}
			}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기  : ");
		int input = sc.nextInt();
		
		char[][] arr = new char[input][];
	
		for(int i=0; i<arr.length; i++) {
		System.out.print(i+ "열의 크기 : ");
		int in = sc.nextInt();
		
		arr[i] = new char[in];
		}
		char value = 'a';
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
				
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
		}
			System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}