package Recursion_Revision2;

public class CoinToss {

	static int count=0;
	public static int CoinCombination(int n, String ans) {
		
		if(n==0) {	
			System.out.println(ans);
			count++;
			return 1;
		}
         int count_local=0;
		// Head will
		int chhota_ans1=CoinCombination(n-1, ans+"H");
		// Tail will
		int chhota_ans2=CoinCombination(n-1, ans+"T");
		return count_local= chhota_ans1+chhota_ans2;
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int ans=CoinCombination(3, "");
            System.out.println(ans);
	}

}
