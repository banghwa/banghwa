package com.suzi.s2;

import java.util.Scanner;

public class Menu {
	
	
	public void order() {
		Bill bill = new Bill(); // Bill(클래스명) bill(변수명) Bill();=> 은 메서드이다.
		
		//생성자(Constructor)
		//객체 생성시 딱 한번 호출 되는 초기화 메서드
		// 모든 클래스는 생성자를 한 개 이상 존재 해야만 한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 요리를 선택해주세요"); // system은 대문자로 시작하니까 클래스명
		System.out.println("=======MENU========");
		System.out.println("1.안심스테이크");
		System.out.println("2.등심스테이크");
		System.out.println("3.립스테이크");
		System.out.println("4.크림파스타");
		System.out.println("5.로제파스타");
		System.out.println("6.알리오올리오");
		
		Shef_Steak steak = new Shef_Steak(); // 스테이크 만드는 사람
		Shef_Pasta pasta = new Shef_Pasta(); // 파스타 만드는 사람
		
		//Shef_Source source = new Shef_Source();
		
		int select = sc.nextInt();
		
		/*switch (select) {
		case 1:
			
			break;
		case 2:
			
		case 3:
			Food_Steak steak1 = steak.makeSteak(select);
			System.out.println(steak1.name);
			System.out.println(steak1.price);
			System.out.println(steak1.source.oilname);
			System.out.println(steak1.source.spicename);
			break;
		case 4:
		
		case 5:
			
		case 6:
			Food_Pasta pasta1 = pasta.makePasta(select-3);
			System.out.println(pasta1.name);
			System.out.println(pasta1.price);
			System.out.println(pasta1.source.oilname);
			System.out.println(pasta1.source.spicename);
			
			
			
		default:
			break;
		}*/
		Food_Steak fs = null;
		Food_Pasta fp = null;
		if(select < 4) {
			fs = steak.makeSteak(select);//스테이크만드는 사람한테 스테이크 만들어달라고 하자
			bill.billsteak(fs);
		
		}
		else {
			fp = pasta.makePasta(select-3);
			bill.billpasta(fp);
		}
	}
}
