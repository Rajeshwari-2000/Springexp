package com.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class MyClass {
	public void m1() {
		System.out.println("in M1 Method");
	}

	public void m2() {
		System.out.println("in M2 Method");
	}
	
	public void m3(int x) {
		System.out.println("in M3 Method"+x);
	}
	public void getX() {
		System.out.println("in getx Method");
	}
}
