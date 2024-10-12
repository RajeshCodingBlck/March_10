import java.util.*;
public class Main {

	public static void stoi(String str, int ans){

		if(str.length()==0){
			System.out.println(ans);
			return;
		}

       char ch= str.charAt(0);
	   int digit= ch-'0';
	   stoi(str.substring(1), ans*10+ digit);
	}
    public static void main(String args[]) {
       
	   Scanner s= new Scanner(System.in);

	   String str= s.next();
	   stoi(str, 0);

    }
}
