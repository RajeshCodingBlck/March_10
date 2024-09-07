package Lec_1;
import java.util.*;
public class CaseStudy {

//	public static void add(int a, int b){
//        
//	       int sum=a+b;
//	        
//	        if(sum==8){
//	            return sum;
//	        }else {
//	        	System.out.println("Hello");
//	        	return 10;
//	        }
//	    }
	    public static void main(String[] args) {
	    
	       Scanner s= new Scanner(System.in);
	       int r= s.nextInt();
	       int c= s.nextInt();
	       int [][] arr= new int[r][c];
	       
	       for(int i=0; i<r;i++) {  
	    	   for(int j=0;j<c;j++) {
	    		   
	    		   arr[i][j]= s.nextInt();
	    	   }
	       }
	       
	       for(int i=0; i<r;i++) {  
	    	   for(int j=0;j<c;j++) {
	    		   
	    		System.out.print(arr[i][j]+" ");
	    	   }
	    	   System.out.println();
	       }
	       
	        
	    }

}
