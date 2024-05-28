package Lec_8;

public class Take_Something_return_Nothing {
    
	public static void add(int a, int b) {
		
		System.out.println("Add is Start");
		int ans=a+b;
		System.out.println(ans);
		System.out.println("Add is End");
		
	}
	
	public static void sub(int a,int b) {
		
		System.out.println("Sub is Start");
		int ans=a-b;
		System.out.println(ans);
		System.out.println("Sub is End");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println("Main is Start");
		int a=12;
		int b=13;
		add(a,b);
		System.out.println("Main is End");
		
		
	}

}
