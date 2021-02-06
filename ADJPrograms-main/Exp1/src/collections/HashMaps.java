package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMaps {
	public static void main(String[] args) {
		HashMap<Integer,String> st = new HashMap<Integer,String>();
		st.put(1227, "sumaja");
		st.put(1233, "supraja");
		st.put(1225, "srija");
		st.put(1236, "sowmya");
		st.put(1219, "Prashanrthi");
		st.put(1236, "Himabindu");
		st.put(1237, "Chandana");
		
		Set keys = st.entrySet();
		Iterator itr = keys.iterator();
		
		System.out.println("HashMap after insertion:");
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue()); 
		}
		
		hm.remove(1233);
		System.out.println("HashMap after deletion:");
		Iterator itr1 = keys.iterator();
		while(itr1.hasNext()) {
			Map.Entry me = (Map.Entry)itr1.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue()); 
		}
		
		hm.replace(1227,"Kadali");
		System.out.println("HashMap after replace operation:");
		Iterator itr2 = keys.iterator();
		while(itr2.hasNext()) {
			Map.Entry me = (Map.Entry)itr2.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue()); 
		}
	}
}
