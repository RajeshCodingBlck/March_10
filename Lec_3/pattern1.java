package Lec_3;
import java.util.*;
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        
        int n= s.nextInt();
        
        int row=1;
        
        while(row<=n) {
        	
        	int i=1;
            while(i<=row) {
            	
            	System.out.print("*");
            	i=i+1;
            }
             
        	row=row+1;
        	System.out.println();
        	
        }
        
	}

}
