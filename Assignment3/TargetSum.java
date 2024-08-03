import java.util.*;
public class Main {

    public static  void triplet(int [] arr, int target){

        Arrays.sort(arr);
        for(int i=0; i<arr.length;i++){
            for(int j=i+1 ; j<arr.length;j++){
                for(int k=j+1; k<arr.length;k++){

                    if(arr[i]+arr[j]+arr[k]==target){
                      System.out.println(arr[i]+ ", "+ arr[j]+ " and "+ arr[k]);
                    }
                }
            }
        }
    }
    public static void main(String args[]) {
      
      Scanner s= new Scanner(System.in);

      int n= s.nextInt();
      int [] arr= new int[n];

      for(int i=0;i<n;i++){
          arr[i]=s.nextInt();
      }

      int target= s.nextInt();
      triplet(arr, target);
    }
}
