package net.antra.controller1;

public class InstanceControleFlow {

	int i;
	String name;
	
	static{
		//System.out.println("in static block");
	}
	
	{
		System.out.println("welcome to class");
	}
	
	InstanceControleFlow(){
		System.out.println("in default constructor");
	}
	InstanceControleFlow(int i,String name){
		this.i=i;
		this.name=name;
	}
	
	public static void main(String[] args) {
		
	}
	
	public void m1() {
		System.out.println("in m1 method");
		
	}
	
}
