package MyHashFunction;

import java.util.HashMap;

public class InbuitHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//               key, value
		HashMap<String,Integer> m= new HashMap();
		
//		add
		m.put("Jyoti", 180);
		m.put("Akash", 90);
		m.put("Shivam", 100);
		m.put("Mohan", 50);
		m.put("Rohan", 50);
		
		
		System.out.println(m);
		
		// Delete
		m.remove("Mohan");
		System.out.println(m);
		
		// read
		System.out.println(m.get("Akshay"));
		
		System.out.println(m.getOrDefault("Aksh", -1000));
		
		// Update
		m.put("Akash", 70);
		System.out.println(m.containsKey("Aksh"));
		
		
	}
	
	

}
