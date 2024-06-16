package String_questions;

public class Anagram {

	class Solution {
	    public int [] getfre(String str){
	        int []fre=new int[256];
			
			for(int i=0;i<str.length();i++) {
				
				char ch= str.charAt(i);
				int ascii=ch;
				fre[ascii]=fre[ascii]+1;
			}
	        return fre;
	    }
	    public boolean isAnagram(String s, String t) {
	        
	        int [] fre_s= getfre(s);
	        int [] fre_t= getfre(t);
	        
	        //Ye karna galat he..
	        // if(fre_s== fre_t){
	        //     return true;
	        // }else{
	        //     return false;
	        // }
	        
	        for(int i=0;i<256;i++){
	            
	            if(fre_s[i]==fre_t[i]){
	                continue;
	            }else{
	                return false;
	            }
	        }
	        return true;
	        
	        
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
