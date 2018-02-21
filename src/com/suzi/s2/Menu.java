package com.suzi.s2;

import java.util.Scanner;

public class Menu {
	
	
	public void order() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 요리를 선택해주세요");
		System.out.println("=======MENU========");
		System.out.println("1.안심스테이크");
		System.out.println("2.등심스테이크");
		System.out.println("3.립스테이크");
		System.out.println("4.크림파스타");
		System.out.println("5.로제파스타");
		System.out.println("6.알리오올리오");
		
		Shef_Steak steak = new Shef_Steak();
		Shef_Pasta pasta = new Shef_Pasta();
		Shef_Source source = new Shef_Source();
		int select = sc.nextInt();
		
		switch (select) {
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
		}
	}
}
