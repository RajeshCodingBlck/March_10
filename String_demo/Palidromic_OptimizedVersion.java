package String_demo;

public class Palidromic_OptimizedVersion {
    
	public static boolean isPalidromic(String str) {
		
		int i=0;
		int j=str.length()-1;
		
		while(i<=j) {
			
			if(str.charAt(i)== str.charAt(j)){
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str= "Nitin";
        System.out.println(isPalidromic(str));
        
	}

}
