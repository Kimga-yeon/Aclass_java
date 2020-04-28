package com.kh.inherit.chap01.model.vo;

// ComputerŬ������ Product Ŭ������ ���
// ��� Ű���� : extends(Ȯ���ϴ�)
// �θ��� ��� + �ڽ��� ��� -> �θ𺸴� ������ Ȯ���


public class Computer extends Product{
	// extends(���) Product(Ŭ������) �߰��ϰ� ��ġ�� �� �ּ�ó�� �ϱ� 
	private String cpu;
	private int ram;
//	private String pName;
//	private int price;
	
	// �⺻������
	public Computer() {
		super();
		// super() �� �⺻�����ڴ� �ۼ����� �ʾƵ� JVM�� ���ؼ� 
		// ������ �ܰ迡�� �ڵ����� ������ ���� ���ʿ� �߰���.
	}
	
	// ������ �ڵ� �ϼ�
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
