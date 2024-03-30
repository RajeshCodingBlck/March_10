package Lec_4;

import java.util.Scanner;

public class Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       int n= s.nextInt();
       
       int row=1;
       
       int nsp= (n-1)/2;
       int nst=1;
       
       while(row<=n) {
    	   
    	   // work
    	   int i=1;
    	   while(i<=nsp) {
    		   System.out.print(" "+" ");
    		   i=i+1;
    	   }
    	   
    	   // Star
    	   int j=1;
    	   while(j<=nst) {
    		   
    		   System.out.print("*"+" ");
    		   j=j+1;
    		   
    	   }
    	   //Preparation
    	   
    	   if(row< (n/2)+1) {
    		   
    		   nst=nst+2;
    		   nsp=nsp-1;
    	   }else {
    		   
    		   nst=nst-2;
    		   nsp=nsp+1;
    	   }
    	   
    	   row=row+1;
    	   System.out.println();
       }
       
       
	}

}
