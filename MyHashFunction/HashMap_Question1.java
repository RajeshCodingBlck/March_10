package MyHashFunction;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str= s.next();
		getFrequency(str);
		
	}
	public static void getFrequency(String str) {
		// TODO Auto-generated method stub
	   HashMap<Character, Integer> m= new HashMap();   
	   for(int i=0; i<str.length();i++) {   
		   char ch= str.charAt(i);
		   if(m.containsKey(ch)) {
			   
			   int old_fre= m.get(ch);
			   m.put(ch, old_fre+1);
		   }else {
			   m.put(ch, 1);
		   }
	   }
//	   System.out.println(m.size()); 
	   System.out.println(m.keySet());
	   for( char ch : m.keySet()) {
		   System.out.println(ch + "->"+ m.get(ch));
	   }
	   
	   Integer a=12;
	   int b= a;// Unboxing
	   
	   a=b; // AutoBoxing
	   long c=12;
	   int d= Integer.MAX_VALUE;
	   
	   System.out.println(d+2);
	   System.out.println(Integer.MIN_VALUE);
	   
	   
	}

}
