package net.antra.controller1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {//class name

	
	public static void main(String[] args) throws ClassNotFoundException {//args
		 String str1="dormitory";
		    String str2="dirtyroom";
		    System.out.println("Hello Java");
		    char [] ch=str1.toCharArray();
		    char [] ch1=str2.toCharArray();
		    
		   Arrays.sort(ch);
		    Arrays.sort(ch1);
		    
		    
		    System.out.println(new String(ch));
		    System.out.println(new String(ch1));
		
		/*Class.forName("net.antra.controller1.InstanceControleFlow");
	
		InstanceControleFlow ist=new InstanceControleFlow(); */
		/*Parent p=new Parent();
		p.m3();
		p.parentM1();
		
		Child ch=new Child();
		ch.childM2();
		ch.m3();*/
		
		/*
		Parent pt=new Child();
		pt.parentM1();
		pt.m3();
	
		Child ch=(Child)pt;
		ch.childM2();*/
		
		/*Student st=new Student();
		st.setRollNo(10);
		
		System.out.println(st.getRollNo());
		
		
		String str=new String("manas");
		System.out.println(str.concat("kumar"));*/
		
		
	/*	Parent p=new Parent();
		p.SampleAbstm4();
		*/
		
		//Parent p=new Parent();
		//System.out.println(p.i);
		//System.out.println(p.j);
		//p.parentM1();
		//p.m3();
		//p.i=45;
		
		/*
		Child ch=new Child();
		System.out.println(ch.j);
		ch.childM2();
		ch.parentM1();*/
		//ch.m3();
		
		
		/*int a=10;
		int b=20;
		int c=30;
		int d=40;
		
		String str="manas";
		
		System.out.println(a+b+str+c+d);*/
		
		/*int x=4;
		int y=x--;//5
		
		System.out.println("final value of x:"+x);
		System.out.println("final value of y:"+y);
		*/
		
		/*Student st=new Student();
		System.out.println(st.rollno);
		st.rollno=400;
		System.out.println(st.rollno);
		
		Student st1=new Student();
		System.out.println(st1.rollno);
		*/
		//System.out.println(Sample.abc);
		//System.out.println(abc);
		//System.out.println(Student.rollno);
		/*Sample sm=new Sample();
		System.out.println(sm.ab);
		sm.ab=35;
		System.out.println(sm.ab);
		
		Sample sm1=new Sample();
		System.out.println(sm1.ab);*/
		
		/*Student st=new Student();
		System.out.println(st.rollno);
		st.rollno=45;
		System.out.println(st.rollno);*/
		
		
		
		/*int i=10;//identifier
		
		//a to z
		//A to Z
		//0 to 9
		//_
		//$
		int String=30;
		int _=123;
		
		System.out.println(String);*/
		
		//byte b=(byte) 130;//-128 to +127 //1 byte
		//System.out.println(b);
		/*short sh=123;//-32768 to 32767// 2bytes//-2^15 to 2^15-1
		int i=101;//-2^31 to 2^31-1// 4 bytes
		long lg=123;//-2^63 to 2^63-1//8 bytes
		float f=12.3f;//4 bytes// 5 to 6 digits 
		System.out.println(f);
		double d=12.45;//8 bytes//14 to 15 
		
		char ch=122;
		System.out.println(ch);
		
		boolean b=true;*/
		/*int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		int k[]= {1,2,3};
		for(int j=0;j<i.length;j++) {
			
			System.out.println(i[j]);
		}
		int m[]=new int[5];
		int[] n=new int[5];
		int []o=new int[5];*/
		
		
	}
	
	public void m2() {
		int i=30;
		System.out.println(i);
	}
}
