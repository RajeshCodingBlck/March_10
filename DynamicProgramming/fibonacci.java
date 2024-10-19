package DynamicProgramming;

import java.util.HashMap;

public class fibonacci {

	public static int fibo(int n
			, HashMap<Integer, Integer> brain) {
		
		if(n==0 || n==1) {
			return n;
		}
		// check kar raha ku Kaam hua he ki nahi
		if(brain.containsKey(n)) {
			return brain.get(n);
		}
		
		System.out.println("N is "+ n);
		int chhotaAns1=fibo(n-1, brain);
		int chhotaAns2=  fibo(n-2, brain);
		int meraAns= chhotaAns1+chhotaAns2;
		brain.put(n, meraAns); // Store
		return meraAns;
	}
	public static int fibo(int n, int [] brain) {
		
		if(n==0 || n==1) {
			return n;
		}
		if(brain[n] !=0) {
			return  brain[n];
		}
		
		System.out.println("N is "+ n);
		int chhotaAns1=fibo(n-1, brain);
		int chhotaAns2=  fibo(n-2, brain);
		int meraAns= chhotaAns1+chhotaAns2;
		brain[n]=meraAns;
		return meraAns;
	}
	
	public static int fibo(int n) {
		
		int [] dp= new int [n+1];
		dp[0]=0;
		dp[1]=1;
		// dp[i]= Answer of fibo(i)
		for(int i=2; i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	
	public static int fibo2(int n) {
		
		int [] dp= new int[3];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++) {
			dp[2]= dp[0]+dp[1];
			dp[0]=dp[1];
			dp[1]=dp[2];
		}
		return dp[2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<Integer, Integer> brain= new HashMap();
//       int ans= fibo(10, brain);
//       System.out.println(ans);
		 
//		  int n=10;
//		 int [] brain= new int[n+1];
//		 int ans= fibo(n, brain);
//		 System.out.println(ans);
		
		  System.out.println(fibo2(10));
	}

}
