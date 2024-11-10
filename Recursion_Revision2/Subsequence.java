package Recursion_Revision2;

public class Subsequence {

	static int count=0;
	public static int Subsequence(String ques, String ans) {
		
		if(ques.length()==0) {
			
			System.out.println(ans);
			count++;
			return 1;
		}
		 char ch= ques.charAt(0);
		 String remaining_ques=  ques.substring(1);
		 
		 int chhota_ans1=Subsequence(remaining_ques, ans+ch);
		 int chhota_ans2=Subsequence(remaining_ques, ans+"");
		 int mera_ans= chhota_ans1+chhota_ans2;
		 return mera_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int ans= Subsequence("abc", "");
       System.out.println(ans);
	}

}
