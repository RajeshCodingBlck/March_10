package recursion_2;

import java.util.ArrayList;

public class CoinFlip {
    
	// n coins -> Un Sabhi he possible outcome ArrayList me Store karke de raha he
	public static ArrayList<String> flip(int n){
		
		if(n==0) {
			ArrayList<String > base_ans= new ArrayList();
			base_ans.add("");
			return base_ans;
		}
		ArrayList<String> chhota_ans=flip(n-1);
		
		ArrayList<String> mera_arr=new ArrayList();
		for(int i=0; i<chhota_ans.size();i++) {
			mera_arr.add("H"+chhota_ans.get(i));
		}
		for(int i=0; i<chhota_ans.size();i++) {
			mera_arr.add("T"+chhota_ans.get(i));
		}
		
		return mera_arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      ArrayList<Integer> arr= new ArrayList();
//      arr.add(1);
//      arr.add(2);
//      
//      System.out.println(arr.get(0));
		
		System.out.println(flip(3));
	}

}
