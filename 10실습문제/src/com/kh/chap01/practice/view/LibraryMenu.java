package com.kh.chap01.practice.view;

import java.util.Scanner;

import com.kh.chap01.practice.model.service.LibraryService;
import com.kh.chap01.practice.model.vo.Book;
import com.kh.chap01.practice.model.vo.Member;

public class LibraryMenu {
	private LibraryService service = new LibraryService();
	private Scanner sc = new Scanner(System.in);
	
	
	
	
	
	public void mainMenu() {
		// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
		System.out.print("이름 : ");
		String name = sc.next();  // next 다음 한 단어
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		// sc.next()는 버퍼에 남아있는 개행문자를 무시하고 다음 단어를 읽어 들임
		// nextLine()대신 쓰면됌
		
		
		
		// LibraryService의 insertMember() 메소드에 전달
		Member m = new Member(name, age, gender);
		service.insertMember(m);
		
		
		int menu = 0;
		while(true) {
		System.out.println("==== 메뉴 ====");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("9. 프로그램 종료하기");
		System.out.print("메뉴 번호 : ");
		menu = sc.nextInt();
		sc.nextLine(); 
		
		
		
		switch(menu) {
		case 1 : System.out.println(service.myinfo()); break; 
				// LibraryController의 myInfo() 호출하여 출력
		case 2 : selectAll(); break;
		case 3 : searchBook(); break;
		case 4 : rentBook(); break;
		case 9 : System.out.println("<프로그램 종료> "); return;
				// return : 호출한 메소드로 반환(돌아가라) 
				// void  메소드 : "반환값"은 없다 
				// JVM이 컴파일 시 void 메소드 제일 마지막에 return을 자동 추가
		default : System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
		}
		
		
		
	}
	public void selectAll() {
		// LibraryService의 selectAll()메소드 호출하여 결과 값 Book[] 자료형 bList에 담기
		Book[] bList = service.selectAll(); 
		
		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력  대여할 때 도서번호를 알기 위해
		//ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
		for(int i=0; i<bList.length; i++) {
			System.out.println(i + "번 도서 : " + bList[i] );
				// 참조변수를 출력(print) 할때는 자동으로 .toString() 이 JVM에 의해서 추가됨.	bList[i].toString()
		}
		
		
		
	}
	
	
	public void searchBook() {
		//검색할 제목 키워드 : “ // 입력 받음 (keyword)
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		
		// 입력된 키워드를 이용하여 LibraryService의 searchBook()을 호출하고
		// 반환값을 book[] 자료형 searchList에 저장 후
		Book[] searchList = service.searchBook(keyword);
		
		// for문을 이용하여 검색 결과인 도서 목록 출력
		for(int i=0; i<searchList.length; i++) {
			if(searchList[i] == null) {
				break;
			} // null로 출력되는 부분 제거 
			System.out.println(searchList[i]);
			
			
		}
	}
	
	public void rentBook() {
		// 도서대여를 위해 도서번호를 알아야 하기 때문에 selectAll() 메소드 호출
		selectAll();
		
		// “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		// LibraryController의 rentBook() 에 전달
		// 그 결과 값을 result로 받고 그 result가
		int result = service.rentBook(index);
		
		// 0일 경우  “성공적으로 대여되었습니다.” 출력
		// 1일 경우  “나이 제한으로 대여 불가능입니다.” 출력
		// 2일 경우  “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니
		// 마이페이지에서 확인하세요” 출력
		
		
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
		}
		
		
	}
	
	
}
