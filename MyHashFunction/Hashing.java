package MyHashFunction;

public class Hashing {
    
//	[0, 9] Small Data Set
	public static int HashFunction(String str) {
		
		    int hashValue =Math.abs(str.hashCode());
		   
		    return hashValue%10;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println(HashFunction("{{{}"));
	}

}
