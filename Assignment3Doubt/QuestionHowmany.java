import java.util.*;
public class Main {
    public static void main (String args[]) {

       Scanner s= new Scanner(System.in);

       int q= s.nextInt();
       
       int count=0;
       for(int i=1; i<=q;i++){

           int a= s.nextInt();
           int b= s.nextInt();
           int c= s.nextInt();

           if(a+b+c>=2){
               count++;
           }
       }
       System.out.println(count);
    }
}
