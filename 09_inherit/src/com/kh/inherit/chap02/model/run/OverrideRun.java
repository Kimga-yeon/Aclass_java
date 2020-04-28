package com.kh.inherit.chap02.model.run;

import com.kh.inherit.chap02.service.OverrideService;

public class OverrideRun {
	public static void main(String[] args) {
		OverrideService service = new OverrideService();
		service.example1();
	}
}
