package String_demo;

public class Palidromic_checking {
	
	public static String reverse(String str) {
    	String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		return reverseStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="abcd";
         String reversStr= reverse(str);
         
         if(str.equals(reversStr)){
        	 System.out.println("Palodromic");
         }else {
        	 System.out.println("Not Palodromic");
         }
	}

}
