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
        // Your Code Here

        Scanner s= new Scanner(System.in);

        int n1= s.nextInt();
        int n2 =s.nextInt();

        for(int i=n1; i<=n2;i++){

              int noOfDigit= digitCount(i);
             int sum= getSum(i, noOfDigit);

             if(i==sum){
                 System.out.println(i);
             }

        }
    }
}
