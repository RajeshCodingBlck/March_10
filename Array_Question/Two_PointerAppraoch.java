package Array_Question;

import java.util.Arrays;

public class Two_PointerAppraoch {
   
	public static boolean checkSum(int [] arr, int target_sum) {
		
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			
			int sum=arr[i]+arr[j];
			
			if(sum==target_sum) {
				return true;
			}else if(sum> target_sum) {
				// Hame Sum ko reduce karna he, to j ko dhatana hoga.
				j--;
			}else {
				// Hame Sum ko Increase karna he, to i ko badhana doga.
				i++;
			}
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr= {12,13,3,5,13,14};
         Arrays.sort(arr);  
         System.out.println(checkSum(arr, 100));
	}

}
