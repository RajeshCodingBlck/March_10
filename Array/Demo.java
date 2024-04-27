package Array;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// arr is not a array, 
//	   it is a reference varible of 1D array of type int.
      int [] arr = new int [5];
      
     // System.out.println(arr);
     // System.out.println(arr+4); Java not Allowed to us.
//      
      //arr[0]=1;
//      arr[1]=2;
//      arr[2]=3;
//      arr[3]=4;
//      arr[4]=5;
      
//      System.out.println(arr[1]);
      
      
        for(int i=0; i< 5;i++) {
        	arr[i]=i+1;
        }
        
//        System.out.println(arr[3]);
        
        // print the Array
        for(int i=0; i<5;i++) {
        	System.out.print(arr[i]+ " ");
        }
        
        // Input from User.
        Scanner s= new Scanner(System.in);
        for(int i=0; i<5;i++) {
        	
        	arr[i]= s.nextInt();
        }
        
       // print the Array
        for(int i=0; i<5;i++) {
        	System.out.print(arr[i]+ " ");
        }
        
        
        
    
	}

}
