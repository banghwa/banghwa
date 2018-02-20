package com.suzi.s1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//SchoolController sc = new SchoolController();
		new SchoolController().start(); // 나중에 이 객체에 무언가를 호출하고 싶을 때 <주소값을 저장하고 싶은 변수가 필요한데 start매서드를 한번 호출하면 더 이상 호출할 일이 없기 때문에 써도 됨.
		//sc.start();
		System.out.println();
		//객체 : 눈에 보이는 사물 또는 개념
		//학생 : 3명, 1명당 Object
		Scanner sc = new Scanner(System.in);
		Student [] ar = new Student[2]; // 학생이 채워지지 않은 빈 교실을 만들었을 뿐 // 학생을 담을 배열
		Student student = new Student();
		ar[0] = student; // 학생을 집어넣는 코드를 만들어야함
		ar[1] = new Student();
		ar[0].name = sc.next();// suji 교실로 가서 첫번째 있는 자리에 빈교실에 0번째 사람의 이름을 대입해라 이름이 없는 학생을 어떻게?대입핼가?
		
		/*for(int i=0;i<ar.length;i++) { // 위와 아래의 차이점은? 위와 같은 실수를 하면 안된다.
			student.name = sc.next();
			ar[i] = student; // i=0, iu i=1, suji 사람이 3명이면 사람객체를 3명 만들어야 되는데 이 코드는 원래 있던 것을 계속 수정해나가는 것
			System.out.println(ar[i].name);
		}
		System.out.println("===================");
		for(int i=0;i<ar.length;i++) {
			student = new Student(); // 무조건 새로만든다는 것은 new 이 코드를 새로 써 넣어야된다.
			student.name = sc.next();
			ar[i] = student;
			System.out.println(ar[i].name);
		}*/
	}
}
