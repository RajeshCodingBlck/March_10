import java.util.*;
public class Main {
    public static void main(String args[]) {

      Scanner s= new Scanner(System.in);
      int n= s.nextInt();
      int [] arr= new int[n];
      int sum=0;
      for(int i=0; i<n;i++){
          arr[i]=s.nextInt();
         sum+=arr[i];
      }

      int q= s.nextInt();

      int ans= (int)(Math.pow(2, q))*(sum);
      int mod= (int)(1e9+7);
      ans%= mod;
      System.out.println(ans);
    }
}
