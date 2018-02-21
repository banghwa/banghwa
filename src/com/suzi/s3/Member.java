package com.suzi.s3;

public class Member {
	String name;
	int age;
	
	public Member() {
		System.out.println("생성자 실행");
		System.out.println("멤버변수의 초기화 담당"); //변수의 최초의 값을 초기화 하는 것
		name = "iu";
		age = 26;
	}
	public void info() {
		System.out.println(name);
		System.out.println(age);
	}
}
