package String_demo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str1= new String("Hello");
     String str2= new String("Hello");
     
     if(str1==str2) {
    	 System.out.println("Me Same hu");
     }else {
    	 System.out.println("BHai Same nahi hu");
     }
     
     // Output :- Same nahi hu. Reason == check address.
     
	}

}
