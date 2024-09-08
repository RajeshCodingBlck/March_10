package MyHashFunction;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,4,3,10,2,20};
      
      int [] prefix= new int[arr.length];
      
      // PreComputation
      prefix[0]=arr[0];
      for(int i=1;i<arr.length;i++) {
    	  
    	  prefix[i]= prefix[i-1]+arr[i];
      }
      
      int q=5;
      Scanner s= new Scanner(System.in);
      
      for(int i=1; i<=q;i++) {
    	  
    	  int l=s.nextInt();
    	  int r= s.nextInt();
    	  
    	  if(l==0) {
    		  System.out.println(prefix[r]);
    	  }else {
    		  System.out.println(prefix[r]-prefix[l-1]);
    	  }
      }
      
	}

}
