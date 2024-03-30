package Lec_3;

import java.util.Scanner;

public class factorial_natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 Scanner s= new Scanner(System.in);
			
			int n= s.nextInt();
			
			int i=1;
			
			int product=1;
			
			while(i<=n) {
				// work
				product=product*i;
			
				i=i+1;
			}
			
			System.out.println(product);
	}

}
