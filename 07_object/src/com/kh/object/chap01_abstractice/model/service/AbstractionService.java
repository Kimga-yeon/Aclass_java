package com.kh.object.chap01_abstractice.model.service;

import com.kh.object.chap01_abstractice.model.vo.Student;

public class AbstractionService {
	
	public void createStudent() {
	
			Student std = new Student();  // �л� ��ü ����
			
			// ����ִ� �л� ��ü��(std)�� �Ӽ�(����) �Է�
			std.name = "�谡��";
			std.age = 20;
			std.gender = '��';
			std.studentNumber = 12345;
			std.schoolName = "KH";
			std.grade = "A+";
			
			// ��� ����
			std.attendance();
			std.study();
			std.test();
			std.eat();
			
			System.out.printf("%s�л��� %d�� %c���̸� �й��� %d �Դϴ�",std.name,std.age,std.gender,std.studentNumber);
			
	}
}
