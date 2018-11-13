package net.antra.controller1;

public class StaticCtrlFlowEx {
	static int i=10;
	
	
	static {
		System.out.println(i);
		System.out.println("in static block");
	}
	public static void main(String[] args) {
		System.out.println("in main method");
		m1();
	}
	
	public static void m1() {
		
		System.out.println("in m1 method");
		
	}
	
}
