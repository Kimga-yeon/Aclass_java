package com.kh.inherit.practice.run;

import com.kh.inherit.practice.view.PracticeMenu;

public class PracticeRun {
	public static void main(String[] args) {
		
		new PracticeMenu().mainMenu();
		// PracticeMenu 객체를 1회용으로 생성하여 mainMenu() 호출
		// while 문으로 돌릴거기 때문에 1회성씀
	}
}
