package WrapperClass_demo;

public class demo_1 {
    
	public static void Incr(Integer a, int b) {
		a++;
		b++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  int b=12;
      Integer a=12;
//         Integer a= new Integer(12);
         Incr(a,b);
         System.out.println(a); // 12
         System.out.println(b); // 12
         // Wrapper class are immutate.
         
         
         
	}

}
