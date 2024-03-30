package Lec_3;
import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int row=1;
		
		// Observation for First Row
		int nst= n;// number of Star in first row
		
		while(row<=n) {
			
			
			// work
			int i=1;
			while(i<=nst) {
				
				System.out.print("*");
				i=i+1;
			}
			
			// Preparation for Next row
			nst=nst-1;
			
			row=row+1;
			System.out.println();
		}
		
	}

}
