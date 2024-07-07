import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here

        Scanner s= new Scanner(System.in);
        long x= s.nextLong();

         long place_value=1;
         long ans=0;
        while(x>=10){

           long ld=  x%10;

           if(ld < (9-ld)){
               ans= ans+ place_value*ld;
           }else{
               ans= ans+ (9-ld)*place_value;
           }

           place_value*=10;
            x= x/10;
        }

        if(x==9 || x <5){
           ans= ans+ place_value*x; 
        }else{
            ans= ans+ place_value*(9-x);
        }
        System.out.println(ans);


    }
}
