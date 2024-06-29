package Recursion_revision;

public class Sum_of_Series {
    
	public static int Sum(int n, int a, int d) {
		
//		if(n==1) {
//			return a;
//		}
		
		if(n==0) {
			return 0;
		}
		
		// Smaller SubProblem 
	    int chhota_ans =Sum(n-1, a,d);
	    int a_nthTerm=  a+ (n-1)*d;
	    int mera_ans= chhota_ans+ a_nthTerm;
	    
	    return mera_ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int ans= Sum(5, 3,5);
       System.out.println(ans);
	}

}
