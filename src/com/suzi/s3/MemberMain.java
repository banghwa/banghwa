package com.suzi.s3;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member(); // 우리가 만든 public member()를 호출함
	/*	m.info();
		Member m2 = new  Member();
		m2.info();*/
		
		m.name = "suzi";
				m.age = 29;
		m.info();
		
		/*Point p = new Point();
		p.kor = 50;
		p.eng = 50;
		
		System.out.println(p.total);
		System.out.println(p.avg);
		
		Point p = new Point();
		p.hap(10, 15);
		p.hap2(10, 15.1f);*/
	}

}
