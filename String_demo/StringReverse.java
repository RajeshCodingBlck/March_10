package String_demo;

public class StringReverse {
    
	public static String reverse(String str) {
		
		String reverseStr="";
		for(int i=str.length()-1; i>=0;i--) {
			reverseStr= reverseStr+ str.charAt(i);
		}
		return reverseStr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str="abcd";
           System.out.println(reverse(str));
	}

}
