package MyHashFunction;

public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	    MyHashMap m= new MyHashMap();
	    
	    m.put("Mohan", 120);
	    m.put("Sohan", 100);
	    System.out.println(m.get("Mohan"));
	    m.put("Mohan", 130);
	    System.out.println(m.get("Mohan"));
	    System.out.println(m.containsKey("Mhan"));
	    
	    
	}

}
