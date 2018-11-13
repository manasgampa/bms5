package net.antra.controller1;

import java.util.Comparator;

public class ExComprator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		//return -ve if i1 comes before i2
		if(i1>i2) {
			
			return -1;
		}else if(i1<i2) {
			//return +ve if i1 comes after i2
			return 1;
		}else if(i1==i2) {
			
			return 0;
		}
		
		
		return 0;
	}

}
