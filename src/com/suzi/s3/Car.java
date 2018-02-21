package com.suzi.s3;

public class Car {
	String color;
	String brand;
	int CC;
	
	public Car() { // 기본 생성자를 지우게 되면 자동적으로 default생성자를 만들어주지 않기 때문에 에러가 뜬다.
		//default, 기본, 빈 생성자
		//color = "Red";
		//this(); 자신의 또다른 생성자를 호출
		
		this("Red");
		//생성자 라인의 첫줄에 기술
	}
	
	public Car(String color) {
		this(color, "Audi");
	}
	
	public Car(String color, String brand) {
		this(color, brand, 3000);
	}
	
	public Car(String color, String brand, int cc) {
		this.color = color;
		this.brand = brand;
		this.CC = cc;
    }
	
	public void info() {
		System.out.println("Color : " + this.color);
		System.out.println("Brand : " + this.brand);
		System.out.println("CC : " + this.CC);
		this.make();
	}
	
	public void make() {
		System.out.println("자동차 제작 완료");
	}
}
