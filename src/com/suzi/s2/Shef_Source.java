package com.suzi.s2;

public class Shef_Source {
	
	public Food_Source makeSource(int select) {   //()는 매개변수 선언하는 것 소스를 만든다는 것 -> 객체를 만든다는 것
		
		//1번 2번을 누군가가 요청해야지만 선택되기 때문에 외부에서 1,2번 숫자가 들어와야되기 때문에 매개변수를 활용해야 한다.
		
		Food_Source source = new Food_Source(); // 어차피 둘 중 하나만 만들면 되니까 위에 넣어도 상관이 없다. 그게 아니라면 각 케이스별로 넣어야함
		//Food_source source = null; // 이렇게 쓰면 밑에 2번이라고 표시한 항목을 2개에 다 넣을 수 있다
		switch (select) {
		case 1:
			//Food_Source source = new Food_Source();
			//source = new Food_Source(); // 2번
			source.oilname = "Olive";
			source.spicename = "Hub";
			break;

		case 2:
			//Food_Source source = new Food_Source();
			//source = new Food_Source(); // 2번
			source.oilname = "Milk";
			source.spicename = "cheese";
			break;
		
		default:
			break;
		}
		
		/*Food_Source source = new Food_Source();
		source.oilname = "Olive";
		source.spicename = "Hub";*/
		
		//oilName = "Milk"
		//spiceName = "cheese";
		
		
		
		return source;
	}
}
