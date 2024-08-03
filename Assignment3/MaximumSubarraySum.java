import java.util.*;
public class Main {
    public static int Kadens_max(int [] arr){

        int overallMaxSum= Integer.MIN_VALUE;
        int currsum=0;

        for(int i=0; i<arr.length;i++){

            currsum+= arr[i];
            overallMaxSum= Math.max(overallMaxSum, currsum);

            if(currsum<0){
                currsum=0;
            }
        }
        return overallMaxSum;
    }
    public static int Kadens_min(int [] arr){

        int overallMinSum= Integer.MAX_VALUE;
        int currsum=0;

        for(int i=0; i<arr.length;i++){

            currsum+= arr[i];
            overallMinSum= Math.min(overallMinSum, currsum);

            if(currsum>0){
                currsum=0;
            }
        }
        return overallMinSum;
    }
    public static void main(String args[]) {

      Scanner s= new Scanner(System.in);

      int t= s.nextInt();

      while(t>0){

          int n= s.nextInt();
          int [] arr= new int[n];
          int TotalSum=0;
          for(int i=0; i<n;i++){
              arr[i]=s.nextInt();
              TotalSum+=arr[i];
          }

          int Sum_linear= Kadens_max(arr);
          int Sum_circular= TotalSum- Kadens_min(arr);

          int finalAns= Math.max(Sum_circular, Sum_linear);
          System.out.println(finalAns);
          t--;
      }
    }
}
