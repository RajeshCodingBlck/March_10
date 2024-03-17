package Lec_2;
import java.util.*;
public class Simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner  hp= new Scanner(System.in);
		
		int p= hp.nextInt();
		int r= hp.nextInt();
		int t= hp.nextInt();
		
		int simple_interest= p*r*t /100;
		System.out.println(simple_interest);
		
	}

}
