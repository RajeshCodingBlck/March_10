package Lec_6;

public class Break_case_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
//		for(int i=1;i<=1000000;i++) {
//			
//			
//			if(i>5) {
//				break;
//			}
//			
//			System.out.println(i);
//		}
		
		
		for(int i=0; i<3;i++) {
			
			for(int j=1; j<=100;j++) {
				
				if(j>5) {
					break;
				}
				System.out.println(j);
			}
			
		     System.out.println();
		}
	}

}
