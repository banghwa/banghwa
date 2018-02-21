package com.suzi.s3;

public class Point {
	
	//메서드 오버로딩(overloading)
	//메서드 오버로딩 조건
	//메서드의 이름은 같아야 함
	//단, 매개변수의 타입, 또는 갯수가 달라야 한다.
	//접근 지정자, 리턴타입은 상관이 없다.
	
	public void hap(int a, int b) {
		System.out.println(a+b);
		
	}
	public void hap2(int a, float b) {
		System.out.println(a+b);
	}
	
	public void hap3(float a, float b) {
		System.out.println(a+b);
	}
}
