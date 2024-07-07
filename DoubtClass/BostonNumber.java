import java.util.*;
public class Main {

    public static boolean isPrime(int n){

        for(int i=2; i<n;i++){

            if(n%i==0){
              return false;
            }
        }

        return true;
    }
    public static int digitSum(int n){

        int sum=0;
        while(n>0){
           
           int ld= n%10;
           sum+=ld;
           n=n/10;
        }

        return sum;
    }
    public static void main(String args[]) {


        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int sum= digitSum(n);
        int sumPrime=0;


        for(int i=2; i<=n;i++){

            if(n%i==0 && isPrime(i)==true){

                 int count=0;
                 while(n%i==0){
                     count++;
                     n=n/i;
                 }

                 sumPrime+= digitSum(i) *count;
            }
        }

        if(sum== sumPrime){
            System.out.println(1);
        }else{
            System.out.println(0);
        }






    }
}
