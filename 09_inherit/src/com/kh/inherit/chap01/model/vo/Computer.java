package com.kh.inherit.chap01.model.vo;

// Computer클래스가 Product 클래스를 상속
// 상속 키워드 : extends(확장하다)
// 부모의 멤버 + 자식의 멤버 -> 부모보다 몸집이 확장됨


public class Computer extends Product{
	// extends(상속) Product(클래스명) 추가하고 겹치는 거 주석처리 하기 
	private String cpu;
	private int ram;
//	private String pName;
//	private int price;
	
	// 기본생성자
	public Computer() {
		super();
		// super() 의 기본생성자는 작성하지 않아도 JVM에 의해서 
		// 컴파일 단계에서 자동으로 생성자 제일 위쪽에 추가됨.
	}
	
	// 생성자 자동 완성
	// alt + shift + s -> o
	
	public Computer(String cpu, int ram, String pName, int price) {
		super();
		this.cpu = cpu;
		this.ram = ram;
	//	this.pName = pName;
	//	this.price = price;
	}
	
	
	// get / setter
	// alt + shift + s -> r
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	/*public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	 */
	public String selectField() {
		return cpu + " / " + ram + " / ";// + pName + " / " + price;
	}
	

	
	
	
}
