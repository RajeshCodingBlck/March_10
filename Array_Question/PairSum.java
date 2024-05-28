package Array_Question;

public class PairSum {
   
	public static boolean CheckSum(int [] arr, int target_sum) {
		
		
		for(int i=0; i<arr.length;i++) {	
			for(int j=i+1; j<arr.length;j++) {		
				int sum=arr[i]+arr[j];
				
				if(sum==target_sum) {
					return true;
				}
			}
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {3,7,3,5,6,7,8};
      int target_sum=20;
      
      System.out.println(CheckSum(arr, target_sum));
	}

}
