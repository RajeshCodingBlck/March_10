package Lec_8;

public class Demo_2 {
   
	
	public static void add() {
		
		System.out.println("add is Start");
		int a=12;
		int b=13;
		int ans=a+b;
		System.out.println("add is"+ans);
		System.out.println("add is End");
	}
	public static void sub() {
		
		System.out.println("Sub is Start");
		int a=12;
		int b=13;
		int ans=a-b;
		System.out.println("Sub is"+ans);
		System.out.println("Sub is End");
	}
	public static void main(String [] args) {
		
		System.out.println("Main is Start");
		add();
		sub();
		System.out.println("Main is End");
		
	}
}
