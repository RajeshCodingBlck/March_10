package recursion_2;

public class BitCombination {

	public static void BitCombination(int n, String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		BitCombination(n-1, ans+"0");
		BitCombination(n-1, ans+"1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitCombination(5, "");
	}

}
