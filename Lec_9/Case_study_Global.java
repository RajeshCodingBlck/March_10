package Lec_9;

public class Case_study_Global {
    
	static int val=13;
	public static void fun() {
		
		val++;
		System.out.println(val);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(val);
       fun();
       System.out.println(val);
	}

}
