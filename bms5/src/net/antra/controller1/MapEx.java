package net.antra.controller1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapEx {

	public static void main(String[] args) {
		
		ConcurrentHashMap hm=new ConcurrentHashMap();
		hm.put(0, "abc");
		hm.put(1, "manas");
		hm.put(2, "kumar");
		hm.put(3, "Yifan");
		hm.put(4,"JinXin");
		hm.put(5, "Luben");
		hm.put(6, "Wu");
		hm.put(7, "zeng");
		
		/*for(int i=0;i<hm.size();i++) {
			System.out.println(hm.get(i));
		}*/
		Set set=hm.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			
			System.out.println(hm.get(it.next()));
			hm.remove(4);
		}
		
	}
}
