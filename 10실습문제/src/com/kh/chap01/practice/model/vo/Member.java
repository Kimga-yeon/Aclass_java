package com.kh.chap01.practice.model.vo;


/* MVC Model2 (model,view, Controller) 
 * 
 * view = 눈에 보여지는 부분 , input,output담당 입력출력
 *        Print / Scanner
 * controller = 원격제어기 ,(스위치문) 
 * Model = 기능적인부분, 데이터저장소연결, 업무처리용기능
 *   -vo(Value Object) = 값을 저장하고 이용하는 객체 
 * 
 * Run = 실행하기 위한 구문 
 * 
 * */

public class Member {
	private String name; // 이름
	private int age; // 나이
	private char gender; // 성별
	private int couponCount; // 쿠폰개수
	
	
// 필드에 프라이빗 쓰는 이유 추상화,캡슐화  
//(불필요 제거 공통된부분추출,외부로부터 직접접근 차단(정보은닉))  	
// 간접접근 get/setter 
	
	
	public Member() {}
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	
	// this 현재 객체의 시작주소
	// this() 디스생성자? 나의 생성자 중에서 다른 생성자를 호출할때 
	// super 부모를 가르키는 참조변수
	
	
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
