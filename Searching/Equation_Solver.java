package Searching;

import java.util.Scanner;

public class Equation_Solver {
	 
	//  x^2<=N  find the Maximum Value of x which Satisfing the Equation
    public static int Equation_Solver(int n) {
    	
    	 int low=1;
    	int high=n;
    	
    	int potential_candidate=-1;
    	while(low<=high) {
    		
    		int mid=(low+high)/2;  
    		if(mid*mid<=n) {
    			potential_candidate=mid;
    			low=mid+1;
    		}else {
    			high=mid-1;
    		}
    	}
    	return potential_candidate;
    }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
       // System.out.println(low);
        System.out.println(Equation_Solver(n));
        
	}

}
