package com.kh.object.chap06_constructor.run;

import javax.sound.midi.Soundbank;

import com.kh.object.chap06_constructor.model.vo.User;

public class ConstructorRun {
	public static void main(String[] args) {
		User u1 = new User();
					//User ��ü�� �⺻�����ڸ� �̿��Ͽ� ����
					//--> JVM�� ���ؼ� �ʵ尡 �⺻������ �ʱ�ȭ
		u1.setUserId("user1");
		u1.setUserPwd("1234");
		u1.setUserName("��ö��");
		u1.setAge(20);
		u1.setGender('��');
		
		System.out.println(u1.selectUser());
		
		
		// �Ű����� �ִ� �����ڷ� ��ü ����

		User u2 = new User("user2" , "qwer", "�ڿ���" ,25 , '��');
		
		System.out.print(u2.selectUser());
		
		User u3 = new User("user3", "asdf" , "�̼���", 40,'��');
		System.out.println(u3.selectUser());
		
		
		// �����ε� Ȯ��
		User u4 = new User("user4","dlkfjd");
		System.out.println(u4.selectUser());
		
		User u5 = new User("�浿", 20, '��');
		System.out.println(u5.selectUser());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
