package com.suzi.s1;

import java.util.Scanner;

public class StudentService {
	
	
	//학생추가 메서드
	//메서드명 : addStudent
	//학생인원수 입력
	//학생수만큼
	//이름입력
	//번호입력
	
	public Student[] addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int number = sc.nextInt();
		Student [] student = new Student[number];
		for(int i=0;i<number;i++) {
			Student s = new Student();
			System.out.println("학생의 이름을 입력하세요");
			s.name = sc.next();
			
			System.out.println("학생의 번호를 입력하세요");
			s.num = sc.nextInt();
			student[i] = s;
		}

		return student;
	}
}
