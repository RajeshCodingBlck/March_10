import java.util.*;
public class Main {

    public static int  getSum(int n , int count){

        int sum=0;

        while(n>0){

            int ld= n%10;
           sum= sum+  (int)Math.pow(ld, count);
           n=n/10;
        }

        return sum;

    }
    public static int digitCount(int n){

        int count=0;
        while(n>0){

            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String args[]) {

       Scanner s= new Scanner(System.in);
       int n= s.nextInt();

       int noOfDigit= digitCount(n);
       int sum= getSum(n, noOfDigit);

       if(sum==n){
           System.out.println("true");
       }else{
           System.out.println("false");
       }

    }
}
