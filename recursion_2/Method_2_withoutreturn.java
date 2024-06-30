package recursion_2;

public class Method_2_withoutreturn {
    
	public static void printCombination(int n, String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		printCombination(n-1, "H" +ans);
		printCombination(n-1, "T" +ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCombination(3, "");
	}

}
