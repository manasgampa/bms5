package net.antra.controller1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {

	public static void main(String[] args) {
		
		TreeSet sh=new TreeSet(new ExComprator());
		sh.add(43);
		sh.add(5);
		sh.add(34);
		sh.add(23);
		sh.add(31);
		sh.add(45);
		sh.add(3);
		sh.add(12);
		sh.add(57);
		//System.out.println(sh);
		/*for(int i=0;i<sh.size();i++) {
			
			System.out.println(sh.get(i));
		}*/
		/*for(Object o:sh) {
			System.out.println(o);
		}*/
		Iterator it=sh.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
}
