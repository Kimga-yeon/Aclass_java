package com.kh.inherit.chap01.model.vo;

public class Cup extends Product {
	private String brand;
	private double capacity;
	//private String pName;
	//private int price;
	
	
	public Cup() {}
	// 생성자 - 필드의 값을 입력하기 위함
	// 매개변수 있는 생성자 - 객체가 생성됨과 동시에 매개변수로 초기화 하겠다
	public Cup(String brand, double capacity, String pName, int price) {
		super();
		this.brand = brand;
		this.capacity = capacity;
		setpName(pName);
		setPrice(price);
		
		// 부모로 부터 상속받은 pName과 price는 접근제한자가 private 이므로
		// 직접 접근할 수는 없지만 
		// 부모로 부터 상속받은 간접 접근 방법 setpName(),setPrice()를 이용하여
		// pName , price를 초기화 할 수 있다.
		
		//	this.pName = pName;
		//	this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getCapacity() {
		return capacity;
	}


	public void setCapacity(double capacity) {
		this.capacity = capacity;
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
		return brand + " / " + capacity + " / " + getpName() + "/ " + getPrice();
			//pName + " / " + price;
	}		// 부모의 멤버변수에 직접접근 불가
	
		
	
}
