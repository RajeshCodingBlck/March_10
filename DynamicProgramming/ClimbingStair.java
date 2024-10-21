package DynamicProgramming;

public class ClimbingStair {
    
	public static int climbingStair(int n, int [] brain) {
		
		 if(n==0 || n==1) {
			 return 1;
		 }
		 // check kaam hua he ki nahi
		  if(brain[n] !=0) {
			  return brain[n];
		  }
		 
		 System.out.println(" N is "+ n);
		// 1 ka jump
		int ans1=climbingStair(n-1, brain);
		// 2 ka jump
		int ans2= climbingStair(n-2, brain);
		int meraAns= ans1+ans2;
		brain[n]=meraAns;
		return meraAns;
		
	}
	public static int climbingStair(int n) {
		
		 if(n==0 || n==1) {
			 return 1;
		 }
		// 1 ka jump
		int ans1=climbingStair(n-1);
		// 2 ka jump
		int ans2= climbingStair(n-2);
		int meraAns= ans1+ans2;
		return meraAns;
		
	}
	
	public static int climbingStairTabulation(int n) {
		
		int [] dp= new int[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	
	public static int helper(int n) {
		
		 int [] dp= new int[3];
		 dp[0]=1;
		 dp[1]=1;
		 for(int i=2;i<=n;i++) {
			 dp[2]=dp[0]+dp[1];
			 dp[0]=dp[1];
			 dp[1]=dp[2];
		 }
		 return dp[2];
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
//		int ans= climbingStair(6);
		int n=4;
		int [] brain= new int[n+1];
//		int ans= climbingStair(n, brain);
//		int ans=climbingStairTabulation(n);
		int ans= helper(n);
		System.out.println(ans);
	}

}
