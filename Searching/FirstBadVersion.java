
import java.util.Scanner;

public class FirstBadVersion {
    
	public static boolean APIisPossible(int [] arr, int P, long time) {
		
		 long kitneProductBanSakteHe=0;
		 for(int i=0;i<arr.length;i++) {
			// ith se Kitne Product Bana Sakte he .
			long currMachineProduct= time/ arr[i];
			kitneProductBanSakteHe+=currMachineProduct;
			
			if(kitneProductBanSakteHe>=P) {
				 return true;
			}
		 }
		 
		 if(kitneProductBanSakteHe>=P) {
			 return true;
		 }else {
			 return false;
		 }
		 
	}
	public static long MinimumTime(int [] arr, int p) {
		
		long max_value=Long.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			max_value= Math.max(max_value, 1L*arr[i]);
		}
		long low=1;
		long high=max_value*p;
		
		long potential_candidate=-1;
		while(low<=high) {
			
			long mid= low+ (high-low)/2;
			if(APIisPossible(arr, p, mid)==true) {
				potential_candidate=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		
		return potential_candidate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       int n=s.nextInt();
       int k=s.nextInt();
       int [] arr=new int[n];
       for(int i=0;i<n;i++) {
    	   arr[i]=s.nextInt();
       }
       System.out.println(MinimumTime(arr, k));
       
	}

}
