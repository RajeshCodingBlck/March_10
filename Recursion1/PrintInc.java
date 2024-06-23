package Recursion1;

public class PrintInc {

	public static void Printinc(int n) {
		
		if(n==0) {
			return ;
		}
		System.out.println(n);
		Printinc(n-1);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //System.out.println(Printinc(5))
		Printinc(5);
	}

}
