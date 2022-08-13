package practice;

import org.testng.annotations.Test;

public class Jenkin1 {
	int a = 10;
	int b =20;
	@Test
	public void display() {
		
		int c = a+b;
		System.out.println("the value of c is "+c);
		
	}
	@Test
	public void sub() {
		int d =a-b;
		System.out.println("the value of d is "+d);
	}

}
