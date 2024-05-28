package Lec_3;

import java.util.Scanner;

public class Sum_of_Natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
     Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int i=1;
		
		int sum=0;
		
		while(i<=n) {
			// work
			sum=sum+i;
		
			i=i+1;
		}
		
		System.out.println(sum);
		
	}

}
