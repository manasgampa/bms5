package net.antra.controller1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MyList{

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList(1);
		al.add(1);
		al.add(3);
		al.add(2.5f);
		al.add("manas");
		al.add(new Student());
		al.remove(2);
		boolean b=al.contains("manas1");
		List li=Collections.unmodifiableList(al);
		
		
		System.out.println(b);
		/*	for(int i=0;i<al.size();i++) {
			
			System.out.println(al.get(i));
		}*/
		
		/*for(Object o:al) {
			
			System.out.println(o);
		}*/
		
		/*Iterator it=al.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}*/
		ListIterator it= al.listIterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
	}

}
