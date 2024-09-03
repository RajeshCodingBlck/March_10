import java.util.*;
public class Main {
    public static void main(String args[]) {
       
       Scanner s= new Scanner(System.in);

       int n=s.nextInt();
       int [] arr= new int[n];
       for(int i=0; i<n;i++){
           arr[i]= s.nextInt();
       }
      
      int [] ans= new int[n];

      for(int i=0; i<n;i++){

          int newIndex= arr[i];
          int newValue=i;
          ans[newIndex]=newValue;
      }

      for(int i=0; i<n;i++){
          System.out.print(ans[i]+" ");
      }
      


    }
}
