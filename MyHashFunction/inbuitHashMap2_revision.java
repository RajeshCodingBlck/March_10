package MyHashFunction;

import java.util.*;

public class inbuitHashMap2_revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//                 key, value
		HashMap<String, Integer> m= new HashMap();
		
		// add
		m.put("Mohan",100);
		m.put("Aman", 45);
		m.put("rohan", 30);
		
		System.out.println(m);
		
		// remove
		m.remove("Moh");
		System.out.println(m);
		
		// update
		m.put("Aman", 79);
		System.out.println(m);
		
		// check
		System.out.println(m.containsKey("Mohn"));
		
		// Read
		System.out.println(m.get("Mohn"));
		
		// read
		System.out.println(m.getOrDefault("Mohn", -100));
		
		
		HashSet<String> s= new HashSet();
		
		
		
		
	}

}
