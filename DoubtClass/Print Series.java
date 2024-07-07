import java.util.*;
public class Main {
    public static void fun(int n1, int n2){

        int count=0;

         int i=1;
        while(count<n1){

            int val= 3*i +2;
            if(val%n2 ==0){
                i++;
                continue;
            }else{
                System.out.println(val);
                count++;
                i++;
            }
        }
    }
    public static void main(String args[]) {
       
       Scanner s= new Scanner(System.in);
       int n1= s.nextInt();
       int n2= s.nextInt();
       fun(n1, n2);
    }
}
