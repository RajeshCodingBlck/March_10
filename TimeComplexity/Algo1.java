package TimeComplexity;

public class Algo1 {

	public static int Sum(int n) {
		
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		long startTime=  System.nanoTime();
		int ans= Sum(10);
		System.out.println(ans);
		long endTime= System.nanoTime();
		System.out.println(endTime-startTime);
		
	}

}
