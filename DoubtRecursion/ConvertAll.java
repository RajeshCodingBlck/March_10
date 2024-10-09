import java.util.*;
public class Main {
	public static int convertAll(int n){
   
     if(n==0){ // Saare Digit khatam ho chhute ke. -ve Base Case
		 return 0;
	 }
    if(n<10 ){  // ak Digit bacha ho..  +ve Base Case.
		return n; 
	}
         
	int chhotaAns=convertAll(n/10);
	int ld= n%10;
	int mera_ans=0;
	if(ld==0){
		 mera_ans= chhotaAns*10+5;	    
	}else{
        mera_ans= chhotaAns*10+ld;   
	}

	 return mera_ans;

	}
    public static void main (String args[]) {
      Scanner s= new Scanner(System.in);
	  int n=s.nextInt();

	  if(n==0){
		  System.out.println(5);
		  return;
	  }

	  int ans= convertAll(n);
	  System.out.println(ans);
    }
}
