package recursion_2;

public class StairProblem {
   
	public static void Stair(int n, String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		if(n<0) {
			return;
		}
		
		Stair(n-1, ans+"1");
		Stair(n-2, ans+"2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stair(4, "");
	}

}
