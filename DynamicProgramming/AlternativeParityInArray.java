package DynamicProgramming;

public class AlternativeParityInArray {
    
	public static int AlterParity(int [] arr) {
		
		int n= arr.length;
		int [] dp=new int[n];
		dp[0]=1;
		int ans=1;
		for(int i=1;i<n;i++) {
			
			if(arr[i]%2  != arr[i-1]%2) {
				dp[i]=1+dp[i-1];
			}else {
				dp[i]=1+0;
			}
			ans= Math.max(ans, dp[i]);
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,2,3,3,4,5,6,7,8,10,12};
       
	}

}
