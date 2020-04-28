package com.kh.object.chap01_abstractice.model.service;

import com.kh.object.chap01_abstractice.model.vo.Student;

public class AbstractionService {
	
	public void createStudent() {
	
			Student std = new Student();  // 학생 객체 생성
			
			// 비어있는 학생 객체에(std)에 속성(정보) 입력
			std.name = "김가연";
			std.age = 20;
			std.gender = '남';
			std.studentNumber = 12345;
			std.schoolName = "KH";
			std.grade = "A+";
			
			// 기능 수행
			std.attendance();
			std.study();
			std.test();
			std.eat();
			
			System.out.printf("%s학생은 %d세 %c자이며 학번은 %d 입니다",std.name,std.age,std.gender,std.studentNumber);
			
	}
}
