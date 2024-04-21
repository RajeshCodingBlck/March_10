package Lec_8;

public class Demo_3 {
   
	public static void gun(int b) {
		b++;
		System.out.println(b);
	}
	public static void fun(int a){
		
		a++;
		int b=23;
		gun(b);
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=12;
       fun(a);
       System.out.println(a);
       
	}

}
