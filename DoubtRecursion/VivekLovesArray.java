import java.util.*;
public class Main {

	public static int getScore(int [] arr, int i, int j){
         
      int totalSum=0;
	  for(int k=i; k<=j;k++){
		  totalSum+=arr[k];
	  }
      int leftsum=0;
	  for(int k=i; k<j ;k++){
		  leftsum+=arr[k];

		  int rightSum= totalSum-leftsum;

		  if(leftsum==rightSum){
             
			 int leftScore= getScore(arr, i, k);
			 int rightScore= getScore(arr, k+1, j);

			 int mera_ans= Math.max(leftScore, rightScore)+1;
			 return mera_ans;
		  }
	  }

	  return 0;

	}
    public static void main(String args[]) {

          Scanner s= new Scanner(System.in);
		  int t= s.nextInt();

		  while(t>0){

              int n= s.nextInt();
			  int [] arr= new int[n];
			  for(int i=0;i<n;i++){
				  arr[i]=s.nextInt();
			  }
			  int ans= getScore(arr, 0, n-1);
              System.out.println(ans);
			  t--;
		  }
    }
}
