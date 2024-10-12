import java.util.*;
public class Main {

	static int count=0;
	public static void subset(int [] arr, int i,
	ArrayList<Integer> ans, int sum, int target ){
     
	 if(arr.length<= i){
		
		if(sum==target){
           
		   for(int val : ans){
			   System.out.print(val+" ");
		   }
		   System.out.print(" ");
		   count++;
		}

		return ;
	 }

	 if(sum> target){ // Backtracking Concept...
		 return;
	 }
   
     // ith index vali value ko choose kar sakte he
       ans.add(arr[i]);
	   subset(arr, i+1,ans, sum+arr[i], target);
	 // ith index vali value ko choose nahi karenge.
	 ans.remove(ans.size()-1);
	 subset(arr, i+1, ans, sum+0, target);


	}
    public static void main(String args[]) {
      
	  Scanner s= new Scanner(System.in);

	  int n= s.nextInt();
	  int [] arr= new int[n];
	  for(int i=0; i<n;i++){
		  arr[i]=s.nextInt();
	  }
	  int target= s.nextInt();
	  ArrayList<Integer> ans= new ArrayList<>();
	  subset(arr, 0, ans, 0, target);
	  System.out.print("\n"+ count);
    }
}
