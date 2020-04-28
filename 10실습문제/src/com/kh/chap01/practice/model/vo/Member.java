package com.kh.chap01.practice.model.vo;


/* MVC Model2 (model,view, Controller) 
 * 
 * view = ���� �������� �κ� , input,output��� �Է����
 *        Print / Scanner
 * controller = ��������� ,(����ġ��) 
 * Model = ������κκ�, ����������ҿ���, ����ó������
 *   -vo(Value Object) = ���� �����ϰ� �̿��ϴ� ��ü 
 * 
 * Run = �����ϱ� ���� ���� 
 * 
 * */

public class Member {
	private String name; // �̸�
	private int age; // ����
	private char gender; // ����
	private int couponCount; // ��������
	
	
// �ʵ忡 �����̺� ���� ���� �߻�ȭ,ĸ��ȭ  
//(���ʿ� ���� ����Ⱥκ�����,�ܺηκ��� �������� ����(��������))  	
// �������� get/setter 
	
	
	public Member() {}
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	
	// this ���� ��ü�� �����ּ�
	// this() �𽺻�����? ���� ������ �߿��� �ٸ� �����ڸ� ȣ���Ҷ� 
	// super �θ� ����Ű�� ��������
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	public int getCouponCount() {
		return couponCount;
	}
	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}
	
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + " , couponCount ="+ couponCount+ "]";
	}
	
	
	
}
