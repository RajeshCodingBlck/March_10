import java.util.*;
public class Main {

	static int count=0;
	public static void climbingwithDic(int n, String ans, int m) {
		
		if(n==0) {
			System.out.print(ans+" ");
			count++;
			return  ;
		}
		if(n<0) {
			return ;
		}
		
//		climbingwithDic(n-1, ans+"1");
//		climbingwithDic(n-2, ans+"2");
//		climbingwithDic(n-3, ans+"3");
//		climbingwithDic(n-4, ans+"4");
//		climbingwithDic(n-5, ans+"5");
//		climbingwithDic(n-6, ans+"6");
		

		for(int jump=1;jump<=m;jump++) {
			climbingwithDic(n-jump, ans+ jump, m);
		}
		
	}
    public static void main(String args[]) {
        // Your Code Here

		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int m= s.nextInt();
		climbingwithDic(n, "",m);
		System.out.println("\n"+ count);
    }
}
