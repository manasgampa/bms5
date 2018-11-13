package net.antra.controller1;

public class Child extends Parent{

	int j=20;
	Child(){
		super();
		System.out.println("in child constructor");
	}
	public void childM2() {
		System.out.println("in child m2");
		
	}
	
	public void m3() {
		
		System.out.println("in child m3");
	}
}
