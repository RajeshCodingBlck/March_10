package Lec_9;

public class Case_study_3_Global_varibles {
    
	static int val=14;
	public static void fun() {
		
		int val=12;
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
