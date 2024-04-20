import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here

        Scanner s= new Scanner(System.in);

        int n= s.nextInt();

        int row=1;

        int nst= (n+1)/2;
        int nsp=-1;
        while(row<=n){


           //Print the  Left Star
           int i=1;

           while(i<=nst){
               System.out.print("*"+ "\t");
               i=i+1;
           }

         // Print the Space
         int j=1;
         while(j<=nsp){
             System.out.print(" "+ "\t");
             j=j+1;
         }

         // Print the Right Star
         int k=1;
         if(row==1 || row==n){
             k=2;
         }
         while(k<=nst){
             System.out.print("*"+ "\t");
             k=k+1;
         }

         // Preparation for Next row

         if( row <(n+1)/2){
             nst=nst-1;
             nsp=nsp+2;
         }else{
             nst=nst+1;
             nsp=nsp-2;
         }


            row=row+1;
            System.out.println();
        }
    }
}
