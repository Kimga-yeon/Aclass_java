package com.kh.object.chap06_constructor.run;

import javax.sound.midi.Soundbank;

import com.kh.object.chap06_constructor.model.vo.User;

public class ConstructorRun {
	public static void main(String[] args) {
		User u1 = new User();
					//User 객체를 기본생성자를 이용하여 생성
					//--> JVM에 의해서 필드가 기본값으로 초기화
		u1.setUserId("user1");
		u1.setUserPwd("1234");
		u1.setUserName("김철수");
		u1.setAge(20);
		u1.setGender('남');
		
		System.out.println(u1.selectUser());
		
		
		// 매개변수 있는 생성자로 객체 생성

		User u2 = new User("user2" , "qwer", "박영희" ,25 , '여');
		
		System.out.print(u2.selectUser());
		
		User u3 = new User("user3", "asdf" , "이순신", 40,'남');
		System.out.println(u3.selectUser());
		
		
		// 오버로딩 확인
		User u4 = new User("user4","dlkfjd");
		System.out.println(u4.selectUser());
		
		User u5 = new User("길동", 20, '남');
		System.out.println(u5.selectUser());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
