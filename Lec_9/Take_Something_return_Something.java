package Lec_9;

public class Take_Something_return_Something {

	public static int add(int a, int b) {

		System.out.println("add is Start");
		int ans = a + b;
		System.out.println("add is End");

		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main is Start");
		int ans = add(12, 13);
		System.out.println(ans);
		System.out.println("Main is End");

	}

}
