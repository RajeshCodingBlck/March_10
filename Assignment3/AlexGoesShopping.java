import java.util.*;
public class Main {

    public static void get(int [] arr, int A, int k){


        int count=0;
        for(int i=0; i<arr.length;i++){

            if(A%arr[i]==0){
                count++;
            }
        }

        if(count>=k){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
    public static void main(String args[]) {


        Scanner s= new Scanner(System.in);

        int n= s.nextInt();

        int [] arr= new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }

        int q=s.nextInt();

        while(q>0){
           
           int A= s.nextInt();
           int k= s.nextInt();
             get(arr, A,k);

            q--;
        }

    }
}
