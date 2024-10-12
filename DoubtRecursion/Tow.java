import java.util.*;
public class Main {

	public static void toh(char src, char helper, char des, int n){

       if(n==0){
		   return ;
	   }
		 toh(src, des,  helper, n-1);
		 System.out.println("Moving ring " +n +" from "+ src+ " to "+ des);
           toh(helper,src ,  des , n-1);
	}
    public static void main(String args[]) {
     
	 Scanner s= new Scanner(System.in);
	 int n= s.nextInt();
     toh('A' ,'C' , 'B',n);

    }
}
