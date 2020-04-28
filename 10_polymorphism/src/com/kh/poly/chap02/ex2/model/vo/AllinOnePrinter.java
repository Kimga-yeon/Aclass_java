package com.kh.poly.chap02.ex2.model.vo;

public abstract class AllinOnePrinter implements Printer,Scanner{
	// �������̽��� ���� ����� �����ϴ�!
	// Ŭ���� ���� ��ӿ����� ���� ��� (extends)
	
	// �߻� Ŭ���� 
	//=> �߻� �޼ҵ尡 �����ϴ� Ŭ���� (0���̻�)

	private String brand; // ������
	private String pName; // ��ǰ��
	
	public AllinOnePrinter() {} // �⺻ ������
	// �߻�Ŭ����, �������̽��� �̿��Ͽ� ��ü�� ���� �� �ִ�? no
	// why? �̿ϼ� Ŭ�����δ� ��ü ���� �Ұ�

	// �߻�Ŭ������ �� �����ڸ� �ۼ�?
	// �ڽ� ��ü ���� �� ���ο� �θ� �κ��� �����ϱ� ���ؼ� �ʿ�� ������
	// �̸� �̿��Ͽ� ���� �θ� ��ü�� ���� �� ����
	
	
	public AllinOnePrinter(String brand, String pName) {
		super();
		this.brand = brand;
		this.pName = pName;
	}

	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	
	
	@Override //�߰��� ���� ������ ���� �ʾұ� ������ Object���� �������̵�
	public String toString() { 
		return "AllinOnePrinter [brand=" + brand + ", pName=" + pName + "]";
	}

	
	
	
	
}
