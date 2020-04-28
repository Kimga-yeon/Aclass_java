package com.kh.object.chap01_abstractice.model.run;

import com.kh.object.chap01_abstractice.model.service.AbstractionService;

public class AbstractionRun {
	public static void main(String[] args) {
		
		AbstractionService aService = new AbstractionService();
	
		aService.createStudent();
		
		
	}
}
