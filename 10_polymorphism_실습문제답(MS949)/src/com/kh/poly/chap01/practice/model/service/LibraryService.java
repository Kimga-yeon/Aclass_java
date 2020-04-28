package com.kh.poly.chap01.practice.model.service;

import com.kh.poly.chap01.practice.model.vo.ComicBook;
import com.kh.poly.chap01.practice.model.vo.Book;
import com.kh.poly.chap01.practice.model.vo.CookBook;
import com.kh.poly.chap01.practice.model.vo.Member;

public class LibraryService {
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	public LibraryService(){ // �⺻�����ڸ� �̿��Ͽ� bList�迭 �ʱ�ȭ
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new ComicBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new ComicBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);

	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] newList = new Book[bList.length];
		
		int count = 0;
		for(int i = 0; i < bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				newList[count++] = bList[i];
			}
		}
		return newList;
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		if(bList[index] instanceof ComicBook) {
			if(((ComicBook)bList[index]).getAccessAge() > mem.getAge()) {
				result = 1;
			}
		}
		
		if(bList[index] instanceof CookBook) {
			if(((CookBook)bList[index]).isCoupon() == true) {
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;
			}
		}
		return result;
	}
}
