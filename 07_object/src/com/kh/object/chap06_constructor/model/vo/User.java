package com.kh.object.chap06_constructor.model.vo;

public class User {
	
	/* 클래스의 기본구조
	 * 
	 * public class 클래스명 {
	 * 		필드
	 * 
	 * 		생성자
	 * 
	 * 		메소드
	 * 			-> get/setter
	 * 			-> 필드 정보 출력 메소드
	 * 			-> 해당 객체만의 추가 기능
	 * } 
	 * 			
	 * */
	
	// 필드
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	
	// 생성자
	/*
	 * *생성자를 사용하는 목적
	 * - new 연산자를 통해 객체가 Heap 영역에 생성될 때 
	 *   객체의 생성과 동시에 필드를 초기화 해줄 목적으로 사용
	 * 
	 * - 호출하는 생성자에 따라서 객체의 필드가 초기화 되는 모양이 다름
	 * 
	 * - 생성자 작성 시 주의사항 
	 * 1. 생성자명은 반드시 클래스명과 같아야 한다.
	 * 2. 반환형은 존재하지 않는다.
	 * 3. 매개변수 있는 생성자만 작성할 경우
	 *    JVM에 의하여 기본 생성자가 자동 생성되지 않음
	 *    --> 필요할 경우 기본생성자를 반드시 작성해야함.
	 * */
	
	// 기본 생성자
	// [접근제한자]  클래스명 (){
	//   수행기능;
	// }
	
	public User() {
		// 객체 생성을 목적 
		
		System.out.println("User() 기본 생성자에 의해서 객체가 생성됨.");
	}
	
	

	//** 만약 클래스 내부에 기본 생성자가 작성되지 않은 경우
	// JVM에 의해서 컴파일 단계에서 자동으로 추가됨.
	// ex) public User(){}
	
	// 매개 변수 있는 생성자
	// 객체 생성과 동시에 매개변수로 전달 받은 값으로 필드를 초기화하는 목적으로 사용.
	public User(String userId,String userPwd, String userName, int age, char gender) {
		
		this(userName, age, gender);
		//this(userId, userPwd);
		
		// this() 생성자 
		// - 같은 클래스에서 다른 생성자를 호출할 때 사용
		
		// ** this() 생성자는 반드시 호출하려는 생성자의 제일 첫 번째 줄에 작성 되어야 한다.
		
		// this()생성자 사용 시 장점
		// 1) 중복 코드 제거
		// 2) 코드 길이 감소
		
	
		this.userId = userId;
		this.userPwd = userPwd;
		
	}
	
	
		/*this.userName = userName;
		this.age = age;
		this.gender = gender;
	
	
	
	/* 오버로딩 (Over Loading, 과적)
	 * 
	 * - 한 클래스 내에서 동일한 이름의 메소드를 여러개 작성 하는 기법
	 * 
	 * - 오버로딩의 조건 
	 * 1. 매개변수의 개수
	 * 2. 매개변수의 타입
	 * 3. 매개변수의 순서
	 * 
	 * 위 세가지 중 하나라도 충족 시 오버로딩 가능
	 *  + 메소드명이 동일해야 함.
	 *  
	 * */
	
	
	public User(String userId,String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
	// 매개변수의 개수가 다르므로 오버로딩 성립
	public User(String userName, int age, char gender) {
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}
	
	// 매개변수의 순서가 다르므로 오버로딩 성립
	public User( char gender, String userName, int age) {
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}
	
	
	
	// 매개변수의 타입이 다르므로 오버로딩 성립
	public User(String userId,String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	// 매개변수의 개수, 타입, 순서가 모두 일치하므로 오버로딩 성립X
	// 순서는 배열타입으로 구분
	/*public User( String userName, String userId,String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	*/
	
	
	
	
	
	

	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPwd() {
		return userPwd;
	}


	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
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
	
	public String selectUser() {
		return userId +"/" + userPwd + "/" + userName + "/" + age + "/" + gender;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
