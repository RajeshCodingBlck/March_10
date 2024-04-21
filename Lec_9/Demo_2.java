package Lec_9;

public class Demo_2 {
   
public static  int add() {
		
		System.out.println("add is Start");
		int a=12;
		int b=13;
		int ans=a+b;
		System.out.println("add is End");

		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main is Start");
		int ans=add();
		System.out.println(ans);
		System.out.println("Main is End");
		
	}
}
