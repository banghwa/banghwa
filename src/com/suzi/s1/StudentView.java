package com.suzi.s1;

import java.util.Scanner;

public class StudentView {
	//학생들의 정보를 출력하는 역할
	//메서드명 view
	//학생들의 정보를 출력
	
	public void view(Student [] student) {
		Scanner sc = new Scanner(System.in); // search매서드 들어갈 것들
		int select;
		boolean check = true;
		while(check) {
			System.out.println("번호를 입력하세요");
			select = sc.nextInt();
		for(int i=0;i<student.length;i++) {
			if(select == student[i].num) {
				check = false;
				break;
			}
		}
		
		
		
	/*	for(int i=0; i<student.length;i++) {
		if(select == student[i].num) {
			System.out.println("이름" + student[i].name);
			System.out.println("번호" + student[i].num);
			System.out.println("국어" + student[i].kor);
			System.out.println("영어" + student[i].eng);
			System.out.println("수학" + student[i].math);
			System.out.println("총점" + student[i].total);
			System.out.println("평균" + student[i].avg);
			check = false;
			break;
		
		}
		else {
			System.out.println("찾으시는 번호가 없습니다");
		}*/
	}
		
}
	public void viewStudent(Student student) {
		System.out.println("이름" + student.name);
		System.out.println("번호" + student.num);
		System.out.println("국어" + student.kor);
		System.out.println("영어" + student.eng);
		System.out.println("수학" + student.math);
		System.out.println("총점" + student.total);
		System.out.println("평균" + student.avg);
	}
}

