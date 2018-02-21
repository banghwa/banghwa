package com.suzi.s3;

public class CarMain {

	public static void main(String[] args) {
	/*	Car c = new Car();
		c.color = "Red";
		c.brand = "audi";
		c.CC = 3000;
		c.info();*/
		
		Car c = new Car();
		c.info();
		c.make();
		
		Car c2 = new Car("Black");
		c2.info();
		
		Car c3 = new Car("Gray", "Benz");
		c3.info();

	}

}
