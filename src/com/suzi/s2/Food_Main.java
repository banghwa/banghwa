package com.suzi.s2;


import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Food_Main {

	public static void main(String[] args) {
		/*Food_Pasta pasta = new Food_Pasta();
		pasta.name = "크림파스타";
		pasta.price = 15000;
		pasta.source = new Food_Source(); // 소스를 새로 만들어주는 것
		pasta.source.oilname = "olive";
		pasta.source.spicename = "hub";
		
		//소스 오일, 향신료
		Food_Pasta pasta2 = new Food_Pasta();
		
		System.out.println(pasta2.source.oilname); // 이 한줄만 가지고 실행시키면 에러가 뜬다.
		
		
		Food_Steak steak = new Food_Steak();
		steak.name = "티본스테이크";
		steak.price = 40000;*/
		
		/*pasta.name = steak.name;
		pasta.price = steak.price; // 멤버변수의 타입은 다 같음
		
		pasta = steak; // 멤버변수는 같지만 타입이 다르다 food_pasta / food_steak
*/
		
		//각각 한개씩 총 2개를 만들어야 하니까 2개를 만들어야 한다.
		//for(int i = 0;i<2;i++) 이런 식을 가지고 만드는 것은 1인분을 가지고 2인분을 만들어서 속여 파는 행위랑 마찬가지이다.
		
		/*Shef_Source s= new Shef_Source(); // 셰프하나를 초대
		
		Food_Source source = s.makeSource(2); //셰프가 만들어 온 소스를 가지고 오자 //소스가 제대로 만들어졌냐? --> return값을 보면 된다
		
		if(source != null) {
		System.out.println(source.oilname);
		System.out.println(source.spicename);
		}
		
		System.out.println("===================");
		Shef_Steak s2 = new Shef_Steak();
		*/
		
		/*Shef_Steak shef = new Shef_Steak();
		Food_Steak steak = shef.makeSteak(1); // 1번스테이크를 만들어주세요 steak접시에 담아서
		
		System.out.println(steak.name);
		System.out.println(steak.price);
		System.out.println(steak.source);
		System.out.println(steak.source.spicename);*/
		
		
/*		Shef_Source source = new Shef_Source();
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		Shef_Steak shef = new Shef_Steak();
		Food_Pasta pasta = new Food_Pasta();*/
		
		Menu order = new Menu(); // 메뉴객체를 생성
		order.order();
	
	}

}
