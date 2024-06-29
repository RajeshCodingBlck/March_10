package Recursion_revision;

public class PrintDec {
   
	public static void PrintDec(int n) {
		
		if(n==0) {
			return;
		}
		
		System.out.println(n);
		PrintDec(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PrintDec(5);
	}

}
