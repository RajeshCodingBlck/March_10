package Lec_9;

public class Take_Nothing_return_Something {

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
		System.out.println(add());
		System.out.println("Main is End");
		
	}

}
