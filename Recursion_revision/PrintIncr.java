package Recursion_revision;

public class PrintIncr {

	public static void PrintInc(int n) {
		
		if(n==0) {
			return ;
		}
		
		PrintInc(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       PrintInc(5);
	}

}
