package Array_Question;

public class RunningMax {

	public static int [] RunningMax(int [] arr) {
		
		int n=arr.length;
		int [] ans= new int[n];
		
		ans[0]=arr[0];
		for(int i=1; i<n;i++) {
			
			ans[i]= Math.max(ans[i-1], arr[i]);
		}	
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,1,10,20,3,40,10};
      
      int [] ans= RunningMax(arr);
      
      for(int i=0;i<ans.length;i++) {
    	  System.out.print(ans[i]+" ");
      }
      
      
	}

}
