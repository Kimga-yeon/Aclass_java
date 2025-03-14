package com.kh.poly.chap01.model.service;

import com.kh.poly.chap01.model.vo.Bentley;
import com.kh.poly.chap01.model.vo.Car;
import com.kh.poly.chap01.model.vo.Sonata;

public class PolyService {
	public void example1() {
		// 다형성(Polymorphism)
		// 부모 타입 참조 변수로 
		// 자식 타입 객체를 참조하는 것.(업캐스팅)
		// --> 부모 타입 참조형 변수 하나로
		// 	  다양한 자식 객체를 참조할 수 있다.
		
		Car[] cars = new Car[2];
		cars[0] = new Sonata();
		cars[1] = new Bentley();
		
		// ****************
		// 부모 타입 참조 변수로 자식 객체 참조 시
		// 자식 내부에 있는 자신 (부모) 부분만 참조 할 수 있다!!!
		//System.out.println(cars[0].hybride);
		
		System.out.println(cars[0].toString());
		
		
		
		
		// 다운 캐스팅
		// 부모 타입 참조 변수로 자식 객체 전체를 참조해야될 경우 
		// 부모 타입 참조 변수 -> 자식 타입 참조 변수 로 강제로 형변환
		
		int num = (int)10.123;  //강제 == 명시 필수 ()
		
		// cars[0]이 참조하고 있는 자식 객체는 Sonata 타입
		// Sonata만의 기능을 수행 하고자 할 때 
		// cars[0]을 부모 타입 참조 변수에서 자식 타입으로
		// 강제 형변환(다운 캐스팅) 하면 됨.
		
		System.out.println( ((Sonata)cars[0]).hybridMode());
		// 형변환 연산자 보다 점(.) 연산자의 우선 순위가 더 높음
		
		System.out.println( ((Bentley)cars[1]).takeOutUmbrella());
		
		
		// 다운 캐스팅 시 유의사항
		//System.out.println( ((Bentley)cars[0]).takeOutUmbrella());
		
		// instanceof 연산자
		// - 참조변수가 참조하고 있는 객체의 타입을 확인하는 연산자
		// - 타입 일치 시 true 아니면 false를 반환함
		// + instanceof의 결과가 true일 경우 
		//   ==비교했던 타입으로 다운 캐스팅이 가능하다. 
		
		
		System.out.println(cars[0] instanceof Sonata);
		// cars [0] 참조변수가 참조하는 객체의 타입이 소나타인가?
		
		System.out.println(cars[0] instanceof Bentley);
		
		System.out.println(cars[0] instanceof Car);
		// cars [0] 참조변수가 참조하는 객체의 타입이 소나타인가?
		
		
		// 다운캐스팅 가능여부 검사
		for(int i=0; i<cars.length; i++) {
			if(cars[i] instanceof Sonata) {
				System.out.println(((Sonata)cars[i]).hybridMode());
			}
			else if(cars[i] instanceof Bentley) {
				System.out.println(((Bentley)cars[i]).takeOutUmbrella());
			}
		}
		
		
		// 바인딩 확인
		System.out.println(cars[1].drive());
		
		
		
		
	}
}
