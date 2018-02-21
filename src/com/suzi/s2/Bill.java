package com.suzi.s2;

public class Bill {
	//STEAK
	
	public void billsteak(Food_Steak steak) {
		//정보를 찍어줘야하니까 steak를 받아오면 된다()안에 Food_Steak steak를 가져오자
		System.out.println(steak.name);
		System.out.println(steak.price);
		System.out.println(steak.source.oilname);
		System.out.println(steak.source.spicename);
	}
	
	public void billpasta(Food_Pasta pasta) {
		System.out.println(pasta.name);
		System.out.println(pasta.price);
		System.out.println(pasta.source.oilname);
		System.out.println(pasta.source.spicename);
	}
}
