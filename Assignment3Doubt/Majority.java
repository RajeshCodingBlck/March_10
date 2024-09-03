import java.util.*;
public class Main {
    public static void getMajority(int [] arr, int n){

        Arrays.sort(arr);

        int fre=1;

        int countForMazority=0;

        for(int i=1; i<n;i++){

            if(arr[i-1] ==arr[i]){
                fre++;
            }else{

                 if(fre> (n/3)){
                     System.out.print(arr[i-1]+" ");
                     countForMazority++;
                 }
                 fre=1;
            }
        }

        if(fre> (n/3)){
            System.out.print(arr[n-1]);
            countForMazority++;
        }

        if(countForMazority==0){
            System.out.println("No Majority Elements");
        }


    }
    public static void main (String args[]) {

       Scanner s= new Scanner(System.in);
       int n= s.nextInt();
       int [] arr= new int[n];

       for(int i=0; i<n;i++){
           arr[i]=s.nextInt();
       }

       getMajority(arr, n);
    }
}
