package com.kh.objectarray.practice.model.service;

import java.util.Scanner;

import com.kh.objectarray.practice.model.vo.Student;

public class PracticeService {
	public void start() {
		
		
		// while���� ����Ͽ� �л����� ������ ��� �Է� �ް� 
		// �� �� �߰� �� ������ ī��Ʈ��
		// ��� �߰��� ������ �����, ��ҹ��� ������� ��y���̸� ��� ��ü �߰�
		
		// 3�� ������ �л� ������ �Է� �޾� �� ��ü�� ������
		// ���� ��ϵ� �л����� ������ ���� ����� ����
		// �л����� ������ ��� ��� (��� ����)

		Scanner sc = new Scanner(System.in);
		
		// 1) �ִ� 10���� �л� ������ ����� �� �ְ� �迭�� �Ҵ��Ѵ�.
		Student students[] = new Student[10];
		
		int count = 0;
		
		
		// 2) while���� ����Ͽ� �л����� ������ ��� �Է� �ް� 
		// �� �� �߰� �� ������ ī��Ʈ��
		// ��� �߰��� ������ �����, ��y���̸� ��� ��ü �߰�
		while(true) {
			System.out.print("�г� : ");
			int grade = sc.nextInt();
			System.out.print("�� : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("�������� : ");
			int kor = sc.nextInt();
			System.out.print("�������� : ");
			int eng = sc.nextInt();
			System.out.print("�������� : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			students[count] = new Student(grade, classroom, name, kor, eng, math);
			
			count++;
			
			
			boolean flag = false;
			while(true) {
				System.out.print("��� �߰��� �̴ϱ� ? (y/n) : ");
				char ch = sc.nextLine().charAt(0);
				
				if(ch == 'n' || count == students.length) {
					// 3) 10���� �Է��� ��� ��� �Է��ϰų�, ��� �߰��� ������ ��� �� ��n���� �Է��� ���
					// �л� ���� �Է��� ����
					flag = true;
					break;
				} else if(ch == 'y') {
					// ��� �߰��� ������ �����, ��y���̸� ��� ��ü �߰�
					break;
					
				} else {
					// 4) 'y' �Ǵ� 'n'�� �Է����� ���� ��� 
					// "�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���" ��� ��
					// �ٽ� ��� �߰����� ���θ� ���.
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���");
				}
				
			}
			
			if(flag) {
				break;
			}
			
			System.out.println();
		}
		
		
		// 5) �Էµ� ��� �л����� ���� + ��� ������ ���
		for(int i=0 ; i<students.length ; i++) {
			
			if(students[i] == null) {
				break;
			}
			
			int sum = students[i].getKor() + students[i].getEng() + students[i].getMath();
			
			System.out.println(students[i].selectStudent() + ", ��� : " + sum/3);
		}
		
	}
}
