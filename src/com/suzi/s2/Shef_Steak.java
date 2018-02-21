package com.suzi.s2;

public class Shef_Steak {
	
	public Food_Steak makeSteak(int select) {
		
			/*Shef_Source s = new Shef_Source(); // 스테이크만들 셰프는 소스를 담당하지 않기 때문에 소스만들 셰프를 초빙
			
			Food_Steak steak = new Food_Steak();
			steak.name = "함박";
			steak.price = 14000;
			steak.source = s.makeSource(2); // 소스만들 셰프에게 어떤 종류를 만들어달라고 부탁
			
*/			
		//1. 안심 스테이크 : 가격 30000 , 1번소스
		
		//2. 등심 스테이크 : 가격 40000 , 2번소스
		
		//3. 립스테이크, 가격 50000, 1번소스
		
		Food_Steak steak = new Food_Steak();
		
		Shef_Source s = new Shef_Source();
		
		switch (select) {
		case 1: 
			steak.name = "안심스테이크";
			steak.price = 30000;
			steak.source = s.makeSource(1);
			break;
		
		case 2:
			steak.name = "등심스테이크";
			steak.price = 40000;
			steak.source = s.makeSource(2);
		
		case 3:
			steak.name = "립스테이크";
			steak.price = 50000;
			steak.source = s.makeSource(1);
		default:
			break;
		}
			return steak;
			
		
	}
}
