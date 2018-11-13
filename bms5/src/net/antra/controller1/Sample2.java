package net.antra.controller1;


import java.sql.Driver;
import java.util.InputMismatchException;
import java.util.Scanner;

import net.antra.controller2.Test;


public class Sample2 {

	public static void main(String[] args) throws ClassNotFoundException{
	
		
		/*int i[]=new int[3];
		i[0]=2;
		i[1]=4.5f;
		i[2]="String";*/
		
		
		/*StringBuffer sb1=new StringBuffer("manas");
		StringBuffer sb2=new StringBuffer("manas");
		String str1=sb1.toString();
		String str2=sb2.toString();
		System.out.println(str1.equals(str2));
		int i=10;
		
		Test t=new Test();
		
		Driver d=new oracle.jdbc.driver.OracleDriver();
		*/
		
		
		
	/*	int i=10;
		String str1=new String("manas");
		String str2=new String("manas");
		String str2=str.concat("kumar");
		System.out.println(str+i);
		System.out.println(str2);
		
		System.out.println(str1.equals(str2));
		
		
		String str3="manas";*/
		
		/*Child ch=new Child();
		ch.m3();*/
		
		/* Student st1=new Student();
		 st1.setRollNo(1);
		 st1.setName("manas");
		 
		 Student st2=new Student();
		 st2.setRollNo(1);
		 st2.setName("manas");
		 
		 System.out.println(st1);
		 System.out.println(st2);
		
		 if(st1.equals(st2)) {
			 System.out.println("true");
		 }else {
			 System.out.println("false");
		 }*/
		
		
		
		 
		
		
		
		/*	try {
			throw new StudentNotFoundException("please check the details");
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*Scanner sc=new Scanner(System.in);
		try {
			Class.forName("net.antra.controller1.Student");
	
		System.out.println("hiii");
		
		
		int i=sc.nextInt();
		int j=sc.nextInt();//mispatch
		
		System.out.println(i/j);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}catch(ArithmeticException e ) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("error");
		}finally {
			sc.close();
			System.out.println("in finally block");
		}
		System.out.println("last");
		throw new ArithmeticException();
		*/
		//doStuff();
	
	
	}

	
	
	
	
	
	
	
	
	public static void doStuff() {
		
		System.out.println("before do more stuff");	
		try {
		doMoreStuff();
		}catch(Exception e) {}
		System.out.println("after do more stuff");
	}
	
	public static void doMoreStuff() {
		System.out.println("in do more stuff before exception");
		
		System.out.println(1/0);
		
			
		
		System.out.println("in do more stuff after exception");
	}
}
